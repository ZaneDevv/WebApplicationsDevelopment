import java.util.Scanner;

public class SignIn
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String name = "";
		int number = 0;
		float height = 0f;
		char genre = 'n';
		String fullGenre = "";
		
		
		// Setting values
		
		System.out.print(" - Name: " + ANSI_CYAN);
		name = input.nextLine();
		System.out.print(ANSI_RESET);
		
		System.out.print(" - Phone number: " + ANSI_CYAN);
		number = input.nextInt();
		System.out.print(ANSI_RESET);
		
		System.out.print(" - Hight: " + ANSI_CYAN);
		height = input.nextFloat();
		System.out.print(ANSI_RESET);
		
		input.nextLine();
		System.out.print(" - Genre [M/F]: " + ANSI_CYAN);
		genre = input.nextLine().charAt(0);
		System.out.print(ANSI_RESET);
		
		fullGenre = (genre == 'f' || genre == 'F') ? "FEMENINE" : "MASCULINE";
		
		
		// Printing informaition
		
		System.out.printf("\nUser\'s name: " + ANSI_YELLOW + "%s" + ANSI_RESET, name);
		System.out.printf("\nUser\'s phone number: " + ANSI_YELLOW + "%9d" + ANSI_RESET, number);
		System.out.printf("\nUser\'s height: " + ANSI_YELLOW + "%.2f" + ANSI_RESET, height);
		System.out.printf("\nUser\'s genre: " + ((genre == 'M' || genre == 'm') ? ANSI_CYAN : ANSI_PURPLE) + "%s" + ANSI_RESET, fullGenre);
	}
}