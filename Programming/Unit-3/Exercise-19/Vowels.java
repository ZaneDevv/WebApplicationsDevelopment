import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class Vowels
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String lastString = "";
		char lastCharacter = '-';
		
		
		do
		{
			// Setting the character
			
			do
			{
				System.out.print("Set a character [SPACE = exit]: ");
				lastString = input.nextLine();
				
			} while (lastString.length() == 0);
			
			lastCharacter = lastString.toUpperCase().charAt(0);
			
			// Checking if the character is even a letter
			
			System.out.println(lastCharacter);
			
			if (lastCharacter >= 'A' && lastCharacter <= 'Z')
			{
				// Checking if the letter is either a consonant or a vowel
				
				if (lastCharacter == 'A' || lastCharacter == 'E' || lastCharacter == 'I' || lastCharacter == 'O' || lastCharacter == 'U')
				{
					System.out.println("It is a vowel.");
				}
				else
				{
					System.out.println("It is a consonant.");
				}
			}
			else
			{
				System.out.println("It is not a letter!");
			}
			
		} while(lastCharacter != ' ');
		
		
		input.close();
	}
}