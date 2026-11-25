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
        $post_language = $_POST['language'] ?? '';
        
        if (!empty($post_language))
            setcookie('language', $post_language, [
                'expires' => time() + 3600 * 24 * 365,
                'path' => '/',
                'httponly' => true,
                'samesite' => 'Lax',
            ]);

        $language = $_COOKIE['language'] ?? DEFAULT_LANGUAGE;

        (new Pages())->render('form/form', [ 'language' => $language ]);
    } 
}
