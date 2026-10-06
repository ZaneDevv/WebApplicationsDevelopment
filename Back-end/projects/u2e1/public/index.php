<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Test OOP</title>
    </head>
    
    <body>
        <?php
            require_once('./php/Product.php');

            $product = new Product();

            try
            {
                echo $product->getName();
            }
            catch (exception $exception)
            {
                echo $exception;
            }
        ?>
    </body>
</html>