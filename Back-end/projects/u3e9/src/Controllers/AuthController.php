<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Request\UserRequest;
use Models\User;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class AuthController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function show_form()
    {
        $this->pages->render('form/form');
    }

    public function process_user()
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->show_form();
            return;
        }

        $user_request = new UserRequest($_POST['user'] ?? []);

        if (!$user_request->is_valid())
        {
            $this->pages->render('form/form', [
                'user' => $user_request->data,
                'errors' => $user_request->errors
            ]);
        }
    }
}