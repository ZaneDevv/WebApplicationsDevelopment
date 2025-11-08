import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.3
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class DNIVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Difining characters
	
	private static final String DNI_CHARACTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	// Defining pattern
	
	private static final Pattern DNI_PATTERN = Pattern.compile("[0-9]{8}[a-zA-Z]");
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String dniString = "";
		boolean isValidDni = false;
		
		
		do
		{
			// Setting DNI's number
			
			System.out.print("Write here your DNI\'s numbers: ");
			
			System.out.print(ANSI_CYAN);
			dniString = input.nextLine();
			System.out.print(ANSI_RESET);
			
			// Checking if the given ID is fully valid
			
			isValidDni = isValidDni(dniString);
			
			if (!isValidDni)
			{
				System.out.println(ANSI_RED + "Invalid DNI!" + ANSI_RESET);
			}
		}
		while (!isValidDni);
		
		
		// The last DNI is valid
		
		System.out.println(ANSI_GREEN + "Valid DNI!" + ANSI_RESET);
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Checks if an DNI is valid
	 * @param dni The DNI to check
	 * @return True if the given DNI is valid, false otherwise
	 * @since 1.0
	 * @version 1.2
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isValidDni(String dni)
	{
		if (!(DNI_PATTERN.matcher(dni).matches()))
		{
			return false;
		}
		
		int number = Integer.parseInt(dni.substring(0, 8));
		char character = dni.charAt(8);
		
		return DNI_CHARACTERS.charAt(number % 23) == character;
	}
}
