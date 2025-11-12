import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @auhot Álvaro Fernández Barrero
 */

public class HighlightMultiples
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[20];
		byte multiplies = 0;
		
		
		// Setting numbers to the array
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 401);
		}
		
		
		// Printing array
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]);
			
			if (i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		
		// Asking what to remark
		
		System.out.print("\n\nWhich multiplies do you want to remark?\n[1 - Multiples of 3\t/\t2 - Multiples of 5]\n");
		multiplies = (byte)(input.nextByte() == 1 ? 3 : 5);
		
		
		// Printing array with remarked numbers
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] % multiplies == 0)
			{
				System.out.printf("**%d**", numbers[i]);
			}
			else
			{
				System.out.print(numbers[i]);
			}
			
			if (i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
		
		
		input.close();
	}
}