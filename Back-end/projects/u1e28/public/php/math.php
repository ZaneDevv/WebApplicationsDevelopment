<?php

declare(strict_types = 1);

/**
 * Computes the factorial of the given number
 * 
 * @param int $n Number to compute the factorial
 * @return int The factorial of the given number
 * 
 * @throws InvalidArgumentException Only positive integers or 0 are accepted
 */
function factorial(int $n) : int
{
    if ($n < 0)
        throw new InvalidArgumentException();

    if ($n <= 1)
        return 1;

    return $n * factorial($n - 1);
}