<h1>Register student</h1>

<form method="POST" action="index.php">
    <p>
        <label for="name">Name:</label>
        <input required type="text" id="name" name="student[name]">
    </p>

    <p>
        <label for="lastname">Lastnames:</label>
        <input required type="text" id="lastname" name="student[lastname]">
    </p>

    <p>
        <label for="birth-date">Birth date:</label>
        <input required type="date" id="birth-date" name="student[birth-date]">
    </p>

    <p>
        <label for="email">Email:</label>
        <input required type="email" id="email" name="student[email]">
    </p>

    <p>
        <label for="student-programming-languages">What programming languages do you know?</label>

        <label for="knows-cpp">C++</label>
        <input type="checkbox" id="knows-cpp" name="languages[knows-cpp]">

        <label for="knows-js">JavaScript</label>
        <input type="checkbox" id="knows-js" name="languages[knows-js]">

        <label for="knows-php">Php</label>
        <input type="checkbox" id="knows-php" name="languages[knows-php]">

        <label for="knows-python">Python</label>
        <input type="checkbox" id="knows-python" name="languages[knows-python]">
    </p>

    <p>
        <label title="does-student-know-static-pages">Do you know how to create static web-pages?</label>
    
        <label for="knows-static-pages">Yes</label>
        <input required type="radio" id="knows-static-pages" name="student[knows-static-pages]">
        
        <label for="does-not-know-static-pages">No</label>
        <input required type="radio" id="does-not-know-static-pages" name="student[knows-static-pages]">
    </p>

    <p>
        <label for="comments">Comments:</label>
        <textarea rows="3" cols="30" id="comments" name="student[comments]"></textarea>
    </p>

    <p>
        <label id="password">Password:</label>
        <input required type="password" id="password" name="student[password]">;
    </p>

    <p>
        <label id="repeated-password">Repeat password:</label>
        <input required type="password" id="repeated-password" name="student[repeated-password]">
    </p>

    <input type="submit">
</form>