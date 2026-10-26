<?php if (isset($authors)): ?>
    <?php foreach($authors as $author): ?>
        <h2><?= $author->title ?></h2>

        <ul>
            <li>Nationality: <?= $author->nationality ?></li>
        </ul>
    <?php endforeach; ?>
<?php endif; ?>