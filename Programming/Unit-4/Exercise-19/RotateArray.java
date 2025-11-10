import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class RotateArray
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[15];
		double[] rotatedArray = new double[15];
		
		
		// Setting values to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("Write here a number (%d/%d): ", i + 1, numbers.length);
			numbers[i] = input.nextDouble();
		}
		
		
		// Rotate array
		
		for (int i = 0; i < numbers.length; i++)
		{
			rotatedArray[i] = numbers[(i == 0) ? (numbers.length - 1) : (i - 1)];
		}
		
		
		// Printing result
		
		System.out.print(" [");
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%.1f", rotatedArray[i]);
			
			if (i != numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		input.close();
	}
}