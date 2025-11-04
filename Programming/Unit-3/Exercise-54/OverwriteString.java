import java.util.Scanner;

/**
 * @version 1.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class OverwriteString
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		String enhancedText = "";
		
		
		// Setting text
		
		System.out.println("Write something:");
		text = input.nextLine();
		
		
		// Applying format
		
		enhancedText = applyFormat(text);
		
		
		// Printing result
		
		System.out.println("\n" + enhancedText);
		
		
		input.close();
	}
	
	
	/**
	 * @brief Applies the correct format to a given text
	 * @param string String to apply format
	 * @return The text with the format already applied
	 * @since 1.0
	 * @version 1.0
	 * @date 25/11/4
	 * @author Álvaro Fernández Barrero
	 */
	private static String applyFormat(String string)
	{
		if (string.length() == 0)
		{
			return string;
		}
		
		
		String result = "";
		
		for (int i = 0; i < string.length(); i++)
		{
			if (i == 0)
			{
				result += String.valueOf(string.charAt(i)).toUpperCase();
				continue;
			}
			
			if (string.charAt(i - 1) == ' ')
			{
				result += String.valueOf(string.charAt(i)).toUpperCase();
				continue;
			}
			
			result += String.valueOf(string.charAt(i)).toLowerCase();
		}
		
		return result;
	}
}