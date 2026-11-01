<?php

declare(strict_types = 1);

namespace Controllers;

use Models\User;
use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class UserController
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

    public function show_user() : void
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->show_log_in();
            return;   
        }

        $this->pages->render('form/response', [ 'user' => User::fromArray($_POST['user'] ?? []) ]);
    }

    public function show_log_in() : void
    {
        $this->pages->render('form/form');
    }
}