// -----------------------------------------------------------------------
// JSON
// -----------------------------------------------------------------------

const movies = {
  "Search": [
    {
      "Title": "Star Wars: Episode IV - A New Hope",
      "Year": "1977",
      "imdbID": "tt0076759",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BOGUwMDk0Y2MtNjBlNi00NmRiLTk2MWYtMGMyMDlhYmI4ZDBjXkEyXkFqcGc@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode V - The Empire Strikes Back",
      "Year": "1980",
      "imdbID": "tt0080684",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BMTkxNGFlNDktZmJkNC00MDdhLTg0MTEtZjZiYWI3MGE5NWIwXkEyXkFqcGc@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode VI - Return of the Jedi",
      "Year": "1983",
      "imdbID": "tt0086190",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BNWEwOTI0MmUtMGNmNy00ODViLTlkZDQtZTg1YmQ3MDgyNTUzXkEyXkFqcGc@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode VII - The Force Awakens",
      "Year": "2015",
      "imdbID": "tt2488496",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BOTAzODEzNDAzMl5BMl5BanBnXkFtZTgwMDU1MTgzNzE@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode I - The Phantom Menace",
      "Year": "1999",
      "imdbID": "tt0120915",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BODVhNGIxOGItYWNlMi00YTA0LWI3NTctZmQxZGUwZDEyZWI4XkEyXkFqcGc@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode III - Revenge of the Sith",
      "Year": "2005",
      "imdbID": "tt0121766",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BNTc4MTc3NTQ5OF5BMl5BanBnXkFtZTcwOTg0NjI4NA@@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode II - Attack of the Clones",
      "Year": "2002",
      "imdbID": "tt0121765",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BNTgxMjY2YzUtZmVmNC00YjAwLWJlODMtNDBhNzllNzIzMjgxXkEyXkFqcGc@._V1_SX300.jpg"
    },
    {
      "Title": "Rogue One: A Star Wars Story",
      "Year": "2016",
      "imdbID": "tt3748528",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BMjEwMzMxODIzOV5BMl5BanBnXkFtZTgwNzg3OTAzMDI@._V1_SX300.jpg"
    },
    {
      "Title": "Star Wars: Episode VIII - The Last Jedi",
      "Year": "2017",
      "imdbID": "tt2527336",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BMjQ1MzcxNjg4N15BMl5BanBnXkFtZTgwNzgwMjY4MzI@._V1_SX300.jpg"
    },
    {
      "Title": "Star Trek",
      "Year": "2009",
      "imdbID": "tt0796366",
      "Type": "movie",
      "Poster": "https://m.media-amazon.com/images/M/MV5BMjE5NDQ5OTE4Ml5BMl5BanBnXkFtZTcwOTE3NDIzMw@@._V1_SX300.jpg"
    }
  ],
  "totalResults": "4947",
  "Response": "True"
}

const moviesSecondSearch = {"Search":[{"Title":"Star Wars: Episode IX - The Rise of Skywalker","Year":"2019","imdbID":"tt2527338","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BODg5ZTNmMTUtYThlNy00NjljLWE0MGUtYmQ1NDg4NWU5MjQ1XkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Trek Into Darkness","Year":"2013","imdbID":"tt1408101","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BMTk2NzczOTgxNF5BMl5BanBnXkFtZTcwODQ5ODczOQ@@._V1_SX300.jpg"},{"Title":"A Star Is Born","Year":"2018","imdbID":"tt1517451","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BNGUxZTc0NTAtNzQwMy00MmM2LTgzMGYtZWIyY2E1MGFjYmM5XkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Solo: A Star Wars Story","Year":"2018","imdbID":"tt3778644","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BOTM2NTI3NTc3Nl5BMl5BanBnXkFtZTgwNzM1OTQyNTM@._V1_SX300.jpg"},{"Title":"Star Trek Beyond","Year":"2016","imdbID":"tt2660888","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BN2FhNDI1YTYtNWI0OC00ZjYxLWJlYWEtN2ZiZjRmZDY1MWJjXkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Trek: The Next Generation","Year":"1987–1994","imdbID":"tt0092455","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BMmNiNTQ2YzYtODBjYy00ZWMwLTlmNWMtYWE1NTQ2ZTYyZmMwXkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Trek: Discovery","Year":"2017–2024","imdbID":"tt5171438","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BOTZkZTc1ZmYtYTA3Mi00MzZhLWFmZTItZTM2NThjYWJlZGU4XkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Wars: The Clone Wars","Year":"2008–2020","imdbID":"tt0458290","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BOTdiODQ1MDYtZjM5My00MmQ5LTk1ZWUtZWIwYjBhZGMxZDAyXkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Trek: First Contact","Year":"1996","imdbID":"tt0117731","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BZjc0OWE1NDMtNjRmMi00ZDc2LWI2ZmQtNzEwNWU4Nzg4NDA5XkEyXkFqcGc@._V1_SX300.jpg"},{"Title":"Star Trek II: The Wrath of Khan","Year":"1982","imdbID":"tt0084726","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BOTFkZDY5NWQtMjY4Yy00OThiLTk3YjQtMDdhYTllMTI4MTdiXkEyXkFqcGc@._V1_SX300.jpg"}],"totalResults":"4947","Response":"True"};

// -----------------------------------------------------------------------
// VARIABLES
// -----------------------------------------------------------------------

const parent = document.getElementById("movies");
const loadMoreButton = document.getElementById("load-more");

let isFullyLoaded = false;

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

// -----------------------------------------------------------------------
// DRAWING
// -----------------------------------------------------------------------

loadAllMovies(movies.Search);

loadMoreButton.addEventListener("click", () => {
    if (isFullyLoaded)
        return;

    isFullyLoaded = true;
    loadAllMovies(moviesSecondSearch.Search);

    loadMoreButton.style.display = "none";
})