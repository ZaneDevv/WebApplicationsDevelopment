<?php

namespace Controllers;

use Core\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class HomeController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function show() : void
    {
        $this->pages->render('home', [
            'show_cookies_panel' => isset($_COOKIE[COOKIE_NAME])
        ]);
    }

    public function set_cookie() : void
    {
        setcookie(COOKIE_NAME, 'true', [
            'expires' => time() + 36e+4,
            'path' => '/',
            'httponly' => true,
            'samesite' => 'Lax',
        ]);

        $this->show();
    }
}
