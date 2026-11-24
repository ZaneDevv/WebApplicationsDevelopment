<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ErrorController
{
    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function show_error_404()
    {
        http_response_code(404);
        (new Pages())->render('error/error_404');
    }
}