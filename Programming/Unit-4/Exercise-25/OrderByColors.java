import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class OrderByColors
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte colorsAmount = 0;
		
		String[] colors = {"green", "red", "blue", "yellow", "orange", "pink", "black", "white", "purple"};
		String[] words = new String[8];
		
		
		// Setting words
		
		for (int i = 0; i < words.length; i++)
		{
			System.out.printf("Set a world (%d/%d): ", i + 1, words.length);
			words[i] = input.nextLine().trim();
		}
		
		
		// Ordering words
		
		for (int i = 0; i < words.length; i++)
		{
			String word = words[i];
			
			if (!isInArray(colors, word))
			{
				continue;
			}
			
			for (int j = i; j > colorsAmount; j--)
			{
				words[j] = words[j - 1];
			}
			words[colorsAmount++] = word;
		}
		
		
		// Printing result
		
		for (int i = 0; i < words.length; i++)
		{
			System.out.printf("%2d: %s\n", i, words[i]);
		}
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Checks if the given string is in the given array
	 * @param array Array to check if it has the given string
	 * @param string String to check if it is in the given array
	 * @return True if the array has the string, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isInArray(String[] array, String string)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equalsIgnoreCase(string))
			{
				return true;
			}
		}
		
		return false;
	}
}