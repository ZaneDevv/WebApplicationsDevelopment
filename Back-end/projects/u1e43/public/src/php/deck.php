<?php

declare(strict_types = 1);

// ---------------------------------------------------------
// CONSTANTS
// ---------------------------------------------------------

define('CARDS_IN_SUIT', 12);
define('SUITS_AMOUNT', 4);

define('IMAGES_PATH', './src/img/');

// ---------------------------------------------------------
// VARIABLES
// ---------------------------------------------------------

$suitNames = ['oros', 'copas', 'espadas', 'bastos'];
$cardName = [
    1 => 'A',
    10 => 'Sota',
    11 => 'Caballo',
    12 => 'Rey'
];

// ---------------------------------------------------------
// METHODS
// ---------------------------------------------------------

/**
 * Prints the given deck
 * 
 * @param array &$deck Deck to print
 */
function printDeck(array &$deck) : void
{
    global $suitNames;

    echo '<pre>';
    array_walk(
        $deck,
        fn ($card) : int => print($suitNames[$card['suit']] . ' ' . $card['number'] . PHP_EOL)
    );
    echo '</pre>';
}

/**
 * Creates the full deck in the given array;
 * 
 * @param array &$deck Array to save the full deck
 */
function createFullDeck(array &$deck) : void
{
    for ($i = 0; $i < SUITS_AMOUNT; $i++)
    {
        for ($j = 1; $j <= CARDS_IN_SUIT; $j++)
        {
            array_push($deck, [
                'suit' => $i,
                'number' => $j
            ]);
        }
    }
}

/**
 * Creates the full deck in the given array;
 * 
 * @param array &$deck Array to save the full deck
 */
function createDeck(array &$deck) : void
{
    createFullDeck($deck);
    $deck = array_filter(
        $deck,
        fn (array $card) : bool => $card['number'] !== 8 && $card['number'] !== 9
    );
}

/**
 * Shuffles the whole given deck;
 * 
 * @param array &$deck Shuffles the given deck 
 */
function shuffleDeck(array &$deck) : void
{
    shuffle($deck);
}

/**
 * Takes the first card out of the deck
 * 
 * @param array &$deck Deck to take the very first card off
 */
function takeCardOutOfDeck(array &$deck) : void
{
    array_pop($deck);
}

/**
 * Shows in the page the card in the given deck in the given position
 * 
 * @param array &$deck Deck to get the card from
 * @param int $index Card's index position in the deck
 */
function showCard(array &$deck, int $index = 0, bool $showCardName = false) : void
{
    global $suitNames, $cardName;

    if (!isset($deck[$index]))
        return;

    $card = $deck[$index];
    $cardImagePath = IMAGES_PATH . $suitNames[$card['suit']] . '_' . $card['number'] . '.jpg';
    $imgHtml = "<img src='$cardImagePath'>";

    if ($showCardName)
    {
        echo '<div class="card">';
        echo $imgHtml;
        echo '<p>' . ($cardName[$card['number']] ?? $card['number']) . ' de ' . $suitNames[$card['suit']] . '</p>';
        echo '</div>';
    }
    else
    {
        echo $imgHtml;
    }
}

// ---------------------------------------------------------
// TESTING
// ---------------------------------------------------------

$deck = [];
createFullDeck($deck);
shuffleDeck($deck);


foreach ($deck as $index => $card)
    showCard($deck, $index, true);
