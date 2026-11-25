<?php

declare(strict_types = 1);

// ------------------------------------------------
// REQUIRES
// ------------------------------------------------

require_once __DIR__ . '/EnvioFactory.php';
require_once __DIR__ . '/TipoEnvio.php';

// ------------------------------------------------
// LOGIC
// ------------------------------------------------

$factory = new EnvioFactory();

$peso = 1.5;
$distancia = 250;
$tipo = TipoEnvio::Express;
$tipoString = $tipo->value;

$envio = $factory->facoryMethod($tipo, $peso, $distancia);
$costo_final = $envio->calcularTarifa();

echo "El costo final para el envío '{$tipoString}' ({$peso}kg, {$distancia}km) es: \${$costo_final}";