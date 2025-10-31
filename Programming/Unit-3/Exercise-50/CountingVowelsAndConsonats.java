import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class CountingVowelsAndConsonats
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		
		byte vowels = 0;
		byte consonants = 0;
		
		
		// Inserting the text
		
		try
		{
			System.out.print("Insert a text here: ");
			text = input.nextLine().toUpperCase();
			
			if (text.length() == 0)
			{
				throw new Exception("At least a character is needed!");
			}
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		
		
		// Counting vowels and consonants
		
		for (int i = 0; i < text.length(); i++)
		{
			char character = text.charAt(i);
			
			if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		
		// Printing results
		
		System.out.printf("That sentence has " + ANSI_CYAN + "%d" + ANSI_RESET + " vowels and " + ANSI_CYAN + "%d" + ANSI_RESET + " consonants.", vowels, consonants);
		
		
		input.close();
	}
}