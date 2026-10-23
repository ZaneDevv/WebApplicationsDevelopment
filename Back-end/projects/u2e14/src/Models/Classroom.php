<?php

declare(strict_types = 1);

namespace Models;

use Lib\Pages;

// ---------------------------------------------------------------
// CLASSES
// ---------------------------------------------------------------

class Classroom
{
    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    private array $students = [];
    private Pages $pages;

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    public function __construct(array $students = [])
    {
        $this->students = $students;
        $this->pages = new Pages();
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    public function addStudent(Student $student)
    {
        array_push($this->students, $student);
    }

    public function getAllStudents()
    {
        return $this->students;
    }
}