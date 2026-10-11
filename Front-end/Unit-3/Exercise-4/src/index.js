/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    
    let fruits = ['apple', 'banana', 'peach', 'strawberry', 'blueberry'];
    
    console.log(fruits[0]);
    console.log(fruits[fruits.length - 1]);    
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    
    let array = ["b", "c"];
    array.push("d");
    array.unshift("a");

    console.log(array);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    let names = ["John", "Jane", "Alex", "Maria"];

    for (let i = 0; i < names.length; i++)
        console.log(names[i]);

    for (let name of names)
        console.log(name);

    names.forEach(name => console.log(name));
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    let languages = ["C", "C++", "C#", "Java", "JavaScript", "PHP", "Lua"];

    console.log(languages.indexOf("JavaScript"));
    console.log(languages.includes("C"));
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    let array1 = ["English", "French", "Spanish"];
    let array2 = ["German", "Norwerian", "Swedish"];
    let array3 = array1.concat(...array2);

    console.log(...array3);
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    
    let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    let doubleNumbers = numbers.map(n => 2 * n);

    console.log(doubleNumbers);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");
    
    let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    let oddNumbers = numbers.filter(n => (n & 1) === 1);

    console.log(oddNumbers);
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");
    
    let numbers = [];
    for (let i = 1; i <= 100; i++)
        numbers.push(i);

    console.log(numbers.reduce((accumulator, value) => accumulator + value));
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");
    
    let names = ["John", "Jane", "Alex", "Maria"];
    let sortedNames = names.sort((name1, name2) => name1.localeCompare(name2));

    console.log(sortedNames);
    console.log(sortedNames.reverse());
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");
    
    let words = ["Hello", "what are you up to?"];
    let sentence = words.join(", ");

    console.log(sentence);
}

// ---------------------------------------------------
// EXERCISE 11
// ---------------------------------------------------

function doExercise11()
{
    console.log("-------------------------\nEXERCISE 11\n-------------------------");
    
    let sentence = "Thank you in advance, I don't wanna dance. I don't need your hands all over me. If I wanna a man, them I'ma get a man, but it's never my priority";
    let words = sentence.split(" ");

    console.log(words);
}

// ---------------------------------------------------
// EXERCISE 12
// ---------------------------------------------------

function doExercise12()
{
    console.log("-------------------------\nEXERCISE 12\n-------------------------");
    
    let numbers = [];
    for (let i = 0; i < 100; i++)
        numbers.push(1 + Math.round(Math.random() * 59));

    let set = new Set(numbers);
    console.log(set);
}

// ---------------------------------------------------
// EXERCISE 13
// ---------------------------------------------------

function doExercise13()
{
    console.log("-------------------------\nEXERCISE 13\n-------------------------");
    
    let integers = [5, 1, 9, 20, 5, -1, -6, 15];

    console.log(`Max: ${Math.max(...integers)}\nMin: ${Math.min(...integers)}`);
}

// ---------------------------------------------------
// EXERCISE 14
// ---------------------------------------------------

function doExercise14()
{
    console.log("-------------------------\nEXERCISE 14\n-------------------------");
    
    let matrix = [
        [1, 0, 0],
        [0, 1, 0],
        [0, 0, 1]
    ];

    console.log(matrix.flat());
}

// ---------------------------------------------------
// EXERCISE 15
// ---------------------------------------------------

function doExercise15()
{
    console.log("-------------------------\nEXERCISE 15\n-------------------------");
    
    let names = ["Jane", "Alex", "John", "Alex", "Jane", "Jane", "Jane", "John"];
    let janeAmout = names.reduce((accumulator, name) => name.toUpperCase() === "JANE" ? accumulator + 1 : accumulator, 0);

    console.log(`#Jane: ${janeAmout}`);
}

// ---------------------------------------------------
// EXERCISE 16
// ---------------------------------------------------

function doExercise16()
{
    console.log("-------------------------\nEXERCISE 16\n-------------------------");
    
    let people = [
        {name: "John", lastName: "Doe", age: 36},
        {name: "Jane", lastName: "Doe", age: 34},
    ]
    let peopleName = people.map(person => person.name);

    console.log(peopleName);
}

// ---------------------------------------------------
// EXERCISE 17
// ---------------------------------------------------

function doExercise17()
{
    console.log("-------------------------\nEXERCISE 17\n-------------------------");
    
    let names = ["John", "Jane", "Maria"];
    let ages = [30, 31, 32];

    let objectsArray = names.map(name => {
        return {name: name, age: ages[names.indexOf(name)]}
    });

    console.log(objectsArray);
}

// ---------------------------------------------------
// EXERCISE 18
// ---------------------------------------------------

function doExercise18()
{
    console.log("-------------------------\nEXERCISE 18\n-------------------------");
    
    let users = [
        {name: "Jane", age: 25},
        {name: "John", age: 30},
        {name: "Alex", age: 20}
    ]
    let sortedUsers = users.sort((userA, userB) => Math.sign(userA.age - userB.age));

    console.log(sortedUsers);
}

// ---------------------------------------------------
// EXERCISE 19
// ---------------------------------------------------

function doExercise19()
{
    console.log("-------------------------\nEXERCISE 19\n-------------------------");
    
    let numbers = [];
    for (let i = 0; i < 100; i++)
        numbers.push(1 + Math.round(Math.random() * 59));

    let set = new Set(numbers.sort((a, b) => Math.sign(a - b)));
    console.log(set);
}

// ---------------------------------------------------
// EXERCISE 20
// ---------------------------------------------------

function doExercise20()
{
    console.log("-------------------------\nEXERCISE 20\n-------------------------");
    
    let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    let addedUpSquaresOfEvenNumbers = numbers
                                    .filter(x => (x & 1) === 0)
                                    .map(x => x * x)
                                    .reduce((accumulator, x) => accumulator + x);
    
    console.log(addedUpSquaresOfEvenNumbers);
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
doExercise19();
doExercise20();