<?php

declare(strict_types = 1);

function isPrime(int $x) : bool
{
    if (($x & 1) === 0)
        return $x === 2;

    $isNumberPrime = true;
    
    for ($i = 3; $isNumberPrime && $i < $x; $i += 2)
    {
        if ($x % $i === 0)
        {
            $isNumberPrime = false;
        }
    }

    return $isNumberPrime;
}