<?php

declare(strict_types = 1);

namespace Repositories;

use Models\Author;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class AuthorRepository
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private array $authors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->authors[0] = new Author(0, 'William Shakespeare', 'England');
        $this->authors[1] = new Author(1, 'Agatha Christie', 'England');
        $this->authors[2] = new Author(2, 'Barbara Cartland', 'England');
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function getAuthors() : array
    {
        return $this->authors;
    }

    public function getAuthor(int $id) : Author
    {
        return $this->authors[$id];
    }
}