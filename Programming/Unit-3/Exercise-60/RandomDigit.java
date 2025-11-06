import java.util.Scanner;

/**
 * @version 1.3
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */

public class RandomDigit
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		byte digit = 0;
		
		
		// Setting values
		
		System.out.print("Set a number: ");
		x = input.nextInt();
		
		
		// Computing a random digit
		
		digit = computeNthDigit(x, (byte)(Math.random() * computeDigitsAmount(x)));
		
		
		// Printing results
		
		System.out.printf("The digit chosen is %d.\n", digit);
		
		input.close();
	}
	
	
	
	/**
	 * @brief Computes the amount of digit the given number has
	 * @param x The number to check the amount of digits
	 * @return The amount of digit the given number has
	 * @since 1.1
	 * @version 1.1
	 * @date 2025/11/06
	 * @author Álvaro Fernández Barrero
	 */
	private static byte computeDigitsAmount(int x)
	{
		byte digitsAmount = 0;
		
		x = Math.abs(x);
	
		while (x > 0)
		{
			digitsAmount++;
			x /= 10;
		}
	
		return digitsAmount;
	}
	
	
	
	/**
	 * @brief Computes the amount of digit the given number has
	 * @param x The number to obtain the digit from
	 * @param digit The digit's number position from left to right
	 * @return The nth digit of the given number
	 * @since 1.2
	 * @version 1.0
	 * @date 2025/11/06
	 * @author Álvaro Fernández Barrero
	 */
	private static byte computeNthDigit(int x, byte digit)
	{
		return (byte)(Math.abs(x) / Math.pow(10, computeDigitsAmount(x) - digit - 1) % 10);
	}
}