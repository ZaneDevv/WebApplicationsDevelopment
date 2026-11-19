<?php if (isset($student)): ?>
    <h1>Welcome, <?= $student->name ?>!</h1>
    <p>Last-names: <?= $student->last_name ?></p>
    <p>Birth: <?= $student->birth_date ?></p>
    <p>Contact: <?= $student->email ?></p>
    <p>I see you <?= $student->does_know_about_static_pages ? 'know about static web-pages. You\'re on the right track!' : 'don\'t know static web-pages yet. You need to catch up' ?></p>
    <p>Your thoughts: <?= $student->comments ?></p>
    <p>Password: <?= $student->password ?></p>
    <p>Repeated password: <?= $student->repeated_password ?></p>
    <p>You know:</p>
    <ul>
        <?php foreach ($student->known_languages as $language): ?>
            <li><?= $language ?></li>
        <? endforeach; ?>
    </ul>
<?php endif; ?>