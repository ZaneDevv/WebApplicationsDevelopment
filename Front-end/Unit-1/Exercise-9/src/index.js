/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

{
    let numero = 10;
    if (numero > 5) {
        numero =/*=*/ 20; // Using comparator operator in lieu of assignment operator
    }
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
   let ciudad = "Madrid";
   console.log(/*Ciudad*/ ciudad); // Variable name not recognised. EcmaScript is case-sensitive, Ciudad is not the same as ciudad
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    function sumar(a, b) {
        let resultado = a + b;
        return resultado; // The function did not return anythng
    }

    console.log(sumar(2, 3)); // The function was not returning anything
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    let i = 1;
    while (i /*>*/ < 5) { // The loop was requiring that i be greater than 5, but it was set to 1. Thus, the loop never started
        console.log(i);
        i++;
    }
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 5\n-------------------------");

let saludo = "Hola";
let nombre = "Luis";
console.log(saludo + /*, */nombre); // Comma has nothing to do in this statement

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 6\n-------------------------");

let dias = ["Lunes", "Martes", "Miércoles"];
console.log(dias[/*3*/2]); // Arrays start from 0, the 3rd component has index 2. There is no component with index 3

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 7\n-------------------------");

{
    let usuario = { nombre: "Ana", edad: 25 };
    console.log(usuario.nombre.toLowerCase/*e*/()); // toLowerCasee does not exist, it is misspelled
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 8\n-------------------------");

{
    let edad = 18;
    if (edad /*=*/== 18) { // Assigning operator used instead of comparator operator
        console.log("Tienes 18 años");
    }
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 9\n-------------------------");

{
    let numeros = [1, 2, 3, 4, 5];
    for (let i = 0; i < numeros.length; i++)/*;*/ { // Syntax does not ask for semicolon after for statement
        console.log(numeros[i]);
    }
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 10\n-------------------------");

{
    let palabra = "javascript";
    for (let i = 0; i </*=*/ palabra.length; i++) { // Wrong operator as strings are arrays
        console.log(palabra[i]);
    }
}