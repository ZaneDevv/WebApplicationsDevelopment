<?php

declare(strict_types = 1);

namespace Lib;

class Pages
{
    // ----------------------------------------------------------
    // CONSTANTS
    // ----------------------------------------------------------

    private const string VIEWS_DIR = __DIR__ . '../../Views/';

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------
    
    /**
     * Renders the page with the given page content
     *
     * @param string $pageName Page content's name
     * @param ?array $params Parameters for the rendering
     * 
     * @author Álvaro Fernández Barrero
     */
    public function render(string $pageName, ?array $params = null) : void
    {
        if ($params !== null)
        {
            foreach ($params as $name => $value)
                $$name = $value;
        }

        require self::VIEWS_DIR . 'Layout/header.php';
        require self::VIEWS_DIR . $pageName . '.php';
        require self::VIEWS_DIR . 'Layout/footer.php';
    }
}