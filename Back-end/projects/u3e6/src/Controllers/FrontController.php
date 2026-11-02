<?php

declare(strict_types = 1);

namespace Controllers;

use lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class FrontController
{
    public static function main() : void
    {
        $pages = new Pages();
        $operation_controller = new OperationController();

        $pages->renderHeader();
        $operation_controller->show_operation();
        $pages->renderFooter();
    }
}