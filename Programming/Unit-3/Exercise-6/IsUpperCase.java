import java.util.Scanner;

public class IsUpperCase
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String importedCharacter = "";
		char character = ' ';
		
		
		// Setting the character
		
		System.out.print("Set a character: ");
		importedCharacter = input.nextLine();
		
		if (importedCharacter.length() > 0)
		{
			character = importedCharacter.charAt(0);
			
			if (character >= 'A' && character <= 'Z')
			{
				System.out.println("It is an upper case letter.");
			}
			else
			{
				System.out.println("It is a lower case letter.");
			}
		}
		else
		{
			System.out.println("You did not set any character here!");
		}
	}
}