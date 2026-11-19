<?php

declare(strict_types = 1);

namespace Models;

use Models\Card;
use Models\Deck;

class Player
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public readonly string $name;

    public float $points = 0
    {
        get => $this->points;
    }

    public array $takenCards = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    function __construct(string $name)
    {
        $this->name = $name;
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Makes a player to play by taking cards until the they must stop
     * 
     * @param Deck &$deck Deck of cards to take the cards from
     * 
     * @author Álvaro Fernández Barrero
     */
    public function takeCards(Deck &$deck)
    {
        while ($this->points < 7)
        {
            $card = $deck->takeCardOutOfDeck();
            array_push($this->takenCards, $card);

            $this->points += $card->number >= 10 ? 0.5 : $card->number;
        }
    }
}