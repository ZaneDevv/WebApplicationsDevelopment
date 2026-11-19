<?php

declare(strict_types = 1);

class Person
{
    // -----------------------------------------------------
    // CONSTRUCTORS
    // -----------------------------------------------------

    public function __construct(
        private string $name,
        private int $age,
        private string $city
    )
    {}

    // -----------------------------------------------------
    // METHODS
    // -----------------------------------------------------

    public function __call(string $method, array $arguments) : mixed
    {
        return match ($method)
        {
            'getName' => $this->name,
            'getAge' => $this->age,
            'getCity' => $this->city,
            default => null
        };
    }
}