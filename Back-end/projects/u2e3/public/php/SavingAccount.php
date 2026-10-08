<?php

declare(strict_types = 1);

require_once __DIR__ . '/BankAccount.php';

class SavingAccount extends BankAccount
{
    public function __construct(
        string $owner, float $money,
        private float $interest
    )
    {
        parent::__construct($owner, $money);
    }

    public function resume() : string
    {
        return 'Owner: ' . $this->owner . ' | money: $' . $this->getMoney();
    }
} 