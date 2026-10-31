<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class FrontController
{
    public static function main() : void
    {
        (new Pages())->render(
            $_SERVER['REQUEST_METHOD'] === 'POST' ? 'form/response' : 'form/form',
            [
                'data' => $_POST ?? []
            ]
        );
    } 
}