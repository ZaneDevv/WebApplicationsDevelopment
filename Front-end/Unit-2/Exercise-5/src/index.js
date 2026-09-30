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
        finalString += String.fromCharCode('A'.charCodeAt() + Math.round(Math.random() * 26));

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
        string += String.fromCharCode('A'.charCodeAt() + Math.round(Math.random() * 26));

    console.log(string);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function validatePassword(password)
{
    let result = "Valid password!";

    if (password.length < 8)
        result = "The password is too short";
    
    else if (!/^(?=.*[A-ZÑÇ]).+$/.test(password))
        result = "The password needs at least a capital-case letter";
    
    else if (!/^(?=.*\d).+$/.test(password))
        result = "The password needs at least a number";
    
    else if (!/^(?=.*[^a-zA-Z0-9]).+$/.test(password))
        result = "The password needs at least a special symbol.";

    return result;
}

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");

    let password = prompt("Type your password");
    console.log(validatePassword(password));
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function runLengthEncode(text)
{
    let result = "";

    let savedCharacter = undefined;
    let counter = 0;

    for (let i = 0; i < text.length; i++)
    {
        let currentCharacter = text[i];

        if (savedCharacter === currentCharacter)
            counter++;

        else
        {
            if (counter > 0)
                result += savedCharacter + counter;

            savedCharacter = currentCharacter;
            counter = 0;
        }
    }
    result += savedCharacter + counter;

    return result;
}

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    let text = prompt("Write here a simple text:");
    console.log(runLengthEncode(text));
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function runLengthInverseEncode(text)
{
    let result = "";

    for (let i = 0; i < text.length; i += 2)
    {
        let character = text[i];
        let amount = parseInt(text[i + 1]);

        for (let j = 0; j < amount; j++)
            result += character;
    }

    return result;
}

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    let text = prompt("Write here a simple text encoded by run length:");
    console.log(runLengthInverseEncode(text));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    let numberToGuess = 1 + Math.round(Math.random() * 99);
    let lastGuess = undefined;

    do
    {
        lastGuess = parseInt(prompt("Gues my number"));

        if (lastGuess < numberToGuess)
            console.log("Try with a greater number");

        else if (lastGuess > numberToGuess)
            console.log("Try with a lower number");
    }
    while (lastGuess !== numberToGuess);

    console.log(`You guessed it! My number was ${numberToGuess}`);
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function validateCreditCardsByLuhn(creditCardNumber)
{
    let totalSum = 0;

    while (creditCardNumber > 0)
    {
        let digit = creditCardNumber % 10;
        let doubleDigit = 2 * digit;
        let digitResult = doubleDigit < 10 ? doubleDigit : doubleDigit % 10 + Math.floor(doubleDigit / 10);

        totalSum += digitResult;

        creditCardNumber /= 10;
    }

    return creditCardNumber % 10 === 0;
}

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");

    const MINIMUM_CREDIT_CARD_NUMBER = 1e15;
    const MAXIMUM_CREDIT_CARD_NUMBER = 9999_9999_9999_9999;

    let number = undefined;
    
    let toPrint = "";
    let iterations = 0;

    do
    {
        number = MINIMUM_CREDIT_CARD_NUMBER + Math.round(Math.random() * MAXIMUM_CREDIT_CARD_NUMBER);
    }
    while (!validateCreditCardsByLuhn(number));

    while (Math.floor(number) > 0)
    {
        toPrint = Math.floor(number % 10) + toPrint;
        
        if (++iterations % 4 === 0 && iterations < 16)
            toPrint = "-" + toPrint;

        number /= 10;
    }

    console.log(toPrint);
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");

    let numbersString = prompt("Give me numbers separated by spaces");
    let numbers = [];

    let totalSum = 0;
    let avareage = 0;
    let standardDeviation = 0;

    for (numberString of numbersString.split(" "))
    {
        let number = Number(numberString);
        
        if (!Number.isNaN(number))
        {
            totalSum += number;
            numbers.push(number);
        }
    }

    avareage = totalSum / numbers.length;

    {
        let nominator = 0;
        for (let i = 0; i < numbers.length; i++)
        {
            let differentToAvarage = numbers[i] - avareage;
            nominator += differentToAvarage * differentToAvarage;
        }

        standardDeviation = Math.sqrt(nominator / numbers.length);
    }

    console.log(numbers);
    console.log(`Avarage: ${avareage.toFixed(2)}`)
    console.log(`Standard deviation: ${standardDeviation.toFixed(2)}`)
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");

    const WORD_TO_LOOK_FOR = "javascript";

    let wordToDisplay = "";
    {
        for (let i = 0; i < WORD_TO_LOOK_FOR.length; i++)
            wordToDisplay += `${i === 0 || i === WORD_TO_LOOK_FOR.length - 1 ? WORD_TO_LOOK_FOR[i] : "_"} `;
        
        wordToDisplay = wordToDisplay.trim();
    }

    do
    {
        let character = prompt("Try with a character");
        if (character.length > 1)
            character = character[0];

        for (let i = 0; i < WORD_TO_LOOK_FOR.length; i++)
        {
            if (WORD_TO_LOOK_FOR[i].toUpperCase() === character.toUpperCase())
                wordToDisplay = `${wordToDisplay.slice(0, i * 2)}${WORD_TO_LOOK_FOR[i]}${wordToDisplay.slice(i * 2 + 1)}`
        }

        console.log(wordToDisplay);
    }
    while (wordToDisplay.toUpperCase().replaceAll(" ", "") !== WORD_TO_LOOK_FOR.toUpperCase());
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