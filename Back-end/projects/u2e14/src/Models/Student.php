<?php

namespace Models;

// ---------------------------------------------------------------
// CLASSES
// ---------------------------------------------------------------

class Student
{
    // ---------------------------------------------------------------
    // STATICS
    // ---------------------------------------------------------------

    private static int $students_counter = 0;

    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    private int $id = 0;
    private int $age;

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    public function __construct(
        private string $name = "",
        private string $lastName = "",
        private int $grade = 0,
        private int $birthYear = 0
    )
    {
        $this->id = ++Student::$students_counter;
        $this->age = date('Y') - $birthYear;
    }

    // ---------------------------------------------------------------
    // GETTERS & SETTERS
    // ---------------------------------------------------------------

    public function getFullName() : string
    {
        return "$this->name $this->lastName";
    }

    public function getAge() : int
    {
        return $this->age;
    }
}