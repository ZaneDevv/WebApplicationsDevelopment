<?php

declare(strict_types = 1);

namespace Controllers;

use Lib\Pages;
use Models\Article;
use Requests\ArticleRequest;

// ----------------------------------------------------------
// CLASSES
// ----------------------------------------------------------

class ArticleController
{
    // ----------------------------------------------------------
    // ATTRIBUTES
    // ----------------------------------------------------------

    private Pages $pages;

    // ----------------------------------------------------------
    // CONSTRUCTORS
    // ----------------------------------------------------------

    public function __construct()
    {
        $this->pages = new Pages();
    }

    // ----------------------------------------------------------
    // METHODS
    // ----------------------------------------------------------

    public function show_form() : void
    {
        $this->pages->render('form/form');
    }

    public function find_article() : void
    {
        if (isset($_POST['id']))
        {
            header('Location: index.php?action=find_article&id=' . $_POST['id']);
            exit;
        }

        if (!isset($_GET['id']))
        {
            ErrorController::show_error_400();
            header('Location: index.php?action=show_form');
            exit;
        }

        $data = [ 'id' => $_GET['id'] ?? '' ];
        $article_request = new ArticleRequest($data);

        if (!$article_request->is_valid())
        {
            ErrorController::show_error_400();
            return;
        }

        if (!Article::does_product_exist($article_request->data['id']))
        {
            ErrorController::show_error_404();
            return;
        }

        http_response_code(200);

        $article = Article::$PRODUCTS[$article_request->data['id']];
        $article['id'] = $article_request->data['id'];

        $this->pages->render('article/article', [
            'article' => Article::from_array($article),
        ]);
    }
}