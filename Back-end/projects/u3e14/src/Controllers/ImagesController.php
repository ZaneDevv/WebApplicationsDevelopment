<?php

declare(strict_types = 1);

namespace Controllers;

use DirectoryIterator;
use Requests\ImagesRequest;
use Lib\Pages;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ImagesController
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

    /**
     * get_images
     *
     * @param array $images
     * @return void
     */
    private function get_images(array &$images) : void
    {
        $images = [];

        $directory = __DIR__ . '/../../public/assets/uploads';
        if (!is_dir($directory))
            return;

        $directory_iterator = new DirectoryIterator($directory);

        foreach ($directory_iterator as $file_data)
        {
            if ($file_data->isDot())
                continue;

            $images[] = '/assets/uploads/' . $file_data->getFilename();
        }
    }

    /**
     * show_form_with_no_images
     *
     * @return void
     */
    public function show_form_with_no_images()
    {
        $this->pages->render('form/form');
    }

    /**
     * show_form
     *
     * @return void
     */
    public function show_form()
    {
        $images_request = new ImagesRequest($_FILES['pictures'] ?? []);

        if (!$images_request->is_valid())
        {
            $this->pages->render('form/form', [ 'errors' => $images_request->errors ]);
            return;
        }

        $images_array = [];
        $this->get_images($images_array);

        $this->pages->render('form/form', [ 'images' => $images_array ]);
    }
}