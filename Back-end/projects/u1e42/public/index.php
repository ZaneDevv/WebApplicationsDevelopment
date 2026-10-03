<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./src/css/style.css">

        <title>Chess</title>
    </head>

    <body>
        <?php require "./src/php/chess.php" ?>

        <table>
            <tbody>
                <?php for ($i = 0; $i < 8; $i++): ?>
                    <tr>
                        <?php for ($j = 0; $j < 8; $j++): ?>
                            <td>
                                <?php if ($i < 2 || $i >5): ?>
                                    <img class="chess-img" src=<?= getImageByPosition($i, $j) ?? '' ?>>
                                <?php endif ?>
                            </td>
                        <?php endfor ?>
                    </tr>
                <?php endfor ?>
            </tbody>
        </table>
    </body>
</html>