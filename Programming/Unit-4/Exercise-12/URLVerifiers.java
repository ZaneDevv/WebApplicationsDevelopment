import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/09
 * @author Álvaro Fernández Barrero
 */

public class URLVerifiers
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Defining pattern
	
	private static final Pattern URL_PATTERN = Pattern.compile("^((https?://)?([a-zA-Z_-]+\\.)?)?[a-zA-Z-_]+\\.[a-zA-Z]{2,}(?:/[a-zA-Z_-]+([&=\\?#\\.][a-zA-Z0-9-_]+)*)*$");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String url = "";
		boolean isValidUrl = false;
		
		
		do
		{
			// Setting URL
			
			System.out.print("Write here a URL you want to go to: ");
			
			System.out.print(ANSI_CYAN);
			url = input.nextLine().trim();
			System.out.print(ANSI_RESET);
			
			// Checking whether the given URL is valid or not
			
			isValidUrl = URL_PATTERN.matcher(url).matches();
			
			if (!isValidUrl)
			{
				System.out.println(ANSI_RED + "Invalid URL!" + ANSI_RESET);
			}
		}
		while (!isValidUrl);
		
		
		// The last URL is valid
		
		System.out.println(ANSI_GREEN  + "URL Valid!" + ANSI_RESET);
		
		input.close();
	}
}