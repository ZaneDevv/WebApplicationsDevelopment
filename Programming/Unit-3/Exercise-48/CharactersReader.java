import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class CharactersReader
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		
		
		// Setting the text to read
		
		try
		{
			System.out.print("Insert a text here: ");
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
		
		
		// Reading the text character by character
		
		for (int i = 0; i < text.length(); i++)
		{
			System.out.println(text.charAt(i));
		}
		
		
		input.close();
	}
}