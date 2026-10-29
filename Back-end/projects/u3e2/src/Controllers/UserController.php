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
    private string $password = '1234';

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

    private static function encrypt(string $password) : string
    {
        return password_hash($password, PASSWORD_BCRYPT);
    }

    public function is_correct_username(string $username) : bool
    {
        return $this->username === $username;
    }

    public function is_correct_password(string $password) : bool
    {
        return self::encrypt($password) === $this->password;
    }
}