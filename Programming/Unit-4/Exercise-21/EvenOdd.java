import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class EvenOdd
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[8];
		
		
		// Setting numbers to array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("Set a number (%d/%d): ", i + 1, numbers.length);
			numbers[i] = input.nextInt();
		}
		
		
		// Printing array
		
		for (int number : numbers)
		{
			System.out.printf("%d - %s\n", number, (number & 1) == 1 ? "odd" : "even");
		}
		
		
		input.close();
	}
}