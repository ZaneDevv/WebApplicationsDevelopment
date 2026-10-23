<?php if (isset($students)): ?>
    <h2>Classroom's students</h2>

    <ul>
        <?php foreach ($students as $student): ?>
            <li>Name: <?= $student->getFullName() ?>, age: <?= $student->getAge() ?></li>
        <?php endforeach; ?>
    </ul>
<?php endif; ?>