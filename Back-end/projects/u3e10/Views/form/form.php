<h1>Candidatura para puesto de trabajo</h1>

<form method="POST" action="index.php?action=process_employee">
    <p>
        <label for="name">Nombre:</label>
        <input required type="text" id="name" name="employee[name]" value="<?= isset($employee) ? $employee->name : '' ?>">
    </p>

    <p>
        <label for="lastnames">Apellidos</label>
        <input required type="text" id="lastnames" name="employee[lastnames]" value="<?= isset($employee) ? $employee->last_names : '' ?>">
    </p>

    <p>
        <label for="email">Email:</label>
        <input required type="email" id="email" name="employee[email]" value="<?= isset($employee) ? $employee->email : '' ?>">

        <?php if (isset($errors)): ?>
            <?= $errors['email'] ?? '' ?>
        <?php endif; ?>
    </p>

    <p>
        <label for="phone_number">N&uacute;mero de tel&eacute;fono:</label>
        <input required type="tel" id="phone_number" name="employee[phone_number]" value="<?= isset($employee) ? $employee->phone_number : '' ?>">

        <?php if (isset($errors)): ?>
            <?= $errors['phone_number'] ?? '' ?>
        <?php endif; ?>
    </p>

    <p>
        <label for="job_status">Estado laboral</label>
        <select required id="job_status" name="employee[job_status]">
            <option value="unemployee">Sin empleo</option>
            <option value="part_time">Media jornada</option>
            <option value="full_time">Tiempo completo</option>
        </select>

        <?php if (isset($errors)): ?>
            <?= $errors['job_status'] ?? '' ?>
        <?php endif; ?>
    </p>

    <p>
        <label for="languages">Lenguajes de programaci&oacute;n que dominas:</label>
        
        <label for="knows-python">Python</label>
        <input type="checkbox" id="knows-python" name="languages[python]">

        <label for="knows-javascript">JavaScript</label>
        <input type="checkbox" id="knows-javascript" name="languages[javascript]">

        <label for="knows-java">Java</label>
        <input type="checkbox" id="knows-java" name="languages[java]">

        <label for="knows-php">Php</label>
        <input type="checkbox" id="knows-php" name="languages[php]">

        <label for="knows-cpp">C++</label>
        <input type="checkbox" id="knows-cpp" name="languages[cpp]">

        <?php if (isset($errors)): ?>
            <?= $errors['known_languages'] ?? '' ?>
        <?php endif; ?>
    </p>

    <p>
        <label for="previous_job">Trabajo anterior:</label>
        <input required type="url" id="previous_job" name="employee[previous_job]" value="<?= isset($employee) ? $employee->previous_job : '' ?>">

        <?php if (isset($errors)): ?>
            <?= $errors['previous_job'] ?? '' ?>
        <?php endif; ?>
    </p>

    <input type="submit">
</form>