<?php

declare(strict_types = 1);

class Car
{
    // --------------------------------------------
    // ATTRIBUTES
    // --------------------------------------------

    public string $color = 'Red';
    public string $brand = 'Ferrari';
    public string $model = 'Aventador';
    public float $speed = 300;
    public float $horses = 500;
    public int $seats = 2;
    
    // --------------------------------------------
    // METHODS
    // --------------------------------------------

    public function speedUp(float $speed) : void
    {
        $this->speed += $speed;
    }

    public function brake(float $speed) : void
    {
        $this->speed -= $speed;
    }
}