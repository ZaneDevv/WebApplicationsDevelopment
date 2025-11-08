import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class CarRegistrationVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Defining pattern
	
	private static final Pattern CAR_REGISTRATION_PATTERN = Pattern.compile("[0-9]{4} [a-zA-Z&&[^qQaAeEiIoOuU]]{3}");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String carRegistration = "";
		boolean isValidCarRegistration = false;
		
		
		do
		{
			// Setting car registration
			
			System.out.print("Write here your car registration: ");
			
			System.out.print(ANSI_CYAN);
			carRegistration = input.nextLine();
			System.out.print(ANSI_RESET);
			
			// Checking whether the given car registration is valid or not
			
			isValidCarRegistration = CAR_REGISTRATION_PATTERN.matcher(carRegistration).matches();
			
			if (!isValidCarRegistration)
			{
				System.out.println(ANSI_RED + "Invalid car registration!" + ANSI_RESET);
			}
		}
		while (!isValidCarRegistration);
		
		
		// The last car registration is valid
		
		System.out.println(ANSI_GREEN + "Valid car registration!" + ANSI_RESET);
		
		input.close();
	}
}