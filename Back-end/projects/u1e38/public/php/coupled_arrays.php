<?php

define('ARRAY_SIZE', 100);

$array1 = [];
$array2 = [];
$array3 = [];

for ($i = 0; $i < ARRAY_SIZE; $i++)
{
    $array1[$i] = $i;
    $array2[ARRAY_SIZE - $i - 1] = $i;
}

for ($i = 0; $i < ARRAY_SIZE; $i++)
{
    $array3[$i] = $array1[$i] + $array2[$i];
}

print_r($array3);