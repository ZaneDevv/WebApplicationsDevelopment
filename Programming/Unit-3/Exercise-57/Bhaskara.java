import java.util.Scanner;

/**
 * @version 1.3
 * @date 25/11/04
 * @author Álvaro Fernández Barrero
 */

public class Bhaskara
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		
		// Setting variables
		
		System.out.println("Let\'s solve a quadratic equation.\n");
		
		do
		{
			System.out.print("Give me the variable a (!= 0): ");
			a = input.nextDouble();
			
		} while(a == 0);
		
		System.out.print("Give me the variable b: ");
		b = input.nextDouble();
		
		System.out.print("Give me the variable c: ");
		c = input.nextDouble();
		
		
		// Computing the value
		
		try
		{
			double[] results = bhaskaraFormula(a, b, c);
			System.out.printf("Result 1: %.3f\nResult 2: %.3f.", results[0], results[1]);
		}
		catch (Exception exception)
		{
			System.out.print(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Computes the two numbers to solve the given quadratic equation
	 * @param a First number, associated with x^2
	 * @param b Second number, associated with x
	 * @param c Third number, independent term
	 * @return The possible real results
	 * @throws There are no real solutions
	 * @since 1.1
	 * @version 1.1
	 * @date 25/11/04
	 * @author Álvaro Fernández Barrero
	 */
	private static double[] bhaskaraFormula(double a, double b, double c) throws Exception
	{
		double bb = b * b;
		double ac4 = 4 * a * c;
		
		
		if (bb < ac4)
		{
			throw new Exception("This equation has no real solution!\n");
		}
		
		
		double[] results = new double[2];

		double doubleA = 2 * a;
		double root = Math.sqrt(bb - ac4);

		results[0] = (-b + root) / doubleA;
		results[1] = (-b - root) / doubleA;
		
		return results;
	}
}
