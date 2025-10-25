import java.util.Scanner;

public class NumberGuesser
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	// Settings

	private static final byte MINIMUM_LIMIT = 1;
	private static final byte MAXIMUM_LIMIT = 100;
	
	private static final byte MAXIMUM_TRIES = 10;
	
	

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		boolean playAgain = true;
		boolean hasWon = false;
		
		byte targetNumber = 0;
		byte guessedNumber = 0;
		
		byte tries = 0;
		
		
		// Starting game
		
		do
		{
			targetNumber = (byte)(MINIMUM_LIMIT + Math.random() * (MAXIMUM_LIMIT + 1 - MINIMUM_LIMIT));
			hasWon = false;
			
			
			while (tries <= MAXIMUM_TRIES)
			{
				tries++;
			
				System.out.printf("What is your" + (tries == 1 ? "" : " next") + " guess? [%d, %d]\n", MINIMUM_LIMIT, MAXIMUM_LIMIT);
				guessedNumber = input.nextByte();
				
				if (guessedNumber < targetNumber)
				{
					System.out.printf("The number is " + ANSI_YELLOW + "bigger" + ANSI_RESET  + " that %d!\n", guessedNumber);
				}
				else if (guessedNumber > targetNumber)
				{
					System.out.printf("The number is " + ANSI_YELLOW + "smaller" + ANSI_RESET + " than %d!\n", guessedNumber);
				}
				else
				{
					hasWon = true;
					break;
				}
			}
			
			if (hasWon)
			{
				System.out.printf(ANSI_GREEN + "You nailed it! The number was %d!" + ANSI_RESET + "\nYou guessed it with %d tries.\n", targetNumber, tries);
			}
			else
			{
				System.out.printf(ANSI_RED + "I\'m sorry, the number was %d..." + ANSI_RESET + "\nYou tried %d times, at least you are persevering...\n", targetNumber, tries);
			}
			
			input.nextLine();
		
			System.out.print("Do you want to play again? [Y/N]: ");
			playAgain = input.nextLine().equalsIgnoreCase("Y");
		
		} while (playAgain);
		
		
		input.close();
	}
}