<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Article
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) static array $PRODUCTS = [
        36 => [
            'name' => 'Table',
            'description' => 'Table to put your objects upon',
            'price' => 34.56
        ],  

        52 => [
            'name' => 'Lightbulb',
            'description' => 'A white lightbulb to illuminate your house',
            'price' => 3.99
        ],

        85 => [
            'name' => 'Book',
            'description' => 'Become smarter with these awesome adventures',
            'price' => 12.75
        ]
    ];

    // ----------------------------------------------------------
    // MEtHODS
    // ----------------------------------------------------------

    public static function does_product_exist(int $number) : bool
    {
        return isset(self::$PRODUCTS[$number]);
    }
}