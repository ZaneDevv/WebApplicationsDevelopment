/**
 * @version 1.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class OrderByGreaterAndLowerThan100
{
	public static void main(String[] args)
	{
		// Defining variables
		
		int[] numbers = new int[10];
		
		int[] greaterThan100 = new int[10];
		int amountGreaterThan100 = 0;
		
		int[] lowerThan100 = new int[10];
		int amountLowerThan100 = 0;
		
		
		// Setting numbers to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			int number = (int)(Math.random() * 201);
			numbers[i] = number;
			
			if (number >= 100)
			{
				greaterThan100[amountGreaterThan100++] = number;
			}
			else
			{
				lowerThan100[amountLowerThan100++] = number;
			}
		}
		
		
		// Printing array
		
		printArray(numbers);
		
		
		// Mix numbers altogether
		
		for (int i = 0; i < Math.min(amountGreaterThan100, amountLowerThan100); i++)
		{
			numbers[i * 2] = lowerThan100[i];
			numbers[1 + i * 2] = greaterThan100[i];
		}
		
		
		// Printing modified array
		
		System.out.print("\n\n");
		printArray(numbers);
	}
	
	
	
	/**
	 * @brief Prints the given array
	 * @param array Array to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("%2d: %d\n", i, array[i]);
		}
	}
}