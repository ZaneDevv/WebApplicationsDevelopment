<?php if (isset($contact)): ?>
    <p>Name: <?= $contact->name ?></p>
    <p>Lastname: <?= $contact->lastname ?></p>
    <p>Accepted: <?= $contact->accepted ? 'Yes' : 'No' ?></p>
<?php endif; ?>