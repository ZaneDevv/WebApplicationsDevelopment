import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/07
 * @author Álvaro Fernández Barrero
 */

public class CountInStrings
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "Siempre podemos aprender java";
		String textInvertedByWords = "";
		String textInvertedByCharacters = "";
		
		int lettersAmount = 0;
		int wordsAmount = 0;
		int asAmount = 0;
		
		
		// Setting the text to count in
		
		System.out.print("Would you like to set a text? [Y/N]: ");
		
		if (input.nextLine().equalsIgnoreCase("Y"))
		{
			text = input.nextLine();
		}
		
		
		// Counting in string
		
		lettersAmount = countLetters(text);
		wordsAmount = countWords(text);
		asAmount = countCharacterInString(text.toLowerCase(), 'a');
		
		
		// Inverting string
		
		textInvertedByCharacters = invertStringByCharacters(text);
		textInvertedByWords = invertStringByWords(text);
		
		
		// Printing result
		
		System.out.printf("Letters amount: %d\n", lettersAmount);
		System.out.printf("Words amount: %d\n", wordsAmount);
		System.out.printf("As amount: %d\n", asAmount);
		System.out.println("------------------------------------------------");
		System.out.printf("Inverted character by character:\n%s\n\n", textInvertedByCharacters);
		System.out.printf("Inverted word by word:\n%s", textInvertedByWords);
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Inverts the given string word by word
	 * @param string The string to invert
	 * @return The string inverted
	 * @since 1.0
	 * @version 1.5
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static String invertStringByWords(String string)
	{
		String result = "";
		int lastSpace = string.length();
		
		string = string.trim();
		
		for (int i = lastSpace - 1; i >= 0; i--)
		{
			if (string.charAt(i) != ' ')
			{
				continue;
			}
		
			result += string.substring(i + 1, lastSpace) + " ";
			lastSpace = i;
		}
		
		result += string.substring(0, lastSpace);
		
		
		return result;
	}
	
	
	
	/**
	 * @brief Inverts the given string character by character
	 * @param string The string to invert
	 * @return The string inverted
	 * @since 1.0
	 * @version 1.2
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static String invertStringByCharacters(String string)
	{
		String result = "";
		
		for (int i = string.length() - 1; i >= 0; i--)
		{
			result += String.valueOf(string.charAt(i));
		}
		
		return result;
	}
	
	
	
	/**
	 * @brief Counts the amount of words the given string has
	 * @param string The string to count the number of words
	 * @return The amount of number of words in the given string
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static int countWords(String string)
	{
		int amount = string.length() > 0 ? 1 : 0;
		
		string = string.trim();
		
		
		for (int i = 1; i < string.length(); i++)
		{
			boolean doesWordStart = string.charAt(i) != ' ' && string.charAt(i - 1) == ' ';
			
			if (!doesWordStart)
			{
				continue;
			}
			
			amount++;
		}
		
		
		return amount;
	}
	
	
	
	/**
	 * @brief Counts how many times the given character shows up in a given string
	 * @param string The string to check
	 * @param character The character to count
	 * @return The amount of time the given character is in the given string
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static int countCharacterInString(String string, char character)
	{
		int amount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (string.charAt(i) != character)
			{
				continue;
			}
			
			amount++;
		}
		
		return amount;
	}
	
	
	
	/**
	 * @brief Counts the amount of letter the given string has
	 * @param string The string whose letters it has to count
	 * @return The amount of letter the given string has
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static int countLetters(String string)
	{
		int amount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (!isALetter(string.charAt(i)))
			{
				continue;
			}
			
			amount++;
		}
		
		return amount;
	}
	
	
	
	/**
	 * @brief Checks if the given number is a letter
	 * @param character The character to check if it is a letter
	 * @return True if the given character is a letter, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/07
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isALetter(char character)
	{
		boolean isUpperLetter = character >= 'A' && character <= 'Z';
		boolean isLowerLetter = character >= 'a' && character <= 'z';
		
		return isLowerLetter || isUpperLetter;
	}
}