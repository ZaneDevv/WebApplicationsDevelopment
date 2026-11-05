<?php

declare(strict_types = 1);

namespace Requests;

use Models\User;

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
    private function clean_up(array $input) : void
    {
        $this->data = [
            'username' => self::clean_string($input['username'] ?? ''),
            'password' => self::clean_string($input['password'] ?? '')
        ];
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
}