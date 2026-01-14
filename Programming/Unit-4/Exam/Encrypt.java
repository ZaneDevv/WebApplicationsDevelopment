/*
	Álvaro Fernández Barrero
	1º DAW Bil.
	2026/01/14
*/

import java.util.Scanner;
import java.util.regex.*;


public class Encrypt
{
	public static void main(String[] args)
	{
		// Constantes
		
		final Pattern ALLOWED_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
				
		// Variables
		
		Scanner input = new Scanner(System.in);
		
		char[][] matrixEncrypted = new char[5][5];
		
		String textToEncrypt = "";
		StringBuilder encryptedText = new StringBuilder();
		
		boolean isTextAllowed = false;
		
		int characterIndex = 0;
		int i = 0;
		int j = 0;
		
		
		// Adding values to the matrix
		
		for (i = 0; i < matrixEncrypted.length; i++)
		{
			for (j = 0; j < matrixEncrypted[0].length; j++)
			{
				char characterToWrite = (char)('A' + characterIndex++);
				
				if (characterToWrite == 'J')
				{
					characterToWrite++;
					characterIndex++;
				}
				
				matrixEncrypted[i][j] = characterToWrite;
			}
		}
		
		
		// Asking for text to encrypt
		
		do
		{
			System.out.print("Message to encrypt: ");
			textToEncrypt = input.nextLine();
			
			isTextAllowed = ALLOWED_PATTERN.matcher(textToEncrypt).matches();
			
			if (!isTextAllowed)
			{
				System.out.println("Incorrect character. Only letters without accents and white spaces are allowed");
			}
		}
		while (!isTextAllowed);
		
		textToEncrypt = textToEncrypt.toUpperCase();
		
		
		
		// Encrypting character by character
		
		for (characterIndex = 0; characterIndex < textToEncrypt.length(); characterIndex++)
		{
			char characterToEncrypt = textToEncrypt.charAt(characterIndex);
			
			// Encrypt the letter, white spaces are ignored
			
			if (characterToEncrypt != ' ')
			{
				if (characterToEncrypt == 'J')
				{
					characterToEncrypt--;
				}
				
				for (i = 0; i < matrixEncrypted.length; i++)
				{
					for (j = 0; j < matrixEncrypted[0].length; j++)
					{
						if (characterToEncrypt == matrixEncrypted[i][j])
						{
							encryptedText.append(i + 1);
							encryptedText.append(j + 1);
						}
					}
				}
			}
		}
		
		
		// Mostrando resultado
		
		System.out.printf("Encrypted message: %s\n", encryptedText);
	}
}