/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");

    console.log(Number("123")); // Parses to number, does not matter if it is an integer or a float
    console.log(parseFloat("3.14")); // Parses to a float
    console.log(parseInt("abc")); // Parses to an integer
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");

    let number = Number(prompt("Give me a number"));
    console.log(Number.isInteger(number) ? "The given number is an integer" : "The given number is either rational or irrational");
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    console.log(`NaN === NaN: ${Number.isNaN(NaN)}`);
    console.log(`NaN === "hello": ${Number.isNaN("hello")}`);
    console.log(`NaN === undefined: ${Number.isNaN(undefined)}`);
    console.log(`NaN === 0/0: ${Number.isNaN(0/0)}`);
    console.log(`NaN === parseInt("abc"): ${Number.isNaN(parseInt("abc"))}`);    
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");

    console.log(`1/0 is ${Number.isFinite(1/0) ? "finite" : "infinite"}`);
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    console.log(3.141592.toFixed(2));
    console.log(3.141592.toFixed(4));
    console.log(3.141592.toFixed(6));
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    console.log((123456).toExponential(2));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    console.log("Decimal: 255");
    console.log(`Binary: ${(255).toString(2)}`);
    console.log(`Octial: ${(255).toString(8)}`);
    console.log(`Hexadecimal: ${(255).toString(16)}`);
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    console.log((123.456789).toPrecision(4));
    console.log((123.456789).toPrecision(7));
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function getNumberData(number)
{
    if (Number.isNaN(number))
        return "Invalid number";

    return Number.isInteger(number) ? "integer" : "rational";
}

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");

    let input = prompt("Give me a number");
    console.log(getNumberData(Number(input)));
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