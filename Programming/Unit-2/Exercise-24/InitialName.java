import java.util.Scanner;

public class InitialName
{
	private static final int CHARACTERS_IN_INITIALS = 2;

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String name = "";
		String lastName1 = "";
		String lastName2 = "";
		String initials = "";
		
		
		// Setting the name
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your first last name: ");
		lastName1 = input.nextLine();
		
		System.out.print("Enter your second last name: ");
		lastName2 = input.nextLine();
		
		
		// Getting initials
		
		initials += name.substring(0, CHARACTERS_IN_INITIALS);
		initials += lastName1.substring(0, CHARACTERS_IN_INITIALS);
		initials += lastName2.substring(0, CHARACTERS_IN_INITIALS);
		
		System.out.printf("\nYour initials are %s.", initials);
	}
}