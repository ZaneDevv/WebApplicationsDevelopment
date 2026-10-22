<?php

declare(strict_types = 1);

// ----------------------------------------------------------
// SET CODE UP
// ----------------------------------------------------------

require_once '../autoloader.php';

use Models\Card;
use Models\Deck;
use Models\Player;
use Models\CardMatch;

use Enums\CardNumber;
use Enums\CardSuit;

use Lib\Pages;

// ----------------------------------------------------------
// CONSTANTS
// ----------------------------------------------------------

define('TARGET_POINTS', 7.5);

define('PLAYER1_NAME', 'Player1');
define('PLAYER2_NAME', 'Player2');

// ----------------------------------------------------------
// METHODS
// ----------------------------------------------------------

// ----------------------------------------------------------
// SET UP
// ----------------------------------------------------------

$allowedCards = 0b111001111111;

$player1 = new Player(PLAYER1_NAME);
$player2 = new Player(PLAYER2_NAME);

$cardMatch = new CardMatch($allowedCards, $player1, $player2);

$pages = new Pages();
$pages->render('deck/showDeck', [
    'deck' => $cardMatch->deck->getCards(),
]);

// ----------------------------------------------------------
// GAME
// ----------------------------------------------------------

$cardMatch->play();

$pages->render('players/match', [
    'player' => $player1,
]);
$pages->render('players/match', [
    'player' => $player2,
]);

$pages->render('players/winner', [
    'match' => $cardMatch,
]);


?>