import java.util.Scanner;

/**
 * Testing RNG class
 *
 * @version 1.3
 * @date 25/11/17
 * @author Álvaro Fernández Barrero
 */

public class RNGTester
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		RNG RandomNumber = new RNG();
		
		double min = 0;
		double max = 0;
		
		
		// Setting limits
		
		System.out.print("Set the limits.\nMin: ");
		min = input.nextDouble();
		
		System.out.print("Max: ");
		max = input.nextDouble();
		
		System.out.print("\n\n");
		
		
		// Testing
		
		for (int i = 0; i < 100; i++)
		{
			System.out.printf("Byte: %d\n", RandomNumber.nextByte((byte)min, (byte)max));
			System.out.printf("Short: %d\n", RandomNumber.nextShort((short)min, (short)max));
			System.out.printf("Int: %d\n", RandomNumber.nextInt((int)min, (int)max));
			System.out.printf("Long: %d\n", RandomNumber.nextLong((long)min, (long)max));
			System.out.printf("Float: %f\n", RandomNumber.nextFloat((float)min, (float)max));
			System.out.printf("Double: %f\n", RandomNumber.nextDouble(min, max));
			System.out.printf("Bool: %b\n", RandomNumber.nextBoolean());
			System.out.print("\n");
		}
		
		input.close();
	}
}