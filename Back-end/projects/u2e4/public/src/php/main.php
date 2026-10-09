<?php

// ----------------------------------------------------------
// SET CODE UP
// ----------------------------------------------------------

declare(strict_types = 1);

require_once __DIR__ . '/Deck.php';

// ----------------------------------------------------------
// CONSTANTS
// ----------------------------------------------------------

define('TARGET_POINTS', 7.5);

define('PLAYER1_NAME', 'Player1');
define('PLAYER2_NAME', 'Player2');

// ----------------------------------------------------------
// METHODS
// ----------------------------------------------------------

/**
 * Makes a player to play by taking cards until the they must stop
 * 
 * @param int &$points Points starts to increment
 * @param Deck &$deck Deck of cards to take the cards from
 * 
 * @author Álvaro Fernández Barrero
 */
function makePlayerToTakeCards(int &$points, Deck &$deck)
{
    while ($points < 7)
    {
        $card = $deck->takeCardOutOfDeck();
        $points += $card->number >= 10 ? 0.5 : $card->number;
        
        $card->showCard();
    }
}

/**
 * Sets the winner message according to the points each player has
 * 
 * @param float $pointsPlayer1 Player 1's points
 * @param float $pointsPlayer2 Player 2's points
 * @param string $namePlayer1 Player 1's name
 * @param string $namePlayer2 Player 2's name
 * 
 * @return string Winner message
 * 
 * @author Álvaro Fernández Barrero
 */
function setWinnerMessage(float $pointsPlayer1, float $pointsPlayer2, string $namePlayer1, string $namePlayer2) : string
{
    $isPlayer1Off = $pointsPlayer1 > TARGET_POINTS;
    $isPlayer2Off = $pointsPlayer2 > TARGET_POINTS;
    $arePlayersOffBuffer = $isPlayer1Off << 1 | $isPlayer2Off;
    
    if ($pointsPlayer1 === $pointsPlayer2 && $arePlayersOffBuffer === 0)
        return 'TIE';

    return match ($arePlayersOffBuffer) {
        0b00 => abs($pointsPlayer1 - TARGET_POINTS) < abs($pointsPlayer2 - TARGET_POINTS) ? "Winner: $namePlayer1" : "Winner: $namePlayer2",
        0b01 => "Winner: $namePlayer1",
        0b10 => "Winner: $namePlayer2",
        0b11 => 'No one wins :('
    };
}

// ----------------------------------------------------------
// SET UP
// ----------------------------------------------------------

$deck = new Deck(0b111001111111);
$deck->shuffle();

$player1Points = 0;
$player2Points = 0;

// ----------------------------------------------------------
// START GAME
// ----------------------------------------------------------

echo '<h1>' . PLAYER1_NAME . ' plays:</h1>';
makePlayerToTakeCards($player1Points, $deck);
echo "<p>Total score: $player1Points</p>";

echo '<h1>' . PLAYER2_NAME . ' plays:</h1>';
makePlayerToTakeCards($player2Points, $deck);
echo "<p>Total score: $player2Points</p>";

echo '<p>' . setWinnerMessage($player1Points, $player2Points, PLAYER1_NAME, PLAYER2_NAME) . '</p>';