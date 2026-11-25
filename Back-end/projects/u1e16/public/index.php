<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Yesterday/today/tomorrow</title>
    </head>

    <body>
        <?php
            define('TIME_FORMAT', 'Y-m-d, l');
            define('SECONDS_IN_A_DAY', 86400);

            echo '<pre>';

            echo 'Yesterday: ' . date(TIME_FORMAT, time() - SECONDS_IN_A_DAY) . PHP_EOL;
            echo 'Today: ' . date(TIME_FORMAT, time()) . PHP_EOL;
            echo 'Tomorrow: ' . date(TIME_FORMAT, time() + SECONDS_IN_A_DAY) . PHP_EOL;
            
            echo '</pre>';
        ?>      
    </body>
</html>