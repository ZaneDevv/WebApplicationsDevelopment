import java.util.Scanner;

/**
 * @version 3.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class CountVowels
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String string = "";
		int vowels = 0;
		
		
		// Setting string value
		
		System.out.println("Write something here:");
		string = input.nextLine();
		
		
		// Adding vowels up
		
		vowels = getAmountOfVowels(string);
		
		
		// Printing result
		
		System.out.printf("\nThe given string has %d vowels.", vowels);
		
		
		input.close();
	}
	
	
	/**
	 * @brief Counts all the vowels in a given string
	 * @param string The string where it counts vowels from
	 * @return The amount of vowels in the given string
	 * @since 1.0
	 * @version 1.0
	 * @author Álvaro Fernández Barrero
	 */
	private static int getAmountOfVowels(String string)
	{
		int vowelsAmount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (!isVowel(string.charAt(i)))
			{
				continue;
			}
			
			vowelsAmount++;
		}
		
		return vowelsAmount;
	}
	
	
	/**
	 * @brief Checks if a given character is a vowels
	 * @param character Character to check
	 * @return True if the given character is vowel, false otherwise
	 * @since 1.0
	 * @version 1.1
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isVowel(char character)
	{
		boolean isLowerVowel = character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
		boolean isCapitalVowel = character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
		
		return isLowerVowel || isCapitalVowel;
	}
}