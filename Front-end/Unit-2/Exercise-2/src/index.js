/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function abs(x)
{
    return Math.abs(x);
}

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");

    let number = Number(prompt("Give me a number"))
    if (Number.isNaN(number))
        return;

    console.log(`|${number}| = ${abs(number)}`);
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");

    let number = Number(prompt("Give me a number"))
    if (Number.isNaN(number))
        return;
    
    console.log(`round = ${Math.round(number)}`);
    console.log(`ceil = ${Math.ceil(number)}`);
    console.log(`floor = ${Math.floor(number)}`);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    let number = Number(prompt("Give me a number"))
    if (Number.isNaN(number))
        return;
    
    console.log(`${number}^3 = ${Math.pow(number, 3)}`);
    console.log(`sqrt{${number}} = ${Math.sqrt(number)}`);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");

    let array = [10, -5, 3, 99, 42];

    console.log(array);
    console.log(`Maximum: ${Math.max(...array)}`);
    console.log(`Minimum: ${Math.min(...array)}`);
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    console.log(Math.random());
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    console.log(Math.round(1 + Math.random() * 5));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function getRng(min, max)
{
    return min + Math.random() * (max - min)
}

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    console.log(getRng(1, 6));
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");

    console.log(`sin(pi/4) = ${Math.sin(Math.PI / 4)}`);
    console.log(`cos(pi/4) = ${Math.cos(Math.PI / 4)}`);
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");

    let tangent = Math.tan(Math.PI * 60 / 180);
    console.log(`cos(pi/4) = ${Math.atan(tangent) * 180 / Math.PI}`);
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");

    console.log(`ln(10) = ${Math.log(10)}`);
}

// ---------------------------------------------------
// EXERCISE 11
// ---------------------------------------------------

function doExercise11()
{
    console.log("-------------------------\nEXERCISE 11\n-------------------------");

    let numberToGuess = Math.round(getRng(1, 100));
    let lastGuess = undefined;

    do
    {
        lastGuess = Number(prompt("Give me the number you believe I am thinking of"));
        
        if (!Number.isNaN(lastGuess))
        {
            if (lastGuess > numberToGuess)
            {
                console.log("Try with a lower number");
            }

            if (lastGuess < numberToGuess)
            {
                console.log("Try with a greater number");
            }
        }
    }
    while (lastGuess !== numberToGuess);

    console.log(`Congratulations! You got it! I was thinking in ${numberToGuess}`);
}

// ---------------------------------------------------
// EXERCISE 12
// ---------------------------------------------------

function doExercise12()
{
    console.log("-------------------------\nEXERCISE 12\n-------------------------");

    let x0 = Number(prompt("x0:"));
    let y0 = Number(prompt("y0:"));
    let x1 = Number(prompt("x1:"));
    let y1 = Number(prompt("y1:"));

    let deltaX = x1 - x0;
    let deltaY = y1 - y0;

    console.log(`The distance is ${Math.sqrt(deltaX * deltaX + deltaY * deltaY)}`);
}

// ---------------------------------------------------
// EXERCISE 13
// ---------------------------------------------------

function doExercise13()
{
    console.log("-------------------------\nEXERCISE 13\n-------------------------");

    console.log(`The winner number is ${Math.round(getRng(1, 36))}!`);
}

// ---------------------------------------------------
// EXERCISE 14
// ---------------------------------------------------

function doExercise14()
{
    console.log("-------------------------\nEXERCISE 14\n-------------------------");

    let password = "";

    for (let i = 0; i < 8; i++)
    {
        password += String.fromCharCode(Math.round(getRng(33, 126)));
    }

    console.log(password);
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
doExercise11();
doExercise12();
doExercise13();
doExercise14();