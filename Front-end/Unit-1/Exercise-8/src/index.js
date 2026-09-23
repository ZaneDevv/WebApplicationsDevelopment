/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

{
    let nombre = "Ana"; // Error: quotes didn't close
    console.log(nombre);
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    let edad = 20;
    console.log(edad);
    // let edad = 20; Variable defined after print
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    let a = 5;
    let b = 10;
    if (a === b) { // Condition was using assignment operator instead of comparator operator
        console.log("a es igual a b");
    }
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    let i = 0;
    while (i < 5) {
        console.log(i);
        i++; // Loop didn't finish because i was always 0
    }
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 5\n-------------------------");

{
    function saludar() {
        console.log("Hola "/* + nombre*/); // Variable "nombre" is undefined
    }
    saludar();
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 6\n-------------------------");

{
    let frutas = ["manzana", "banana", "pera"];
    console.log(frutas[3]); // The 3rd value value in the array is not pera, is undefined because arrays start from 0
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 7\n-------------------------");

{
    let persona = { nombre: "Ana", edad: 25 };
    console.log(persona./*apellido*/nombre.toUpperCase()); // "apellido" is not a property of "persona"
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 8\n-------------------------");

{
    let a = 5;
    let b = "10";
    console.log(a + b); // Adding number with string: no addition operation but concatenation
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 9\n-------------------------");

{
    let nota = 8;
    if (nota > 5)//; <- Semicolon was not expected
    {
        console.log("Aprobado");
    } else {
        console.log("Reprobado");
    }
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 10\n-------------------------");

{
    let numeros = [1, 2, 3, 4, 5];
    for (let i = 0; i </*=*/ numeros.length; i++) { // Comparator <= in lieu of <, including an unexistent parameter
        console.log(numeros[i]);
    }
}