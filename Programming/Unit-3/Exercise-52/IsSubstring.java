import java.util.Scanner;

/**
 * @version 1.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class IsSubstring
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String string = "";
		String substring = "";
		
		
		// Setting strings
		
		System.out.println("Set a text:");
		string = input.nextLine();
		
		System.out.println("\nSet a text to check if it is inside the previous one:");
		substring = input.nextLine();
		
		
		// Printing result
		
		System.out.println("\n" + (isSubstring(string, substring) ? "It is a substring." : "It is not a substring."));
		
		
		input.close();
	}
	
	
	/**
	 * @brief Checks if a string is a substring of another
	 * @param string The original string
	 * @param substring The string to check if it is inside the original string
	 * @return True if it is a substring, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 25/11/4
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isSubstring(String string, String substring)
	{
		if (string.length() == 0 || substring.length() == 0)
		{
			return false;
		}
		
		
		char firstCharacter = substring.charAt(0);
		
		for (byte i = 0; i < string.length(); i++)
		{
			if (string.charAt(i) != firstCharacter)
			{
				continue;
			}
			
			if (string.substring(i, i + substring.length()).equals(substring))
			{
				return true;
			}
		}
		
		return false;
	}
}