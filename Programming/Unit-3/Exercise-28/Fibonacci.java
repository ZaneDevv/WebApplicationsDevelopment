import java.util.Scanner;

/**
 * @date 25/10/27
 * @author Álvaro Fernández Barrero
 */

public class Fibonacci
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		int fibonacci0 = 0;
		int fibonacci1 = 1;
		
		
		// Setting the number of fibonacci's number to display
		
		System.out.print("How many numbers from the Fibonacci\'s number do you want to display? ");
		n = input.nextInt();
		
		
		// Displaying the Fibonacci's number
		
		if (n >= 1)
		{
			System.out.printf("%d\t", fibonacci0);
		}
		
		if (n >= 2)
		{
			System.out.printf("%d\t", fibonacci1);
		}
		
		if (n >= 3)
		{
			for (int i = 2; i < n; i++)
			{
				int nextFibonacciNumber = fibonacci0 + fibonacci1;
				
				fibonacci0 = fibonacci1;
				fibonacci1 = nextFibonacciNumber;
				
				System.out.printf("%d\t", nextFibonacciNumber);
			}
		}
		
		
		input.close();
	}
}