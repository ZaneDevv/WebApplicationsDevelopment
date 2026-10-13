<?php

declare(strict_types = 1);

require_once __DIR__ . '/Product.php';
require_once __DIR__ . '/User.php';

// --------------------------------------------------------- \\

$random1 = random_int(5, 15);
$random2 = random_int(5, 15);

$objects = [];

for ($i = 0; $i < $random1; $i++)
    array_push($objects, new Product());

for ($i = 0; $i < $random2; $i++)
    array_push($objects, new User());

echo '<pre>';
foreach ($objects as $object)
    echo $object->getId() . PHP_EOL;
echo '</pre>';