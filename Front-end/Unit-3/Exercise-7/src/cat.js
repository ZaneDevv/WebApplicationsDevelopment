const randomAmount = () => 1 + Math.floor(Math.random() * 5);

class Cat
{
    // ------------------------------------------------
    // ATTRIBUTES
    // ------------------------------------------------

    #name = "";

    #tiredness = 0;
    #hunger = 0;
    #loneliness = 0;
    #happiness = 0;

    // ------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------

    constructor(name)
    {
        this.#name = name;
    }

    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    sleep()
    {
        this.#tiredness -= randomAmount();
        this.#tiredness = Math.max(0, this.#tiredness);
    }

    feed()
    {
        this.#hunger -= randomAmount();
        this.#hunger = Math.max(0, this.#hunger);
    }

    pet()
    {
        if (Math.random() > 0.5)
        {
            this.#happiness += randomAmount();
            this.#loneliness -= randomAmount();
            this.#loneliness = Math.max(0, this.#loneliness);
        }
        else
        {
            console.log(`${this.#name} doesn't want to be petted`);
        }
    }

    printOut()
    {
        console.log(`${this.#name}'s stats:\n- Tireness: ${this.#tiredness}\n- Hunger: ${this.#loneliness}\n- Lonliness: ${this.#loneliness}\n- Happinnes: ${this.#happiness}`);
    }
}

const cat = new Cat("Anubis");
cat.pet();
cat.printOut();