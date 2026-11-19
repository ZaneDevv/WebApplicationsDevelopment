class Card
{
    // -----------------------------------------
    // ATTRIBUTES
    // -----------------------------------------

    #face = "";
    #number = 0;

    // -----------------------------------------
    // CONSTRUCTORS
    // -----------------------------------------

    constructor(face, number)
    {
        this.#face = face;
        this.#number = number;
    }

    // -----------------------------------------
    // METHODS
    // -----------------------------------------

    static getFaceName(index)
    {
        return index == 0 ? "Picas"
            : index == 1 ? "Corazones"
            : index == 3 ? "Rombos"
            : "Trebol";
    }

    toString()
    {
        return `${this.#number} ${Card.getFaceName(this.#face)}`
    }

    // -----------------------------------------
    // GETTERS & SETTERS
    // -----------------------------------------

    get face()
    {
        return this.#face;
    }

    get number()
    {
        return this.#number;
    }
}