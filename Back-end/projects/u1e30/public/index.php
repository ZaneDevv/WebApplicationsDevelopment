<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/styles.css">

        <title>Password verifier</title>
    </head>

    <body>
        <?php include "./php/password_verifier.php" ?>

        <form>
            <label for="password">Password:</label>
            <input required type="text" name="password" id="password" placeholder="Password..." value=<?= $_GET['password'] ?? '' ?> />
            <input type="submit" />
        </form>

        <p style="color: <?= $color ?> "><?= $validatedPasswordText ?></p>
    </body>
</html>