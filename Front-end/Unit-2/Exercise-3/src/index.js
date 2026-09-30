/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    console.log(new Date());
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    console.log(new Date(2007, 5, 22));
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    let date = new Date();

    console.log(date.getFullYear());
    console.log(date.getMonth());
    console.log(date.getDate());
    console.log(date.getDay());
    console.log(`${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`);
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    let date = new Date();

    console.log(date.toDateString());
    console.log(date.toTimeString());
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function addDaysToDate(date, days)
{
    date.setTime(date.getTime() + days * 24 * 3600 * 1e3);
    return date;
}

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");

    let date = new Date();

    console.log(date);
    console.log(addDaysToDate(date, 2))
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");

    let now = new Date();
    let next31stDecember = new Date(`${now.getFullYear()}-11-31 00:00:00`);

    let difference = next31stDecember - now;

    console.log("The next 31st of December is in:");
    console.log(`Miliseconds: ${Math.floor(difference)}`);
    console.log(`Seconds: ${Math.floor(difference / 1e3)}`);
    console.log(`Minutes: ${Math.floor(difference / (1e3 * 60))}`);
    console.log(`Hours: ${Math.floor(difference / (1e3 * 3600))}`);
    console.log(`Days: ${Math.floor(difference / (1e3 * 3600 * 24))}`);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    let time1 = Math.random() * new Date().getTime();
    let time2 = Math.random() * new Date().getTime();

    let date1 = new Date(time1);
    let date2 = new Date(time2);

    console.log(date1);
    console.log(time1 < time2 ? "<" : time1 > time2 ? ">" : "=");
    console.log(date2);
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function getFirstDayByMonthAndYear(month, year)
{
    let day = new Date(`${year}-${month}-01 00:00:00`).getDay();
    return day.toLocaleDateString("es-US", {weekday: "long"});
}

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");

    let year = Math.abs(parseInt(prompt("Give me a year")));
    let month = Math.abs(parseInt(prompt("Give me a month"))) - 1;

    console.log(`Day: ${getFirstDayByMonthAndYear(month, year)}`);
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");
    console.log(new Date().toISOString());
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");
    
    let date = new Date();

    console.log(`Local: ${date}`);
    console.log(`UTC: ${date.getUTCDate()}`);
}

// ---------------------------------------------------
// EXERCISE 11
// ---------------------------------------------------

function ensureTwoDigits(number)
{
    return number < 10 ? `0${number}` : number;
}

function formatDate(date)
{
    let hours = ensureTwoDigits(date.getHours());
    let minutes = ensureTwoDigits(date.getMinutes());
    let seconds = ensureTwoDigits(date.getSeconds());

    return `${date.getDay()}/${date.getMonth()}/${date.getFullYear()} ${hours}:${minutes}:${seconds}`;
}

function doExercise11()
{
    console.log("-------------------------\nEXERCISE 11\n-------------------------");
    console.log(formatDate(new Date()));
}

// ---------------------------------------------------
// EXERCISE 12
// ---------------------------------------------------

function doExercise12()
{
    console.log("-------------------------\nEXERCISE 12\n-------------------------");
    
    let spain = Intl.DateTimeFormat("es-ES");
    let unitedStates = Intl.DateTimeFormat("en-US");
    let japan = Intl.DateTimeFormat("ja-JA");

    let now = new Date();
    
    console.log(spain.format(now));
    console.log(unitedStates.format(now));
    console.log(japan.format(now));
}

// ---------------------------------------------------
// EXERCISE 13
// ---------------------------------------------------

function doExercise13()
{
    console.log("-------------------------\nEXERCISE 13\n-------------------------");
    
    let now = new Date();
    let newYear = new Date(now.getFullYear() + 1, 1, 1);
    
    console.log("Time left for the new year:");
    setInterval(
        () => {
            now = new Date();
            let deltaTime = newYear - now;
            
            console.log("--------------------------------------------------");
            console.log(`Days: ${Math.floor(deltaTime / (1e3 * 3600 * 24))}`);
            console.log(`Hours: ${Math.floor(deltaTime / (1e3 * 3600))}`);
            console.log(`Minutes: ${Math.floor(deltaTime / (1e3 * 60))}`);
            console.log(`Seconds: ${Math.floor(deltaTime / 1e3)}`);
            console.log("--------------------------------------------------");
        },
        1e3
    );
}

// ---------------------------------------------------
// EXERCISE 14
// ---------------------------------------------------

function computeAge(birthYear, birthMonth, birthDay)
{
    let birthDate = new Date(birthYear, birthMonth - 1, birthDay);
    let now = new Date();
    let deltaTime = now - birthDate;

    return Math.floor(deltaTime / (1e3 * 3600 * 24 * 365));
}

function doExercise14()
{
    console.log("-------------------------\nEXERCISE 14\n-------------------------");
    
    let birthYear = Math.floor(parseInt(prompt("In what year were you born?")));
    let birthMonth = Math.floor(parseInt(prompt("In what month were you born?")));
    let birthDay = Math.floor(parseInt(prompt("In what Day were you born?")));

    console.log(`You are ${computeAge(birthYear, birthMonth, birthDay)} years old`);
}

// ---------------------------------------------------
// EXERCISE 15
// ---------------------------------------------------

function doExercise15()
{
    console.log("-------------------------\nEXERCISE 15\n-------------------------");
    
    let year = Math.floor(parseInt(prompt("In what year do you want to start?")));
    let month = Math.floor(parseInt(prompt("In what month do you want to start?"))) - 1;

    let now = new Date();
    let date = new Date(year, month, now.getDay());

    let days = [];

    for (let i = date.getTime(); i < now.getTime(); i += 36e5 * 24)
    {
        let date = new Date(i); 
        days.push(date);

        console.log(date);
    }
}

// ---------------------------------------------------
// EXERCISE 16
// ---------------------------------------------------

function doExercise16()
{
    console.log("-------------------------\nEXERCISE 16\n-------------------------");
    
    let now = new Date();

    let month = now.getMonth();
    let day = now.getDay();
    
    let nextFriday13 = undefined;

    let timeZone = "en-US";
    let timeProperties = {
        weekday: "long"
    };

    if (day <= 13 && new Date(now.getFullYear(), month, 13).toLocaleDateString(timeZone, timeProperties) === "Friday")
    {
        nextFriday13 = new Date(now.getFullYear(), month, 13);
    }

    while (nextFriday13 === undefined)
    {
        month++;

        let newDate = new Date(now.getFullYear(), month, 13);

        if (newDate.toLocaleDateString(timeZone, timeProperties) === "Friday")
        {
            nextFriday13 = newDate;
        }
    }

    console.log(nextFriday13);
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