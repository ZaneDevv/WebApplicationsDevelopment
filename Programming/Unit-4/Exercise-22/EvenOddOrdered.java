/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class EvenOddOrdered
{
	public static void main(String[] args)
	{
		// Defining variables
		
		int evenNumbersIndex = 0;
		int oddNumbersIndex = 0;
		
		int[] evenNumbers = new int[20];
		int[] oddNumbers = new int[20];
		int[] numbers = new int[20];
		
		
		// Setting even and odd numbers
		
		for (int i = 0; i < numbers.length; i++)
		{
			int number = (int)(Math.random() * 21);
			
			if ((number & 1) == 0)
			{
				evenNumbers[evenNumbersIndex++] = number;
			}
			else
			{
				oddNumbers[oddNumbersIndex++] = number;
			}
		}
		
		
		// Setting numbers
		
		for (int i = 0; i < evenNumbersIndex; i++)
		{
			numbers[i] = evenNumbers[i];
		}
		
		for (int i = 0; i < oddNumbersIndex; i++)
		{
			numbers[i + evenNumbersIndex] = oddNumbers[i];
		}
		
		
		// Printing result
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%2d: %d\n", i, numbers[i]);
		}
	}
}
