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
        $action = $_GET['action'] ?? DEFAULT_ACTION;
        $id = $_GET['id'] ?? DEFAULT_ID;

        settype($id, 'int');
        
        $libraryController = new LibraryController();
        $libraryController->$action($id);
    } 
}
