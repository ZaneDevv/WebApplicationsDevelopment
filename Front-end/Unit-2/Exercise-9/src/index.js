/**
 * @author Álvaro Fernández Barrero
 */

function printCookies()
{
    const cookies = document.cookie.split(";");
    
    let toPrint = "";
    let index = 0;

    for (cookie of cookies)
    {        
        let sections = cookie.split("=");
        
        if (sections[0] !== "")
            toPrint += `${++index}. ${sections[0].trim()} = ${sections[1]}\n`;
    }

    if (toPrint !== "")
        console.log(toPrint);
}

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    
    document.cookie = "name=alvaro";
    printCookies();
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    
    document.cookie = "name=alvaro";
    document.cookie = "age=19";
    document.cookie = "city=granada";

    printCookies();
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");
    
    document.cookie = "name=Juan";
    document.cookie = document.cookie.replace("name=Juan", "name=Pedro");

    printCookies();
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    document.cookie = "name=John";
    document.cookie = "name=Jane";

    printCookies();
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function getCookieValue(searchingCookieName)
{
    const cookies = document.cookie.split(";");
    
    let value = undefined;

    for (let i = 0; value === undefined && i < cookies.length; i++)
    {
        let separatedCookie = cookies[i].split("=");

        let cookieName = separatedCookie[0].trim();
        let cookieValue = separatedCookie[1].trim();


        if (cookieName === searchingCookieName)
            value = cookieValue;
    }

    return value;
}

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    document.cookie = "name=Juan";
    document.cookie = "city=Granada";
    document.cookie = "age=25";

    console.log(`Name: ${getCookieValue("name")}`);
    console.log(`City: ${getCookieValue("city")}`);
    console.log(`Age: ${getCookieValue("age")}`);
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    
    console.log(`Name: ${getCookieValue("name")}`);
    console.log(`Address: ${getCookieValue("address")}`);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");

    function greet()
    {
        let userName = getCookieValue("username");
        console.log(userName !== undefined ? `Welcome back, ${userName}!` : "We do not know your name yet");
    }

    greet();
    
    const submitButton = document.getElementById("submit-username-button");
    const removeUserButton = document.getElementById("remove-username-button");
    const userNameInput = document.getElementById("username-input");

    submitButton.addEventListener("click", () => {
        document.cookie = `username=${userNameInput.value}`;
        greet();
    });

    removeUserButton.addEventListener("click", () => {
        document.cookieValue = "username=.; expires=Thu, 18 Dec 2013 12:00:00 UTC";
    });
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");
    
    let now = new Date();
    now = now.setTime(now.getTime() + 1e3 * 3600 * 24);

    document.cookie = `myname=John; expires=${now.toString()}`;
    printCookies();
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");
    
    let now = new Date();
    now = now.setTime(now.getTime() + 1e3 * 30);

    document.cookie = `temporalcookie=a; expires=${now.toString()}`;
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");
    
    const submitButton = document.getElementById("submit-username-button");
    const welcomeText = document.getElementById("welcome-text");
    const userNameInput = document.getElementById("username-input");
    
    function greet()
    {
        let userName = getCookieValue("username");
        let amountVisits = getCookieValue("visits");

        switch (amountVisits)
        {
        case "1":
            welcomeText.innerHTML = `Welcome, ${userName}!`;
            break;
            
        case "2":
            welcomeText.innerHTML = `Welcome back, ${userName}!`;
            break;

        default:
            welcomeText.innerHTML = "We do not know your name yet";
        }

        amountVisits = amountVisits === undefined ? "0" : amountVisits;
        document.cookie = `visits=${Math.min(2, Number(amountVisits) + 1)}`;
    }

    greet();

    submitButton.addEventListener("click", () => {
        document.cookie = `username=${userNameInput.value}`;
        greet();
    });
}

// ---------------------------------------------------
// EXERCISE 11
// ---------------------------------------------------

function doExercise11()
{
    console.log("-------------------------\nEXERCISE 11\n-------------------------");

    let amountVisits = Number(getCookieValue("visits"));
    if (Number.isNaN(amountVisits))
        amountVisits = 0;

    document.cookie = `visits=${++amountVisits}`;
    console.log(`Visits: ${amountVisits}`);
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