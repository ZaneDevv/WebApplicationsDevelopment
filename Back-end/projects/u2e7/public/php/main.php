<?php

declare(strict_types = 1);

include_once __DIR__ . '/Product.php';

$procucts = [];

$procuctsAmount = random_int(10, 100);
for ($i = 0; $i < $procuctsAmount; $i++)
    array_push($procucts, new Product());

echo Product::getObjectsAmount();