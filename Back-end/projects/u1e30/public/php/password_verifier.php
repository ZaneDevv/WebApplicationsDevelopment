<?php

declare(strict_types = 1);

define('PASSWORD_PATTERN', '/^(?=.*\d)(?=.*[A-ZÇÑ])(?=.*[a-zñç])(?=.*[\.\/\\\-_!]).{6,15}$/');

define('VALID_PASSWORD_TEXT', 'Valid password');
define('INVALID_PASSWORD_TEXT', 'Invalid password, please try again');

define('VALID_COLOR', '#050');
define('INVALID_COLOR', '#A00');

$password = $_GET['password'] ?? '';
$validatedPasswordText = '';
$color = '#000';

if (!empty($password))
{
    $isValidPassword = preg_match(PASSWORD_PATTERN, $password);
    
    /*
        Solution made in class:

        $isValidPassword = preg_match('/[A-Z]/', $password);
        $isValidPassword = $isValidPassword && preg_match('/[a-z]/', $password);
        $isValidPassword = $isValidPassword && preg_match('/\d/', $password);
        $isValidPassword = $isValidPassword && preg_match('/[\.\/\\\-_!]/', $password);
    */

    $validatedPasswordText = $isValidPassword ? VALID_PASSWORD_TEXT : INVALID_PASSWORD_TEXT;
    $color = $isValidPassword ? VALID_COLOR : INVALID_COLOR;
}
