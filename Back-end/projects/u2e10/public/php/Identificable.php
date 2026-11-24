<?php

declare(strict_types = 1);

trait Identificable
{
    public function generateId() : string
    {
        return $this->getIdPrefix() . random_int(1000, 9999);
    }

    public abstract function getIdPrefix() : string;
}