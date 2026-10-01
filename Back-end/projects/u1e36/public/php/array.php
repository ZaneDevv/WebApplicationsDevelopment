<?php

$numbers = [];

while (count($numbers) <= 120)
    $numbers[] = rand(0, 1e4);

print_r($numbers);