/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    console.log(new Date());
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    console.log(new Date(2007, 5, 22));
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    let date = new Date();

    console.log(date.getFullYear());
    console.log(date.getMonth());
    console.log(date.getDate());
    console.log(date.getDay());
    console.log(`${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    let date = new Date();

    console.log(date.toDateString());
    console.log(date.toTimeString());
}

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

doExercise1();
doExercise2();
doExercise3();
doExercise4();