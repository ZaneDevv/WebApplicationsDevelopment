/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");

    let num1 = Number(prompt("Set here the first number"));
    let num2 = Number(prompt("Set here the second number"));

    console.log(`${num1} + ${num2} = ${num1 + num2}`);
    console.log(`${num1} - ${num2} = ${num1 - num2}`);
    console.log(`${num1} x ${num2} = ${num1 * num2}`);
    console.log(`${num1} / ${num2} = ${num1 / num2}`);
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");

    let number = Number(prompt("Set here a number"));
    console.log(`${number} is ${(number & 1) === 0 ? "even" : "odd"}`);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    let a = Number(prompt("Set here the first number"));
    let b = Number(prompt("Set here the second number"));
    let c = Number(prompt("Set here the third number"));

    let maximum = undefined;

    if (a > b && a > c)
    {
        maximum = a;
    }
    else if (b > a && b > c)
    {
        maximum = b;
    }
    else
    {
        maximum = c;
    }

    console.log(`The maximum value of the given ones is ${maximum}`);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");

    let num = Number(prompt("Set here a number"));

    for (let i = 1; i <= 10; i++)
    {
        console.log(`${num} x ${i} = ${num * i}`);
    }
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    let n = Number(prompt("Set here a number"));
    let result = 0;

    for (let i = 1; i <= n; i++)
    {
        result += i;
    }

    console.log(`The summation from 1 to ${n} is ${result}`);
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    let positivesAmount = 0;
    let negativesAmount = 0;

    for (let i = 0; i < 5; i++)
    {
        let n = Number(prompt("Set here a number"));

        if (n > 0)
        {
            positivesAmount++;
        }
        else if (n < 0)
        {
            negativesAmount++;
        }
    }

    console.log(`You have written ${positivesAmount} positive numbers and ${negativesAmount} negative numbers`);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    let n = Math.abs(Number(prompt("Set here a number")));
    let isPrime = n === 2 || (n & 1) === 1;

    if (n > 0)
    {
        for (let i = 3; !isPrime && i < n; i += 2)
        {
            if (n % i === 1)
            {
                isPrime = false;
            }
        }
    }

    console.log(`${n} is ${isPrime ? "" : "not "}a prime number`);
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");

    let n = Math.floor(Math.abs(Number(prompt("Set here a number"))));
    let result = 1;

    for (let i = 2; i <= n; i++)
    {
        result *= i;
    }

    console.log(`${n}! = ${result}`);
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");

    let n = Math.floor(Math.abs(Number(prompt("Set here a number"))));
   
    for (let i = 2; i <= n; i += 2)
    {
        console.log(i);
    }
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");

    let goalNumber = Math.round(1 + Math.random() * 9);
    let lastAttempt = undefined;
    let attemptsAmount = 0;
    
    do
    {
        attemptsAmount++;
        lastAttempt = parseInt(prompt("Try to guess my number [1, 10]"));

        console.log(lastAttempt < goalNumber ? "Try with a greater number" : lastAttempt > goalNumber ? "Try with a lower number" : "");
    }
    while (lastAttempt !== goalNumber);

    console.log(`You guessed it in ${attemptsAmount} tries! The number was ${goalNumber}`);
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