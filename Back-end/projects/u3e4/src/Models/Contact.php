<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Contact
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $name = "",
        public private(set) string $email = "",
        public private(set) string $phone_number = "",
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromPostArray(array $post): self
    {
        return new self(
            name: ucfirst(strip_tags(htmlspecialchars($post['name'] ?? ''))),
            email: strtolower(strip_tags(htmlspecialchars($post['email'] ?? ''))),
            phone_number: '+' . strip_tags(htmlspecialchars($post['phone-number'] ??''))
        );
    }
}