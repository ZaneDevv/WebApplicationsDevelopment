<?php

/**
 * Álvaro Fernández Barrero
 * 1º DAW Bilingüe
 */

declare (strict_types = 1);

// -------------------------------------------
// CONSTANTES
// -------------------------------------------

define('CANTIDAD_PEDIDOS', 15);
define('MAXIMO_PESO_FURGONETA', 15);

// -------------------------------------------
// VARIABLES
// -------------------------------------------

$catalogo = [
    [
        'id' => 0,
        'nombre' => 'cuaderno',
        'precio' => 2.5,
        'peso' => 1,
        'stock' => 8,
        'descuento' => 10
    ],
    [
        'id' => 1,
        'nombre' => 'boligrafo',
        'precio' => 0.9,
        'peso' => 0.4,
        'stock' => 25,
        'descuento' => null
    ],
    [
        'id' => 2,
        'nombre' => 'archivador',
        'precio' => 4.2,
        'peso' => 3,
        'stock' => 1,
        'descuento' => 15
    ]
];

$clientes = [
    [
        'id' => 1,
        'nombre' => 'John'
    ],
    [
        'id' => 2,
        'nombre' => 'Jane'
    ],
    [
        'id' => 3,
        'nombre' => 'Juan'
    ],
    [
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

function obtenerClientePorId(int $id) : ?array
{
    global $clientes;

    $clenteObtenido = false;
    $cliente = [];

    for ($i = 0; !$clenteObtenido || $i < count($clientes); $i++)
    {
        if (isset($clientes[$i]))
        {
            $cliente = $clientes[$i];
        }
    }

    return $cliente;
}

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
            'cliente' => $clientes[random_int(0, count($clientes) - 1)]['id'],
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

function extraerPedido() : array
{
    global $pedidos;

    return (array)array_pop($pedidos);
}

function agregarPedidosAFurgoneta(int &$aceptados, int &$rechazados) : void
{
    global $pesoFurgoneta, $precioFinal, $catalogo, $pedidos;

    $contador = count($pedidos);
    $rechazados = 0;

    while ($pesoFurgoneta < MAXIMO_PESO_FURGONETA && count($pedidos) > 0)
    {
        $pedidoExtraido = extraerPedido();
        
        $informacionProducto = $catalogo[$pedidoExtraido['producto']];
        $estaEnStock = $informacionProducto > $pedidoExtraido['unidades'];

        if ($estaEnStock)
        {
            $precio = 0;
    
            $pesoFurgoneta += $informacionProducto['peso'];
    
            $precio = $informacionProducto['precio'];
            if (isset($informacionProducto['descuento']) && is_float($informacionProducto['descuento']))
            {
                $precio -= $precio * $informacionProducto['descuento'] / 100;
            }
    
            $precioFinal += round($precio, 2);
            $aceptados++;
        }
        else
        {
            $rechazados++;
        }

        printf(
            "#$contador %10s | %s x %15s | %10s | %.2f EUR | carga: %.1f kg",
            obtenerClientePorId($pedidoExtraido['cliente'])['nombre'],
            $pedidoExtraido['unidades'],
            $informacionProducto['nombre'],
            $informacionProducto['precio'],
            $estaEnStock ? 'ACEPTADO' : 'RECHAZADO',
            $informacionProducto['peso'],
        );
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

echo printf('La furgonate alcanza %.1f kg. Se detiene el reparto', $pesoFurgoneta);

echo PHP_EOL . PHP_EOL . '=== INFORME ===' . PHP_EOL;
echo printf('Aceptados: %d | Rechazados: %d | Sin procesar: %d', )

echo '</pre>';