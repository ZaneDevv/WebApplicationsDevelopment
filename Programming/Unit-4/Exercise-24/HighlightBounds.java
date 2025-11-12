import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class HighlightBounds
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		boolean highlightingGreatest = false;
		
		int greatestNumber = Integer.MIN_VALUE;
		int greatestNumberIndex = 0;
		
		int lowestNumber = Integer.MAX_VALUE;
		int lowestNumberIndex = 0;
		
		int[] numbers = new int[100];
		
		
		// Setting numbers to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			int number = obtainNumber();
			numbers[i] = number;
			
			
			// Saving the greatest number
			
			if (number > greatestNumber)
			{
				greatestNumber = number;
				greatestNumberIndex = i;
			}
			
			
			// Saving the lowest number
			
			if (number < lowestNumber)
			{
				lowestNumber = number;
				lowestNumberIndex = i;
			}
			
			
			// Printing array
			
			System.out.print(number);
			
			if (i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		
		// Asking the user for highlighting the lowest and greatest number
		
		System.out.print("\n\n\nWould you like to highlighting the greatest or the lowest value?\n[0 - lowest, 1 - greatest]\n");
		highlightingGreatest = input.nextInt() == 1;
		System.out.print("\n\n");
		
		
		// Highlighting the specified number
		
		for (int i = 0; i < numbers.length; i++)
		{
			boolean highlight = i == (highlightingGreatest ? greatestNumberIndex : lowestNumberIndex);
			int number = numbers[i];
			
			
			if (highlight)
			{
				System.out.printf("**%d**", number);
			}
			else
			{
				System.out.print(number);
			}
			
			if (i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Obtains a random number between 0 and 500
	 * @return A random number [0, 500]
	 * @since 1.0
	 * @version 1.0
	 * @author Álvaro Fernández Barrero
	 */
	private static int obtainNumber()
	{
		return (int)(Math.random() * 501);
	}
}