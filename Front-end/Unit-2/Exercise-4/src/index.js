/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    console.log("JavaScript".length);
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    
    const STRING = "Hello, world";
    console.log(STRING[0], STRING[STRING.length - 1]);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    const STRING = "Programming is fun";

    console.log(STRING.toUpperCase());
    console.log(STRING.toLowerCase());
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    const STRING0 = "Hello";
    const STRING1 = "World";

    console.log(STRING0 + STRING1);
    console.log(STRING0.concat(STRING1));
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    const STRING = "Hola, mundo!";
    console.log(STRING.indexOf("o"), STRING.lastIndexOf("o"));
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    
    const STRING = "JavaScript is great";
    
    console.log(STRING.substring(0, 10), STRING.substring(14));
    console.log(STRING.slice(0, 10), STRING.slice(14));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");
    
    const STRING = "The dog runs fast";
    console.log(STRING.replace("dog", "cat"));
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");
    
    const STRING = "Frontend Developer";
    
    console.log(STRING.includes("end"));
    console.log(STRING.startsWith("Front"));
    console.log(STRING.endsWith("per"));
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");
    console.log("red,green,blue,yellow".split(","));
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");
    console.log("Hello".repeat(5));
}

// ---------------------------------------------------
// EXERCISE 11
// ---------------------------------------------------

function doExercise11()
{
    console.log("-------------------------\nEXERCISE 11\n-------------------------");
    console.log("    Hello  ".trim());
}

// ---------------------------------------------------
// EXERCISE 12
// ---------------------------------------------------

function doExercise12()
{
    console.log("-------------------------\nEXERCISE 12\n-------------------------");
    console.log("7".padStart(3, "0"));
}

// ---------------------------------------------------
// EXERCISE 13
// ---------------------------------------------------

function getVowelsAmount(string)
{
    let amount = 0;

    string = string.toUpperCase();
    for (let i = 0; i < string.length; i++)
    {
        let character = string[i];
        if (character === 'A' || character === 'E' || character == 'I' || character === 'O' || character === 'U')
        {
            amount++;
        }
    }

    return amount;
}

function doExercise13()
{
    console.log("-------------------------\nEXERCISE 13\n-------------------------");
    
    let text = prompt("Write here a simple text");
    console.log(`#Vowels: ${getVowelsAmount(text)}`);
}

// ---------------------------------------------------
// EXERCISE 14
// ---------------------------------------------------

function isPalindrome(string)
{
    let isStringAPalindrome = true;

    for (let i = 0; isPalindrome && i < string.length / 2; i++)
    {
        if (string[i] !== string[string.length - i - 1])
        {
            isStringAPalindrome = false;
        }
    }

    return isStringAPalindrome;
}

function doExercise14()
{
    console.log("-------------------------\nEXERCISE 14\n-------------------------");

    let text = prompt("Write here a simple text");
    console.log(`Is palindrome: ${isPalindrome(text)}`);
}

// ---------------------------------------------------
// EXERCISE 15
// ---------------------------------------------------

function invertString(string)
{
    let newString = "";

    for (let i = string.length - 1; i >= 0; i--)
    {
        newString += string[i];
    }

    return newString;
}

function doExercise15()
{
    console.log("-------------------------\nEXERCISE 15\n-------------------------");

    let text = prompt("Write here a simple text");
    console.log(`Inverted: ${invertString(text)}`);
}

// ---------------------------------------------------
// EXERCISE 16
// ---------------------------------------------------

function capitalizeEveryWord(string)
{
    let newString = "";

    for (word of string.trim().split(" "))
    {
        newString += word[0].toUpperCase() + word.slice(1) + " ";
    }

    return newString.trim();
}

function doExercise16()
{
    console.log("-------------------------\nEXERCISE 16\n-------------------------");

    let text = prompt("Write here a simple text");
    console.log(capitalizeEveryWord(text));
}

// ---------------------------------------------------
// EXERCISE 17
// ---------------------------------------------------

function hideCardNumber(cardNumber)
{
    let charactersToHide = Math.floor(cardNumber.length * 0.75);
    return "*".repeat(charactersToHide) + cardNumber.slice(charactersToHide);
}

function doExercise17()
{
    console.log("-------------------------\nEXERCISE 17\n-------------------------");
    
    let cardNumber = prompt("Give me your card number");
    console.log(hideCardNumber(cardNumber));
}

// ---------------------------------------------------
// EXERCISE 18
// ---------------------------------------------------

function countWords(string)
{
    return string.trim().split(" ").length;
}

function doExercise18()
{
    console.log("-------------------------\nEXERCISE 18\n-------------------------");
    
    let text = prompt("Write here a simple text");
    console.log(`#Words: ${countWords(text)}`);
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
doExercise15();
doExercise16();
doExercise17();
doExercise18();