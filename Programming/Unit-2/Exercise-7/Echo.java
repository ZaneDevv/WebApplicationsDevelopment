import java.util.Scanner;

public class Echo
{
	// Defining color.
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_BLUE = "\u001B[34m";


	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		String value = "";
		
		System.out.print("Write something here: " + ANSI_BLUE);
		value = Input.nextLine();
		System.out.print(ANSI_RESET);
		
		System.out.printf("You've said \"%s\".\n", value);
	}
}