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
        $article_controller = new ArticleController();
        $action = $_GET['action'] ?? DEFAULT_ACTION;

        if (!is_callable([$article_controller, $action]))
        {
            ErrorController::show_error_404();
            return;
        }

        $article_controller->$action();
    } 
}
