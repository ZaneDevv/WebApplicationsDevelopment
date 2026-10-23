<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Deck;
use Models\Card;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class DeckController
{
    // ----------------------------------------------------------
    // STATICS
    // ----------------------------------------------------------

    private static $allowedCardsMask = 0b111001111111;

    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;
    private Deck $deck;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
        $this->deck = new Deck(self::$allowedCardsMask);
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Shows the deck on screen
     * @author Álvaro Fernández Barrero
     */
    public function show() : void
    {
        $this->renderDeck('Deck');
    }

    /**
     * Shuffles and shows the deck on screen
     * @author Álvaro Fernández Barrero
     */
    public function showShuffled() : void
    {
        $this->deck->shuffle();
        $this->renderDeck('Shuffled deck');
    }

    /**
     * Shows the first card in the deck after shuffling it
     * @author Álvaro Fernández Barrero
     */
    public function showFirstCard() : void
    {
        $this->deck->shuffle();
        $this->pages->render('deck/showCard', [
            'card' => $this->deck->getFirstCard()
        ]);
    }

    /**
     * Renders the deck on screen
     * 
     * @param string $title The title for the rendering to show above the deck on screen
     * 
     * @author Álvaro Fernández Barrero
     */
    private function renderDeck(string $title = 'Deck') : void
    {
        $this->pages->render('deck/showDeck', [
            'deck' => $this->deck->getCards(),
            'title' => $title
        ]);
    }
}