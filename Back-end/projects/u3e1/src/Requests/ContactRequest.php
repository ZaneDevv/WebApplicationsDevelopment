<?php

declare(strict_types = 1);

namespace Requests;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ContactRequest
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) array $data = [];
    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(array $data)
    {
        $this->cleanUp($data);
        $this->validate();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    private function isValid() : bool
    {
        return count($this->errors) === 0;
    }
    
    private static function convertString(mixed $string) : string
    {
        return is_string($string) ? trim(strip_tags($string)) : '';
    }

    private function cleanUp(array $data) : void
    {

    }

    private function validate() : void
    {

    }
}