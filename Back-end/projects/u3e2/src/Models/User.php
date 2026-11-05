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
        public private(set) string $username,
        public private(set) string $password,
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * fromArray
     * 
     * @param array $data
     * @return User
     */
    public static function fromArray(array $data) : self
    {
        return new self(
            username: $data['username'] ?? '',
            password: $data['password'] ?? ''
        );
    }
}