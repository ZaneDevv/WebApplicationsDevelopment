<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Employee;
use Requests\EmployeeRequest;

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

    public function show_received_message()
    {
        $this->pages->render('form/response');
    }

    public function process_employee()
    {
        if ($_SERVER['REQUEST_METHOD'] !== 'POST')
        {
            $this->show_form();
            return;
        }

        $post_data = $_POST['employee'] ?? [];
        $post_data['languages'] = $_POST['languages'] ?? [];

        $employee_request = new EmployeeRequest($post_data);

        if (!$employee_request->is_valid())
        {
            $this->pages->render('form/form', [
                'employee' => Employee::fromArray($employee_request->data),
                'errors' => $employee_request->errors
            ]);

            return;
        }

        header('Location: index.php?action=show_received_message');
        exit;
    }
}