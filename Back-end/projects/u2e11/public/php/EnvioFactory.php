<?php

require_once __DIR__ . '/EnvioEstandard.php';
require_once __DIR__ . '/EnvioExpress.php';
require_once __DIR__ . '/EnvioInternacional.php';
require_once __DIR__ . '/EnvioBase.php';
require_once __DIR__ . '/TipoEnvio.php';

class EnvioFactory
{
    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    /**
     * facoryMethod
     *
     * @param TipoEnvio $tipo
     * @param float $peso
     * @param float $distance
     * @return EnvioBase
     */
    public function facoryMethod(TipoEnvio $tipo, float $peso = 0, float $distance = 0) : EnvioBase
    {
        return match ($tipo)
        {
            TipoEnvio::Estandard => new EnvioEstandard($peso, $distance),
            TipoEnvio::Express => new EnvioExpress($peso, $distance),
            TipoEnvio::Internacional => new EnvioInternacional($peso, $distance)
        };
    }
}