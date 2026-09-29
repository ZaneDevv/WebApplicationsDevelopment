<?php

declare(strict_types = 1);

/**
 * Computes the maximum common divisor between the two given numbers
 * 
 * @param int $a First number in the operation
 * @param int $b Second number in the operaton
 * 
 * @return int The maximum common divisor between the two given numbers
 */
function mcd(int $a, int $b) : int
{
    $result = 0;
    $lowestNumber = min($a, $b);

    for ($i = $lowestNumber; $result === 0 && $i > 0; $i--)
    {
        if ($i === 1 || ($a % $i === 0 && $b % $i === 0))
        {
            $result = $i;
        }
    }

    return $result;
}