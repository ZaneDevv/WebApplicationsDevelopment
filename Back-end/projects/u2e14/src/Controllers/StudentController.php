<?php

declare(strict_types = 1);

namespace Controllers;

use Models\Student;
use Lib\Pages;

// ---------------------------------------------------------------
// CLASSES
// ---------------------------------------------------------------

class StudentController
{
    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    private Student $student;
    private Pages $pages;

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    public function __construct(string $name = "", string $lastName = "", int $grade = 0, int $birthYear = 0)
    {
        $this->student = new Student($name, $lastName, $grade, $birthYear);
        $this->pages = new Pages();
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    /**
     * Shows the student on screen
     * @author Álvaro Fernández Barrero
     */
    public function show() : void
    {
        $this->pages->render('students/show_student', [
            'name' => $this->student->getFullName(),
            'age' => $this->student->getAge()
        ]);
    }
}