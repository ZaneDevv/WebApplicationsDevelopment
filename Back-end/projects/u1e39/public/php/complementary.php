<?php

define('BITS_AMOUNT', 10);

$bits = [];
$complementaries = [];

for ($i = 0; $i < BITS_AMOUNT; $i++)
{
    $bit = rand(0, 1);
    $complementary = !$bit;

    settype($complementary, 'int');

    $bits[] = $bit;
    $complementaries[] = $complementary;
}

echo '<h2>Bits:</h2>';
print_r($bits);

echo '<h2>Complementary bits</h2>';
print_r($complementaries);