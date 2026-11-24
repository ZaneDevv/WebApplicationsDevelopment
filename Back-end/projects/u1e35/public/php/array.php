<?php

$integers = [rand(1, 1e5), rand(1, 1e5), rand(1, 1e5), rand(1, 1e5), rand(1, 1e5), rand(1, 1e5), rand(1, 1e5), rand(1, 1e5)];

echo '<h2>Numbers:</h2>';
echo '<pre>';
foreach ($integers as $integer)
{
    echo $integer . PHP_EOL;
}
echo '</pre>';

echo '<h2>Sorted numbers:</h2>';

asort($integers);
print_r($integers);

echo '<h2>Length</h2>';
echo 'Total length: ' . count($integers);