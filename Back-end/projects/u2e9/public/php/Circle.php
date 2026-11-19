<?php

declare(strict_types = 1);

require_once __DIR__ . '/Shape.php';

class Circle extends Shape
{
    // ---------------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------------

    public float $radius = 0
    {
        get => $this->radius;
        set(float $value)
        {
            if ($value < 0)
                throw new InvalidArgumentException('Invalid radius: it cannot be negative');

            $this->radius = $value;
        }
    }

    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    /**
     * Creates a new circle according to the given arguments
     * 
     * @param float $radius The radius's length of the circle to create
     * @param string $name The name of the circle to create
     *
     * @author Álvaro Fernández Barrero 
     */
    public function __construct(float $radius, string $name)
    {
        $this->radius = $radius;

        parent::__construct($name);
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    public function computeArea(): float
    {
        return M_PI * $this->radius * $this->radius;
    }
}