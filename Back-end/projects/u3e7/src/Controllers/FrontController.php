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
        $file = 'testing_pdf.pdf';

        header('Content-Type: application/pdf');
        header('Content-Disposition: attachment; filename=' . $file . '"');
        header('Content-Length: ' . filesize($file));

        readfile($file);
        exit;
    } 
}
