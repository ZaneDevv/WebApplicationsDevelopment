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
        $color_post = $_POST['color'] ?? '';

        if (!empty($color_post))
            setcookie('color', $color_post, [
                'expires' => time() + 3600 * 24 * 365,
                'path' => '/',
                'httponly' => true,
                'samesite' => 'Lax',
            ]);

        (new Pages())->render('form/form', [ 'color' => $_COOKIE['color'] ?? DEFAULT_COLOR ]);
    }
}
