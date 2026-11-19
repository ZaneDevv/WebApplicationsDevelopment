<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Contact
{
    // ----------------------------------------------------------
    // CLASSES
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $name = '',
        public private(set) string $lastname = '',
        public private(set) bool $accepted = false,
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromArray(array $data) : self
    {
        return new self(
            name: htmlspecialchars(trim($data['username'] ?? ''), ENT_QUOTES, 'UTF-8'),
            lastname: htmlspecialchars(trim($data['lastname'] ?? ''), ENT_QUOTES, 'UTF-8'),
            accepted: isset($data['check']),
        );
    }
}