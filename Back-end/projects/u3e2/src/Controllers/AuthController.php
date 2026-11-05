<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\User;
use Requests\UserRequest;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class AuthController
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
            $this->go_to_action('show_form');
            return;
        }

        $user_request = new UserRequest($_POST['data'] ?? []);
        $user = User::fromArray($user_request->data);

        if (!$user_request->is_valid())
        {
            $this->show_form([
                'errors' => $user_request->errors,
                'user' => $user
            ]);
            return;
        }

        $is_correct_name = $this->user_controller->is_correct_username($user->username);
        $is_correct_password = $this->user_controller->is_correct_password($user->password);

        if ($is_correct_name && $is_correct_password)
            $this->go_to_action('show_welcome_page');

        else
            $this->show_form([
                'errors' => [
                    'username' => !$is_correct_name ? 'The username is incorrect' : null,
                    'password' => !$is_correct_password ? 'The password is incorrect' : null
                ],
                'user' => $user
            ]);
    }

    /**
     * goToAction
     *
     * @param string $action
     * @return void
     */
    private function go_to_action(string $action) : void
    {
        header("Location: index.php?action=$action");
        exit;
    }
}