<?php

declare(strict_types = 1);

require_once __DIR__ . '/Identificable.php';

class User
{
    use Identificable;

    // ---------------------------------------------------------
    // ATTRIBUTES
    // ---------------------------------------------------------

    private string $id = '';

    // ---------------------------------------------------------
    // CONSTRUCTORS
    // ---------------------------------------------------------

    public function __construct()
    {
        $this->id = $this->generateId();
    }

    // ---------------------------------------------------------
    // METHODS
    // ---------------------------------------------------------

    public function getIdPrefix(): string
    {
        return 'USR';
    }

    // ---------------------------------------------------------
    // GETTERS & SETTERS
    // ---------------------------------------------------------

    /**
     * Get the value of id
     */ 
    public function getId()
    {
        return $this->id;
    }
}