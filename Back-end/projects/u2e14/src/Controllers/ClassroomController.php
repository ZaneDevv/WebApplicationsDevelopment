<?php

declare(strict_types = 1);

namespace Controllers;

use Models\Classroom;
use Models\Student;

use Lib\Pages;

// ---------------------------------------------------------------
// CLASSES
// ---------------------------------------------------------------

class ClassroomController
{
    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    private Classroom $classroom;
    private Pages $pages;

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    public function __construct()
    {
        $this->classroom = new Classroom();
        $this->pages = new Pages();

        $this->classroom->addStudent(new Student('John', 'Doe', 7, 2000));
        $this->classroom->addStudent(new Student('Jane', 'Doe', 8, 2005));
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    /**
     * Shows all students on screen
     * @author Álvaro Fernández Barrero
     */
    public function showAll()
    {
        $this->pages->render('students/show_classroom_students', [
            'students' => $this->classroom->getAllStudents()
        ]);
    }
}