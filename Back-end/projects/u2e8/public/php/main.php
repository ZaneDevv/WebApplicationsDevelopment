<?php

declare(strict_types = 1);

try
{
    $dogs = [];

    require_once __DIR__ . '/Dog.php';

    $dog = new Dog(24.5, 'Bulldog', 'White', 'Labrador');
    $dog->showProperties();
    $dog->speak();

    array_push($dogs, $dog);
    array_push($dogs, new Dog(10, 'Caniche', 'White', 'Caniche'));
}
catch (Exception $exception)
{
    echo $exception;
}