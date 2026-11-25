<?php
declare(strict_types=1);

require_once __DIR__ . '/ValidacionPedido.php';

/**
 * Crea el catálogo de la tienda.
 *
 * @return array<string, array{precio: float, peso: float, stock: int, descuento: ?float}>
 */
function crearCatalogo(): array
{
    //como en el ejemplo el nombre del producto es único,
    // crear así el array es más eficiente
    // y el acceso es más rápido
    return [
        'Cuaderno A4' => ['precio' => 2.50, 'peso' => 1.0, 'stock' => 8,  'descuento' => 10.0],
        'Bolígrafo'   => ['precio' => 0.90, 'peso' => 0.4, 'stock' => 25, 'descuento' => null],
        'Archivador'  => ['precio' => 4.20, 'peso' => 3.0, 'stock' => 1,  'descuento' => 15.0],
    ];
}

/**
 * Otra forma de generarlo:
 * function crearCatalogo(): array
 * {
 * return [
 * [
 * 'nombre' => 'Cuaderno A4',
 * 'precio' => 2.50,
 * 'peso' => 1.0,
 * 'stock' => 8,
 * 'descuento' => 10.0
 * ],
 * [
 * 'nombre' => 'Bolígrafo',
 * 'precio' => 0.90,
 * 'peso' => 0.4,
 * 'stock' => 25,
 * 'descuento' => null
 * ],
 * [
 * 'nombre' => 'Archivador',
 * 'precio' => 4.20,
 * 'peso' => 3.0,
 * 'stock' => 1,
 * 'descuento' => 15.0
 * ],
 * ];
 * }
 */



/**
 * Devuelve la lista de clientes
 *
 * @return string[]
 */
function crearClientes(): array
{
    return ['Pablo', 'Lucía', 'Marcos', 'Elena'];
}

/**
 * Genera pedidos aleatorios con identificador correlativo
 *
 * @param string[] $clientes Clientes
 * @param array<int, array{nombre: string, precio: float, peso: float, stock: int, descuento: float|null}> $catalogo Catálogo de productos
 * @param int $cantidad Número de pedidos a generar.
 *
 * @return array<int, array{id: int, cliente: string, producto: string, unidades: int}>
 * @throws \Random\RandomException
 */
function generarPedidos(array $clientes, array $catalogo, int $cantidad): array
{
    $pedidos = [];

    for ($id = 1; $id <= $cantidad; $id++) {
        $pedidos[] = [
            'id'       => $id,
            'cliente'  => $clientes[array_rand($clientes)],
            'producto' => array_rand($catalogo), // las claves del catálogo son los nombres
            'unidades' => random_int(1,5)
        ];
    }

    return $pedidos;
}

/**
 * La misma función si has elegido crearlo con el campo "nombre"
 * function generarPedidos(array $clientes, array $catalogo, int $cantidad): array
 * {
 * $pedidos = [];
 *
 * for ($id = 1; $id <= $cantidad; $id++) {
 *
 * $producto = $catalogo[array_rand($catalogo)];
 *
 * $pedidos[] = [
 * 'id' => $id,
 * 'cliente' => $clientes[array_rand($clientes)],
 * 'producto' => $producto['nombre'],
 * 'unidades' => random_int(1, 5),
 * ];
 * }
 *
 * return $pedidos;
 * }
  */


/**
 * Comprueba si un pedido puede cargarse en la furgoneta.
 *
 * @param array{producto: string, unidades: int} $pedido
 * @param array<string, array{precio: float, peso: float, stock: int, descuento: ?float}> $catalogo
 * @param float $pesoActual Peso que lleva ya la furgoneta.
 *
 * @return ValidacionPedido
 */
function validarPedido(array $pedido, array $catalogo, float $pesoActual): ValidacionPedido
{
    $producto = $catalogo[$pedido['producto']];

    if ($producto['stock'] < $pedido['unidades']) {
        return ValidacionPedido::SIN_STOCK;
    }

    $pesoPedido = $producto['peso'] * $pedido['unidades'];

    if ($pesoActual + $pesoPedido > CAPACIDAD_MAXIMA) {
        return ValidacionPedido::NO_CABE;
    }

    return ValidacionPedido::OK;
}


/**
 * Resta del stock las unidades que se mandan en la furgoneta
 *
 * @param array<string, array{precio: float, peso: float, stock: int, descuento: ?float}> $catalogo
 */
function actualizarStock(array &$catalogo, string $producto, int $unidades): void
{
    $catalogo[$producto]['stock'] -= $unidades;
}

/**
 * Calcula el importe final de un pedido redondeando,
 * añade descuento (si existe) y aplica IVA
 *
 * @param float  $precioUnitario Precio sin IVA de una unidad.
 * @param int    $unidades       Unidades pedidas.
 * @param ?float $descuento      Porcentaje de descuento o null si no hay.
 */

function calcularPrecioFinal(float $precioUnitario, int $unidades, ?float $descuento): float
{
    $importe = $precioUnitario * $unidades;

    if ($descuento !== null) {
        $importe *= (1 - $descuento / 100);
    }

    return round($importe * (1 + IVA), 2);
}

/**
 * Procesa los pedidos, del último al primero, mientras queden pedidos
 * y la furgoneta lleve menos de 15 kg.
 *
 * @param array<int, array{id: int, cliente: string, producto: string, unidades: int}> $pedidos
 *
 * @param array<string, array{precio: float, peso: float, stock: int, descuento: ?float}> $catalogo
 *
 * @return array{
 *     lineas: array<int, array{pedido: array<string, mixed>, resultado: ValidacionPedido, importe: float, carga: float}>,
 *     aceptados: int,
 *     rechazos: array<string, int>,
 *     peso: float,
 *     importes: float[],
 *     ventas: array<string, int>,
 *     clientes: string[]
 * }
 */
function cargarPedidosFurgo(array &$pedidos, array &$catalogo): array
{
    $peso      = 0.0;
    $aceptados = 0;
    $lineas    = [];
    $importes  = [];
    $clientes  = [];
    $rechazos  = [ValidacionPedido::SIN_STOCK->value => 0, ValidacionPedido::NO_CABE->value => 0];
    $ventas    = array_fill_keys(array_keys($catalogo), 0);

    while (count($pedidos) > 0 && $peso < PARAR_CARGA) {
        $pedido    = array_pop($pedidos);
        $resultado = validarPedido($pedido, $catalogo, $peso);
        $importe   = 0.0;

        if ($resultado === ValidacionPedido::OK) {
            $producto = $catalogo[$pedido['producto']];

            actualizarStock($catalogo, $pedido['producto'], (int)$pedido['unidades']);

            $peso       = round($peso + $producto['peso'] * $pedido['unidades'], 1);
            $importe    = calcularPrecioFinal($producto['precio'], (int)$pedido['unidades'], $producto['descuento']);
            $importes[] = $importe;
            $clientes[] = $pedido['cliente'];
            $ventas[$pedido['producto']] += $pedido['unidades'];
            $aceptados++;
        } elseif (array_key_exists($resultado->value, $rechazos)) {
            $rechazos[$resultado->value]++;
        }

        $lineas[] = [
            'pedido'    => $pedido,
            'resultado' => $resultado,
            'importe'   => $importe,
            'carga'     => $peso,
        ];
    }

    return [
        'lineas'    => $lineas,
        'aceptados' => $aceptados,
        'rechazos'  => $rechazos,
        'peso'      => $peso,
        'importes'  => $importes,
        'ventas'    => $ventas,
        'clientes'  => $clientes,
    ];
}

/**
 * Calcula los datos del informe final a partir del resultado de cargarPedidosFurgo().
 *
 * @param array<string, mixed> $resumen Resultado de cargarPedidosFurgo().
 * @param int $sinProcesar Pedidos que quedan en la cola.
 *
 * @return array{
 *     aceptados: int,
 *     rechazados: int,
 *     sinProcesar: int,
 *     rechazosPorMotivo: array<string, int>,
 *     peso: float,
 *     facturado: float,
 *     ranking: array<string, int>,
 *     clientes: string[]
 * }
 */
function generarInforme(array $resumen, int $sinProcesar): array
{
    $ranking = $resumen['ventas'];
    arsort($ranking); // de mayor a menor unidades vendidas

    return [
        'aceptados'         => $resumen['aceptados'],
        'rechazados'        => array_sum($resumen['rechazos']), //suma todos los valores del array
        'sinProcesar'       => $sinProcesar,
        'rechazosPorMotivo' => array_filter($resumen['rechazos']), // solo motivos con rechazos
        'peso'              => $resumen['peso'],
        'facturado'         => round(array_sum($resumen['importes']), 2),
        'ranking'           => $ranking,
        'clientes'          => array_unique($resumen['clientes']), //quita clientes duplicados
    ];
}

/** Formatea un importe, ejemplo: "5,09 EUR". */
function formatearEuros(float $importe): string
{
    return number_format($importe, 2, ',', '.') . ' EUR';
}

/** Formatea un peso, ejemplo: "13,2 kg". */
function formatearKilos(float $peso): string
{
    return number_format($peso, 1, ',', '.') . ' kg';
}

/**
 * Devuelve los rechazos por los siguientes motivos: sin stock, no cabe.
 * Si no hay ninguno, devuelve "ninguno".
 *
 * @param array<string, int> $rechazos Cantidad de rechazos por motivo.
 */

function convertirRechazosATexto(array $rechazos): string {

    if ($rechazos === []) {
        return "ninguno";
    }

    $salidaFormateada = [];

    // Recorre el array y concatena la clave y el valor
    foreach ($rechazos as $motivo => $cantidad) {
        $salidaFormateada[] = $motivo . ": " . $cantidad;
    }

    return implode(", ", $salidaFormateada);
}

/**
 * Devuelve el ranking de productos
 *
 * @param array<string, int> $ranking Unidades vendidas por producto, ya ordenado.
 */
function convertirRankingATexto(array $ranking): string
{
    $salidaFormateada = [];
    foreach ($ranking as $producto => $unidades) {
        $salidaFormateada[] = "$producto ($unidades uds)";
    }

    return implode(', ', $salidaFormateada);
}