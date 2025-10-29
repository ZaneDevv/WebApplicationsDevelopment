/*
	Given a 3-digit number set by the user, compute its inverse.

	@date 25/10/16
	@author Álvaro Fernández Barrero
*/

import java.util.Scanner;

public class InvertNumber
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int invertedNumber = 0;
		
		byte digit1 = 0;
		byte digit2 = 0;
		byte digit3 = 0;
		
		
		// Obtaining number
		
		System.out.print("Give me a 3-digit number: ");
		number = input.nextInt();
		
		number = Math.max(100, Math.min(number, 999));
		
		
		// Computing digits
		
		digit1 = (byte)(number / 100);
		digit2 = (byte)(number % 100 / 10);
		digit3 = (byte)(number % 10);
		
		
		// Computing inverted number
		
		invertedNumber = digit3 * 100 + digit2 * 10 + digit1;
		
		
		// Printing result
		
		System.out.printf("Given %d, the inverted is %d.\n", number, invertedNumber);
	}
}