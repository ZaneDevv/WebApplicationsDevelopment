import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class SecondDegreeEquation
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
		double c = 0.0;
		
		double x1 = 0.0;
		double x2 = 0.0;
		
		
		// Setting the values of a and b
		
		System.out.print("Let\'s solve a simple second-degree equation ax² + bx + c = 0\n\n");

		try
		{
			System.out.print("Set the value for a: ");
			a = input.nextDouble();
			
			
			try
			{
				System.out.print("Set the value for b: ");
				b = input.nextDouble();
				
				
				try
				{
					System.out.print("Set the value for c: ");
					c = input.nextDouble();
				}
				catch (InputMismatchException exception)
				{
					canSolveEquation = false;
					System.out.print(ANSI_RED + "You have not set a correct value for c!" + ANSI_RESET);
				}
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
				
				double bb_4ac = b * b - 4 * a * c;
				
				if (bb_4ac < 0)
				{
					throw new Exception("This equation has no real solution!");
				}
				
				
				double doubleA = 2 * a;
				double root = Math.sqrt(bb_4ac);
				
				x1 = (-b + root) / doubleA;
				x2 = (-b - root) / doubleA;
				
				
				// Printing result
				
				System.out.printf("\nx1 = %.3f\nx2 = %.3f", x1, x2);
			}
			catch (Exception exception)
			{
				System.out.print(ANSI_RED + exception.getMessage() + ANSI_RESET);
			}
		}
		
		
		input.close();
	}
}
