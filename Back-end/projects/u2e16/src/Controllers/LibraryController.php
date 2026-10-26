<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;

use Repositories\AuthorRepository;
use Repositories\BookRepository;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class LibraryController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;

    private BookRepository $book_repository;
    private AuthorRepository $author_repository;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();

        $this->book_repository = new BookRepository();
        $this->author_repository = new AuthorRepository();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function authors()
    {
        $this->pages->render('library/authors', [
            'authors' => $this->author_repository->getAuthors()
        ]); 
    }

    public function author(int $id)
    {
        $this->pages->render('library/authors', [
            'authors' => $this->author_repository->getAuthor($id)
        ]); 
    }

    public function books()
    {
        $this->pages->render('library/books', [
            'books' => $this->book_repository->getBooks()
        ]); 
    }

    public function book(int $id)
    {
        $this->pages->render('library/books', [
            'books' => $this->book_repository->getBook($id)
        ]); 
    }

    public function availableBooks()
    {
        $this->pages->render('library/books', [
            'book' => $this->book_repository->getAvailableBooks()
        ]); 
    }
}