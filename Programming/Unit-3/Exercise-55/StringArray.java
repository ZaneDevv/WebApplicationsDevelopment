import java.util.Scanner;

/**
 * @version 3.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class StringArray
{
	public static void main(String[] args)
	{
		// Defining variables
		
		String[] strings = makeStringArray();
		String concatenatedString = concatStringsInArray(strings);
		String longestString = getLongestString(strings);
		
		
		// Printing result
		
		System.out.printf("\n%s\n", concatenatedString);
		System.out.printf("\n%s\n", longestString);
	}
	
	
	/**
	 * @brief Allows the user to write ten strings
	 * @return Array with ten different strings
	 * @since 1.0
	 * @version 1.3
	 * @author Álvaro Fernández Barrero
	 */
	private static String[] makeStringArray()
	{
		Scanner input = new Scanner(System.in);
		
		String[] stringArray = new String[10];
		
		
		for (byte i = 0; i < 10; i++)
		{
			System.out.printf("Write the no. %d text:\n", i + 1);
			stringArray[i] = input.nextLine();
		}
		
		
		input.close();
		
		return stringArray;
	}
	
	
	/**
	 * @brief Concatenates all the strings in the given array
	 * @param stringArray An array of strings
	 * @return A string with all the strings in the array
	 * @since 2.0
	 * @version 1.2
	 * @author Álvaro Fernández Barrero
	 */
	private static String concatStringsInArray(String[] stringArray)
	{
		String result = "";
		
		for (String string : stringArray)
		{
			result += string + " ";
		}
		
		return result;
	}
	
	
	/**
	 * @brief Obtains the longest string in an array
	 * @param stringArray The array of strings to obtain the string from
	 * @return The longest string in the given array
	 * @since 3.0
	 * @version 1.2
	 * @author Álvaro Fernández Barrero
	 */
	private static String getLongestString(String[] stringArray)
	{
		String longest = stringArray[0];
		
		for (String string : stringArray)
		{
			if (string.length() < longest.length())
			{
				continue;
			}
			
			longest = string;
		}
		
		return longest;
	}
}