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
        public private(set) string $username = '',
        public private(set) string $password = '',
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromArray(array $user) : self
    {
        return new self(
            username: strip_tags(htmlspecialchars($user["username"] ?? '')),
            password: strip_tags(htmlspecialchars($user['password'] ?? ''))
        );
    }
}