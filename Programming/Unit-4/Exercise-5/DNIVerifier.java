import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
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
	
	
	//Setting DNI's pattern
	
	private static final Pattern DNI_PATTERN = Pattern.compile("[0-9]{8}[a-zA-Z]");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String dni = "";
		boolean isValidDni = false;
		
		
		// Setting dni
		
		do
		{
			System.out.print("Write here your DNI: ");
			System.out.print(ANSI_CYAN);
			
			dni = input.nextLine();
			
			System.out.print(ANSI_RESET);
			
			
			// Checking if the given DNI has a correct format
			
			isValidDni = DNI_PATTERN.matcher(dni).matches();
			
			if (!isValidDni)
			{
				System.out.println(ANSI_RED + "Invalid DNI!" + ANSI_RESET);
			}
		}
		while (!isValidDni);
		
		
		// Printing result
		
		System.out.print(ANSI_GREEN + "Valid DNI!" + ANSI_RESET);
		
		
		input.close();
	}
}