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
        $action_name = strtolower($_GET['action'] ?? DEFAULT_ACTION);
        $controller = new UserController();

        if (!is_callable([$controller, $action_name]))
        {
            ErrorController::show_error_404();
            return;
        }

        $controller->$action_name();
    } 
}