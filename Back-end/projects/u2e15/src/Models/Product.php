<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Product
{
    // ----------------------------------------------------------
    // STATICS
    // ----------------------------------------------------------

    private static int $PRODUCTS_CREATED_AMOUNT = 0;

    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private int $id = 0;

    // ----------------------------------------------------------
    // CONSTRUTORS
    // ----------------------------------------------------------

    public function __construct(
        private string $name = "",
        private float $price = 0,
        private int $stock = 0
    )
    {
        $this->id = ++self::$PRODUCTS_CREATED_AMOUNT;
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function getName() : string
    {
        return $this->name;
    }

    public function getPrice() : float
    {
        return $this->price;
    }

    public function getStock() : int
    {
        return $this->stock;
    }
}