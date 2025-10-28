import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class Pyramid
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String setString = "";
		
		int height = 0;
		char character = ' ';
		
		
		// Setting pyramid attributes
		
		System.out.print("Height: ");
		height = input.nextInt();
		
		do
		{
			System.out.print("Which character do you want to use? ");
			setString = input.nextLine();
		} while (setString.length() == 0);
		
		character = setString.charAt(0);
		
		
		// Drawing pyramid
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < height - i; j++)
			{
				System.out.print(" ");
			}
				
			for (int j = 0; j < i * 2 - 1; j++)
			{
				System.out.print(character);
			}
			
			System.out.print("\n");
		}
		
		
		input.close();
	}
}