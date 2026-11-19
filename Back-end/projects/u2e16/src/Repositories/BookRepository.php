<?php

declare(strict_types = 1);

namespace Repositories;

use Models\Book;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class BookRepository
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private array $books = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->books[0] = new Book(0, 'Antony and Cleopatra', 1601, 0, true);
        $this->books[1] = new Book(1, 'Cymbeline', 1634, 0, true);
        $this->books[2] = new Book(2, 'Julius Caesar', 1599, 0, false);
        $this->books[3] = new Book(3, 'The Mysterious Affair at Styles', 1920, 1, false);
        $this->books[4] = new Book(4, 'The Secret Adversary', 1922, 1, true);
        $this->books[5] = new Book(5, 'The Murder on the Links', 1923, 1, true);
        $this->books[6] = new Book(6, 'A knight in Paris', -1, 2, true);
        $this->books[7] = new Book(7, 'Love finds the way', -1, 2, false);
        $this->books[8] = new Book(8, 'A ghost in Monte Carlo', 1951, 2, true);
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function getBooks() : array
    {
        return $this->books;
    }

    public function getAvailableBooks() : array
    {
        return array_filter($this->books, fn (Book $book) : bool => $book->available);
    }

    public function getBook(int $id) : Book
    {
        return $this->books[$id];
    }
}