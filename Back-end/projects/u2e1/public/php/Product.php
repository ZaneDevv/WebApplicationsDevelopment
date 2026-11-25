<?php

declare(strict_types = 1);

class Product
{
    // --------------------------------------------
    // ATTRIBUTES
    // --------------------------------------------

    private string $name = "product";
    private float $price = 10;

    // --------------------------------------------
    // GETTERS & SETTERS
    // --------------------------------------------

    /**
     * Gets the name of the current product
     * @return string The current product's name
     */
    public function getName() : string
    {
        return $this->name;
    }

    /**
     * Gets the price of the current product
     * @return float The current product's price
     */
    public function getPrice() : float
    {
        return $this->price;
    }

    /**
     * Sets the price of the current product
     * @param float $price The new current product's price
     * @throws InvalidArgumentException The price cannot be negative
     */
    public function setPrice(float $price) : void
    {
        if ($price < 0)
            throw new InvalidArgumentException('Price must be greater or equal than 0');
        
        $this->price = $price;
    }
}