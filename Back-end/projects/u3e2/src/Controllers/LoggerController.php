<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\User;
use Requests\UserRequest;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class LoggerController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;
    private UserController $user_controller;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
        $this->user_controller = new UserController();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * show_form
     *
     * @param array $data
     * @return void
     */
    public function show_form(array $data = []) : void
    {
        $this->pages->render('form/form', $data);
    }

    /**
     * show_welcome_page
     *
     * @return void
     */
    public function show_welcome_page() : void
    {
        $this->pages->render('form/response');
    }

    /**
     * attempt_to_log_in
     *
     * @return void
     */
    public function attempt_to_log_in()
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->goToAction('show_form');
            return;
        }

        $user = User::fromArray($_POST['data'] ?? []);
        $user_request = new UserRequest($user);

        if (!$user_request->isValid())
        {
            $username_error_message = $user_request->errors['username'] ?? null;
            $password_error_message = $user_request->errors['password'] ?? null;

            $this->show_form([
                'username_error_message' => isset($username_error_message) ? $username_error_message : null,
                'password_error_message' => isset($password_error_message) ? $password_error_message : null,
                'username' => $user->username
            ]);
        }

        $is_correct_name = $this->user_controller->is_correct_username($user->username);
        $is_correct_password = $this->user_controller->is_correct_password($user->password);

        if ($is_correct_name && $is_correct_password)
        {
            $this->goToAction('show_welcome_page');
        }
        else
        {
            $username_error_message = !$is_correct_name ? 'The username is incorrect' : null;
            $password_error_message = !$is_correct_password ? 'The password is incorrect' : null;

            $this->show_form([
                'username_error_message' => $username_error_message,
                'password_error_message' => $password_error_message,
                'username' => $user->username
            ]);
        }
    }

    /**
     * goToAction
     *
     * @param string $action
     * @return void
     */
    private function goToAction(string $action) : void
    {
        header("Location: index.php?action=$action");
    }
}