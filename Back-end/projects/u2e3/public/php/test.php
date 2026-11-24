<?php

declare(strict_types = 1);

require_once __DIR__ . '/SavingAccount.php';

$account = new SavingAccount('John', 15.67, 0);
$account->withdraw(0.67);
$account->saveMoney(10);

var_dump($account);