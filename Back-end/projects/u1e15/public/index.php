<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Drawing pyramids</title>
    </head>

    <body>
        <form action="index.php">
            <input type="number" name="pyramid-height">
            <input type="submit">
        </form>

        <div id="pyramid-container">
            <?php
                $pyramidHeightString = $_GET['pyramid-height'];

                if (!empty($pyramidHeightString))
                {                
                    $pyramidHeight = (int)$pyramidHeightString;

                    if (is_numeric($pyramidHeight))
                    {
                        for ($i = 1; $i <= $pyramidHeight; $i++)
                        {
                            $stringToPrint = '';
        
                            for ($j = 1; $j <= $pyramidHeight; $j++)
                            {
                                $stringToPrint .= $j <= $pyramidHeight - $i ? '&nbsp;' : '*';
                            }
        
                            echo "<p>$stringToPrint</p>";
                        }
                    }
                }
            ?>
        </div>
    </body>
</html>