<?php if (isset($user)): ?>
    <h1>Welcome, <?= $user->username ?>!</h1>
    <p>Your password is <?= $user->password ?></p>
<?php endif; ?>