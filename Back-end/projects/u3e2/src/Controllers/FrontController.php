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
        $controller_name = $_GET['controller'] ?? DEFAULT_CONTROLLER;
        $action_name = $_GET['action'] ?? DEFAULT_ACTION;

        $controller_full_name = 'Controllers\\' . ucfirst($controller_name) . 'Controller';

        if (!class_exists($controller_full_name) || in_array($controller_full_name, [self::class, ErrorController::class], true))
        {
            ErrorController::show_error_404();
            return;
        }
            
        $controller = new $controller_full_name();
        
        if (!is_callable([$controller, $action_name]))
        {
            ErrorController::show_error404();
            return;
        }

        $controller->$action_name();
    } 
}
