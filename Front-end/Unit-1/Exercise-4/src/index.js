/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

{
    let number = prompt("Set a number here:");
    
    if (number < 0)
    {
        console.log("The given number is negative (" + number + ")");
    }
    else if (number > 0)
    {
        console.log("The given number is positive (" + number + ")");
    }
    else
    {
        console.log("The 0 is neither negative nor positive")
    }
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    let age = prompt("How old are you?");
    
    if (age >= 18)
    {
        console.log("You're overage");
    }
    else
    {
        console.log("You're minor");
    }
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    let number = prompt("Give me a number");

    if ((number & 1) === 0)
    {
        console.log("The number is even");
    }
    else
    {
        console.log("The number is odd");
    }
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    let grade = prompt("Which is your grade?");

    if (grade >= 5)
    {
        console.log("You've passed!");
    }
    else
    {
        console.log("You've failed!");
    }
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 5\n-------------------------");

{
    let x = 5;
    let y = 6;

    if (x === y)
    {
        console.log(x + " (x) = " + y + " (y)");
    }
    else if (x > y)
    {
        console.log(x + " (x) > " + y + " (y)");
    }
    else
    {
        console.log(x + " (x) < " + y + " (y)");
    }
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 6\n-------------------------");

{
    let numericDay = prompt("Give me a number [1-7]");

    switch (numericDay)
    {
    case "1":
        console.log("Monday");
        break;

    case "2":
        console.log("Tuesday");
        break;

    case "3":
        console.log("Wednesday");
        break;

    case "4":
        console.log("Thursday");
        break;

    case "5":
        console.log("Friday");
        break;

    case "6":
        console.log("Saturday");
        break;

    case "7":
        console.log("Sunday");
        break;

    default:
        console.log("You haven't set a valid number");
    }
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 7\n-------------------------");

{
    let chosenOption = prompt("Choose an option [1-3]");

    switch (chosenOption)
    {
    case "1":
        console.log("First option selected");
        break;

    case "2":
        console.log("Second option selected");
        break;

    case "3":
        console.log("Third option selected");
        break;

    default:
        console.log("Invalid option!");
    }
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 8\n-------------------------");

{
    let color = prompt("Pick and write a color from the list:  red, yellow, green");

    switch (color)
    {
    case "red":
        console.log("Halt");
        break;

    case "yellow":
        console.log("Carefully");
        break;

    case "green":
        console.log("Continue");
        break;

    default:
        console.log("That color is not registered");
    }
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 9\n-------------------------");

{
    let fruit = prompt("Write here a fruit");

    switch (fruit)
    {
    case "Apple":
        console.log("It is a red apple");
        break;

    case "Banana":
        console.log("The banana is yellow");
        break;

    case "Grape":
        console.log("The grape is purple");
        break;

    default:
        console.log("Unknown fruit");
    }
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 10\n-------------------------");

{
    let grade = prompt("Which is your grade? (A, B, C, D or F)");

    switch (grade)
    {
    case "a":
    case "A":
        console.log("Excelent!");
        break;

    case "b":
    case "B":
        console.log("Very good");
        break;

    case "c":
    case "C":
        console.log("Good");
        break;

    case "d":
    case "D":
        console.log("Enough");
        break;

    case "f":
    case "F":
        console.log("Failed");

    default:
        console.log("Invalid grade");
    }
}