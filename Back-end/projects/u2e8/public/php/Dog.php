<?php

declare(strict_types = 1);

class Dog
{
    // -------------------------------------------------------
    // ATTRIBUTES
    // -------------------------------------------------------

    private float $size = 0;
    private string $breed = 'Bulldog';
    private string $color = 'White';
    private string $name = 'Ricky';

    // -------------------------------------------------------
    // CONSTRUCTORS
    // -------------------------------------------------------

    public function __construct(float $size = 0, string $breed = 'Bulldog', string $color = 'Brown', string $name = 'Ricky')
    {
        $this->size = $size;
        $this->breed = $breed;
        $this->color = $color;
        $this->name = $name;
    }

    // -------------------------------------------------------
    // GETTERS & SETTERS
    // -------------------------------------------------------

    public function getSize() : float
    {
        return $this->size;
    }

    public function setSize(float $size)
    {
        $this->size = $size;
    }

    public function getBreed() : string
    {
        return $this->breed;
    }

    public function setBreed(string $breed)
    {
        $this->breed = $breed;
    }

    public function getColor() : string
    {
        return $this->color;
    }

    public function setColor(string $color)
    {
        $this->color = $color;
    }

    public function getName() : string
    {
        return $this->name;
    }

    public function setName(string $name) : bool
    {
        if (strlen($name) >= 21)
            return false;

        $this->name = $name;
        return true;
    }

    // -------------------------------------------------------
    // METHODS
    // -------------------------------------------------------

    public function showProperties() : void
    {
        echo '<ul>';
        echo "<li>Size: $this->size</li>";
        echo "<li>Breed: $this->breed</li>";
        echo "<li>Color: $this->color</li>";
        echo "<li>Name: $this->name</li>";
        echo '</ul>';
    }

    public function speak()
    {
        echo 'WOOF';
    }
}