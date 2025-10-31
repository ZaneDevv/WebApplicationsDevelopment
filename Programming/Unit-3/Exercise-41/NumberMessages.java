import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class NumberMessages
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";


	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte x = 0;
		
		
		try
		{
			// Setting variables
			
			System.out.print("Set a number: ");
			x = input.nextByte();
			
			
			// Printing result
			
			switch (x)
			{
				case 1 -> System.out.println("The chosen number is " + ANSI_GREEN + "one" + ANSI_RESET + ".");
				case 2 -> System.out.println("The chosen number is " + ANSI_GREEN + "two" + ANSI_RESET + ".");
				case 3 -> System.out.println("The chosen number is " + ANSI_GREEN + "three" + ANSI_RESET + ".");
				default -> throw new Exception("The number you have set is unknown.");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "You have not set a number!" + ANSI_RESET);
		}
		catch (Exception exception)
		{
			System.out.print(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		
		
		input.close();
	}
}
