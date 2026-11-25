<?php

declare(strict_types = 1);

require_once __DIR__ . '/EnvioEstandard.php';

class EnvioExpress extends EnvioEstandard
{
    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    public function calcularTarifa() : float
    {
        $tarifa_estandar = parent::calcularTarifa();
        $cargo_urgencia = 10.0;
        return $tarifa_estandar + $cargo_urgencia;
    }
}