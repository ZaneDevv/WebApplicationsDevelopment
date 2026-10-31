<?php

declare(strict_types = 1);

namespace Models;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class Student
{
    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct(
        public private(set) string $name = '',
        public private(set) string $last_name = '',
        public private(set) string $birth_date = '',
        public private(set) string $email = '',
        public private(set) array $known_languages = [],
        public private(set) bool $does_know_about_static_pages = false,
        public private(set) string $comments = '',
        public private(set) string $password = '',
        public private(set) string $repeated_password = '',
    )
    {}

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public static function fromPostArray(array $post = []): self
    {
        $student = $post['student'] ?? [];
        $languages = array_filter($post['languages'] ?? [], fn (string $language_status) : bool => strtolower($language_status) === 'on');
        $languages_name = array_map(fn (string $language) : string => strtoupper(substr($language, 6)), array_keys($languages));

        return new self(
            name: strip_tags(htmlspecialchars($student['name'] ?? '')),
            last_name: strip_tags(htmlspecialchars($student['lastname'] ?? '')),
            birth_date: strip_tags(htmlspecialchars($student['birth-date'] ?? '')),
            email: strip_tags(htmlspecialchars($student['email'] ?? '')),
            comments: strip_tags(htmlspecialchars($student['comments'] ?? '')),
            password: strip_tags(htmlspecialchars($student['password'] ?? '')),
            repeated_password: strip_tags(htmlspecialchars($student['repeated_password'] ?? '')),
            does_know_about_static_pages: strtolower($student['knows-static-pages']) === 'on',
            known_languages: $languages_name
        );
    }
}