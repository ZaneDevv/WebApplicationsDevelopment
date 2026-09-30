<?php

declare(strict_types = 1);

define('PASSWORD_PATTERN', '/^(?=.*\d)(?=.*[A-ZÇÑ])(?=.*[a-zñç])(?=.*[^a-zA-Z0-9]).{6,15}$/');

define('VALID_PASSWORD_TEXT', 'Valid password');
define('INVALID_PASSWORD_TEXT', 'Invalid password');

define('VALID_COLOR', '#050');
define('INVALID_COLOR', '#A00');

$password = $_GET['password'];
$validatedPasswordText = '';
$color = '#000';

if (!empty($password))
{
    $isValidPassword = preg_match(PASSWORD_PATTERN, $password);
    $validatedPasswordText = $isValidPassword ? VALID_PASSWORD_TEXT : INVALID_PASSWORD_TEXT;
    $color = $isValidPassword ? VALID_COLOR : INVALID_COLOR;
}
