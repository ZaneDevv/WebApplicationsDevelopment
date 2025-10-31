import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class LeastCommonMultiple
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		int maximum = 0;
		int lcm = 0;
		
		
		// Setting x and y
		
		try
		{
			System.out.print("Set the first number: ");
			x = input.nextInt();
			
			if (x < 0)
			{
				throw new Exception("This number cannot be negative!");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
			return;
		}
		
		try
		{
			System.out.print("Set the second number: ");
			y = input.nextInt();
			
			if (y < 0)
			{
				throw new Exception("This number cannot be negative!");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
			return;
		}
		
		
		// Computing the least common multiple
		
		if (x == 0 || y == 0)
		{
			lcm = 0;
		}
		else
		{
			maximum = Math.max(x, y);
			lcm = maximum;
			
			while (lcm % x > 0 || lcm % y > 0)
			{
				lcm += maximum;
			}
		}
		
		
		// Printing result
		
		System.out.printf("lcm(%d, %d) = " + ANSI_CYAN + "%d" + ANSI_RESET + "\n", x, y, lcm);
		
		
		input.close();
	}
}