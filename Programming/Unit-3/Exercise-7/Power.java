import java.util.Scanner;

public class Power
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double base = 0;
		double exponent = 0;
		double result = 0;
		
		
		// Setting the value for the base and exponent
		
		System.out.print("Base: ");
		base = input.nextDouble();
		
		System.out.print("Exponent: ");
		exponent = input.nextDouble();
		
		
		// Computing the operation
		
		if (exponent == 0)
		{
			result = 1;
		}
		else if(exponent > 0)
		{
			result = Math.pow(base, exponent);
		}
		else
		{
			result = 1 / Math.pow(base, -exponent);
		}
		
		System.out.printf("%.2f^%.2f = %.2f", base, exponent, result);
	}
}