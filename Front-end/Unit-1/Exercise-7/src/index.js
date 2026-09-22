/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

{
    let n = Math.abs(parseInt(prompt("Give me an odd number")));

    if ((n & 1) === 0)
    {
        console.warn("You have not set an odd number, value set to " + ++n);
    }
    
    const nHalf = n * 0.5;
    const nHalfNoDecimals = Math.floor(nHalf);

    for (let i = 1; i <= n; i++)
    {
        let toPrint = "";

        for (let j = 1; j <= n; j++)
        {
            toPrint += i + j ? "*" : " ";
        }

        console.log(toPrint);
    }
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    let n = Math.abs(parseInt(prompt("Give me a number to obtain all the prime nombers below it")));

    if (n === 0)
    {
        console.warn("There are no prime numbers lower than 0");
    }
    else if (n === 1)
    {
        console.log("[1]");
    }
    else
    {
        let consecutiveNumbers = [];
        
        for (let i = 2; i <= n; i++)
        {  
            consecutiveNumbers[i - 2] = i
        }

        let arrayIndex = 0;
        let p = consecutiveNumbers[arrayIndex];

        do
        {
            for (let i = 0; i < consecutiveNumbers.length; i++)
            {
                let isMultipleOfP = consecutiveNumbers[i] % p === 0;
                let shouldBeRemoved = isMultipleOfP && p !== consecutiveNumbers[i];
    
                if (shouldBeRemoved)
                {
                    for (let j = i; j < consecutiveNumbers.length; j++)
                    {
                        consecutiveNumbers[j] = consecutiveNumbers[j + 1];
                    }
                    i--;
                }
            }
            
            p = consecutiveNumbers[++arrayIndex];
        }
        while (p !== undefined);

        console.log(consecutiveNumbers);
    }
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    let stringToEncode = prompt("Give me a string to encode");
    let encodedString = "";

    let counter = 1;
    let stackingCharacter = null;

    for (let i = 0; i < stringToEncode.length; i++)
    {
        let currentCharacter = stringToEncode.at(i);

        if (currentCharacter !== stackingCharacter)
        {
            if (counter > 1)
            {
                encodedString += counter;
            }
            counter = 1;
            
            stackingCharacter = currentCharacter;
            encodedString += stackingCharacter;
        }
        else
        {
            counter++;
        }
    }

    if (counter > 0)
    {
        encodedString += + counter;
    }

    console.log("Original string: " + stringToEncode);
    console.log("Encoded string: " + encodedString);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    const matrix = [
        [1, 0, 1],
        [0, 1, 0],
        [0, 0, 1]
    ];

    let isIdentity = matrix.length === matrix[0].length;

    for (let i = 0; i < matrix.length && isIdentity; i++)
    {
        for (let j = 0; j < matrix[i].length && isIdentity; j++)
        {
            isIdentity = matrix[i][j] === (i === j ? 1 : 0);
        }
    }

    console.log(isIdentity ? "The matrix is the identity" : "The matrix is not the identity");
}