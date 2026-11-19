<?php if (isset($operation)): ?>
    <p><?= $operation->x ?> <?= $operation->operator_symbol ?> <?= $operation->y ?> = <?= $operation->result ?></p>
<?php endif; ?>