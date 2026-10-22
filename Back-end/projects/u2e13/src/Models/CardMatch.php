<?php

declare(strict_types = 1);

namespace Models;

use Models\Card;
use Models\Deck;
use Models\Player;

class CardMatch
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public readonly Deck $deck;

    public readonly Player $player1;
    public readonly Player $player2;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(int &$allowedCards, Player $player1, Player $player2)
    {
        $this->deck = new Deck($allowedCards);
        $this->deck->shuffle();

        $this->player1 = $player1;
        $this->player2 = $player2;
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Makes the two players play the game
     * @author Álvaro Fernández Barrero
     */
    public function play()
    {
        $this->player1->takeCards($this->deck);
        $this->player2->takeCards($this->deck);
    }

    /**
     * Sets the winner message according to the points each player has
     * 
     * @return string Winner message
     * 
     * @author Álvaro Fernández Barrero
     */
    function setWinnerMessage() : string
    {
        $pointsPlayer1 =  $this->player1->points;
        $pointsPlayer2 =  $this->player1->points;

        $isPlayer1Off = $pointsPlayer1 > TARGET_POINTS;
        $isPlayer2Off = $pointsPlayer2 > TARGET_POINTS;
        $arePlayersOffBuffer = $isPlayer1Off << 1 | $isPlayer2Off;
        
        if ($pointsPlayer1 === $pointsPlayer2 && $arePlayersOffBuffer === 0)
            return 'TIE';

        $namePlayer1 = $this->player1->name;
        $namePlayer2 = $this->player2->name;

        return match ($arePlayersOffBuffer) {
            0b00 => abs($pointsPlayer1 - TARGET_POINTS) < abs($pointsPlayer2 - TARGET_POINTS) ? "Winner: $namePlayer1" : "Winner: $namePlayer2",
            0b01 => "Winner: $namePlayer1",
            0b10 => "Winner: $namePlayer2",
            0b11 => 'No one wins :('
        };
    }
}