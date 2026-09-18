/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

{
    for (let i = 1; i <= 10; i++)
    {
        console.log(i);
    }
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    let result = 0;

    for (let i = 1; i <= 5; i++)
    {
        result += i;
    }

    console.log("The sum from 1 to 5 is " + result);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    let number = parseInt(prompt("Give me a number:"));

    for (let i = 1; i <= 10; i++)
    {
        console.log(number + " x " + i + " = " + number * i);
    }
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    let number = 10;

    while (number >= 1)
    {
        console.log(number);
        number--;
    }
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 5\n-------------------------");

{
    let result = 0;
    let currentNumber = 1;

    while (result < 20)
    {
        result += currentNumber;
        currentNumber++;
    }

    console.log(result);
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 6\n-------------------------");

{
    const REQUIRED_PASSWORD = "1234";
    let password = "0";

    do
    {
        password = prompt("Set your  password:")
    }
    while (password !== REQUIRED_PASSWORD);

    console.log("Password set successfully");
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 7\n-------------------------");

{
    let currentNumber = 1;

    do
    {
        console.log(currentNumber++);
    }
    while (currentNumber <= 5);
}