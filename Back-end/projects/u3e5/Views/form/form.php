<h1>Log in</h1>

<form method="POST" action="index.php?action=show_user">
    <label for="username">Username:</label>
    <input required type="text" id="username" name="user[username]">

    <label for="password">Password:</label>
    <input required type="password" id="password" name="user[password]">

    <input type="submit" value="Log in">
</form>