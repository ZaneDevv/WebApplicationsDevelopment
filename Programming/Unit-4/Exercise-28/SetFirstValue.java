import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class SetFirstValue
{
	// Defining colors

	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";



	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		int[] rotatedNumbers = new int[10];

		int searchedNumber = 0;
		int indexNumberInArray = 0;


		// Setting numbers to the array

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 101);
		}


		// Printing array

		printArray(numbers);


		// Asking user for a numbers

		do
		{
			System.out.print("Set here a number: ");
			searchedNumber = input.nextInt();

			indexNumberInArray = obtainIndexByValue(numbers, searchedNumber);


			// If numbers was not found in the array. If it is not, ask for another

			if (indexNumberInArray == -1)
			{
				System.out.print(ANSI_RED + "Number not found!\n" + ANSI_RESET);
				continue;
			}


			// Rotating array so the given number has the index 0

			for (int i = 0; i < numbers.length; i++)
			{
				rotatedNumbers[i] = numbers[(i + indexNumberInArray) % numbers.length];
			}
		}
		while (indexNumberInArray == -1);


		// Printing rotated array

		printArray(rotatedNumbers);


		input.close();
	}



	/**
	 * @brief Computes the value's index position in the given array
	 * @param array Array where it will look for the number
	 * @param value Number to look for in the given array
	 * @return The value's index position, if it is not found, return 0
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static int obtainIndexByValue(int[] array, int value)
	{
		int index = -1;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == value)
			{
				index = i;
				break;
			}
		}

		return index;
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