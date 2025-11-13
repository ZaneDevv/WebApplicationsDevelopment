import java.util.Scanner;

/**
 * @version 2.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class Kingdom
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		int kingsAmount = 0;
		
		String[] kingsName;
		String[] kingsCardinality;


		// Asking for kings amount

		System.out.print("How many kings are in this kingdom? ");
		kingsAmount = input.nextInt();
		input.nextLine();


		// Asking for the names

		kingsName = new String[kingsAmount];
		kingsCardinality = new String[kingsAmount];

		for (int i = 0; i < kingsAmount; i++)
		{
			System.out.printf("\nSet the name of the king no. %d: ", i + 1);
			String name = input.nextLine();

			kingsName[i] = name;
			kingsCardinality[i] = name + " " + String.valueOf(computeTimesValueShowsUp(kingsName, name)) + "º";
		}


		// Printing result

		printArray(kingsCardinality);


		input.close();
	}



	/**
	 * @brief Checks how many times a given string shows up in a given string array
	 * @param array Array to check
	 * @param value Value to check in array
	 * @return Amount of times the given value is in the given array
	 * @since 2.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static int computeTimesValueShowsUp(String[] array, String value)
	{
		int amount = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == null)
			{
				break;
			}

			if (array[i].equalsIgnoreCase(value))
			{
				amount++;
			}
		}

		return amount;
	} 



	/**
	 * @brief Prints the given array
	 * @param array Array to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static void printArray(String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("%2d: %s\n", i, array[i]);
		}
	}
}