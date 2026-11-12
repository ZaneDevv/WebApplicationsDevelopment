<?php

declare(strict_types = 1);

namespace Controllers;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class FrontController
{
    public static function main() : void
    {
        setcookie('current_date', date('Y-m-d H:i:s'), [
            'secure' => true,
            'httponly' => true,
            'path' => '/',
            'expires' => time() + 380_000
        ]);
        
        echo $_COOKIE['current_date'] ?? '';
    } 
}
