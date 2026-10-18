class BookList
{
    // ------------------------------------------------
    // ATTRIBUTES
    // ------------------------------------------------

    #readBooks = 0;
    #unreadBooks = 0;

    #currentBookIndex = 0;
    #currentBook = undefined;
    #nextBook = undefined;
    #previousBook = undefined;

    #books = [];

    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    add(book)
    {
        this.#books.push(book);

        if (this.#currentBook === undefined)
            this.#currentBook = book;
        else if (this.#nextBook === undefined)
            this.#nextBook = book;

        this.#unreadBooks++;
    }

    finishCurrentBook()
    {
        this.#currentBookIndex++;
        this.#previousBook = this.#currentBook;
        this.#currentBook = this.#nextBook;

        if (this.#books.length > this.#currentBookIndex)
            this.#nextBook = this.#books[this.#currentBookIndex + 1];

        this.#readBooks++;
        this.#unreadBooks--;
    }
}