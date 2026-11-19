<?php
declare(strict_types=1);
require_once 'ValidacionPedido.php';
require_once 'config.php';
require_once 'funcionesReparto.php';

/**
 * Ejercicio: Reparto de pedidos de una tienda
 * Se generan 15 pedidos aleatorios que se procesan del último al primero
 * y muestra un informe.
 */

$catalogo = crearCatalogo();
$clientes = crearClientes();
$pedidos  = generarPedidos($clientes, $catalogo, NUM_PEDIDOS);

$totalPedidos = count($pedidos);
$resumen      = cargarPedidosFurgo($pedidos, $catalogo);
$informe      = generarInforme($resumen, count($pedidos));
$repartoParado = $resumen['peso'] >= PARAR_CARGA;
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Reparto</title>

</head>
<body>
<p>=== FURGONETA DE REPARTO ===</p>
<p>Pedidos en cola: <?= $totalPedidos ?></p>

<?php foreach ($resumen['lineas'] as $linea): ?>
    <?php $aceptado = $linea['resultado'] === ValidacionPedido::OK; ?>
        <p>
           #<?= sprintf('%02d', $linea['pedido']['id']) ?>
            <?= $linea['pedido']['cliente'] ?> |
            <?= $linea['pedido']['unidades'] ?> x <?= $linea['pedido']['producto'] ?> |
            <?php if ($aceptado): ?>
               ACEPTADO |<?= formatearEuros($linea['importe']) ?>|
                carga: <?= formatearKilos($linea['carga']) ?>
            <?php else: ?>
                RECHAZADO |
                <?= $linea['resultado']->value ?>
            <?php endif; ?>
        </p>
    <?php endforeach; ?>
        <?php if ($repartoParado): ?>
            <p>La furgoneta alcanza <?= formatearKilos($resumen['peso']) ?>. Se detiene el reparto.</p>
        <?php else: ?>
            <p>Se han procesado todos los pedidos de la cola.</p>
        <?php endif; ?>

<p>=== INFORME ===</p>

<p>
    Aceptados: <?= $informe['aceptados'] ?> |
    Rechazados: <?= $informe['rechazados'] ?> |
    Sin procesar: <?= $informe['sinProcesar'] ?>
</p>
<p>
    Rechazos -&gt; <?= convertirRechazosATexto($informe['rechazosPorMotivo']) ?>
</p>

<p>
    Peso total: <?= formatearKilos($informe['peso']) ?> |
    Facturado: <?= formatearEuros($informe['facturado']) ?>
</p>
<p>
    Ranking: <?= convertirRankingATexto($informe['ranking'])?>
</p>
<p>
    Clientes atendidos: <?= implode(', ', $informe['clientes'])?>
</p>

</body>
</html>
