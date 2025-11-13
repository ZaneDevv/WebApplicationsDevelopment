import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class SetToArray
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[12];
		
		int index = 0;
		int value = 0;
		
		
		// Setting numbers to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 201);
		}
		
		
		// Printing array
		
		printArray(numbers);
		
		
		// Setting new value
		
		System.out.print("Where do you want to place the number? ");
		index = input.nextInt();
		
		System.out.print("Which number do you want to place? ");
		value = input.nextInt();
		
		
		// Placing value to the set index
		
		for (int i = numbers.length - 1; i > index; i--)
		{
			numbers[i] = numbers[i - 1];
		}
		numbers[index] = value;
		
		
		// Printing array with the new value set
		
		printArray(numbers);
		
		
		
		input.close();
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