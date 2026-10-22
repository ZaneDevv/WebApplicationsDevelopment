window.onload = () => {
    const buttons = [
        document.getElementById("red"),
        document.getElementById("blue"),
        document.getElementById("yellow"),
        document.getElementById("green")
    ];
    const levelText = document.getElementById("level");

    let level = 0;
    let pickedButton;

    function upgrade()
    {
        level++;
        levelText.innerHTML = `Level ${level}`;
    }
    upgrade();

    const getRandomButton = () => pickedButton = buttons[Math.floor(Math.random() * buttons.length)];
    getRandomButton();

    for (let button of buttons)
        button.addEventListener("click", () => {
            if (pickedButton !== button)
                return;
            
            getRandomButton();
            button.style.opacity = 1;

            upgrade();
        });
    
    setInterval(() => {
        if (pickedButton)
            pickedButton.style.opacity = 1;

        setTimeout(() => {
            if (pickedButton)
                pickedButton.style.opacity = 0;
        }, 5e+2);
    }, 1e+3);
}