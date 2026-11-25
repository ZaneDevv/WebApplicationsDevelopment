<?php

declare(strict_types = 1);

namespace Requests;

use Models\Article;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ArticleRequest
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
    
    private function clean_up(array $data) : void
    {
        $this->data = [
            'id' => htmlspecialchars(strip_tags(trim($data['id'])), ENT_QUOTES, 'UTF-8'),
        ];
    }

    private function validate() : void
    {
        if (!Article::does_product_exist($this->data['id']))
            $this->errors[] = "Product not found";
    }
}