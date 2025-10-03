import java.util.Scanner;
import java.util.Arrays;

/**
	This program converts the given binary numbers into its equivalent in decimal, printing all the results of this convertion.
	In case any of the given parameters is not detected as a binary number, the result will show this issue directly.
	
	@date 2025/10/03
	@author Álvaro Fernández Barrero
*/

public class BinaryConversion
{
	private static final String NO_BINARY_ERROR = "This number was not binary!";
	private static final int ASCII_ZERO_NUMBER = (int)'0';


	/**
	* Checks if a number is between another two numbers.
	* @param Number to check in the interval.
	* @param Minimum number in the interval.
	* @param Maximum number in the interval.
	* @return True if the given number is in the given interval, false otherwise.
	* @author Álvaro Fernández Barrero
	*/
	private static boolean isNumberInInterval(byte x, byte min, byte max)
	{
		return x >= min && x <= max;
	}


	/**
	* Obtains number from a specified character.
	* @param Character to convert into a number.
	* @return the given number in a character as an actual number.
	* @author Álvaro Fernández Barrero
	*/
	private static byte getNumberFromCharacter(char character)
	{
		return (byte)((int)character - ASCII_ZERO_NUMBER);
	}


	/**
	* Computes the decimal value from a binary number written in a string.
	* @param The string with the binary number.
	* @return The given binary number in decimal.
	* @author Álvaro Fernández Barrero
	*/
	private static int getDecimalNumberFromBinaryString(String binaryNumber)
	{
		char[] digits = binaryNumber.toCharArray();
		int decimalResult = 0;
		
		for (byte i = 0; i < digits.length; i++)
		{
			byte number = getNumberFromCharacter(digits[i]);
			if (!isNumberInInterval(number, (byte)0, (byte)1))
			{
				decimalResult = -1;
				break;
			}
			
			decimalResult += number * Math.pow(2, digits.length - i - 1);
		}
		
		return decimalResult;
	}


	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("You have not set any binary number to convert!");
			return;
		}
		
		for (byte i = 0; i < args.length; i++)
		{
			String binaryNumber = args[i];
			int decimalResult = getDecimalNumberFromBinaryString(binaryNumber);
			
			System.out.println(" " + (i + 1) + ") " + binaryNumber + (decimalResult < 0 ? ". " + NO_BINARY_ERROR : " = " + decimalResult));
		}
	}
}