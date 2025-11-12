import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class PrimesOrder
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int[] numbersArray = new int[10];
		byte primeNumbersAmount = 0;
		
		
		// Setting numbers
		
		for (int i = 0; i < numbersArray.length; i++)
		{
			System.out.printf("Set a number (%d/%d): ", i + 1, numbersArray.length);
			numbersArray[i] = input.nextInt();
		}
		
		
		// Printing the set array
		
		System.out.print("\n\nOriginal table:\n");
		printArray(numbersArray);
		
		
		// Ordering array by checking if each number is prime
		
		for (int i = 0; i < numbersArray.length; i++)
		{
			int number = numbersArray[i];
			
			if (!isPrime(number))
			{
				System.out.println(number);
				continue;
			}
			
			for (int j = i; j > primeNumbersAmount; j--)
			{
				numbersArray[j] = numbersArray[j - 1];
			}
			numbersArray[primeNumbersAmount] = number;
			
			primeNumbersAmount++;
		}
		
		
		// Printing the previos array but ordered (primes go first)
		
		System.out.print("\n\nOrdered table:\n");
		printArray(numbersArray);
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Prints the given array with a table form
	 * @param array The array to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/12
	 * @author Álvaro Fernández Barrero
	 */
	private static void printArray(int[] array)
	{
		System.out.print("\nIndex|");
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("  %2d  |", i);
		}
		
		System.out.print("\n----------------------------------------------------------------------------\nValue|");
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("  %2d  |", array[i]);
		}
		
		System.out.print("\n");
	}
	
	
	
	/**
	 * @brief Checks whether the given number is prime or not
	 * @param x Number to check whether it is prime or not
	 * @return True if the given number is prime, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/12
	 * @author Álvaro Fernández Barreroif
	 */
	private static boolean isPrime(int x)
	{
		// If the number is even, it is not prime
		
		if ((x & 1) == 0)
		{
			return false;
		}
		
		
		// If the number is odd, it could be prime
		
		x = Math.abs(x);
		
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}