<?php

declare(strict_types = 1);

class BankAccount
{
    public function __construct(
        protected string $owner,
        private float $money
    )
    {}

    public function getMoney() : float
    {
        return $this->money;
    }

    public function saveMoney(float $amount) : void
    {
        if ($amount < 0)
            throw new InvalidArgumentException('Amount of money to save cannot be negative');

        $this->money += $amount;
    }

    public function withdraw(float $amount) : void
    {
        if ($amount < 0)
            throw new InvalidArgumentException('Amount of money to withdraw cannot be negative');

        if ($amount > $this->money)
            throw new InvalidArgumentException('Amount of money to withdraw cannot be greater than the money saved');

        $this->money -= $amount;
    }
}