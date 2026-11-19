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
        'P36' => [
            'name' => 'Table',
            'description' => 'Table to put your objects upon',
            'price' => 34.56
        ],  

        'P52' => [
            'name' => 'Lightbulb',
            'description' => 'A white lightbulb to illuminate your house',
            'price' => 3.99
        ],

        'P85' => [
            'name' => 'Book',
            'description' => 'Become smarter with these awesome adventures',
            'price' => 12.75
        ]
    ];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $id = '',
        public private(set) string $name = '',
        public private(set) string $description = '',
        public private(set) float $price = 0,
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function does_product_exist(string $id) : bool
    {
        return isset(self::$PRODUCTS[$id]);
    }

    public static function from_array(array $data) : self
    {
        return new self(
            id: $data['id'] ?? '',
            name: $data['name'] ?? '',
            description: $data['description'] ?? '',
            price: $data['price'] ?? 0,
        );
    }
}