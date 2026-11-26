<?php

declare(strict_types = 1);

namespace Controllers;

use Core\Pages;

class ProductController
{
    // --------------------------------------------------------------------------------
    // ATTRIBUTES
    // --------------------------------------------------------------------------------

    private Pages $pages;

    // --------------------------------------------------------------------------------
    // METHODS
    // --------------------------------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
    }

    // --------------------------------------------------------------------------------
    // METHODS
    // --------------------------------------------------------------------------------

    public function send_to_buy()
    {
        $this->pages->render('store/to_buy');
    }

    public function send_to_cart()
    {
        $product = $_POST['product'] ?? [];

        if (empty($product))
        {
            header('Location: /');
            exit;
        }

        $name = strtoupper(strip_tags(trim($product['name'])));

        $products_amount = (int)($_SESSION[$name] ?? 0);
        $_SESSION[$name] = $products_amount + (int)$product['amount'];

        $this->pages->render('store/shopping_cart', ['products' => $_SESSION]);
    }
}