// ------------------------------------------------------------------------
// CONSTANTS
// ------------------------------------------------------------------------

const WORDS = [
    { word: "Elephant", category: "Animal" },
    { word: "Giraffe", category: "Animal" },
    { word: "Kangaroo", category: "Animal" },
    { word: "Rhinoceros", category: "Animal" },
    { word: "Hippopotamus", category: "Animal" },
    { word: "Crocodile", category: "Animal" },
    { word: "Chameleon", category: "Animal" },
    { word: "Octopus", category: "Animal" },
    { word: "Penguin", category: "Animal" },
    { word: "Cheetah", category: "Animal" },
    { word: "Leopard", category: "Animal" },
    { word: "Gorilla", category: "Animal" },
    { word: "Orangutan", category: "Animal" },
    { word: "Koala", category: "Animal" },
    { word: "Platypus", category: "Animal" },
    { word: "Flamingo", category: "Animal" },
    { word: "Porcupine", category: "Animal" },
    { word: "Armadillo", category: "Animal" },
    { word: "Sloth", category: "Animal" },
    { word: "Meerkat", category: "Animal" },
    { word: "Strawberry", category: "Fruit" },
    { word: "Watermelon", category: "Fruit" },
    { word: "Pineapple", category: "Fruit" },
    { word: "Blackberry", category: "Fruit" },
    { word: "Raspberry", category: "Fruit" },
    { word: "Blueberry", category: "Fruit" },
    { word: "Passionfruit", category: "Fruit" },
    { word: "Dragonfruit", category: "Fruit" },
    { word: "Pomegranate", category: "Fruit" },
    { word: "Mango", category: "Fruit" },
    { word: "Papaya", category: "Fruit" },
    { word: "Guava", category: "Fruit" },
    { word: "Kiwi", category: "Fruit" },
    { word: "Avocado", category: "Fruit" },
    { word: "Cantaloupe", category: "Fruit" },
    { word: "Grapefruit", category: "Fruit" },
    { word: "Coconut", category: "Fruit" },
    { word: "Lemon", category: "Fruit" },
    { word: "Lime", category: "Fruit" },
    { word: "Cherry", category: "Fruit" },
    { word: "Mountain", category: "Place" },
    { word: "Volcano", category: "Place" },
    { word: "Cavern", category: "Place" },
    { word: "Waterfall", category: "Place" },
    { word: "Desert", category: "Place" },
    { word: "Jungle", category: "Place" },
    { word: "Ocean", category: "Place" },
    { word: "Island", category: "Place" },
    { word: "Canyon", category: "Place" },
    { word: "Plateau", category: "Place" },
    { word: "Meadow", category: "Place" },
    { word: "Swamp", category: "Place" },
    { word: "Tundra", category: "Place" },
    { word: "Taiga", category: "Place" },
    { word: "Savanna", category: "Place" },
    { word: "Bay", category: "Place" },
    { word: "Delta", category: "Place" },
    { word: "Fjord", category: "Place" },
    { word: "Glacier", category: "Place" },
    { word: "Atoll", category: "Place" },
    { word: "Computer", category: "Technology" },
    { word: "Keyboard", category: "Technology" },
    { word: "Algorithm", category: "Technology" },
    { word: "Processor", category: "Technology" },
    { word: "Motherboard", category: "Technology" },
    { word: "Harddrive", category: "Technology" },
    { word: "Smartphone", category: "Technology" },
    { word: "Laptop", category: "Technology" },
    { word: "Robot", category: "Technology" },
    { word: "Drone", category: "Technology" },
    { word: "Server", category: "Technology" },
    { word: "Database", category: "Technology" },
    { word: "Network", category: "Technology" },
    { word: "Firewall", category: "Technology" },
    { word: "Bluetooth", category: "Technology" },
    { word: "WiFi", category: "Technology" },
    { word: "Cloud", category: "Technology" },
    { word: "Virus", category: "Technology" },
    { word: "Malware", category: "Technology" },
    { word: "Encryption", category: "Technology" },
    { word: "Chocolate", category: "Food" },
    { word: "Broccoli", category: "Food" },
    { word: "Spaghetti", category: "Food" },
    { word: "Sandwich", category: "Food" },
    { word: "Hamburger", category: "Food" },
    { word: "Pizza", category: "Food" },
    { word: "Taco", category: "Food" },
    { word: "Sushi", category: "Food" },
    { word: "Curry", category: "Food" },
    { word: "Risotto", category: "Food" },
    { word: "Lasagna", category: "Food" },
    { word: "Omelette", category: "Food" },
    { word: "Biscuit", category: "Food" },
    { word: "Casserole", category: "Food" },
    { word: "Falafel", category: "Food" },
    { word: "Hummus", category: "Food" },
    { word: "Paella", category: "Food" },
    { word: "Smoothie", category: "Food" },
    { word: "Pancake", category: "Food" },
    { word: "Waffle", category: "Food" },
    { word: "Telescope", category: "Science" },
    { word: "Chemistry", category: "Science" },
    { word: "Biology", category: "Science" },
    { word: "Physics", category: "Science" },
    { word: "Genetics", category: "Science" },
    { word: "Evolution", category: "Science" },
    { word: "Molecule", category: "Science" },
    { word: "Atom", category: "Science" },
    { word: "Nebula", category: "Science" },
    { word: "Galaxy", category: "Science" },
    { word: "Quantum", category: "Science" },
    { word: "Entropy", category: "Science" },
    { word: "Photosynthesis", category: "Science" },
    { word: "Metabolism", category: "Science" },
    { word: "Microbe", category: "Science" },
    { word: "Fossil", category: "Science" },
    { word: "Dinosaur", category: "Science" },
    { word: "Crustacean", category: "Science" },
    { word: "Mammal", category: "Science" },
    { word: "Reptile", category: "Science" },
    { word: "Adventure", category: "Activity" },
    { word: "Exploration", category: "Activity" },
    { word: "Discovery", category: "Activity" },
    { word: "Hiking", category: "Activity" },
    { word: "Climbing", category: "Activity" },
    { word: "Swimming", category: "Activity" },
    { word: "Cycling", category: "Activity" },
    { word: "Running", category: "Activity" },
    { word: "Dancing", category: "Activity" },
    { word: "Singing", category: "Activity" },
    { word: "Painting", category: "Activity" },
    { word: "Drawing", category: "Activity" },
    { word: "Photography", category: "Activity" },
    { word: "Gardening", category: "Activity" },
    { word: "Cooking", category: "Activity" },
    { word: "Reading", category: "Activity" },
    { word: "Writing", category: "Activity" },
    { word: "Traveling", category: "Activity" },
    { word: "Camping", category: "Activity" },
    { word: "Fishing", category: "Activity" },
    { word: "Football", category: "Sport" },
    { word: "Basketball", category: "Sport" },
    { word: "Tennis", category: "Sport" },
    { word: "Athletics", category: "Sport" },
    { word: "Gymnastics", category: "Sport" },
    { word: "Boxing", category: "Sport" },
    { word: "Karate", category: "Sport" },
    { word: "Judo", category: "Sport" },
    { word: "Soccer", category: "Sport" },
    { word: "Volleyball", category: "Sport" },
    { word: "Baseball", category: "Sport" },
    { word: "Golf", category: "Sport" },
    { word: "Rugby", category: "Sport" },
    { word: "Hockey", category: "Sport" },
    { word: "Badminton", category: "Sport" },
    { word: "Tabletennis", category: "Sport" },
    { word: "Archery", category: "Sport" },
    { word: "Skiing", category: "Sport" },
    { word: "Argentina", category: "Country" },
    { word: "Australia", category: "Country" },
    { word: "Bangladesh", category: "Country" },
    { word: "Colombia", category: "Country" },
    { word: "Croatia", category: "Country" },
    { word: "Denmark", category: "Country" },
    { word: "Ecuador", category: "Country" },
    { word: "Finland", category: "Country" },
    { word: "Georgia", category: "Country" },
    { word: "Hungary", category: "Country" },
    { word: "Indonesia", category: "Country" },
    { word: "Jamaica", category: "Country" },
    { word: "Kenya", category: "Country" },
    { word: "Luxembourg", category: "Country" },
    { word: "Malaysia", category: "Country" },
    { word: "Norway", category: "Country" },
    { word: "Pakistan", category: "Country" },
    { word: "Qatar", category: "Country" },
    { word: "Romania", category: "Country" },
    { word: "Singapore", category: "Country" },
    { word: "Kaleidoscope", category: "Random" },
    { word: "Quarantine", category: "Random" },
    { word: "Jazz", category: "Random" },
    { word: "Puzzle", category: "Random" },
    { word: "Whisper", category: "Random" },
    { word: "Echo", category: "Random" },
    { word: "Mystery", category: "Random" },
    { word: "Fantasy", category: "Random" },
    { word: "Horizon", category: "Random" },
    { word: "Serendipity", category: "Random" },
    { word: "Labyrinth", category: "Random" },
    { word: "Paradox", category: "Random" },
    { word: "Renaissance", category: "Random" },
    { word: "Symphony", category: "Random" },
    { word: "Tornado", category: "Random" },
    { word: "Wilderness", category: "Random" },
    { word: "Xylophone", category: "Random" },
    { word: "Yoga", category: "Random" },
    { word: "Zeppelin", category: "Random" }
];

const LETTER_CLASS = "letter";

// ------------------------------------------------------------------------
// VARIABLES
// ------------------------------------------------------------------------

const category = document.getElementById("category");
const lifeAmount = document.getElementById("lifes-amount");

const lettersContainer = document.getElementById("letters-container");
const guesserContainer = document.getElementById("guesser-container");

let wordToGuess = "";
let lifes = 10;

// ------------------------------------------------------------------------
// METHODS
// ------------------------------------------------------------------------

const pickRandomWord = () => WORDS[Math.floor(Math.random() * WORDS.length)];

const hasDied = () => lifes <= 0;

const updateLifes = () => lifeAmount.textContent = lifes;

function generateLetters()
{
    const start = 'A'.charCodeAt(0);
    const end = 'Z'.charCodeAt(0);

    for (let i = start; i <= end; i++)
    {
        const p = document.createElement("p");
        p.className = LETTER_CLASS;
        p.textContent = String.fromCharCode(i);

        lettersContainer.appendChild(p);
    }
}

function looseLife()
{
    if (hasDied())
        return;

    lifes--;
    updateLifes();

    if (hasDied())
        startMatch();
}

function cleanWord()
{
    while (guesserContainer.firstChild)
        guesserContainer.removeChild(guesserContainer.lastChild);
}

function startMatch()
{
    lifes = 10;
    updateLifes();
    
    cleanWord();
    const word = pickRandomWord();
 
    wordToGuess = word.word.toUpperCase();
    category.textContent = word.category;

    for (let i = 0; i < wordToGuess.length; i++)
    {
        const p = document.createElement("p");
        p.className = wordToGuess[i];
        p.textContent = "_";

        guesserContainer.appendChild(p);
    }
}

// ------------------------------------------------------------------------
// EVENTS
// ------------------------------------------------------------------------

document.addEventListener("click", event => {
    if (event.target.innerHTML.length !== 1)
        return;
    
    const targetLetter = event.target.innerHTML;
    const letters = document.getElementsByClassName(targetLetter.trim());

    if (letters.length === 0)
        looseLife();
    else
    {
        for (let letter of letters)
            letter.innerHTML = targetLetter;
    }
});

// ------------------------------------------------------------------------
// LOGIC
// ------------------------------------------------------------------------

generateLetters();
startMatch();