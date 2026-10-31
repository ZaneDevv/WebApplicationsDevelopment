<?php

declare(strict_types = 1);

namespace Controllers;

use Models\Contact;
use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ContactController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public Pages $pages;

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

    public function show()
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->pages->render('form/form');
            return;
        }

        $this->pages->render('form/response', [ 'contact' => Contact::fromPostArray($_POST['user'] ?? []) ]);
    }
}