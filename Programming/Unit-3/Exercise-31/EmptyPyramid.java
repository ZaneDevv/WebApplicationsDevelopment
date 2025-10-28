import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class EmptyPyramid
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
			int jIterations = i * 2 - 1;
		
			boolean isInGround = i == height - 1;
			
			for (int j = 0; j < height - i; j++)
			{
				System.out.print(" ");
			}
				
			for (int j = 0; j < jIterations; j++)
			{
				boolean isInEdge = j == 0 || j == jIterations - 1;
				System.out.print((isInEdge || isInGround) ? character : " ");
			}
			
			System.out.print("\n");
		}
		
		
		input.close();
	}
}