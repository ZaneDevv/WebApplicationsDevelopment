window.onload = () => {
    const commandText = document.getElementById("command");

    const forbiddenKeys = "^";

    let targetKey;

    const getRandomKey = () => String.fromCharCode(33 + Math.round(Math.random() * 93)); 
    const setText = (key) => commandText.innerHTML = `Press the key <span id='key'>${key}</span>`;

    function goForNextKey()
    {
        targetKey = getRandomKey();
        setText(targetKey);

        if (forbiddenKeys.includes(targetKey))
            goForNextKey();
    }
    goForNextKey();

    window.addEventListener("keydown", event => {
        if (event.key === targetKey)
            goForNextKey();
    });
}