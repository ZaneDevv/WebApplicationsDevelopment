<h2>Log in</h2>

<form method='POST' action='index.php' enctype="multipart/form-data">
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

    <p>
        <label for="photo">Face:</label>
        <input required id="photo" name="photo" accept="image/*" type="file" />
    </p>

    <input type='submit' />
</form>