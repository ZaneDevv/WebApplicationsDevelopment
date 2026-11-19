<?php

declare(strict_types = 1);

namespace Controllers;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class UserController
{
    // ----------------------------------------------------------
    // ATTRBITES
    // ----------------------------------------------------------

    private string $username = 'user';
    private string $password = 'Password2000';

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->password = self::encrypt($this->password);
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    /**
     * encrypt
     * 
     * @param string $password
     * @return string
     */
    private static function encrypt(string $password) : string
    {
        return password_hash($password, PASSWORD_BCRYPT);
    }

    /**
     * is_correct_username
     * 
     * @param string $username
     * @return bool
     */
    public function is_correct_username(string $username) : bool
    {
        return $this->username === $username;
    }

    /**
     * is_correct_password
     * 
     * @param string $password
     * @return bool
     */
    public function is_correct_password(string $password) : bool
    {
        return password_verify($password, $this->password);
    }
}