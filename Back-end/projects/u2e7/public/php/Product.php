<?php

declare(strict_types = 1);

class Product
{
    // ----------------------------------------------
    // CONSTANTS
    // ----------------------------------------------

    public static float $tax = 0.21;

    // ----------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------

    private static int $objectsAmount = 0;

    // ----------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------

    public function __construct()
    {
        self::$objectsAmount++;
    }

    // ----------------------------------------------
    // METHODS
    // ----------------------------------------------

    public static function getObjectsAmount() : int
    {
        return self::$objectsAmount;
    }
}