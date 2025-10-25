import java.util.Scanner;

/**
 * @date 25/10/21
 * @author Álvaro Fernández Barrero
 */

public class FirstHour
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String day = "";
		

		while (true)
		{
			// Setting the day to check

			System.out.print("Choose one day in the week, type \"c\" to cancel: ");
			day = input.nextLine();
			
			
			// In case the user set "c", quit the program
			
			if (day.equalsIgnoreCase("C"))
			{
				input.close();
				break;
			}
			
			
			// Displaying the first subject in the chosen day
			
			System.out.printf("%s, at the first hour, the subject is ", day.toLowerCase());
			System.out.print(ANSI_GREEN);
			
			switch (day.toUpperCase())
			{
				case "MONDAY" -> System.out.print("Programming");
				case "TUESDAY" -> System.out.print("Databases");
				case "WEDNESDAY" -> System.out.print("Databases");
				case "THURSDAY" -> System.out.print("Programming");
				case "FRIDAY" -> System.out.print("Computer systems");
				default -> System.out.print("None");
			}
			
			System.out.print(ANSI_RESET);
			System.out.print(".\n\n");
		}
	}
}