import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class SquareAndCubic
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int startingPoint = 0;
		
		
		// Setting where to start
		
		System.out.print("Set the number to start from: ");
		startingPoint = input.nextInt();
		
		
		// Displaying the powers
		
		for (int i = startingPoint; i <= startingPoint + 5; i++)
		{
			System.out.printf("%7d \t %7d \t %7d\n", i, i*i, i*i*i);
		}
		
		
		input.close();
	}
}