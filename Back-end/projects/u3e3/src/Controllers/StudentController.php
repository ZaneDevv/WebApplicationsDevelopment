<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Student;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class StudentController
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

        $this->pages->render('form/response', [ 'student' => Student::fromPostArray($_POST ?? []) ]);
    }
}