<?php

declare(strict_types = 1);

require_once __DIR__ . '/Person.php';

class Client extends Person
{
    public function __construct(string $name, string $lastName)
    {
        parent::__construct($name, $lastName);
    }
}