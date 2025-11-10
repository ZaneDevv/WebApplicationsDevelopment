import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class InvertNumbersOrder
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		
		// Setting numbers to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("Write here a number (%d/%d): ", i + 1, numbers.length);
			numbers[i] = input.nextDouble();
		}
		
		
		// Printing the numbers from last to first
		
		for (int i = numbers.length - 1; i >= 0; i--)
		{
			System.out.printf("%2d: %.2f\n", i, numbers[i]);
		}
		
		
		input.close();
	}
}