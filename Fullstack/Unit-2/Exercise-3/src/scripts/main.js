// ----------------------------------------------------------------------------------
// IMPORTS
// ----------------------------------------------------------------------------------

import { initializeApp } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-app.js";
import { 
    getFirestore,
    collection, doc,
    getDocs, addDoc, deleteDoc, updateDoc
} from "https://www.gstatic.com/firebasejs/10.12.5/firebase-firestore.js";

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
// CONSTANTS
// ----------------------------------------------------------------------------------

const COLLECTION_NAME = "piece_art";

const DELETE_BUTTON_CLASS = "delete-button";
const UPDATE_BUTTON_CLASS = "update-button";

const IMAGE_CLASS = "art-image";
const TITLE_CLASS = "art-title";
const AUTHOR_CLASS = "author-text";

// ----------------------------------------------------------------------------------
// VARIABLES
// ----------------------------------------------------------------------------------

const artContainer = document.getElementById("art-container");

const newArtInputTitle = document.getElementById("new-piece-art-title");
const newArtInputAuthor = document.getElementById("new-piece-art-author");
const newArtInputImage = document.getElementById("new-piece-art-image");
const addNewArtButton = document.getElementById("button-add-art");

const artModifyContainer = document.getElementById("modify-art");
const artModifyInputTitle = document.getElementById("piece-art-title");
const artModifyInputAuthor = document.getElementById("piece-art-author");
const artModifyInputImage = document.getElementById("piece-art-image");

let modifyingId = undefined;

// ----------------------------------------------------------------------------------
// METHODS
// ----------------------------------------------------------------------------------

/**
 * Gets a valid object for firbase with the input fields's data
 * @returns An object to properly assign to firestore with the input fields
 * @author Álvaro Fernández Barrero
 */
function obtainDataFromInputFields()
{
    return {
        title: newArtInputTitle.value,
        author: newArtInputAuthor.value,
        image_url: newArtInputImage.value
    };
}

/**
 * Cleans the input's data
 * @author Álvaro Fernández Barrero
 */
function cleanNewArtFormData()
{
    newArtInputTitle.value = "";
    newArtInputAuthor.value = "";
    newArtInputImage.value = "";
}

/**
 * Cleans the input's data
 * @author Álvaro Fernández Barrero
 */
function cleanModifyArtFormData()
{
    newArtInputTitle.value = "";
    newArtInputAuthor.value = "";
    newArtInputImage.value = "";
}

/**
 * Removes the paint with the given ID
 * @param {String} id Paint's id
 * @author Álvaro Fernández Barrero
 */
function removeArt(id)
{
    const artDiv = document.getElementById(id);
    if (!artDiv)
        return;

    artDiv.remove();
    deleteDoc(doc(database, COLLECTION_NAME, id));
}

/**
 * Updates an art's data
 * @param {String} id Paint's id
 * @author Álvaro Fernández Barrero 
 */
async function updateArt()
{
    if (modifyingId === undefined)
        return;

    let data = {
        title: artModifyInputTitle.value,
        author: artModifyInputAuthor.value,
        image_url: artModifyInputImage.value
    };
    cleanModifyArtFormData();

    await updateDoc(doc(database, COLLECTION_NAME, modifyingId), data);

    const elementToUpdate = document.getElementById(modifyingId);

    for (let child of elementToUpdate.children)
    {
        switch (child.className)
        {
        case IMAGE_CLASS:
            child.src = data.image_url;
            break;

        case TITLE_CLASS:
            child.innerHTML = data.title;
            break;
        
        case AUTHOR_CLASS:
            child.innerHTML = data.author;
            break;
        }
    };

    closeUpdateMenu();
}

/**
 * Creates all the HTML elements for the given piece of art's data
 * @param {Object} data Data for the new peice of art
 * @author Álvaro Fernández Barrero 
 */
function createPieceOfArtHtml(data, id)
{
    const pieceArt = document.createElement("div");
    pieceArt.className = "piece-art";
    pieceArt.id = id;

    const image = document.createElement("img");
    image.src = data.image_url;
    image.className = IMAGE_CLASS;

    const title = document.createElement("h3");
    title.innerHTML = data.title;
    title.className = TITLE_CLASS;

    const author = document.createElement("p");
    author.innerHTML = data.author;
    author.className = AUTHOR_CLASS;

    const editButton = document.createElement("button")
    editButton.innerHTML = "Edit";
    editButton.className = UPDATE_BUTTON_CLASS;

    const deleteButton = document.createElement("button");
    deleteButton.innerHTML = "Delete";
    deleteButton.className = DELETE_BUTTON_CLASS;

    pieceArt.appendChild(image);
    pieceArt.appendChild(title);
    pieceArt.appendChild(author);
    pieceArt.appendChild(editButton);
    pieceArt.appendChild(deleteButton);

    artContainer.appendChild(pieceArt);
}

/**
 * Loads all the saved pieces of art on screen
 * @author Álvaro Fernández Barrero
 */
async function load()
{
    const dataFromDatabase = await getDocs(collection(database, COLLECTION_NAME));
    const receivedData = dataFromDatabase.docs;

    receivedData.forEach(element => createPieceOfArtHtml(element.data(), element.id));
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
    cleanNewArtFormData();

    let newDocument = await addDoc(collection(database, COLLECTION_NAME), data);
    createPieceOfArtHtml(data, newDocument.id);
}

/**
 * Opens the menu to modify an art's data
 * @param {String} id Art to modify's id
 * @author Álvaro Fernández Barrero
 */
function openUpdateMenu(id)
{
    modifyingId = id;
    artModifyContainer.style.display = "block";
}

/**
 * Closes the menu to stop modifying an art's data
 * @author Álvaro Fernández Barrero
 */
function closeUpdateMenu()
{
    modifyingId = undefined;
    artModifyContainer.style.display = "none";
}

// ----------------------------------------------------------------------------------
// EVENTS
// ----------------------------------------------------------------------------------

addNewArtButton.addEventListener("click", addArt);

artContainer.addEventListener("click", event => {
    if (!event.target.parentElement)
        return;

    let id = event.target.parentElement.id;

    if (event.target.className === DELETE_BUTTON_CLASS)
    {
        removeArt(id);
        return;
    }
        
    if (event.target.className === UPDATE_BUTTON_CLASS)
        openUpdateMenu(id);
});

artModifyContainer.addEventListener("click", event => {
    switch (event.target.id)
    {
    case "button-modify-art":
        updateArt();
        break;
    
    case "button-cancel-art-modification":
        closeUpdateMenu();
        break;
    }
});

// ----------------------------------------------------------------------------------
// SET UP
// ----------------------------------------------------------------------------------

load();
