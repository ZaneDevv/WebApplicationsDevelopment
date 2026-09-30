/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");

    let finalString = "";

    for (let i = 0; i < 3; i++)
        finalString += String.fromCharCode('A'.charCodeAt() + Math.round(Math.random() * 27));

    finalString += "-";

    for (let i = 0; i < 4; i++)
        finalString += Math.round(Math.random() * 9);

    console.log(finalString);
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");

    let dicesAmount = Math.abs(parseInt(prompt("How many dices do you want to roll?")));
    let dicesFaces = Math.abs(parseInt(prompt("How many faces those dices have?")));

    let total = 0;

    for (let i = 0; i < dicesAmount; i++)
    {
        let number = 1 + Math.round(Math.random() * (dicesFaces - 1));
        console.log(`Dice ${i + 1}: ${number}`);

        total += number;
    }

    console.log(`Total: ${total}`);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    let string = "";

    for (let i = 0; i < 16; i++)
    {
        string += String.fromCharCode();
    }
}

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

doExercise1();
doExercise2();
doExercise3();