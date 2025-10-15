import java.util.Scanner;

public class NumbersAndStrings
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		double number = 0.0;
		
		
		// Setting values
		
		System.out.print("Give me a text: " + ANSI_CYAN);
		text = input.nextLine();
		System.out.print(ANSI_RESET);
		
		System.out.print("Give me a number: " + ANSI_CYAN);
		number = input.nextDouble();
		System.out.print(ANSI_RESET);
		
		
		// Printing it altogether
		
		System.out.printf("You set " + ANSI_PURPLE + "%.3f" + ANSI_RESET + " and " + ANSI_PURPLE + "%s" + ANSI_RESET, number, text);
	}
}