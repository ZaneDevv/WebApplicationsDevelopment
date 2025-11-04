import java.util.Scanner;

/**
 * @version 1.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class IsEmpty
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String string = "";
		
		
		// Setting strings
		
		System.out.println("Set a text:");
		string = input.nextLine();
		
		
		// Printing result
		
		if (!isStringEmpty(string))
		{
			System.out.println("\n" + string);
		}
		
		
		input.close();
	}
	
	
	/**
	 * @brief Checks if a string is empty
	 * @param string The string to check
	 * @return True if it is empty, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 25/11/4
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isStringEmpty(String string)
	{
		return string.length() == 0;
	}
}