<?php

declare(strict_types = 1);

require_once __DIR__ . '/CardSuit.php';

class Card
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public int $number
    {
        get => $this->number ?? -1;
        set(int $value)
        {
            if ($value < 1 || $value > 12)
                throw new InvalidArgumentException('No available card number!');
        
            $this->number = $value;
        }
    }

    public CardSuit | int $suit
    {
        get => $this->suit ?? -1;
        set(CardSuit | int $value)
        {
            if (is_int($value) && in_array($value, CardSuit::cases()))
                throw new InvalidArgumentException('No available card suit!');
            
            $this->suit = $value;
        }
    }

    private string $suitName
    {
        get => is_int($this->suit) ? CardSuit::from($this->suit)->getSuitName() : $this->suit->getSuitName();
    }

    private string $cardImage
    {
        get => '<img class="card" src="./src/img/' . strtolower($this->suitName) . '_' . $this->number . '.jpg">';
    }

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    /**
     * Creates a new card with the given number and card suit
     * 
     * @param int $number Card's number
     * @param int $suit Card's suit
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __construct(int $number, CardSuit | int $suit)
    {
        $this->number = $number;
        $this->suit = $suit;
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Shows in the page this card's image
     * 
     * @author Álvaro Fernández Barrero
     */
    public function showCard() : void
    {
        echo $this->cardImage;
    }

    /**
     * Makes a string out of this instance's data
     * 
     * @author Álvaro Fernández Barrero
     */
    public function __toString() : string
    {
        return 'Number: ' . $this->number . ' | Suit: ' . $this->suitName;
    }
}