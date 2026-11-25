<?php if (isset($contact)): ?>
    <p>¡Buenos d&iacute;as, <?= $contact->name ?>! Te voy a enviar spam a <?= $contact->email ?> y te llamar&eacute; de madrugada a <?= $contact->phone_number ?>. Enviado desde un iPhone.</p>
<?php endif; ?>