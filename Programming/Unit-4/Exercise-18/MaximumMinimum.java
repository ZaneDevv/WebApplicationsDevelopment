import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class MaximumMinimum
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		int[] numbersBounds;
		
		
		// Setting values to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("Write here a number(%d/%d): ", i + 1, numbers.length);
			numbers[i] = input.nextDouble();
		}
		
		
		// Setting bounds
		
		numbersBounds = computeMaximumAndMinimum(numbers);
		
		
		// Printing result
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%.2f%s\n", numbers[i], (i == numbersBounds[0] ? " - Maximum" : i == numbersBounds[1] ? " - Minimum" : ""));
		}
		
		input.close();
	}
	
	
	
	/**
	 * @brief Computes the maximum and minimum number's index in a double array
	 * @param numbers Array of doubles
	 * @return The maximum and minimum value's index in a array. The first number is the maximum whereas the second one is the minimum
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/10
	 * @author Álvaro Fernández Barrero
	 */
	private static int[] computeMaximumAndMinimum(double[] numbers)
	{
		// Defining variables
		
		int[] bounds = new int[2];
		
		double maximumValue = Double.MIN_VALUE;
		int maximumValueIndex = 0;
		
		double minimumValue = Double.MAX_VALUE;
		int minimumValueIndex = 0;
		
		
		// Computing bounds
		
		for (int i = 0; i < numbers.length; i++)
		{
			double number = numbers[i];
			
			if (maximumValue < number)
			{
				maximumValue = number;
				maximumValueIndex = i;
			}
			
			if (minimumValue > number)
			{
				minimumValue = number;
				minimumValueIndex = i;
			}
		}
		
		
		// Returning bounds
		
		bounds[0] = maximumValueIndex;
		bounds[1] = minimumValueIndex;
		
		return bounds;
	}
}