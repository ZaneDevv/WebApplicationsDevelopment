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
	
	private static final String DNI_CHARACTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	//Setting DNI's pattern
	
	private static final Pattern NIE_PATTERN = Pattern.compile("[x-zX-Z][0-9]{7}[a-zA-Z]");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String nie = "";
		boolean isValidNie = false;
		
		
		// Setting NIE
		
		do
		{
			System.out.print("Write here your NIE: ");
			System.out.print(ANSI_CYAN);
			
			nie = input.nextLine();
			
			System.out.print(ANSI_RESET);
			
			
			// Checking if the given NIE has a correct format
			
			isValidNie = NIE_PATTERN.matcher(nie).matches();
			
			if (!isValidNie)
			{
				System.out.println(ANSI_RED + "Invalid NIE!" + ANSI_RESET);
			}
		}
		while (!isValidNie);
		
		
		// Printing result
		
		System.out.print(ANSI_GREEN + "Valid NIE!" + ANSI_RESET);
		
		
		input.close();
	}
}