<?php

$numbers = [];
$squares = [];
$cubes = [];

for ($i = 0; $i < 20; $i++)
{
    $random = rand(0, 100);

    $numbers[] = $random;
    $squares[] = $random ** 2;
    $cubes[] = $random ** 3;
}

echo '<h2>Numbers:</h2>';
print_r($numbers);

echo '<h2>Squares:</h2>';
print_r($squares);

echo '<h2>Cubes:</h2>';
print_r($cubes);