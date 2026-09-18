/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

var name = "Álvaro Fernández Barrero";
console.log(name);

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

let age = 10;
console.log("Age 1: " + age);
age = 80;
console.log("Age 2: " + age);

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

const country = "Germany";
// country = 5; -> Error
console.log("Country: " + country);

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    var x = 10;
}
console.log("x: " + x); // x is defined even out of the scope

{
    let y = 20;
}
// console.log("y: " + y); -> y is not defined out of the scope
console.log("y is undefined out of the scope");