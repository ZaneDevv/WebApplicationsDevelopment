import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class FirstDegreeEquation
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		boolean canSolveEquation = true;
		
		double a = 0.0;
		double b = 0.0;
		double x = 0.0;
		
		
		// Setting the values of a and b
		
		System.out.print("Let\'s solve a simple first-degree equation ax+b = 0\n\n");

		try
		{
			System.out.print("Set the value for a: ");
			a = input.nextDouble();
			
			
			try
			{
				System.out.print("Set the value for b: ");
				b = input.nextDouble();
			}
			catch (InputMismatchException exception)
			{
				canSolveEquation = false;
				System.out.print(ANSI_RED + "You have not set a correct value for b!" + ANSI_RESET);
			}
		}
		catch (InputMismatchException exception)
		{
			canSolveEquation = false;
			System.out.print(ANSI_RED + "You have not set a correct value for a!" + ANSI_RESET);
		}
		
		
		// Solving equation
		
		if (canSolveEquation)
		{
			try
			{
				if (a == 0)
				{
					throw new Exception("Cannot divide by 0!");
				}
				
				x = -b / a;
				
				
				// Printing result
				
				System.out.printf("x=%.3f\n", x);
			}
			catch (Exception exception)
			{
				System.out.print(ANSI_RED + exception.getMessage() + ANSI_RESET);
			}
		}
		
		
		input.close();
	}
}
