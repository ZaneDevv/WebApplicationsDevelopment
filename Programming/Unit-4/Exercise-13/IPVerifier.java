import java.util.Scanner;
import java.util.regex.*;

/**
 * @version 1.0
 * @date 2025/11/09
 * @author Álvaro Fernández Barrero
 */

public class IPVerifier
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	// Defining IP pattern
	
	private static final Pattern IP_PATTERN = Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3}");
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String ip = "";
		boolean isValidIp = false;
		
		
		do
		{
			// Setting IP
			
			System.out.print("Write here an IP you want to go to: ");
			
			System.out.print(ANSI_CYAN);
			ip = input.nextLine().trim();
			System.out.print(ANSI_RESET);
			
			// Checking whether the IP is valid or not
			
			isValidIp = IP_PATTERN.matcher(ip).matches();
			
			if (!isValidIp)
			{
				System.out.println(ANSI_RED + "Invalid IP!" + ANSI_RESET);
			}
		}
		while (!isValidIp);
		
		
		// The last IP is valid
		
		System.out.println(ANSI_GREEN + "Valid IP!" + ANSI_RESET);
		
		input.close();
	}
}