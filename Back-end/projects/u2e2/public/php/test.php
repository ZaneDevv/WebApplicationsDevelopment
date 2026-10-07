<?php

declare(strict_types = 1);

require_once __DIR__ . '/Client.php';

$client = new Client("John", "Doe");
echo $client->getFullName();