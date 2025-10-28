import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class U
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int height = 0;
		
		
		// Setting the height
		
		System.out.print("Set the height: ");
		height = input.nextInt();
		
		
		// Displaying the L
		
		for (int i = 0; i <= height; i++)
		{
			char character1 = ' ';
			char character2 = ' ';
			
			if (i == height)
			{
				character1 = ' ';
				character2 = '*';
			}
			else
			{
				character1 = '*';
				character2 = ' ';
			}
			
			System.out.print(character1);
				
			for (int j = 0; j <= 5; j++)
			{
				System.out.print(character2);
			}
			
			System.out.print(character1);
			
			System.out.print("\n");
		}
		
		
		input.close();
	}
}