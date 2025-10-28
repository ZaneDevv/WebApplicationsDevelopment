import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class NumericTriangle
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		
		// Setting the amount of rows to display
		
		System.out.print("Triangle\'s height: ");
		n = input.nextInt();
		
		
		// Displaying triangle
		
		for (int i = 1; i <= n; i++)
		{
			int jIterations = i * 2;
			
			for (int j = 0; j < n - i; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= jIterations - 1; j++)
			{
				System.out.print((j > i ? jIterations - j : j) % 10);
			}
			
			System.out.print("\n");
		}
		
		
		input.close();
	}
}