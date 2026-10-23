<?php

declare(strict_types = 1);

require_once __DIR__ . '/Account.php';

$account = new Account();
$account->money = 15345;
$account->owner = ' lAmbERt';

echo '<pre>';
echo "Money: $account->formattedMoney$" . PHP_EOL;
echo "Owner: $account->owner";
echo '</pre>';