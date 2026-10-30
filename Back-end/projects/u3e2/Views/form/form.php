<h2>Log in</h2>
<form method='POST' action='index.php'>
    <p>
        <?php if (isset($username_error_message)): ?>
            <p><?= $username_error_message ?? '' ?></p>
        <?php endif; ?>
        <label for='username'>Username:</label>
        <input required id='username' name='data[username]' type='text' value=<?= $username ?? '' ?> />
    </p>

    <p>
        <?php if (isset($password_error_message)): ?>
            <p><?= $password_error_message ?? '' ?></p>
        <?php endif; ?>
        <label for='password'>Password:</label>
        <input required id='password' name='data[password]' type='password' />
    </p>

    <input type='submit' />
</form>