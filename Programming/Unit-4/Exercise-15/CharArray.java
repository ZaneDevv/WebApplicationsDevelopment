/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class CharArray
{
	public static void main(String[] args)
	{
		// Defining variables
		
		char[] symbols = new char[10];
		
		
		// Setting values to the symbols array
		
		symbols[0] = 'a';
		symbols[1] = 'x';
		symbols[4] = '@';
		symbols[6] = ' ';
		symbols[7] = '+';
		symbols[8] = 'Q';
		
		
		// Printing array
		
		for (int i = 0; i < symbols.length; i++)
		{
			System.out.printf("%2d: %c\n", i, symbols[i]);
		}
		
		
		// The values in the array of chars we did not set, takes a default value until we set a value for them.
	}
}