<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" href="./css/style.css">

        <title>Arrays</title>
    </head>

    <body>
        <?php include "./php/dictionary.php" ?>
        
        <table>
            <thead>
                <tr>
                    <th>Spanish</th>
                    <th>English</th>
                </tr>
            </thead>

            <tbody>
                <?php foreach ($translations as $spanishWord => $englishWord): ?>
                    <tr>
                        <td><?= $spanishWord ?></td>
                        <td><?= $englishWord ?></td>
                    </tr>
                <?php endforeach ?>
            </tbody>
        </table>
    </body>
</html>