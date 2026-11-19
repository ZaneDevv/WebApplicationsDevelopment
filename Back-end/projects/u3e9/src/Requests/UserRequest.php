<?php

declare(strict_types = 1);

namespace Request;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class UserRequest
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) array $data = [];
    public private(set) array $errors = [];

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(array $input)
    {
        $this->clean_up($input);
        $this->validate();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function is_valid() : bool
    {
        return count($this->errors) === 0;
    }

    private function clean_up(array $input) : void
    {
        $this->data = [
            'name' => strip_tags(trim(htmlspecialchars($input['name'] ?? ''))),
            'phone_number' => strip_tags(trim(htmlspecialchars($input['phone-number'] ?? ''))),
            'email' => strip_tags(trim(htmlspecialchars($input['email'] ?? ''))),
        ];
    }

    private function validate()
    {
        if (!preg_match('/^\w+$/', $this->data['name']))
            $this->errors['name'] = 'El nombre solo debe tener letras';

        if (!preg_match('/^\d{9}$/', $this->data['phone_number']))
            $this->errors['phone_number'] = 'El tel&eacute;fono no es correcto';
        
        if (!filter_var($this->data['email'], FILTER_VALIDATE_EMAIL))
            $this->errors['email'] = 'El correo no es correcto';
    }
}