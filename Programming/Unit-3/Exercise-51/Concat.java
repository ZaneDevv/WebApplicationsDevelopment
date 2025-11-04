import java.util.Scanner;

/**
 * @version 1.0
 * @date 25/11/4
 * @author Álvaro Fernández Barrero
 */
 
public class Concat
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String string1 = "";
		String string2 = "";
		String result = "";
		
		
		// Setting strings
		
		System.out.println("Set a text:");
		string1 = input.nextLine();
		
		System.out.println("\nSet a text:");
		string2 = input.nextLine();
		
		
		// Concat
		
		result = concat(string1, string2);
		
		
		// Printing result
		
		System.out.printf("\n%s", result);
		
		
		input.close();
	}
	
	
	/**
	 * @brief Concatenates the two given strings
	 * @param string1 First string to concatenate
	 * @param string2 Second string to concatenate
	 * @return New string product of the concatination of the two given strings
	 * @since 1.0
	 * @version 1.0
	 * @date 25/11/4
	 * @author Álvaro Fernández Barrero
	 */
	private static String concat(String string1, String string2)
	{
		return string1 + string2;
	}
}