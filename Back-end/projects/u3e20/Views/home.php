<h1>Cookie</h1>

<?php if (!$show_cookies_panel): ?>
    <form method="POST" action="/cookie" novalidate>
        <label>Do you want this program to save cookies?</label>
        <input type="submit" value="Of course!">
    </form>
<?php endif; ?>