<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Multiplication tables</title>
    </head>

    <body>
        <?php for($i = 0; $i <= 10; $i++): ?>
            <table>
                <thead>
                    <tr>
                        <th>x</th>
                        <th>y</th>
                        <th>xy</th>
                    </tr>
                </thead>
                <tbody>
                    <?php for($j = 0; $j <= 10; $j++): ?>
                        <tr>
                            <td><?= $i ?></td>
                            <td><?= $j ?></td>
                            <td><?= $i * $j ?></td>
                        </tr>
                    <?php endfor ?>
                </tbody>
            </table>
        <?php endfor ?>
    </body>
</html>