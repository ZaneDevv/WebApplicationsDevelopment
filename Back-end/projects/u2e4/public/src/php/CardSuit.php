<?php

declare(strict_types = 1);

enum CardSuit : int
{
    // ----------------------------------------------------------
    // VALUES
    // ----------------------------------------------------------

    case Oros = 1;
    case Copas = 2;
    case Espadas = 3;
    case Bastos = 4;

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * Gets the name as string of the given card suit
     * @return string The given card suit's name
     * 
     * @author Álvaro Fernández Barrero
     */
    public function getSuitName() : string
    {
        return match($this)
        {
            CardSuit::Oros => 'Oros',
            CardSuit::Copas => 'Copas',
            CardSuit::Espadas => 'Espadas',
            CardSuit::Bastos => 'Bastos',
        };
    }
}