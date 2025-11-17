/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */
 
public class ArrayLibrary
{
	/**
	 * @brief Creates a new numerical array full of random numbers between the two given bounds
	 * @param n Array's size
	 * @param min Minimum value to set to the array
	 * @param max Maximum value to set to the array
	 * @return The created array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int[] createArray(int n, int min, int max)
	{
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			array[i] = (int)(min + Math.random() * (max - 1 - min));
		}
		
		return array;
	}
	
	
	
	/**
	 * @brief Obtains the lowest number in the given array
	 * @param array Array to obtain the lowest number from
	 * @return The lowest value in the given array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int getLowestNumber(int[] array)
	{
		int lowest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++)
		{
			int number = array[i];
		
			if (number < lowest)
			{
				lowest = number;
			}
		}
		
		return lowest;
	}
	
	
	
	/**
	 * @brief Obtains the greatest number in the given array
	 * @param array Array to obtain the greatest number from
	 * @return The greatest value in the given array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int getGreatestNumber(int[] array)
	{
		int greatest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++)
		{
			int number = array[i];
		
			if (number > greatest)
			{
				greatest= number;
			}
		}
		
		return greatest;
	}
	
	
	
	/**
	 * @brief Computes the avarege of all the numbers in the given array
	 * @param array Array to compute the avarage
	 * @return The avarage result of all numbers in the given array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int computeArrayNumbersAvagare(int[] array)
	{
		if (array.length == 0)
		{
			return 0;
		}
	
	
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	
	
	/**
	 * @brief Checks if the given number is in the given array
	 * @param array Array to check
	 * @param x Value to check if it is in the given array
	 * @return True if the given number in in the given array, false otherwise
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isNumberInArray(int[] array, int x)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == x)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	/**
	 * @brief Obtains the index in the given array of the given value
	 * @param array Array to check
	 * @param x Value to obtain the index from
	 * @return The index of the given number. -1 if it was not found
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int getIndexOfValue(int[] array, int x)
	{
		int index = -1;
		
		for (int i = 0; i < array.length && index < 0; i++)
		{
			if (array[i] == x)
			{
				index = i;
			}
		}
		
		return index;
	}
	
	
	
	/**
	 * @brief Turns the whole given array
	 * @param array Array to turn
	 * @return The turned array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int[] turnArray(int[] array)
	{
		int[] result = new int[array.length];
		
		for (int i = 0; i < result.length; i++)
		{
			result[i] = array[array.length - 1 - i];
		}
		
		return result;
	}
	
	
	/**
	 * @brief Moves all the elements in the given array to the right by the given amount of steps
	 * @param array Array to move
	 * @param steps Amount of steps to move the array
	 * @return The moved array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int[] moveArrayToRight(int[] array, int steps)
	{
		if (steps < 0)
		{
			return moveArrayToLeft(array, Math.abs(steps));
		}
		
		int[] result = new int[array.length];
		
		for (int i = 0; i < result.length; i++)
		{
			result[(i + steps) % array.length] = array[i];
		}
		
		return result;
	}
	
	
	
	/**
	 * @brief Moves all the elements in the given array to the left by the given amount of steps
	 * @param array Array to move
	 * @param steps Amount of steps to move the array
	 * @return The moved array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int[] moveArrayToLeft(int[] array, int steps)
	{
		if (steps < 0)
		{
			return moveArrayToRight(array, Math.abs(steps));
		}
	
		int[] result = new int[array.length];
		
		for (int i = 0; i < result.length; i++)
		{
			result[i] = array[(i + steps) % array.length];
		}
		
		return result;
	}
	
	
	
	/**
	 * @brief Prints the given array
	 * @param array Array to print
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static void printArray(int[] array)
	{
		System.out.print("|");
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("  %2d  |", i);
		}
		
		System.out.print("\n-----------------------------------------------------------------------\n|");
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("  %2d  |", array[i]);
		}
	}
}