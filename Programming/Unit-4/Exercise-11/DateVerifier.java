import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class DateVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Defining patters
	
	private static final Pattern DATE_PATTERN = Pattern.compile("[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}");
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String date = "";
		boolean isValidDate = false;
		
		
		do
		{
			// Setting date
			
			System.out.print("Write here a date: ");
			
			System.out.print(ANSI_CYAN);
			date = input.nextLine();
			System.out.print(ANSI_RESET);
			
			// Checking whether the date is valid or not
			
			isValidDate = DATE_PATTERN.matcher(date).matches();
			
			if (!isValidDate)
			{
				System.out.println(ANSI_RED + "Invalid date!" + ANSI_RESET);
			}
		}
		while (!isValidDate);
		
		
		// The last date is valid
		
		System.out.println(ANSI_GREEN + "Valid date!" + ANSI_RESET);
		
		
		input.close();
	}
}