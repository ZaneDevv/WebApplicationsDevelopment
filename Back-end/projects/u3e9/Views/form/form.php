<h2>FORMULARIO Y RESULTADO &Uacute;NICO ARCHIVO (FORMULARIO)</h2>

<form method="POST" action="index.php&amp;action=process_user">
    <p>Escriba los datos siguientes:</p>
    
    <p>
        <label for="name">Nombre:</label>
        <input required type="text" id="name" name="user[name]" value="<?= isset($user) ? $user->name : '' ?>">
    </p>

    <p>
        <label for="phone-number">Phone:</label>
        <input required type="tel" id="phone-number" name="user[phone-number]" value="<?= isset($user) ? $user->phone_number : '' ?>">

        <?php if (isset($errors) && isset($errors['phone_number'])): ?>
            <?= $errors['phone_number'] ?>
        <?php endif; ?>
    </p>

    <p>
        <label for="email">Email:</label>
        <input required type="email" id="email" name="user[email]" value="<?= isset($user) ? $user->email : '' ?>">

        <?php if (isset($errors) && isset($errors['email'])): ?>
            <?= $errors['email'] ?>
        <?php endif; ?>
    </p>

    <input type="submit">
</form>