<?php

namespace Controllers;

use Core\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ErrorController
{
    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function show_error404() : void
    {
        (new Pages())->render('error/error404.php');
    }
}
