/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class IntArray
{
	public static void main(String[] args)
	{
		// Defining variables
		
		int[] numbers = new int[12];
		
		
		// Setting values to the array
		
		numbers[0] = 39;
		numbers[1] = -2;
		numbers[4] = 0;
		numbers[6] = 14;
		numbers[8] = 5;
		numbers[9] = 120;
		
		
		// Printing array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%2d: %3d\n", i, numbers[i]);
		}
		
		
		// The values in the array we did not set yet, when the program tries to access to them, they show the data type's default value.
		// The array has integer numbers, which means that the default value is 0.
	}
}