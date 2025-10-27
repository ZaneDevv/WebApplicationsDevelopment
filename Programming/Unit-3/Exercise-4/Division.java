import java.util.Scanner;

public class Division
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		
		// Setting the value of x and y
		
		System.out.print("x: ");
		x = input.nextDouble();
		
		System.out.print("y: ");
		y = input.nextDouble();
		
		
		// Dividing x / y if and only if y is not 0
		
		if (y != 0)
		{
			System.out.printf("The result of %.2f / %.2f = %.2f", x, y, x / y);
		}
		else
		{
			System.out.println(ANSI_RED + "Cannot divide a number by 0!" + ANSI_RESET);
		}
	}
}