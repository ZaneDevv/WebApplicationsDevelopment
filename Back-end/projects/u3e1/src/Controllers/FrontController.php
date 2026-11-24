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

        $controller_name = ucfirst($_GET['controller'] ?? DEFAULT_CONTROLLER) . 'Controller';
        $action_name = strtolower($_GET['action'] ?? DEFAULT_ACTION);

        $controller_full_name = 'Controllers\\' . $controller_name;

        if (!class_exists($controller_full_name) || in_array($controller_full_name, [ErrorController::class, self::class], true))
        {
            ErrorController::show_error404();
            return;
        }

        $controller = new $controller_full_name();

        if (!is_callable([$controller, $action_name]))
        {
            ErrorController::show_error404();
            return;
        }

        $pages->renderHeader();
        $controller->$action_name();
        $pages->renderFooter();
    } 
}
