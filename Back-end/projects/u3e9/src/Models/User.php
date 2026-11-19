<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class User
{
    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $name = '',
        public private(set) string $phone_number = '',
        public private(set) string $email = '',
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function fromArray(array $data) : self
    {
        return new self(
            name: $data['name'],
            phone_number: $data['phone_number'],
            email: $data['email'],
        );
    }
}