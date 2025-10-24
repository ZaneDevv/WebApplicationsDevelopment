import java.util.Scanner;

public class WhichIsBigger
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		
		// Setting the value for x and y
		
		System.out.print("First number: ");
		x = input.nextDouble();
		
		System.out.print("Second number: ");
		y = input.nextDouble();
		
		
		// Checking  is the biggest
		
		if (x > y)
		{
			System.out.printf("%.2f is bigger than %.2f", x, y);
		}
		else
		{
			System.out.printf("%.2f is lower than %.2f", x, y);
		}
	}
}