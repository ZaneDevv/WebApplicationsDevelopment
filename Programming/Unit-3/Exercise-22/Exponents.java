import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class Exponents
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double base = 0.0;
		int exponent = 0;
		
		double result = 1.0;
		
		
		// Setting the base and exponent
		
		System.out.print("Set the base: ");
		base = input.nextDouble();
		
		System.out.print("Set the exponent: ");
		exponent = input.nextInt();
		
		
		// Computing the result
		
		for (int i = 0; i < exponent; i++)
		{
			result *= base;
		}
		
		
		// Printing result
		
		System.out.printf("%.2f^%d = %.2f", base, exponent, result);
		
		
		input.close();
	}
}