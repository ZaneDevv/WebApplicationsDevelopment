<h2>Log in</h2>

<form method='POST' action='index.php'>
    <p>
        <?php if (isset($errors)): ?>
            <p><?= $errors['username'] ?? '' ?></p>
        <?php endif; ?>

        <label for='username'>Username:</label>
        <input required id='username' name='data[username]' type='text' value=<?= isset($user) ? $user->username : '' ?> />
    </p>

    <p>
        <?php if (isset($errors)): ?>
            <p><?= $errors['password'] ?? '' ?></p>
        <?php endif; ?>

        <label for='password'>Password:</label>
        <input required id='password' name='data[password]' type='password' />
    </p>

    <input type='submit' />
</form>