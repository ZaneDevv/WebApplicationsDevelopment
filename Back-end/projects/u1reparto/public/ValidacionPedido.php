<?php

declare(strict_types = 1);

enum ValidacionPedido : string
{
    case OK = 'Válido';
    case SIN_STOCK = 'Sin stock';
    case NO_CABE = 'No cabe';
}