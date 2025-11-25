/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández Barrero
 */

public class Card
{
	// Attributes

	private int number = 1;
	private char suit = 'H';



	// Constructors

	/**
	 * @brief Create a new card, 1 of hearts
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public Card() {}


	/**
	 * @brief Creates a new card with the given number and suit
	 * @param number Card's number
	 * @param suit Card's suit
	 * @throws Exception Invalid card
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public Card(int number, char suit) throws Exception
	{
		this.setNumber(number);
		this.setSuit(suit);
	}


	/**
	 * @brief Copies the given heart
	 * @param card Card to copy
	 * @throws Exception Invalid card
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public Card(Card card) throws Exception
	{
		this.setNumber(card.getNumber());
		this.setSuit(card.getSuit());
	}



	// Methods

	/**
	 * @brief Shows the card's data
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public void show()
	{
		String number = switch(this.number)
		{
			case  1: yield "As";
			case 11: yield "Jack";
			case 12: yield "Queen";
			case 13: yield "King";
			default: yield String.valueOf(this.number);
		};

		String suit = switch(this.suit)
		{
			case 'H': yield "Hearts";
			case 'D': yield "Diamonds";
			case 'C': yield "Clubs";
			case 'S': yield "Spades";
			default: yield "null";
		};

		System.out.printf("Card: %s of %s\n", number, suit);
	}


	/**
	 * @brief Compares the current card with the given one and chooses a winner according to the number and suit
	 * @param other The care to compare with
	 * @return The winner card
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public Card compare(Card other)
	{
		if (this.getNumber() != other.getNumber())
		{
			return this.getNumber() < other.getNumber() ? other : this;
		}

		return this.getSuit() < other.getSuit() ? other : this;
	}



	// Getters and setters

	/**
	 * @brief Obtains card's number
	 * @return Card's number
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public int getNumber()
	{
		return this.number;
	}


	/**
	 * @brief Sets the card's number
	 * @param number Number to set to the card
	 * @throws Exception Invalid number for the card
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public void setNumber(int number) throws Exception
	{
		if (number < 1 && number > 13)
		{
			throw new Exception("Invalid number! It must be between 1 and 13");
		}

		this.number = number;
	}


	/**
	 * @brief Obtains card's suit
	 * @return Card's suit
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public char getSuit()
	{
		return this.suit;
	}


	/**
	 * @brief Sets the card's suit
	 * @param suit Suit to set to the card
	 * @throws Exception Invalid suit for the card
	 * @version 1.0
	 * @date 2025/11/24
 	 * @author Álvaro Fernández Barrero
 	 */
	public void setSuit(char suit) throws Exception
	{
		if (suit >= 'a')
		{
			suit -= ('a' - 'A');
		}

		if (suit != 'H' && suit != 'D' && suit != 'C' && suit != 'S')
		{
			throw new Exception("Invalid suit!");
		}

		this.suit = suit;
	}
}