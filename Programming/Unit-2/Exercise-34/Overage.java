import java.util.Scanner;

public class Overage
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	
	private static final byte MINIMUM_OVERAGE_AGE = 18;
	

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte age = 0;
		boolean isOverage = false;
		
		
		// Setting radius
		
		System.out.println("How old are you?");
		age = input.nextByte();
		
		
		// Is overage?
		
		isOverage = age > MINIMUM_OVERAGE_AGE;
		System.out.println((isOverage ? (ANSI_GREEN + "You are overage.") : (ANSI_RED + "You are not overage!")) + ANSI_RESET);
	}
}