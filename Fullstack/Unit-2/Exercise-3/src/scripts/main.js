// ----------------------------------------------------------------------------------
// IMPORTS
// ----------------------------------------------------------------------------------

import { initializeApp } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-app.js";
import { getFirestore, getDocs, addDoc, collection } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-firestore.js";

// ----------------------------------------------------------------------------------
// SETTING UP FIREBASE
// ----------------------------------------------------------------------------------

const firebaseConfig = {
    apiKey: "AIzaSyCdY9jyDneVD9JKPIYZGNLf8gi01CQnYpM",
    authDomain: "testingfirestore-8b040.firebaseapp.com",
    projectId: "testingfirestore-8b040",
    storageBucket: "testingfirestore-8b040.firebasestorage.app",
    messagingSenderId: "625707244820",
    appId: "1:625707244820:web:e07667b288b6ceff9cb601"
};

const app = initializeApp(firebaseConfig);
const database = getFirestore(app);

// ----------------------------------------------------------------------------------
// VARIABLES
// ----------------------------------------------------------------------------------

const COLLECTION_NAME = "piece_art";

const artContainer = document.getElementById("art-container");

const newArtInputTitle = document.getElementById("new-piece-art-title");
const newArtInputAuthor = document.getElementById("new-piece-art-author");
const newArtInputImage = document.getElementById("new-piece-art-image");

const addNewArtButton = document.getElementById("button-add-art");

// ----------------------------------------------------------------------------------
// METHODS
// ----------------------------------------------------------------------------------

/**
 * Creates all the HTML elements for the given piece of art's data
 * @param {Object} data Data for the new peice of art
 * @author Álvaro Fernández Barrero 
 */
function createPieceOfArtHtml(data)
{
    const pieceArt = document.createElement("div");
    pieceArt.className = "piece-art";

    const image = document.createElement("img");
    image.src = data.image_url;

    const title = document.createElement("h3");
    title.innerHTML = data.title;
    title.className = "art-title";

    const author = document.createElement("p");
    author.innerHTML = data.author;
    author.className = "author-text";

    pieceArt.appendChild(image);
    pieceArt.appendChild(title);
    pieceArt.appendChild(author);

    artContainer.appendChild(pieceArt);
}

/**
 * Loads all the saved pieces of art on screen
 */
async function load()
{
    const dataFromDatabase = await getDocs(collection(database, COLLECTION_NAME));
    const receivedData = dataFromDatabase.docs;

    receivedData.forEach(element => createPieceOfArtHtml(element.data()));
}

/**
 * Adds a new piece of art's data for the database
 * @author Álvaro Fernández Barrero
 */
async function addArt()
{
    let data = {
        title: newArtInputTitle.value,
        author: newArtInputAuthor.value,
        image_url: newArtInputImage.value
    };

    createPieceOfArtHtml(data);

    await addDoc(collection(database, COLLECTION_NAME), data);
}

// ----------------------------------------------------------------------------------
// EVENTS
// ----------------------------------------------------------------------------------

addNewArtButton.addEventListener("click", addArt);

// ----------------------------------------------------------------------------------
// SET UP
// ----------------------------------------------------------------------------------

load();
