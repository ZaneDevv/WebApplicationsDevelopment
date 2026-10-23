<?php

declare(strict_types = 1);

enum TipoEnvio : string
{
    case Estandard = 'Estandard';
    case Express = 'Express';
    case Internacional = 'Internacional';
}