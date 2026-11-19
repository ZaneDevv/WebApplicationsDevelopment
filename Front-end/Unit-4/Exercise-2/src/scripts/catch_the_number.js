window.onload = () => {
    const messageText = document.getElementById("message-text");
    const numbersContainer = document.getElementById("numbers");

    let pickedNumber;

    const selectRandomNumber = () => pickedNumber = 1 + Math.floor(Math.random() * 9);
    const showNumber = () => messageText.innerHTML = `Pick the number <span id="number-selected">${pickedNumber}</span>`;
    
    function pickNumber()
    {
        selectRandomNumber();
        showNumber();
    }
    
    pickNumber();

    numbersContainer.addEventListener("click", element => {
        if (element.target.innerHTML == pickedNumber)
            pickNumber();
    });
}