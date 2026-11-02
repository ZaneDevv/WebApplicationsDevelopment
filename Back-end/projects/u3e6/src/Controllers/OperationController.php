<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Operation;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class OperationController
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

    public function show_operation()
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->pages->render('form/form');
            return;
        }

        $this->pages->render('form/response', [ 'operation' => Operation::fromAray($_POST['operation'] ?? []) ]);
    }
}