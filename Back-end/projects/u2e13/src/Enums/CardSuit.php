<?php

declare(strict_types = 1);

namespace Enums;

enum CardSuit : string
{
    // ----------------------------------------------------------
    // VALUES
    // ----------------------------------------------------------

    case Oros = 'Oros';
    case Copas = 'Copas';
    case Espadas = 'Espadas';
    case Bastos = 'Bastos';

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