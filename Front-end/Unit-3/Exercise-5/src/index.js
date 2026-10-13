/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    
    let classroom = [
        ['John Doe', 17, 6, 8, 5],
        ['Jane Doe', 17, 7, 7, 8],
        ['Albert Doe', 18, 7, 8, 9],
        ['Maria Doe', 17, 5, 10, 6],
    ];

    function getMark(studentId, semester)
    {
        return classroom[studentId][semester + 1];
    }

    function computeAvarageAge()
    {
        return classroom.reduce((accumulator, value) => accumulator + value[1], 0) / classroom.length;
    }

    function getRandomStudentName()
    {
        return classroom[Math.floor(Math.random() * classroom.length)][0];
    }

    console.log(getMark(3, 2));
    console.log(computeAvarageAge().toFixed(2));
    console.log(getRandomStudentName());
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    
    let numbers = [];
    for (let i = 0; i < 100; i++)
        numbers.push(1 + Math.floor(Math.random() * 1e3));

    let evenNumbers = numbers.filter(n => (n & 1) === 0);
    let oddNumbers = numbers.filter(n => (n & 1) === 1);
    let evenOddNumbers = evenNumbers.concat(oddNumbers);

    console.log(numbers);
    console.log(evenOddNumbers);
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    function computeSalary(sells)
    {
        return 200 + sells * 0.09;
    }

    console.log(computeSalary(5000));
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    let array = [];
    for (let i = 0; i < 20; i++)
        array.push(Math.round(Math.random() * 10));

    function setTo0ToThe10First()
    {
        array = array.map((value, index) => index < 10 ? 0 : value);
    }

    function setAllTo1()
    {
        array = array.map(_ => 1);
    }

    function printArray()
    {
        console.log(array.reduce((result, value) => result + value + " "));
    }

    setTo0ToThe10First();
    printArray();
    
    setAllTo1();
    printArray();
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    let dices = [0, 0, 0];
    let combinations = [];
    let distinctCombinations = [];

    const computeRolledDice = () => Math.round(Math.random() * 5) + 1;

    function rollDices()
    {
        let dice0 = computeRolledDice();
        let dice1 = computeRolledDice();

        let combinationArray = [dice0, dice1];

        dices[0] = dice0;
        dices[1] = dice1;
        dices[2] = dice0 + dice1;

        let found = combinations.find(value => value === combinationArray) !== undefined;
        if (!found)
            combinations.push(combinationArray);
    }

    for (let i = 0; i < 36e3; i++)
        rollDices();

    combinations.forEach(combination => {
        let foundIndex = distinctCombinations.find(value => value[0] === combination[0] && value[1] === combination[1]);

        if (foundIndex === undefined)
            distinctCombinations.push([combination[0], combination[1], 1]);
        else
            distinctCombinations[distinctCombinations.indexOf(foundIndex)][2]++;
    });  

    console.log(distinctCombinations);
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    
    let takenSeats = 0b0000000000;

    function printBill(seatNumber)
    {
        let toPrint = `+${"-".repeat(15)}+\n| Aeroline${" ".repeat(6)}|\n Seat: ${seatNumber + 1}\n+${"-".repeat(15)}+\n`;
        console.log(toPrint);
    }

    function tryToTakeSeat(offset = 0)
    {
        let seatNumber = -1;

        for (let i = offset; seatNumber < 0 && i < 5 + offset; i++)
        {
            let currentBit = 1 << i;
            if ((takenSeats & currentBit) === 0)
            {
                seatNumber = i;
                takenSeats |= currentBit;
            }
        }


        return seatNumber;
    }

    function askForSeat(isFirst)
    {
        let seat = isFirst ? tryToTakeSeat() : -1;

        if (seat < 0)
            seat = tryToTakeSeat(5);

        if (seat > 0)
            printBill(seat);
    }

    askForSeat(false);
    askForSeat(false);
    askForSeat(true);
    askForSeat(false);
    askForSeat(true);
    askForSeat(false);
    askForSeat(false);
    askForSeat(false);
    askForSeat(false);
    askForSeat(true);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");
    
    const employeesProductData = [];
    for (let i = 0; i < 100; i++)
        employeesProductData.push({
            employee: 1 + Math.round(Math.random() * 3),
            product: 1 + Math.round(Math.random() * 4),
            amount: 1 + Math.round(Math.random() * 4)
        });

    let totalSellsByEmployee = [];
    employeesProductData.forEach(data => {
        let valueFound = totalSellsByEmployee.find(value => value.employee === data.employee);

        if (valueFound === undefined)
            totalSellsByEmployee.push({
                employee: data.employee,
                amount: data.amount
            });
        else
            totalSellsByEmployee[totalSellsByEmployee.indexOf(valueFound)].amount += data.amount;
    })

    console.log(totalSellsByEmployee);
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