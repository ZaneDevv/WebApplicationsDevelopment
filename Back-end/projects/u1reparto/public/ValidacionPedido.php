<?php

declare(strict_types = 1);

enum ValidacionPedido : int
{
    case OK = 0;
    case SIN_STOCK = 1;
    case NO_CABE = 2;
}