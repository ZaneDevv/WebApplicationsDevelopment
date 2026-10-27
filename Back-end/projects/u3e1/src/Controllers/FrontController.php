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
        $pages = new Pages();
        $pages->renderHeader();
        $pages->render('form/form');
        $pages->render('form/response', [
            'username' => htmlspecialchars($_POST['username'] ?? '', ENT_QUOTES, 'UTF-8'),
            'lastname' => htmlspecialchars($_POST['lastname'] ?? '', ENT_QUOTES, 'UTF-8'),
            'check' => htmlspecialchars($_POST['check'] ?? '', ENT_QUOTES, 'UTF-8'),
        ]);
        $pages->renderFooter();
    } 
}
