import java.util.Scanner;

/**
 * @date 25/10/27
 * @author Álvaro Fernández Barrero
 */

public class SafeBox
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	
	// Settings
	
	private static final byte MAXIMUM_AMOUNT_OF_TRIES = 4;
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = ninputew Scanner(System.in);
		
		short password = 0;
		short passwordTried = 0;
		
		boolean playAgain = false;
		boolean hasWon = false;
		
		
		// Starting the game
		
		do
		{
			hasWon = false;
			
			// Generating the number
			
			password = (short)(1e3 + Math.random() * 9e3);
			
			// Tries
			
			for (int i = 0; i < MAXIMUM_AMOUNT_OF_TRIES; i++)
			{
				System.out.println("Give me the password.");
				passwordTried = input.nextShort();
				input.nextLine();
				
				// Checking if the given password is correct
				
				if (passwordTried == password)
				{
					System.out.println(ANSI_GREEN + "You have got the password! The safe bix is opened." + ANSI_RESET);
					hasWon = true;
					
					break;
				}
				
				System.out.println(ANSI_RED + "That is not the password..." + ANSI_RESET);
			}
			
			// Checking if the user has won the game
			
			if (hasWon)
			{
				System.out.println(ANSI_GREEN + "Congratulations!" + ANSI_RESET);
			}
			else
			{
				System.out.printf(ANSI_RED + "I am sorry, you cannot enter... The password was %d." + ANSI_RESET, password);
			}
			
			// Checking if the user wants to play again
			
			System.out.print("\nDo you want to play again? [Y/N]: ");
			playAgain = input.nextLine().equalsIgnoreCase("Y");
		
		} while(playAgain);
		
		
		input.close();
	}
}