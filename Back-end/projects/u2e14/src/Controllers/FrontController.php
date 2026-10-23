<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;

// ---------------------------------------------------------------
// CLASSES
// ---------------------------------------------------------------

class FrontController
{
    // ---------------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------------

    public static function main() : void
    {
        $name = $_GET['name'] ?? '';
        $lastName = $_GET['lastName'] ?? '';
        $grade = $_GET['grade'] ?? 0;
        $birthYear = $_GET['birthYear'] ?? 0;

        settype($grade, 'int');
        settype($birthYear, 'int');

        $pages = new Pages();
        $classroom = new ClassroomController();

        $pages->renderHeader();
        $classroom->showAll();
        $pages->renderFooter();
    }
}