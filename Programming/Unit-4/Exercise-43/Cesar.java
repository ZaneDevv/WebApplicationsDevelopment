import java.util.Scanner;


/**
 * @version 1.0
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class Cesar
{
	// Constants

	private static int CESAR_MOVEMENT = 3;



	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		char[] characters;



		// Setting sentence

		System.out.println("Write here a sentence:");
		characters = input.nextLine().toCharArray();



		// Encrypting

		for (int i = 0; i < characters.length; i++)
		{
			boolean isCapitalLetter = characters[i] >= 'A' && characters[i] <= 'Z';
			boolean isLoweredLetter = characters[i] >= 'a' && characters[i] <= 'z';

			if (isCapitalLetter || isLoweredLetter)
			{
				char minimumCharacter = isCapitalLetter ? 'A' : 'a';
				characters[i] = (char)((characters[i] + CESAR_MOVEMENT - minimumCharacter) % ('z' - 'a') + minimumCharacter);
			}

		}



		// Printing result

		System.out.println("\nEncrypted result:");
		for (int i = 0; i < characters.length; i++)
		{
			System.out.print(characters[i]);
		} 


		input.close();
	}
}