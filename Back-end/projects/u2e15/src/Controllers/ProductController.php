<?php

declare(strict_types = 1);

namespace Controllers;

use Models\ProductRepository;
use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ProductController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private static Pages $pages;
    private static ProductRepository $product_repository;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function index() : void
    {
        if (!isset(self::$pages))
            self::$pages = new Pages();

        if (!isset(self::$product_repository))
            self::$product_repository = new ProductRepository();

        $products = [];
        self::$product_repository->getProducts($products);

        self::$pages->render('products/list', [
            'products' => $products
        ]);
    }
}