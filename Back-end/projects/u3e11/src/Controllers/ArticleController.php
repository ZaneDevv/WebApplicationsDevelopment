<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Article;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ArticleController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function show_form()
    {
        $this->pages->render('form/form');
    }

    public function find_product(int $id)
    {
        if (!Article::does_product_exist($id))
        {
            $this->show_form();
            return;
        }

        $this->pages->render('product/product', [ 'product' => Article::$PRODUCTS[$id] ]);
    }
}