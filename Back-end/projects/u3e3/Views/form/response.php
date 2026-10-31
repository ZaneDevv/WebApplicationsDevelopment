<?php if (isset($data) && !empty($data)): ?>
    <?php
        $student_data = $data['student'] ?? [];
        $student_languages = $data['languages'] ?? [];
    ?>

    <?php if (isset($student_data) && !empty($student_data)): ?>
        <h1>Welcome, <?= strip_tags(htmlspecialchars($student_data['name'])) ?>!</h1>
        <p>Last-names: <?= strip_tags(htmlspecialchars($student_data['lastname'])) ?></p>
        <p>Birth: <?= $student_data['birth-date'] ?></p>
        <p>Contact: <?= strip_tags(htmlspecialchars($student_data['email'])) ?></p>
        <p>I see you <?= $student_data['knows-static-pages'] === 'on' ? 'know about static web-pages. You\'re on the right track!' : 'don\'t know static web-pages yet. You need to catch up' ?></p>
        <p>Your thoughts: <?= strip_tags(htmlspecialchars($student_data['comments'])) ?></p>
        <p>Password: <?= strip_tags(htmlspecialchars($student_data['password'])) ?></p>
        <p>Repeated password: <?= strip_tags(htmlspecialchars($student_data['repeated-password'])) ?></p>
        <p>You know:</p>
        <ul>
            <?php foreach ($student_languages as $language => $language_statuc): ?>
                <?php if ($language_statuc === 'on'): ?>
                    <li><?= strtoupper(substr($language, 6)) ?></li>
                <?php endif; ?>
            <? endforeach; ?>
        </ul>
    <?php endif; ?>
<?php endif; ?>