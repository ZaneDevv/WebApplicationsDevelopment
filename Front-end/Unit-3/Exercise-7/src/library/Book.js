class Book
{
    // ------------------------------------------------
    // ATTRIBUTES
    // ------------------------------------------------

    #title = "";
    #genre = "";
    #author = "";

    #read = false;
    #readDate = undefined;

    // ------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------

    constructor(title, genre, author)
    {
        this.#title = title;
        this.#genre = genre;
        this.#author = author;
    }
}