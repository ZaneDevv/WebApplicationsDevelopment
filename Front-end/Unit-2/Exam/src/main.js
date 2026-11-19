function exercise1(age, authorization)
{
    let isAdult = age >= 18;
    let isAllowed = isAdult && authorization;

    if (isAllowed)
    {
        console.log("Access granted");
    }
    else if (!isAdult)
    {
        console.log("Access denied: underage");
    }
    else
    {
        console.log("Authorization required");
    }
}

function exercise2()
{
    const numbers = [12, 7, 24, 3, 18, 9, 30];
    let greaterThan15 = 0;
    let sum = 0;

    console.log("----------------Numbers----------------");

    for (let i = 0; i < numbers.length; i++)
        console.log(numbers[i]);

    console.log("----------------Even numbers----------------");

    for (let i = 0; i < numbers.length; i++)
    {
        let number = numbers[i];

        if (number % 2 === 0)
            console.log(number);
    }

    console.log("----------------Numbers > 15----------------");

    for (let i = 0; i < numbers.length; i++)
    {
        let number = numbers[i];
        if (number > 15)
        {
            console.log(number);
            greaterThan15++;
        }
    }
    console.log(`Numbers greater than 15: ${greaterThan15}`);

    console.log("----------------Total sum----------------");

    for (let i = 0; i < numbers.length; i++)
        sum += numbers[i];

    console.log(sum);
}

function exercise3()
{
    let rolledNumber = 1 + Math.round(Math.random() * 5);
    alert(rolledNumber);

    if (confirm("Roll the dice again?"))
        exercise3();
}

function exercise4()
{
    let birthYear = parseInt(prompt("Enter your birth year"));

    if (Number.isNaN(birthYear))
    {
        console.error("Invalid year!");
    }
    else
    {
        const currentYear = new Date().getFullYear();
        let age = currentYear - birthYear;

        if (age < 0)
        {
            console.error("You cannot have been born in the future");
        }
        else
        {
            console.log(`Current year: ${currentYear}`);
            alert(`Age: ${age}`);
        }
    }
}

function exercise5()
{
    function getUser()
    {
        let data = document.cookie.split("user=")[1].trim();
        let semicolonPosition = data.indexOf(";");

        if (semicolonPosition > -1)
            data = data.slice(0, semicolonPosition);

        return data;
    }

    let name = prompt("Enter your name:");

    document.cookie = `user=${name}`;
    console.log(document.cookie);

    console.log(getUser());

    if (confirm("Do you want to delete the saved name?"))
    {
        document.cookie = `user=.; expires=${new Date(2000).toUTCString()}`;
        console.log("Cookie successfully deleted");
    }
}
