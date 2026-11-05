<?php

declare(strict_types = 1);

namespace Requests;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class EmployeeRequest
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    public private(set) array $data = [];
    public private(set) array $errors = [];

    private static array $possible_job_status = ['unemployee', 'part_time', 'full_time'];
    private static array $approved_languages = ['javascript', 'java', 'cpp', 'python', 'php'];

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

    private static function format_string(string $string) : string
    {
        return is_string($string) ? strip_tags(htmlspecialchars(trim($string))) : '';
    }

    public function is_valid() : bool
    {
        return count($this->errors) === 0;
    }


    private function clean_up(array $input) : void
    {
        $languages = [];
        foreach ($input['languages'] ?? [] as $language_name => $value)
            $languages[] = $language_name;
        
        $this->data = [
            'name' => self::format_string($input['name']),
            'last_names' => self::format_string($input['lastnames']),
            'email' => self::format_string($input['email']),
            'phone_number' => self::format_string($input['phone_number']),
            'job_status' => self::format_string($input['job_status']),
            'previous_job' => self::format_string($input['previous_job']),
            'known_languages' => $languages
        ];
    }

    private function validate() : void
    {
        foreach ($this->data['known_languages'] as $language)
        {
            if (!in_array($language, self::$approved_languages))
                $this->errors['known_languages'] = 'Los lenguajes dados no son requeridos';
        }

        if (!in_array($this->data['job_status'], self::$possible_job_status))
            $this->errors['job_status'] = 'El estado de trabajo dado no es v&aacute;lido';

        if (!filter_var($this->data['previous_job'], FILTER_VALIDATE_URL))
            $this->errors['previous_job'] = 'El link a los trabajos anteriores no es v&aacute;lido';

        if (!filter_var($this->data['email'], FILTER_VALIDATE_EMAIL))
            $this->errors['email'] = 'El email dado no es correcto';

        if (!preg_match('/^\d{9}$/', $this->data['phone_number']))
            $this->errors['phone_number'] = 'El n&uacute;mero dado no es correcto';
    }
}