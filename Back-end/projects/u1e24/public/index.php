<?php
    declare(strict_types = 1);
?>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Strict types</title>
    </head>
    
    <body>
        <?php
            /**
             * Computes the factorial of the given number
             * 
             * @param int $n Number of which compute the factorial
             * 
             * @return int The factorial of the given number n!
             */
            function factorial(int $n) : int
            {
                if ($n <= 1)
                    return 1;
                
                return $n * factorial($n - 1);
            }

            /**
             * Computes the factorial of the given number and gives the full operation's statement
             * 
             * @param int $n Number of which compute the factorial
             * 
             * @return string The factorial's statement with its result
             */
            function factorialMessage(int $n) : string
            {
                return $n . '! = ' . factorial($n);
            }
        ?>
    </body>

    <p><?= factorialMessage(10) ?></p>
    <p><?= factorialMessage(4) ?></p>
    <p><?= factorialMessage(5) ?></p>
    <!-- <p><?= factorialMessage() ?></p> Invalid type -->
    <!-- <p><?= factorialMessage('Hi') ?></p> Invalid type -->
</html>