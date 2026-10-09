/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

/**
 * Gets the greatest number from the given ones
 * @param  {...number} numbers Numbers to obtain the maximum from
 * @returns The greatest number from the given ones
 * @author Álvaro Fernández Barrero
 */
function max(...numbers)
{
    let maximum = -Infinity;

    for (number of numbers)
    {
        if (number > maximum)
            maximum = number;
    }

    return maximum;
}

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    console.log(max(5, 6, 7, 12, 13));
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

/**
 * Rolls a dice
 * @returns The face the dice has upwards
 * @author Álvaro Fernández Barrero
 */
function rollDice()
{
    return 1 + Math.round(Math.random() * 5)
}

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    console.log(rollDice());
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function showProbabilities()
{
    let probabilities = [];

    for (let i = 0; i < 6e3; i++)
    {
        let number = rollDice();

        if (probabilities[number] == undefined)
            probabilities[number] = 0;
        
        probabilities[number]++; 
    }

    for (let i = 1; i <= 6; i++)
        console.log(`${i} -> ${probabilities[i]}`)
}

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    showProbabilities();
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

/**
 * Computes the volume of the sphere with the given radius
 * @param {number} radius Sphere's radius
 * @returns The volume of the sphere with the given radius
 * @author Álvaro Fernández Barrero
 */
function computeSphereVolume(radius)
{
    return 4 * Math.PI * radius * radius * radius / 3;
}

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    console.log(computeSphereVolume(10));
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function computeVolumeOfEitherSphereOrCircle(radius, dimensions)
{
    let result = 0;

    switch (dimensions)
    {
    case 2:
        result = Math.PI * radius * radius;
        break;

    case 3:
        result = computeSphereVolume(radius);
        break;

    default:
        console.warn("only 2 and 3 dimensions are allowed");
    }

    return result;
}

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    console.log(computeVolumeOfEitherSphereOrCircle(10, 2).toFixed  (5));
    console.log(computeVolumeOfEitherSphereOrCircle(10, 3).toFixed(5));
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

/**
 * Powers a given number to the other
 * @param {number} base Exponential base
 * @param {number} exponential Number to power the base
 * @returns The base to the exponential
 * @author Álvaro Fernández Barrero
 */
function pow(base, exponential)
{
    if (exponential === 0)
        return 1;

    return base * pow(base, exponential - 1);
}

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    console.log(pow(2, 3));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

/**
 * Computes the factorial of the given number
 * @param {number} number Number to compute the factorial from 
 * @returns The factorial of the given number
 * @author Álvaro Fernández Barrero
 */
function factorial(number)
{
    if (number <= 1)
        return 1;

    return number * factorial(number - 1);
}

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");
    
    console.log("n |   n!");
    for (let i = 1; i <= 10; i++)
    {
        console.log(`${i} | ${factorial(i)}`);
    }
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
