/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

const sum = (num1, num2) => num1 + num2;

sum(40,2);
sum(42,0);
console.log("the answer to everything is", sum(42,0));

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

const stringLength0 = str => {
    console.log(`the length of "${str}" is:`, str.length);
}

let longestCityNameInTheWorld = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";

stringLength0(longestCityNameInTheWorld);

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

const stringLength = str =>{
    let length = str.length
    console.log(`the length of "${str}" is:`, length)
    return str.length;
}

stringLength("willynilly")

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

let alerts = ["Hey, you are awesome", "You are so wonderful", "What a marvel you are", "You're so lovely", "You're so sweet that I'd think you're a sweet potato -- and I LOOOOVE POTATOES"]

const showAlert = name => lert(alerts[(Math.floor(Math.random()*alerts.length))] + `, ${name}!`);

showAlert("you ball of fluff");

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

const greet = (name, age) => console.log(`Hello, I am ${name} and I am ${age} years old`);

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

const sumUp = integers => {
    let result = 0;
    integers.reduce((accumulator, currentValue) => result += currentValue);

    return result;
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

let eye = "eye";

const fire = () => {
    return `bulls-`;
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

const fibonacci = n => {
    if (n < 3) return 1;
    
    return fibonacci(n - 1) + fibonacci(n - 2);
}