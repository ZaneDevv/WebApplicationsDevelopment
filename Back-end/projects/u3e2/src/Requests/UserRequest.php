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

    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        private User &$user
    )
    {
        $this->cleanUp();
        $this->validate();
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
     * @return void
     */
    private function cleanUpUsername() : void
    {
        $this->user->username = trim(strip_tags($this->user->username));
    }

    /**
     * cleanUpPassword
     *
     * @return void
     */
    private function cleanUpPassword() : void
    {
        $this->user->password = strip_tags($this->user->password);
    }

    /**
     * validateUsername
     *
     * @return bool
     */
    private function validateUsername() : bool
    {
        $username = $this->user->username;

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
     * validatePassword
     *
     * @return bool
     */
    private function validatePassword() : bool
    {
        $password = $this->user->password;

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

    /**
     * cleanUp
     *
     * @return void
     */
    private function cleanUp()
    {
        $this->cleanUpUsername();
        $this->cleanUpPassword();
    }

    /**
     * validate
     *
     * @return void
     */
    private function validate()
    {
        $this->validateUsername();
        $this->validatePassword();
    }
}