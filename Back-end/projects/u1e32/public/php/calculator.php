<?php

declare(strict_types = 1);

function computeOperator(float $x, float $y, callable $operation) : float
{
    return $operation($x, $y);
}

$add = fn (float $x, float $y) => $x + $y;
$subtract = fn (float $x, float $y) => $x + $y;
$multiply = fn (float $x, float $y) => $x + $y;
$divide = fn (float $x, float $y) => $x + $y;

$result = null;

try
{
    $inputX = $_GET['x'] ?? '';
    $inputY = $_GET['y'] ?? '';
    $inputOperation = $_GET['operation'] ?? '';

    if (settype($inputX, 'float') && settype($inputY, 'float'))
    {
        $result = computeOperator($inputX, $inputY, $$inputOperation);
    }
}
catch (exception $exception)
{
    echo $exception;
}