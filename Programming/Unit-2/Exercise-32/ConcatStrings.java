import java.util.Scanner;

public class ConcatStrings
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";
	
	
	public static void main(String[] agrs)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String string1 = "";
		String string2 = "";
		String string3 = "";
		
		
		// Setting characters
		
		System.out.print("Give me a text: ");
		string1 = input.nextLine();
		
		System.out.print("Give me another text: ");
		string2 = input.nextLine();
		
		string3 = string1 + " " + string2;
		
		
		// Printing result
		
		System.out.printf("The concat result is: %s", string3);
	}
}