function encryptMessage(message)
{
    let encrypted = "";
    let squareSideLength = Math.floor(Math.sqrt(message.length));
    
    message = message.replaceAll(" ", "");

    for (let i = 0; i < message.length; i++)
    {
        encrypted += message[i];

        if ((i + 1) % squareSideLength === 0)
            encrypted += "\n";
    }

    return encrypted;
}

console.log(encryptMessage("If man was meant to stay on the ground god would have given us roots"));