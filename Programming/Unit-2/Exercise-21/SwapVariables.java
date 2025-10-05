import java.util.Scanner;

public class SwapVariables
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		
		// Setting a and b value
		
		System.out.print("Give me a value for a: ");
		a = input.nextDouble();
		
		System.out.print("Give me a value for b: ");
		b = input.nextDouble();
		
		
		// Swap variables
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("\na = %.2f\nb = %.2f", a, b);
	}
}