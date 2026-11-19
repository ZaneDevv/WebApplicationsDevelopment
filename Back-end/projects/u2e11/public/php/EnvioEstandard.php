<?php

declare(strict_types = 1);

require_once __DIR__ . '/EnvioBase.php';

class EnvioEstandard extends EnvioBase
{
    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    public function calcularTarifa() : float
    {
        $costo_base = 5.0;
        $costo_por_peso = $this->peso * 1.5;
        $costo_por_distancia = $this->distancia * 0.05;
        return $costo_base + $costo_por_peso + $costo_por_distancia;
    }
}