<?php

declare(strict_types = 1);

class Account
{
    // -----------------------------------------------
    // ATTRIBUTES
    // -----------------------------------------------

    public float $money = 0
    {
        set (float $money)
        {
            if ($money < 0)
                throw new InvalidArgumentException('Money cannot be negative');

            $this->money = $money;
        }
    }

    public string $owner = ''
    {
        set(string $owner)
        {
            $owner = trim($owner);
            $owner = strtoupper(substr($owner, 0, 1)) . strtolower(substr($owner, 1));
            $this->owner = $owner;
        }
    }

    public string $formattedMoney
    {
        get => number_format($this->money, 2);
    }

    // -----------------------------------------------
    // CONSTRUCTORS
    // -----------------------------------------------

    public function __construct(float $money = 0, string $owner = 'Nobody')
    {
        $this->money = $money;
        $this->owner = $owner;
    }
}