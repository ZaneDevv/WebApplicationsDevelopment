<?php

declare(strict_types = 1);

require_once __DIR__ . '/Card.php';

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
    public function __construct(int $acceptedCards = 0b111111111111)
    {
        for ($i = 1; $i <= 4; $i++)
        {
            for ($j = 1; $j <= 12; $j++)
            {
                $mask = 1 << ($j - 1);
                if (($acceptedCards & $mask) === $mask)
                    array_push($this->cards, new Card($j, $i));
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
     * Show all cards from the desk
     * 
     * @author Álvaro Fernández Barrero
     */
    public function showAllCards() : void
    {
        foreach ($this->cards as $card)
            $card->showCard();
    }

    /**
     * Takes a card out of the deck
     * @return Card Card taken from the deck
     * 
     * @author Álvaro Fernández Barrero
     */
    public function takeCardOutOfDeck() : Card
    {
        return array_pop($this->cards);
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
}