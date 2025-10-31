import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class MakePascalCase
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		
		
		// Inserting the text
		
		try
		{
			System.out.print("Insert a text here:\n\n");
			text = input.nextLine();
			
			if (text.length() == 0)
			{
				throw new Exception("At least a character is needed!");
			}
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		
		
		// Make the new text with the capitalized letters
		
		for (int i = 0; i < text.length(); i++)
		{
			if (i == 0)
			{
				text = String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1);
				continue;
			}
			
			if (text.charAt(i - 1) == ' ')
			{
				text = text.substring(0, i) + String.valueOf(text.charAt(i)).toUpperCase() + text.substring(i + 1);
			}
		}
		
		
		// Printing results
		
		System.out.println("\n\n" + text);
		
		
		input.close();
	}
}