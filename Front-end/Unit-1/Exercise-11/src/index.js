/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");

    let age = Number(prompt("How old are you?"));
    let hasPermission = prompt("Do you have your parents's permission? [y/n]") === "y";

    console.log(hasPermission || age > 18 ? "You can come in!" : "You are not allowed to be here");
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");

    let acedMathematics = prompt("Have you aced mathematics? [y/n]") === "y";
    let acedPhysics = prompt("Have you aced physics? [y/n]") === "y";
    let acedChemistry = prompt("Have you aced chemistry? [y/n]") === "y";

    console.log(acedChemistry || acedMathematics || acedPhysics ? "You can go to the next grade" : "You have to repeat this course");
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    const SAVED_PASSWORD = "1234";

    let password = prompt("Write your password");

    if (password !== SAVED_PASSWORD)
    {
        console.log("Wrong password!");
    }
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");

    let number = Number(prompt("Give me a number"));
    console.log(number >= 10 && number <= 50 ? "The number is in the interval [10, 50]" : "The number is not in the interval [10, 50]");
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    let age = Number(prompt("Write here your age"));
    let hasTutor = prompt("Do you have a present tutor? [y/n]") === "y";

    console.log(age >= 18 || hasTutor ? "Welcome!" : "You cannot come in...");
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    const ADMIN_USERNAME = "admin";
    const ADMIN_PASSWORD = "1234";

    const GUEST_USERNAME = "guest";

    let username = prompt("Write here your username");

    let shouldComeIn = username === GUEST_USERNAME;

    if (username === ADMIN_USERNAME)
    {
        shouldComeIn = prompt("Write here your password") === ADMIN_PASSWORD;
    }
    
    console.log(shouldComeIn ? "You can come in!" : "You are not allowed to come in");
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    let number = Number(prompt("Give me a number"));
    console.log(number > 0 && number <= 100 ? "Your number is positive and lower than 0" : "Your number is either negative or greater than 100");
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");

    let day = prompt("Write here a day of the week");
    let isWorkingDay = !(day.toUpperCase() === "SATURDAY" || day.toUpperCase() === "SUNDAY");

    console.log(isWorkingDay ? "This is a working day" : "This is weekend");
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");

    const COUNTRY = "Germany";

    let age = Number(prompt("What is your age?"));
    let nationality = prompt("What is your nationality?");

    console.log(age >= 18 && nationality === COUNTRY ? "You can vote!" : "You cannot vote");
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");

    const USERNAME = "admin";
    const PASSWORD = "1234";

    let usernameAttempt = "";
    let passwordAttempt = "";

    do
    {
        usernameAttempt = prompt("Write your username");
        passwordAttempt = prompt("Write your password");
    }
    while (!(usernameAttempt === USERNAME && passwordAttempt === PASSWORD));

    console.log("Welcome!");
}

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

doExercise1();
doExercise2();
doExercise3();
doExercise4();
doExercise5();
doExercise6();
doExercise7();
doExercise8();
doExercise9();
doExercise10();