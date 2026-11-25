<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">
   
        <title>Drawing a line</title>
    </head>
    
    <body>
        <?php
            define('MINIMUM_WIDTH', 10);
            define('MAXIMUM_WIDTH', 1e+3);

            $lineWidth = $_GET['line-width'];

            if (!empty($lineWidth) || $lineWidth != false)
            {
                $lineWidth = abs((int)$lineWidth);

                if (is_numeric($lineWidth))
                {
                    if ($lineWidth >= MINIMUM_WIDTH && $lineWidth <= MAXIMUM_WIDTH)
                    {
                        print("<svg height=\"10\" width=\"$lineWidth\">");
                        print("<line x1=\"0\" y1=\"0\" x2=\"$lineWidth\" y2=\"0\"/>");
                        print('</svg>');
                    }
                    else
                    {
                        print("The set width does not fit with the established boundaries");
                    }
                }
            }
        ?>

        <form action="index.php">
            <label for="line-width">Line's width</label>
            <input required type="number" id="line-width" name="line-width" value=<?= $lineWidth ?>>
    
            <input type="submit">
        </form>
    </body>
</html>