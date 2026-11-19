<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Employee
{
    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $name = '',
        public private(set) string $last_names = '',
        public private(set) string $email = '',
        public private(set) string $phone_number = '',
        public private(set) string $job_status = '',
        public private(set) array $known_languages = [],
        public private(set) string $previous_job = ''
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromArray(array $data) : self
    {
        return new self(
            name: $data['name'],
            last_names: $data['last_names'],
            email: $data['email'],
            phone_number: $data['phone_number'],
            job_status: $data['job_status'],
            known_languages: $data['known_languages'],
            previous_job: $data['previous_job'],
        );
    }
}