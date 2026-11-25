<?php

declare(strict_types = 1);

interface CalculadorEnvio
{
    /**
     * calcularCosto
     *
     * @return float
     */
    public function calcularCosto() : float;
}