<?php

declare(strict_types = 1);

namespace Controllers;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class FrontController
{
    public static function main() : void
    {
        $article_controller = new ArticleController();
        $article_id = $_GET['article-identifier'] ?? null;

        if (!is_null($article_id))
        {
            settype($article_id, 'int');
            $article_controller->find_product($article_id);
            
            return;
        }

        $article_controller->show_form();
    } 
}
