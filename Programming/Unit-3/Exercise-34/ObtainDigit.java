import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class ObtainDigit
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int y = 0;
		int x = 0;
		
		int digit = 0;
		int digitsAmount = 0;
		int digitPosition = 0;
		
		
		// Setting the value of the number
		
		System.out.print("Number: ");
		y = x = input.nextInt();
		
		
		// Computing the digits amount
		
		if (y >= 10)
		{
			do
			{
				digitsAmount++;
				y /= 10;
				
			} while(y > 10);
			
			digitsAmount++;
		}
		else
		{
			digitsAmount = 1;
		}
		
		
		// Setting the digit from the number to obtain
		
		do
		{
			System.out.print("Which digit do you want to check?\n");
			digitPosition = input.nextInt();
			
		} while(digitPosition <= 0 || digitPosition > digitsAmount);
		
		
		// Computing the given digit from the number
		
		digit = x / (int)Math.pow(10, digitsAmount - digitPosition) % 10;
		
		
		// Printing result
		
		System.out.printf("The digit is %d", digit);
		
		
		input.close();
	}
}