<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Operation
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------
    
    public private(set) float $result;
    public private(set) string $operator_symbol;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) float $x,
        public private(set) float $y,
        public private(set) string $operator_name,
    )
    {
        $this->result = $this->$operator_name();
        $this->operator_symbol = match (strtolower($operator_name))
        {
            'add' => '+',
            'subtract' => '-',
            'multiply' => '*',
            'divide' => '/',

            default => ''
        };
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromAray(array $array) : self
    {
        $x = $array['x'] ?? 0;
        $y = $array['y'] ?? 0;

        settype($x, 'int');
        settype($y, 'int');

        return new self(
            x: $x,
            y: $y,
            operator_name: $array['operator'] ?? 0,
        );
    }

    private function add() : float
    {
        return $this->x + $this->y;
    }

    private function subtract() : float
    {
        return $this->x - $this->y;
    }

    private function multiply() : float
    {
        return $this->x * $this->y;
    }

    private function divide() : float
    {
        return $this->x / $this->y;
    }
}