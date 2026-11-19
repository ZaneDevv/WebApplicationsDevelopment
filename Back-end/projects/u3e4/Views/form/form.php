<form method="POST" action="index.php">
    <p>
        <label for="name">Name:</label>
        <input required type="text" id="name" name="user[name]">
    </p>

    <p>
        <label for="email">Email:</label>
        <input required type="email" id="email" name="user[email]">
    </p>

    <p>
        <label id="phone-number">Phone number:</label>
        <input required type="tel" id="phone-number" name="user[phone-number]">
    </p>

    <input type="submit">
</form>