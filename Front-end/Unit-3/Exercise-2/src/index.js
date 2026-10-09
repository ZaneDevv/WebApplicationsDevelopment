/**
 * @author Álvaro Fernández Barrero
 */

/**
 * @name isOdd
 * @description Devuelve si un número es impar
 * 
 * @param {number} x - El número a evaluar
 * @returns {Boolean} Devuelve true si el número {x} es impar, false sino
 *
 * @example
 *  isOdd(3) // returns true
 */
function isOdd(x)
{
    return (x & 1) === 1
}

/**
 * @name inRange
 * @description Devuelve si un número se encuentra dentro de un rango
 * 
 * @param {number} x - El número a evaluar si se encuentra dentro del rango
 * @param {number} min - El límite inferior del rango
 * @param {number} max - El límite superior del rango
 * @returns {Boolean} Devuelve true si el número {x} se encuentra dentro del rango definido por {min} y {max}, false sino
 *
 * @example
 *  inRange(2, -4, 10) // returns true
 */
function inRange(x, min, max)
{
    return x >= min && x <= max;
}

/**
 * @name getBiggestNumber
 * @description Devuelve el número más grande de un array
 * 
 * @param {number[]} numbers - Un array de números
 * @returns {Number} El número más grande del arrray {numbers}
 *
 * @example
 *  getBiggestNumber([3, 8, 2, 1, 10]) // returns 10
 */
function getBiggestNumber(numbers)
{
    let greatest = -Infinity;

    for (number of numbers)
    {
        if (greatest < number)
            greatest = number;
    }

    return greatest;
}

/**
 * @name getPercentage
 * @description Devuelve el porcentaje correspondiente de un número
 * 
 * @param {number} number - Número a obtener el porcentage
 * @param {number} percentage - Porcentaje a obtener
 * @returns {Number}
 *
 * @example
 *  getPercentage(200, 10) // returns 20
 */
function getPercentage(number, percentage)
{
    return number * percentage / 100;
}

/**
 * @name getRandomColorSequence
 * @description Devuelve una secuencia aleatoria de ciertos colores con cierta longitud
 * 
 * @param {string[]} colors - Array de colores a ser utilizados en la secuencia
 * @param {number} length - Longitud de la secuencia
 * @returns {String[]} - Secuencia aleatoria de colores disponibles en {colors}, con longitud {length}
 *
 * @example
 *  getRandomColorSequence(["red", "blue", "green"], 4) // returns ['blue', 'red', 'red', 'green']
 */
function getRandomColorSequence(colors, length)
{
    let randomColors = [];

    for (let i = 0; i < length; i++)
        randomColors.push(colors[Math.round(Math.random() * colors.length - 1)]);

    return randomColors;
}

/**
 * @name getRockPaperScissor
 * @description Devuelve una jugada aleatoria de piedra, papel o tijera
 * 
 * @returns {String} - Devuelve "rock", "paper" o "scissor"
 *
 * @example
 *  getRockPaperScissor() // returns "paper"
 */
function getRockPaperScissor()
{
    let randomId = Math.round(Math.random() * 2);
    let result = "";

    switch (randomId)
    {
    case 0:
        result = "rock";
        break;

    case 1:
        result = "paper";
        break;

    case 2:
        result = "scissor";
        break;

    default:
        result = "Unknown";
    }

    return result;
}

/**
 * @name getRockPaperScissorRandomSequence
 * @description Devuelve una secuencia aleatoria de jugadas de piedra, papel o tijera, con cierta longitud
 *
 * @param {number} length - Longitud de la secuencia
 * @returns {String[]}
 *
 * @example
 *  getRockPaperScissorRandomSequence(4) // returns ["rock", "paper", "rock", "scissor"]
 */
function getRockPaperScissorRandomSequence(length)
{
    let result = [];

    for (let i = 0; i < length; i++)
        result.push(getRockPaperScissor())

    return result;
}

/**
 * @name filterNumbersGreaterThan
 * @description Filtra los números de un array que sean mayor a cierto número x dejando solo los que sean menores a este
 *
 * @param {number[]} numbers - Array de números a filtrar
 * @param {number} filter - Número a partir del cuál filtrar los demás números
 * @returns {Number[]} - Array de números filtrados menores a {filter}
 *
 * @example
 *  filterNumbersGreaterThan([3, 8, 12, 1, 7, 4], 7) // returns [3, 1, 4]
 */
function filterNumbersGreaterThan(numbers, filter)
{
    let result = [];

    for (number of numbers)
    {
        if (number > filter)
            result.push(number);
    }

    return result;
}

/**
 * @name getFactorial
 * @description Devuelve el factorial de un número
 *
 * @param {number} x - Número del cuál obtener factorial
 * @returns {Number} - Factorial de {x}
 *
 * @example
 *  getFactorial(4) // returns 24
 */
function getFactorial(x)
{
    if (x <= 1)
        return 1;

    return x * getFactorial(x - 1)
}

/**
 * @name areArraysEqual
 * @description Devuelve si dos arrays son iguales (tienen los mismos ítems en el mismo orden)
 *
 * @param {[]} a 
 * @param {[]} b 
 * @returns {Boolean} - Devuelve true si ambos arrays son iguales, false sino
 *
 * @example
 *  areArraysEqual([1, 4], [1, 4]) // returns true
 */
function areArraysEqual(a, b)
{
    if (a.length !== b.length)
        return false;

    let areEqual = true;

    for (let i = 0; areEqual && i < a.length; i++)
        areDifferent = a[i] === b[i];

    return areEqual;
}

/**
 * @name toHackerSpeak
 * @description Convierte un string a "Hacker Speak". Para hacerlo, tiene que transformar las "a" en 4, las "e" en 3, las "i"
 * en 1, las "o" en 0 y las "s" en 5
 *
 * @param {string} text 
 * @returns {String} - El texto convertido a "Hacker Speak"
 * 
 * @example
 *  toHackerSpeak("I'm a hacker now") // returns "1'm 4 h4ack3r n0w"
 */
function toHackerSpeak(text)
{
    text.replaceAll("a", 4);
    text.replaceAll("w", 3);
    text.replaceAll("i", 1);
    text.replaceAll("o", 0);
    text.replaceAll("s", 5);

    return text;
}

/**
 * @name getFileExtension
 * @description Obtiene la extensión de un archivo
 *
 * @param {string} file - El nombre del archivo a obtener la extensión 
 * @returns {String} - La extensión del archivo
 * 
 * @example
 *  getFileExtension("imagen.jpg") // returns "jpg"
 */
function getFileExtension(file)
{
    let dotPosition = file.lastIndexOf(".");
    return file.slice(dotPosition + 1);
}

/**
 * @name flatArray
 * @description Dado un array 2D, devuelve un array 1D que contiene todos los ítems 
 *
 * @param {[][]} arr - Array 2D a "aplanar" 
 * @returns {[]} - El array "aplanado"
 * 
 * @example
 *  flatArray([[1, 5, 4], [3, 10], [2, 5]]) // returns [1, 5, 6, 3, 10, 2, 5]
 */
function flatArray(arr)
{
    let array = []

    for (row of arr)
    {
        for (element of row)
            array.push(element);
    }

    return array;
}

/**
 * @name removeDuplicates
 * @description Remueve duplicados de un array 
 *
 * @param {[]} arr - Array con duplicados a remover
 * @returns {[]} - El array resultante sin duplicados
 * 
 * @example
 *  removeDuplicates([4, 5, 10, 4, 10, 2]) // returns [4, 5, 10, 2]
 */
function removeDuplicates(arr)
{
    let result = []

    for (element of arr)
    {
        if (result.find(result) === undefined)
            result.push(element);
    }
}

/**
 * @name countLetter
 * @description Devuelve la cantidad de veces que una letra aparece en un string 
 *
 * @param {string} letter - Letra a contar
 * @param {string} text - Texto sobre el que realizar la cuenta de {letter}
 * @returns {Number} - Número de veces que aparece {letter} en {text}
 * 
 * @example
 *  countLetter("a", "javascript") // returns 2
 */
function countLetter(letter, text)
{
    let count = 0;

    for (currentLetter of text)
    {
        if (letter === currentLetter)
            count++;
    }

    return count;
}

/**
 * @name canPlay
 * @description Devuelve si dada una mano de Uno y una carta en la mesa, puede jugar o tiene que retirar del mazo. Las cartas
 * tienen uno de 4 colores posibles (red, blue, green or yellow) y un número del 1 al 9. Una carta se escribe como un string
 * con color y número. Por ejemplo: "yellow 3", "red 6". Se puede jugar si la carta en la mano coincide en color o en número
 * con la carta en la mesa
 *
 * @param {string[]} hand - Array de cartas que tiene en la mano 
 * @param {string} face - Carta que está en la mesa
 * @returns {Boolean} - Devuelve true si puede jugar alguna carta, o false si tiene que retirar del mazo
 * 
 * @example
 *   canPlay(["yellow 3", "yellow 5", "red 8"], "red 2") // returns true
 *   canPlay(["yellow 3", "yellow 5", "red 8"], "blue 5") // returns true
 *   canPlay(["yellow 3", "blue 5", "red 8", "red 9"], "green 4") // returns false
 *   canPlay(["yellow 3", "red 8"], "green 2") // returns false
 */
function canPlay(hand, face)
{
    let lastCard = hand[hand.length - 1].split(" ");
    let faceData = face.split(" ");

    return lastCard[0] === faceData[0] || lastCard[1] === faceData[1];
}

/**
 * @name removeWords
 * @description Dado un string y un array de palabras a remover, devuelve el string sin las palabras removidas
 *
 * @param {string} str - Texto a recortar 
 * @param {string[]} words - Palabras a remover
 * @returns {string} - Texto resultante con las palabras removidas
 * 
 * @example
 *   removeWords("This is a really bad test", ["really", "bad"]) // returns "This is a test"
 */
function removeWords(str, words)
{
    let words = str.split(" ");
    let finalStrig = "";

    for (word of words)
    {
        if (words.find(word) !== undefined)
            finalStrig += word + " ";
    }

    return finalStrig.trim();
}

/**
 * @name getRange
 * @description Dado dos números, devuelve un array con los números enteros sucesivos entre ellos, puede incluir los números 
 * iniciales o no
 *
 * @param {number} a 
 * @param {number} b
 * @param {boolean} [inclusive=true] inclusive // Parámetro opcional, valor por defecto true
 * @returns {number[]} - Array de números entre a y b, incluyendo a y b
 * 
 * @example
 *   getRange(5, 10) // returns [5, 6, 7, 8, 9 ,10]
 *   getRange(3, -2) // returns [3, 2, 1, 0, -1, -2]
 *   getRange(-5, -10, false) // returns [-6, -7, -8, -9]
 */
function getRange(a, b, inclusive = true)
{
    let range = [];

    let min = a < b ? a : b;
    let max = min === a ? b : a;

    for (let i = inclusive ? min : min + 1; i <= inclusive ? max : max - 1; i++)
        range.push(i);

    return range;
}