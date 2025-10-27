import java.util.Scanner;

/**
 * @date 25/10/27
 * @author Álvaro Fernández Barrero
 */

public class DigitsAmount
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		long originalNumber = 0L;
		long number = 0L;
		
		byte digitsAmount = 0;
		
		
		// Setting the number
		
		System.out.print("Give me a number: ");
		number = originalNumber = input.nextLong();
		
		
		// Checking the given number's digits amount
		
		if (number < 10)
		{
			digitsAmount = 1;
		}
		else
		{
			while (number > 10)
			{
				digitsAmount++;
				number /= 10;
			}
			digitsAmount++;
		}
		
		
		// Printing result
		
		System.out.printf("The number you said has %d digits.", digitsAmount);
		
		
		input.close();
	}
}