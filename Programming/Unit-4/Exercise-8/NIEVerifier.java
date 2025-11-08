import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class NIEVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Difining characters
	
	private static final String NIE_CHARACTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	// Defining NIE patters
	
	private static final Pattern NIE_PATTERN = Pattern.compile("[x-zX-Z][0-9]{7}[a-zA-Z]");
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String nieString = "";
		boolean isNieValid = false;
		
		
		do
		{
			// Setting NIE
			
			System.out.print("Write here your NIE: ");
			
			System.out.print(ANSI_CYAN);
			nieString = input.nextLine();
			System.out.print(ANSI_RESET);
			
			// Checking whether the given NIE is valid or not
			
			isNieValid = isValidNie(nieString);
			
			if (!isNieValid)
			{
				System.out.println(ANSI_RED + "Invalid NIE!" + ANSI_RESET);
			}
		}
		while (!isNieValid);
		
		
		// The last NIE is valid
		
		System.out.println(ANSI_GREEN + "Valid NIE!" + ANSI_RESET);
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Checks if the given NIE is correct
	 * @param nie The NIE to check
	 * @return True if the given NIE is correct, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isValidNie(String nie)
	{
		if (!(NIE_PATTERN.matcher(nie).matches()))
		{
			return false;
		}
		
		int numbers = Integer.parseInt(nie.substring(1, 8));
		char character = nie.charAt(8);
		
		return NIE_CHARACTERS.charAt(numbers % 23) == character;
	}
}