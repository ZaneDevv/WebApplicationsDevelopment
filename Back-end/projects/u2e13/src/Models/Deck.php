<?php

declare(strict_types = 1);

namespace Models;

use Enums\CardNumber;
use Enums\CardSuit;

class Deck
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private array $cards = [];

    // ----------------------------------------------------------
    // CONSTRUCTS
    // ----------------------------------------------------------
    
    /**
     * Creates a new cards deck
     * @param int $acceptedCards Binary mask to accept or reject card numbers in the desk
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __construct(int $acceptedCards = 0xFFF)
    {
        foreach (CardNumber::cases() as $number)
        {
            $mask = 1 << ($number->value - 1);
            if (($acceptedCards & $mask) === 0)
                continue;

            foreach (CardSuit::cases() as $suit)
            {
                $this->cards[] = new Card($number, $suit); 
            }
        }
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Shuffles the deck
     * 
     * @author Álvaro Fernández Barrero
     */
    public function shuffle() : void
    {
        shuffle($this->cards);
    }

    /**
     * Takes a card out of the deck
     * @return Card Card taken from the deck
     * 
     * @author Álvaro Fernández Barrero
     */
    public function takeCardOutOfDeck() : Card
    {
        return array_shift($this->cards);
    }

    /**
     * Makes a string out of this instance's data
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __toString() : string
    {
        $finalString = '';

        foreach ($this->cards as $card)
            $finalString .= $card->__toString() . PHP_EOL;

        return $finalString;
    }

    // ----------------------------------------------------------
    // GETTERS & SETTERS
    // ----------------------------------------------------------

    public function getCards()
    {
        return $this->cards;
    }
}