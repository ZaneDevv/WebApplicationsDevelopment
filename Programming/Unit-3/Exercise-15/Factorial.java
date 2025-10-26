import java.util.Scanner;

/**
 * @date 25/10/25
 * @author Álvaro Fernández Barrero
 */

public class Factorial
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte n = 0;
		long factorial = 1L;
		
		
		// Setting the number to calculate the factorial
		
		System.out.print("n = ");
		n = input.nextByte();
		
		
		// Computing factorial
		
		if (n > 1)
		{
			for (byte i = 2; i <= n; i++)
			{
				factorial *= i;
			}
		}
		
		
		// Printing result
		
		System.out.printf("%d! = %d", n, factorial);
		
		input.close();
	}
}