<?php

/**
 * Álvaro Fernández Barrero
 * 2º DAW Bilingüe
 */

declare (strict_types = 1);

// -------------------------------------------
// CONSTANTES
// -------------------------------------------

define('CANTIDAD_PEDIDOS', 15);
define('MAXIMO_PESO_FURGONETA', 15);

define('PRINT_PEDIDO_FORMATO', "#%2d %-10s | %s x %-15s | %10s | %.2f EUR | carga: %.1f kg" . PHP_EOL);

// -------------------------------------------
// VARIABLES
// -------------------------------------------

$catalogo = [
    0 => [
        'id' => 0,
        'nombre' => 'cuaderno',
        'precio' => 2.5,
        'peso' => 1,
        'stock' => 8,
        'descuento' => 10
    ],
    1 => [
        'id' => 1,
        'nombre' => 'boligrafo',
        'precio' => 0.9,
        'peso' => 0.4,
        'stock' => 25,
        'descuento' => null
    ],
    2 => [
        'id' => 2,
        'nombre' => 'archivador',
        'precio' => 4.2,
        'peso' => 3,
        'stock' => 1,
        'descuento' => 15
    ]
];

$clientes = [
    1 => [
        'id' => 1,
        'nombre' => 'John'
    ],
    2 => [
        'id' => 2,
        'nombre' => 'Jane'
    ],
    3 => [
        'id' => 3,
        'nombre' => 'Juan'
    ],
    4 => [
        'id' => 4,
        'nombre' => 'Maria'
    ]
];

$pedidos = [];

$pesoFurgoneta = 0;
$precioFinal = 0;

// -------------------------------------------
// METODOS
// -------------------------------------------

function generarPedidoAleatorio(int $id) : bool
{
    global $pedidos, $clientes, $catalogo;

    $sePudoExtraer = false;

    $productoId = random_int(0, count($catalogo) - 1);
    $unidadesProducto = random_int(1, 5);

    if ($catalogo[$productoId]['stock'] > $unidadesProducto)
    {
        $catalogo[$productoId]['stock'] -= $unidadesProducto;
        
        array_push($pedidos, [
            'id' => $id,
            'cliente' => $clientes[random_int(1, count($clientes))]['id'],
            'producto' => $productoId,
            'unidades' => $unidadesProducto
        ]);

        $sePudoExtraer = true;
    }

    return $sePudoExtraer;
}

function generarPedidosAleatorios() : void
{
    for ($i = 1; $i <= CANTIDAD_PEDIDOS; $i++)
    {
        generarPedidoAleatorio($i);
    }
}

function extraerPedido() : mixed
{
    global $pedidos;

    return array_pop($pedidos);
}

function agregarPedidosAFurgoneta(int &$aceptados, int &$rechazados) : void
{
    global $clientes, $pesoFurgoneta, $precioFinal, $catalogo, $pedidos;

    $contador = count($pedidos);

    while ($pesoFurgoneta < MAXIMO_PESO_FURGONETA && $contador > 0)
    {
        $pedidoExtraido = extraerPedido();

        $informacionProducto = $catalogo[$pedidoExtraido['producto']];
        $estaEnStock = $informacionProducto['stock'] >= $pedidoExtraido['unidades'];

        if ($estaEnStock)
        {
            $pesoFurgoneta += $informacionProducto['peso'];
    
            $precio = $informacionProducto['precio'];
            if (isset($informacionProducto['descuento']) && is_float($informacionProducto['descuento']))
                $precio -= $precio * $informacionProducto['descuento'] / 100;
    
            $precioFinal += round($precio, 2);
            $aceptados++;
        }
        else
        {
            $rechazados++;
        }

        printf(
            PRINT_PEDIDO_FORMATO,
            $contador,
            $clientes[$pedidoExtraido['cliente']]['nombre'],
            $pedidoExtraido['unidades'],
            $informacionProducto['nombre'],
            $estaEnStock ? 'ACEPTADO' : 'RECHAZADO',
            $informacionProducto['precio'],
            $informacionProducto['peso'],
        );
        $contador--;
    }
}

// -------------------------------------------
// RESULTADO
// -------------------------------------------

generarPedidosAleatorios();

$contador = count($pedidos);
$aceptados = 0;
$rechazados = 0;

echo '<pre>';
echo '=== FURGONETA DE REPARTO ===' . PHP_EOL;
echo 'Pedidos en cola: ' . count($pedidos) . PHP_EOL;

agregarPedidosAFurgoneta($aceptados, $rechazados);

if ($pesoFurgoneta > MAXIMO_PESO_FURGONETA)
    printf('La furgonate alcanza %.1f kg. Se detiene el reparto', $pesoFurgoneta);

echo PHP_EOL . PHP_EOL . '=== INFORME ===' . PHP_EOL;
printf('Aceptados: %d | Rechazados: %d | Sin procesar: %d', $aceptados, $rechazados, count($pedidos));

echo '</pre>';