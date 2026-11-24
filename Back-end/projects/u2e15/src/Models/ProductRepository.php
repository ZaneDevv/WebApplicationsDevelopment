<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ProductRepository
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private array $products = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        array_push($this->products, new Product("Computer", 145.24, 56));
        array_push($this->products, new Product("Book", 24.50, 0));
        array_push($this->products, new Product("Lamp", 12, 2));
        array_push($this->products, new Product("Laptop", 177.68, 27));
        array_push($this->products, new Product("Glasses", 56.75, 3));
        array_push($this->products, new Product("Microwave", 150.50, 0));
        array_push($this->products, new Product("Plush", 15, 0));
        array_push($this->products, new Product("Shirt", 34.99, 10));
        array_push($this->products, new Product("Meat", 27.24, 31));
        array_push($this->products, new Product("Fish", 26.35, 0));
        array_push($this->products, new Product("Microphone", 205.15, 162));
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function getProducts(array &$products) : void
    {
        $products = $this->products;
    }
}