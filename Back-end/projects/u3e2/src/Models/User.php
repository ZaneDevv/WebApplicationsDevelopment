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
        public private(set) string $password
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromArray(array $data) : self
    {
        return new self(
            username: htmlspecialchars(trim($data['username'] ?? ''), ENT_QUOTES, 'UTF-8'),
            password: htmlspecialchars(trim($data['password'] ?? ''), ENT_QUOTES, 'UTF-8')
        );
    }
}