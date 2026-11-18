// -----------------------------------------------------------------------
// CONSTANTS
// -----------------------------------------------------------------------

const API_URL = "http://www.omdbapi.com/";

// -----------------------------------------------------------------------
// VARIABLES
// -----------------------------------------------------------------------

const parent = document.getElementById("movies");
const loadMoreButton = document.getElementById("load-more");

let page = 1;

// -----------------------------------------------------------------------
// METHODS
// -----------------------------------------------------------------------

function loadMovie(movieData)
{
    const card = document.createElement("div");

    const image = document.createElement("img");
    image.src = movieData.Poster;
    image.alt = "Movie";

    const titleText = document.createElement("p");
    titleText.textContent = movieData.Title;

    const yearText = document.createElement("p");
    yearText.textContent = movieData.Year;

    const typeText = document.createElement("p");
    typeText.textContent = movieData.Type;

    card.appendChild(image);
    card.appendChild(titleText);
    card.appendChild(yearText);
    card.appendChild(typeText);

    parent.appendChild(card);
}

function loadAllMovies(movies)
{
    for (const movieData of movies)
        loadMovie(movieData);
}

function loadCurrentPage()
{
    fetch(`${API_URL}&s=bang&page=${page++}`)
        .then(data => data.json())
        .then(data => loadAllMovies(data.Search))
        .catch(_ => console.error("Failed to load"));
}

// -----------------------------------------------------------------------
// DRAWING
// -----------------------------------------------------------------------

loadCurrentPage();
loadMoreButton.addEventListener("click", loadCurrentPage);