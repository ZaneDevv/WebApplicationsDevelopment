import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class L
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
			if (i == height)
			{
				for (int j = 0; j < 5; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.println("*");
			}
		}
		
		
		input.close();
	}
}