<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Book
{
    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public int $id = 0,
        public string $title = "-",
        public int $year = 0,
        public int $authorId = -1,
        public bool $available = true
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

}