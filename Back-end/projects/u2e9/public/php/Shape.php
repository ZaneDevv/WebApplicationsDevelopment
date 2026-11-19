<?php

declare(strict_types = 1);

abstract class Shape
{
    // ---------------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------------

    /**
     * Creates a new shape according to the given arguments
     * 
     * @param string $name The name of the shape to create
     *
     * @author Álvaro Fernández Barrero 
     */
    public function __construct(protected string $name)
    {
    }

    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    /**
     * Compute the shape's area
     * @return float This shape's area
     * 
     * @author Álvaro Fernández Barrero
     */
    public abstract function computeArea() : float;
    
    /**
     * Displays the shape's name
     * @author Álvaro Fernández Barrero
     */
    public function displayName(): void
    {
        echo "<p>$this->name</p>";
    }
}