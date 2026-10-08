<?php

// ---------------------------------------------------------
// DECLARATIONS
// ---------------------------------------------------------

declare(strict_types = 1);

require_once __DIR__ . '/deck.php';


// ---------------------------------------------------------
// SETTING UP THE GAME
// ---------------------------------------------------------

$deck = [];
createDeck($deck);
shuffle($deck);

$playerPoints = 0;
$cpuPoints = 0;

// ---------------------------------------------------------
// METHODS
// ---------------------------------------------------------

/**
 * Takes the card from the deck and adds up the points to the given variable
 * 
 * @param float &$points Points to increment according to the taken card 
 */
function takeCards(float &$points) : void
{
    global $deck;

    do
    {
        $card = takeCardOutOfDeck($deck);
        showCard($card);
        
        $cardNumber = $card['number'];        
        if ($cardNumber >= 10)
            $cardNumber = 0.5;

        $points += $cardNumber;
    }
    while ($points < 7);
}

/**
 * Gives the winner message
 */
function getWinnerMessage() : string
{
    global $playerPoints, $cpuPoints;
    
    $message = '';

    if ($playerPoints === $cpuPoints)
        $message = 'TIE!';

    else
        $message = ($playerPoints > $cpuPoints ? 'CPU' : 'The player') . ' won!';

    return $message;
}

// ---------------------------------------------------------
// START GAME
// ---------------------------------------------------------

echo '<h2>PLAYER TURN</h2>';
takeCards($playerPoints);

echo '<br><h2>CPU TURN</h2>';
takeCards($cpuPoints);

echo '<hr>';
echo getWinnerMessage();