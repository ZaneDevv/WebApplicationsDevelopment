<?php

declare(strict_types = 1);

namespace Requests;

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

    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * isValid
     *
     * @return bool
     */
    public function isValid() : bool
    {
        return count($this->errors) === 0;
    }

    /**
     * cleanUpUsername
     *
     * @param string $username
     * @return void
     */
    private function cleanUpUsername(string &$username) : void
    {
        $username = strip_tags($username);
        $username = trim($username);
    }

    /**
     * cleanUpPassword
     *
     * @param string $password
     * @return void
     */
    private function cleanUpPassword(string &$password) : void
    {
        $password = strip_tags($password);
    }

    /**
     * isValidUsername
     *
     * @param string $username
     * @return bool
     */
    private function isValidUsername(string $username) : bool
    {
        if (mb_strlen($username) < self::$MINIMUM_USERNAME_CHARCTERS)
        {
            $this->errors['username'] = 'The username must be at least ' . self::$MINIMUM_USERNAME_CHARCTERS . '-character long';
            return false;   
        }

        if (preg_match('/\W/', $username))
        {
            $this->errors['username'] = 'The username must only contain characters';
            return false;
        }

        return true;
    }

    /**
     * isValidPassword
     *
     * @param string $password
     * @return bool
     */
    private function isValidPassword(string $password) : bool
    {
        if (mb_strlen($password) < self::$MINIMUM_PASSWORD_CHARACTERS)
        {
            $this->errors['password'] = 'The password must be at least ' . self::$MINIMUM_PASSWORD_CHARACTERS . '-character long';
            return false;
        }

        if (preg_match('/[A-Z]/', $password))
        {
            $this->errors['password'] = 'The password must contain at least a capital-case character';
            return false;
        }

        if (preg_match('/[a-z]/', $password))
        {
            $this->errors['password'] = 'The password must contain at least a camel-case character';
            return false;
        }

        if (preg_match('/\d/', $password))
        {
            $this->errors['password'] = 'The password must contain at least a digit';
            return false;
        }

        if (preg_match('/[\.#$-_]/', $password))
        {
            $this->errors['password'] = 'The password must contain at least one of the following symbols: . # $ - _';
            return false;
        }

        return false;
    }
}