<?php

namespace Controllers;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ErrorController
{
    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function show_error404() : string
    {
        return 'Error 404: Data not found!';
    }
}
