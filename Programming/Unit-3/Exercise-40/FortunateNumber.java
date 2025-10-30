import java.util.Scanner;

/**
 * @date 25/10/30
 * @author Álvaro Fernández Barrero
 */
 
public class FortunateNumber
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int y = 0;
		int x = 0;
		byte digits = 0;
		
		byte fortunateAmount = 0;
		byte unfortunateAmount = 0;
		
		boolean isLucky = false;
		
		
		// Setting the number to check whether it is lucky or not
		
		System.out.print("Set a number: ");
		y  = x = input.nextInt();
		
		
		// Computing digits amount
		
		if (y >= 10)
		{
			while (y >= 10)
			{
				digits++;
				y /= 10;
			}
			digits++;
		}
		else
		{
			digits = 1;
		}
		
		
		// Computing the amount of lucky and unlucky numbers
		
		for (byte i = 0; i < digits; i++)
		{
			byte digit = (byte)(x / (int)Math.pow(10, i) % 10);
			
			if (digit == 3 || digit == 7 || digit == 8 || digit == 9)
			{
				fortunateAmount++;
			}
			else
			{
				unfortunateAmount++;
			}
		}
		
		
		// Checking if the given number is lucky
		
		isLucky = fortunateAmount > unfortunateAmount;
		
		
		// Printing results
		
		System.out.printf("The number %d is %s%s" + ANSI_RESET + ".", x, isLucky ? ANSI_GREEN : ANSI_RED, isLucky ? "fortunate" : "unfortunate");
		
		
		input.close();
	}
}