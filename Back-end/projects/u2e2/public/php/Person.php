<?php

declare(strict_types = 1);

class Person
{
    public function __construct(
        private string $name,
        private string $lastName
    )
    {
        
    }

    public function getName() : string
    {
        return $this->name;
    }

    public function getLastName() : string
    {
        return $this->lastName;
    }

    public function getFullName() : string
    {
        return $this->name . ' ' . $this->lastName;
    }
}