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

    public function showForm() : void
    {
        $this->pages->render('form/form');
    }

    public function process() : void
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->showForm();
            return;
        }

        $contact = Contact::fromArray($_POST['data'] ?? []);
        $this->pages->render('form/response', ['contact' => $contact]);
    }
}