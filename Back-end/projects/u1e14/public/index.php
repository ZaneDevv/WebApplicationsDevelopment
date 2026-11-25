<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Reversing texts in input</title>
    </head>

    <body>
        <form action="index.php">
            <input type="text" name="text-to-reverse">
            <input type="submit">
        </form>

        <?php
            try
            {
                $stringToReverse = $_GET['text-to-reverse'];
    
                if (!empty($stringToReverse))
                {
                    $stringToPrint = '';
                    
                    for ($i = strlen($stringToReverse) - 1; $i >= 0; $i--)
                    {
                        $stringToPrint .= $stringToReverse[$i];
                    }

                    echo $stringToPrint;
                }
            }
            catch (exception $exception)
            {
                echo 'No string recognised to be reversed';
            }
        ?>
    </body>
</html>