import java.util.Scanner;

public class NumberSign
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		
		
		// Setting the value of x
		
		System.out.print("Set the value of x: ");
		x = input.nextDouble();
		
		
		// Checking sign
		
		if (x == 0)
		{
			System.out.println("This number has no sign!");
		}
		else if (x > 0)
		{
			System.out.println("This number is positive.");
		}
		else
		{
			System.out.println("This number is negative.");
		}
	}
}