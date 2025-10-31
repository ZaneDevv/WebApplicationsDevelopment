import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class FirstDigit
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int x = -1;
		int y = 0;
		
		byte digit1 = 0;
		byte lastDigit = 0;
		byte digits = 0;
		
		
		try
		{
			// Defining the value of x
			
			System.out.print("Set a number: ");
			y = x = input.nextInt();
			
			
			// Limiting the number
			
			if (x > 99999 || x < 1e+4)
			{
				throw new Exception("5-digit positive numbers accepted only!");
			}
		}
		catch (InputMismatchException exception)
		{
			x = -1;
			System.out.println(ANSI_RED + "You have not set a number!" + ANSI_RESET);
		}
		catch (Exception exception)
		{
			x = -1;
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		
		
		
		if (x != -1)
		{
			// Computing digits amount
			
			while (y >= 10)
			{
				y /= 10;
				digits++;
			}
			digits++;
			
			
			// Computing the first and last digit
			
			digit1 = (byte)(x / Math.pow(10, digits - 1));
			lastDigit = (byte)(x % 10);
			
			
			// Printing result
			
			System.out.printf("The first digit of the given number is " + ANSI_PURPLE + "%d" + ANSI_RESET + " and the last one is " + ANSI_PURPLE + "%d" + ANSI_RESET + ".", digit1, lastDigit);
		}
		
		
		input.close();
	}
}
