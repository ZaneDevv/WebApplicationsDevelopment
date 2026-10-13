<?php

declare(strict_types = 1);

require_once __DIR__ . '/Shape.php';

class Rectangle extends Shape
{
    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    public float $base = 0
    {
        get => $this->base;
        set(float $value)
        {
            if ($value < 0)
                throw new InvalidArgumentException('Invalid base: it cannot be negative');

            $this->base = $value;
        }
    }

    public float $height = 0
    {
        get => $this->height;
        set(float $value)
        {
            if ($value < 0)
                throw new InvalidArgumentException('Invalid height: it cannot be negative');

            $this->height = $value;
        }
    }

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    /**
     * Creates a new rectangle according to the given arguments
     * 
     * @param float $base The base's length of the rectangle to create
     * @param float $height The height's length of the rectangle to create
     * @param string $name The name of the rectangle to create
     *
     * @author Álvaro Fernández Barrero 
     */
    public function __construct(float $base, float $height, string $name)
    {
        $this->base = $base;
        $this->height = $height;

        parent::__construct($name);
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    public function computeArea(): float
    {
        return $this->base * $this->height;
    }
}