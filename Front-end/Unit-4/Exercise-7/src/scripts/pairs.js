// ------------------------------------------------------------------------
// CONSTANTS
// ------------------------------------------------------------------------

const CARDS = [
    "https://www.animalspot.net/wp-content/uploads/2023/12/Mallard-Duck.jpg",
    "https://www.birdadvisors.com/wp-content/uploads/2022/02/Mallard-ducks.jpg",
    "https://img.freepik.com/premium-photo/duck-swimming-water_81048-31820.jpg",
    "https://tse2.mm.bing.net/th/id/OIP.MGXRecFeW3cYWUV7sKs8EgHaEJ?r=0&pid=Api",
    "https://tse2.mm.bing.net/th/id/OIP.P_d2mDJB6RWtDKXR8FyzawHaE8?r=0&pid=Api",
    "https://ducksofprovidence.com/wp-content/uploads/2024/06/wp-17195115820302082688886541539591.jpg",
    "https://ducksofprovidence.com/wp-content/uploads/2024/06/20240402_184001-1536x1152.jpg",
    "https://insectsinresin.com/wp-content/uploads/2022/09/Wholesale-Taxidermy-Duckling-scaled-scaled.jpg",
    "https://media.istockphoto.com/id/153175629/photo/tufted-duck.jpg?s=612x612&w=0&k=20&c=HqxSrH_0Z74lop7ryfh_WhriaJfEnw-5RReAFXB0_Ck=",
    "https://i.pinimg.com/originals/86/8f/ab/868fab02a50a441d21756100bc25b171.jpg"
];

// ------------------------------------------------------------------------
// VARIABLES
// ------------------------------------------------------------------------

const cardContainer = document.getElementById("cards-container");

let currentImage = undefined;

let cardsToUoh = 0;

// ------------------------------------------------------------------------
// METHODS
// ------------------------------------------------------------------------

const doCardsShareImage = (card1, card2) => card1.style.backgroundImage === card2.style.backgroundImage;

function shuffle(array) {
    let currentIndex = array.length;

    while (currentIndex != 0)
    {
        let randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex--;

        [array[currentIndex], array[randomIndex]] = [array[randomIndex], array[currentIndex]];
    }

    return array;
}

function generateCards()
{
    let cards = shuffle(CARDS.concat(CARDS));

    for (const image of cards)
    {
        const card = document.createElement("div");
        card.className = "card";
        card.style.backgroundImage = `url("${image}")`;

        cardContainer.appendChild(card);
    }
}

function tryWin()
{
    if (cardsToUoh > 0)
    {
        cardsToUoh--;
        return;
    }

    
}

function startMatch()
{
    generateCards();
    cardsToUoh = CARDS.length;
}

// ------------------------------------------------------------------------
// EVENTS
// ------------------------------------------------------------------------

document.addEventListener("click", event => {
    if (event.target.className !== "card")
        return;

    if (!currentImage)
    {
        currentImage = event.target;
        return;
    }
    
    if (!doCardsShareImage(currentImage, event.target))
    {
        currentImage = undefined;
        return;
    }
    
    tryWin();
});

// ------------------------------------------------------------------------
// LOGIC
// ------------------------------------------------------------------------

startMatch();