class Game
{
    // ------------------------------------------------
    // ATTRIBUTES
    // ------------------------------------------------

    #players = [];
    #deck = [];

    #releavedCardsUponTable = [];
    #cardsUponTable = [];

    // ------------------------------------------------
    // METHODS
    // ------------------------------------------------

    joinPlayer(player)
    {
        this.#players.push(player);
    }

    #shuffleDeck()
    {
        let currentIndex = this.#deck.length;

        while (currentIndex != 0)
        {
            let randomIndex = Math.floor(Math.random() * currentIndex);
            currentIndex--;

            [this.#deck[currentIndex], this.#deck[randomIndex]] = [this.#deck[randomIndex], this.#deck[currentIndex]];
        }
    }
    
    #setUpDeck()
    {
        for (let i = 1; i <= 13; i++)
        {
            for (let j = 0; j < 4; j++)
            {
                let card = new Card(Card.getFaceName(j), i);
                this.#deck.push(card);
            }
        }
    }

    #giveCardsToPlayers()
    {
        for (let i = 0; i < this.#players.length; i++)
        {
            let player = this.#players[i];

            for (let j = 0; j < 2; j++)
                player.getCard(this.#deck.unshift());
        }
    }

    #sendCardToTable()
    {
        for (let i = 0; i < 4; i++)
            this.#cardsUponTable.push(this.#deck.shift());
    }

    #doesAnyoneHasRoyalFlush()
    {

    }

    #doesAnyoneHasStraightFlush()
    {

    }

    #doesAnyoneHasFourOfAKind()
    {

    }

    #doesAnyoneHasFullHouse()
    {

    }

    #doesAnyoneHasFlush()
    {

    }

    #doesAnyoneHasStraight()
    {

    }

    #doesAnyoneHasThreeOfAKind()
    {

    }

    #doesAnyoneHasTwoPair()
    {

    }

    #doesAnyoneHasOnePair()
    {

    }

    #doesAnyoneHasHighCard()
    {

    }

    #setWinners()
    {
        console.log(" =============== WINNER =============== ");

        
    }

    #setIndividualMatch()
    {
        let card = this.#cardsUponTable.shift();
        this.#releavedCardsUponTable.push(card);
        
        console.log(card);
    }

    #initializeMatch()
    {
        for (let i = 0; i < this.#cardsUponTable.length; i++)
            this.#setIndividualMatch(); 
        
        this.#setWinners();
    }

    initialize()
    {
        if (this.#players.length < 2)
        {
            console.log("You need more players to start the game!");
            return;
        }

        this.#setUpDeck();
        this.#shuffleDeck();

        this.#giveCardsToPlayers();
        this.#sendCardToTable();

        this.#initializeMatch();
    }
}