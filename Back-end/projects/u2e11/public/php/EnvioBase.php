<?php

declare(strict_types = 1);

require_once __DIR__ . '/CalculadorEnvio.php';

abstract class EnvioBase implements CalculadorEnvio
{
    // ------------------------------------------------
    // ATTRIBUTES
    // ------------------------------------------------

    protected float $peso = 0
    {
        get => $this->peso;
        set(float $value)
        {
            if ($value < 0)
                throw new InvalidArgumentException('El peso no puede ser negativo');

            $this->peso = $value;
        }
    }

    protected float $distancia = 0
    {
        get => $this->distancia;
        set (float $value)
        {
            if ($value < 0)
                throw new Exception('La distancia no puede ser negativa');

            $this->distancia = $value;
        }
    }

    // ------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------

    /**
     * __construct
     *
     * @param float $peso
     * @param float $distance
     * @return void
     */
    public function __construct(float $peso = 0, float $distance = 0)
    {
        $this->peso = $peso;
        $this->distancia = $distance;
    }

    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    /**
     * calcularTarifa
     *
     * @return float
     */
    public abstract function calcularTarifa() : float;

    public function calcularCosto() : float
    {
        return 0;
    }
}