import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		
		// Setting values for x and y
		
		System.out.print("Set a number for x: ");
		x = input.nextDouble();
		
		System.out.print("Set a number for y: ");
		y = input.nextDouble();
		
		
		// Computing basing arithmetic operations
		
		System.out.printf("%.3f + %.3f = %.3f\n", x, y, x + y);
		System.out.printf("%.3f - %.3f = %.3f\n", x, y, x - y);
		System.out.printf("%.3f * %.3f = %.3f\n", x, y, x * y);
		System.out.printf("%.3f / %.3f = %.3f\n", x, y, x / y);
	}
}