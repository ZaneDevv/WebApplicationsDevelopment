<?php

declare(strict_types = 1);

function duplicateCharacters(string $text) : string
{
    $result = '';

    for ($i = 0; $i < strlen($text); $i++)
    {
        $result .= $text[$i] . $text[$i];
    }

    return $result;
}