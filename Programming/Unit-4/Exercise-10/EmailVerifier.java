import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class EmailVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Defining pattern
	
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_-](?:[a-zA-Z0-0\\._-]*[a-zA-Z0-9_-])?@([a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.)+[a-zA-Z]{2,}$");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String email = "";
		boolean isEmailValid = false;
		
		
		do
		{
			// Setting the email
			
			System.out.print("Write here your email: ");
			
			System.out.print(ANSI_CYAN);
			email = input.nextLine();
			System.out.print(ANSI_RESET);
			
			// Checking whether the given email is valid or not
			
			isEmailValid = EMAIL_PATTERN.matcher(email).matches();
			
			if (!isEmailValid)
			{
				System.out.println(ANSI_RED + "Invalid email!" + ANSI_RESET);
			}
		}
		while (!isEmailValid);
		
		
		// The last email is valid
		
		System.out.println(ANSI_GREEN + "Email valid!" + ANSI_RESET);
		
		
		input.close();
	}
}
