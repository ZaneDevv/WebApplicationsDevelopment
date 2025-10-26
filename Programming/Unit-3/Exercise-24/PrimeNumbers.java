import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class PrimeNumbers
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";


	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		boolean isPrime = true;
		
		
		// Setting the number to check whether is prime
		
		System.out.print("Which number do you want to check? ");
		x = input.nextInt();
		
		
		// Checking if the number is prime
		
		for (int i = 2; i <= Math.sqrt(x); i++)
		{
			if (x % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		
		// Printing result
		
		System.out.printf("The number %d is " + (isPrime ? "" : ANSI_RED + "not " + ANSI_RESET) + "prime.", x);
		
		input.close();
	}
}