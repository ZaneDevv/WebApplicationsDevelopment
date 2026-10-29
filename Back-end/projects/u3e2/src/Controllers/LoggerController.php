<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\User;

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

    public function attempt_to_log_in()
    {
        $user = User::fromArray($_POST['data'] ?? []);

        $is_correct_name = $this->user_controller->is_correct_username($user->username);
        $is_correct_password = $this->user_controller->is_correct_password($user->password);

        if ($is_correct_name && $is_correct_password)
        {
            $this->pages->render('form/response');
        }
        else
        {
            $username_error_message = !$is_correct_name ? 'The username is incorrect' : null;
            $password_error_message = !$is_correct_password ? 'The password is incorrect' : null;

            $this->pages->render('form/form', [
                'username_error_message' => $username_error_message,
                'password_error_message' => $password_error_message,
                'username' => $user->username
            ]);
        }
    }
}