<?php

declare(strict_types = 1);

namespace Requests;

use finfo;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ImagesRequest
{
    // ----------------------------------------------------------
    // STATICS
    // ----------------------------------------------------------

    private static int $MAXIMUM_BYTES_SIZE = 5 * 1024 * 1024; 
    private static array $ALLOWED_FILE_EXTENSIONS = [
        'image/gif' => 'gif',
        'image/jpeg' => 'jpg',
        'image/png' => 'png'
    ];

    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) array $data = [];
    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(array $input)
    {
        $this->clean_up($input);
        $this->validate();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * is_valid
     *
     * @return bool
     */
    public function is_valid() : bool
    {
        return count($this->errors) === 0;
    }

    /**
     * clean_up
     *
     * @param array $data
     * @return void
     */
    public function clean_up(array $data) : void
    {
        $this->data['pictures'][] = $data;
    }

    /**
     * validate
     *
     * @return void
     */
    public function validate() : void
    {
        foreach ($this->data['pictures'] as $picture_key => $picture)
        {
            if ($picture['error'] !== UPLOAD_ERR_OK)
            {
                $this->errors[$picture_key] = 'The file could not be uploaded';
                continue;
            }

            if ($picture['size'] >= self::$MAXIMUM_BYTES_SIZE)
            {
                $this->errors[$picture_key] = 'The file is too large. Only ' . self::$MAXIMUM_BYTES_SIZE . 'B or less is allowed';
                continue;
            }

            if (!is_uploaded_file($picture['tmp_name']))
            {
                $this->errors[$picture_key] = 'Invalid request';
                continue;
            }

            $file_info = new finfo(FILEINFO_MIME_TYPE);
            $actual_mime = $file_info->file($picture['tmp_name']);

            if (!array_key_exists($actual_mime, self::$ALLOWED_FILE_EXTENSIONS))
            {
                $this->errors[$picture_key] = 'The extension is not allowed';
                continue;
            }

            $directory = __DIR__ . '/../../public/assets/uploads';
            $file_name = $directory . '/' . date('Ymd_His') . bin2hex(random_bytes(4)) . '.' . self::$ALLOWED_FILE_EXTENSIONS[$actual_mime];

            if (!is_dir($directory))
                mkdir($directory, 0755);

            if (!move_uploaded_file($picture['tmp_name'], $file_name))
                $this->errors[$picture_key] = 'Could not upload the file';
        }
    }
}