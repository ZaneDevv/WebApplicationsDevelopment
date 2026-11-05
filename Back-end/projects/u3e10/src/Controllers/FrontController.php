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
        $controller = new AuthController();
        $action = strtolower($_GET['action'] ?? DEFAULT_ACTION);

        if (!is_callable([$controller, $action]))
        {
            ErrorController::show_error_404();
            return;
        }

        $controller->$action();
    } 
}
