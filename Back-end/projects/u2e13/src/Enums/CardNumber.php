<?php

declare(strict_types = 1);

namespace Enums;

enum CardNumber : int
{
    // ----------------------------------------------------------
    // VALUES
    // ----------------------------------------------------------

    case AS = 1;
    case TWO = 2;
    case THREE = 3;
    case FOUR = 4;
    case FIVE = 5;
    case SIX = 6;
    case SEVEN = 7;
    case EIGHT = 8;
    case NINE = 9;
    case SOTA = 10;
    case HORSE = 11;
    case KING = 12;

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Gets the name of the card's number
     * @return string The card's number's name
     * 
     * @author Álvaro Fernández Barrero
     */
    public function name() : string
    {
        return strtolower($this->name);
    }
}