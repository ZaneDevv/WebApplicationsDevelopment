<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Author
{
    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public int $id = 0,
        public string $name = "Anonymous",
        public string $nationality = "Unknown"
    )
    {}
}