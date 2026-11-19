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
        $controller_name = $_GET['controller'] ?? CONTROLLER_DEFAULT;
        $action_name = $_GET['action'] ?? ACTION_DEFAULT;

        $controller_class_name = 'Controllers\\' . ucfirst($controller_name) . 'Controller';

        if (!class_exists($controller_class_name) || in_array($controller_class_name, [self::class, ErrorController::class], true))
        {
            ErrorController::show_error404();
            return;
        }

        $controller = new $controller_class_name();

        if (!is_callable([$controller, $action_name]))
        {
            ErrorController::show_error404();
            return;
        }

        $pages = new Pages();
        $pages->renderHeader();

        $controller->$action_name();
        $pages->renderFooter();
    }
}