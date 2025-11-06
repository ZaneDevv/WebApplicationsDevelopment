import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */

public class Dices
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte dice1 = 0;
		byte dice2 = 0;
		
		boolean throwAgain = false;
		
		
		// Throwing dices
		
		do
		{
			// Computing dices' value
			
			dice1 = (byte)(Math.random() * 6 + 1);
			dice2 = (byte)(Math.random() * 6 + 1);
			
			
			// Printing result
			
			System.out.printf("dice 1: %d\tdice 2: %d\n", dice1, dice2);
			
			
			// Stopping the program if both dices had the same value
			
			if (dice1 == dice2)
			{
				System.out.print(ANSI_GREEN + "The dices have the same value!" + ANSI_RESET);
				break;
			}
			
			
			// Checking if the user wants to throw the dices again
			
			System.out.print("Press enter to throw dices again, write c to stop: ");
			throwAgain = !(input.nextLine().equalsIgnoreCase("C"));
		}
		while (throwAgain);
		
		
		input.close();
	}
}