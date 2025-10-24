import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		
		
		// Setting the value for x
		
		System.out.print("Set the value of x: ");
		x = input.nextDouble();
		
		
		// Checking if the number is even or odd
		
		if (x % 2 == 0)
		{
			System.out.printf("The number %.3f is even", x);
		}
		else
		{
			System.out.printf("The number %.3f is odd", x);
		}
	}
}