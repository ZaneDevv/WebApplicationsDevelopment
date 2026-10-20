<?php

declare(strict_types = 1);

namespace Models;

use Enums\CardSuit;
use Enums\CardNumber;

class Card
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public string $cardImage
    {
        get => "./src/img/{strtolower($this->cardSuit->value)}_{$this->cardNumber->name()}jpg";
    }

    public int $number
    {
        get => $this->cardNumber->value;
    }

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    /**
     * Creates a new card with the given number and card suit
     * 
     * @param CardNumber $cardNumber Card's number
     * @param CardSuit $cardSuit Card's suit
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __construct(
        private readonly CardNumber $cardNumber,
        private readonly CardSuit $cardSuit
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Makes a string out of this instance's data
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __toString() : string
    {
        return "Number: {$this->cardNumber->name()} | Suit: {$this->cardSuit->name()}";
    }
}