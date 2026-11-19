<?php

declare(strict_types = 1);

namespace Requests;

use finfo;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class UserRequest
{
    // ----------------------------------------------------------
    // STATIC
    // ----------------------------------------------------------

    private static int $MINIMUM_USERNAME_CHARCTERS = 3;
    private static int $MINIMUM_PASSWORD_CHARACTERS = 12;
    private static int $MAX_SIZE_BYTES = 5 * 1024 * 1024;

    public private(set) static array $ALLOWED_FILE_EXTENSIONS = [
        'image/jpeg' => 'jpg',
        'image/png' => 'png',
        'image/gif' => 'gif'
    ];

    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) array $data = [];
    public private(set) array $pictures = [];
    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(array $input, array $pictures)
    {
        $this->clean_up($input, $pictures);
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
     * clean_string
     *
     * @return string
     */
    private static function clean_string(string $string) : string
    {
        return is_string($string) ? htmlspecialchars(strip_tags(trim($string)), ENT_QUOTES, 'UTF-8') : '';
    }

    /**
     * clean_up
     *
     * @return void
     */
    private function clean_up(array $input, array $pictures) : void
    {
        $this->data = [
            'username' => self::clean_string($input['username'] ?? ''),
            'password' => self::clean_string($input['password'] ?? '')
        ];

        foreach ($pictures as $picture_key => $picture)
            $this->pictures[0] = $picture;
    }

    /**
     * validate
     *
     * @return void
     */
    private function validate()
    {
        $this->validate_username();
        $this->validate_password();
        $this->validate_picture();
    }
    
    /**
     * validate_username
     *
     * @return void
     */
    private function validate_username() : void
    {
        if (strlen($this->data['username']) < self::$MINIMUM_USERNAME_CHARCTERS)
            $this->errors['username'] = 'The username must be at least ' . self::$MINIMUM_USERNAME_CHARCTERS . '-character long';
        

        if (preg_match('/\W/', $this->data['username']))
            $this->errors['username'] = 'The username must only contain characters';
    }

    /**
     * validate_password
     *
     * @return void
     */
    private function validate_password() : void
    {
        if (strlen($this->data['password']) < self::$MINIMUM_PASSWORD_CHARACTERS)
            $this->errors['password'] = 'The password must be at least ' . self::$MINIMUM_PASSWORD_CHARACTERS . '-character long';

        if (!preg_match('/[A-Z]/', $this->data['password']))
            $this->errors['password'] = 'The password must contain at least a capital-case character';

        if (!preg_match('/[a-z]/', $this->data['password']))
            $this->errors['password'] = 'The password must contain at least a camel-case character';

        if (!preg_match('/\d/', $this->data['password']))
            $this->errors['password'] = 'The password must contain at least a digit';

        if (!preg_match('/[\.#$-_]/', $this->data['password']))
            $this->errors['password'] = 'The password must contain at least one of the following symbols: . # $ - _';
    }

    /**
     * validate_picture
     *
     * @return void
     */
    private function validate_picture() : void
    {
        if (!isset($this->pictures[0]))
        {
            $this->errors['picture'] = 'The picture was not found!';
            return;
        }

        $picture = $this->pictures[0];

        if ($picture['error'] !== UPLOAD_ERR_OK)
        {
            $this->errors['picture'] = 'The picture could not be sent to the server successfully';
            return;   
        }

        if ($picture['size'] > self::$MAX_SIZE_BYTES)
        {
            $this->errors['picture'] = 'The picture is too large. Only ' . self::$MAX_SIZE_BYTES . 'B are allowed at most';
            return;
        }

        if (!is_uploaded_file($picture['tmp_name']))
        {
            $this->errors['picture'] = 'Invalid request';
            return;
        }

        $file_info = new finfo(FILEINFO_MIME_TYPE);
        $actual_mime = $file_info->file($picture['tmp_name']);

        $this->pictures[0]['actual_mime'] = $actual_mime;

        if (!array_key_exists($actual_mime, self::$ALLOWED_FILE_EXTENSIONS))
        {
            $this->errors['picture'] = 'The  format is not allowed';
            return;
        }

        $directory = __DIR__ . '/../../public/assets/uploads';

        if (!is_dir($directory))
            mkdir($directory, 0755, true);

        $file_name = date('Ymd_His') . '_' . bin2hex(random_bytes(4)) . '.' . UserRequest::$ALLOWED_FILE_EXTENSIONS[$actual_mime];

        if (!move_uploaded_file($picture['tmp_name'], $directory . '/' . $file_name))
            $this->errors['picture'] = 'Internal error when uploaded the file';
    }
}