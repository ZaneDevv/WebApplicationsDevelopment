import java.util.Scanner;

public class InvertNumber
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte x = 0;
		byte invertedX = 0;
		byte firstDigit = 0;
		byte secondDigit = 0;
		
		
		// Setting the value of x
		
		System.out.print("Give me a number with only 2 digits: ");
		
		x = input.nextByte();
		x = (x < 10) ? 10 : (x >= 100) ? 99 : x;
		
		
		// Inverting number
		
		firstDigit = (byte)(x / 10);
		secondDigit = (byte)(x % 10);
		invertedX = (byte)(secondDigit * 10 + firstDigit);
		
		System.out.printf("\nThe inverse %d is %d.", x, invertedX);
	}
}