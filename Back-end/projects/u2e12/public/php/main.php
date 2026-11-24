<?php

declare(strict_types = 1);

require_once __DIR__ . '/Person.php';

$person = new Person('Pablo', 19, 'Granada');
echo $person->getName() . ' is ' . $person->getAge() . ' and is from ' . $person->getCity();