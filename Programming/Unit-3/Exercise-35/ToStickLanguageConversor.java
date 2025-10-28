import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class ToStickLanguageConversor
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		int currentDigit = 0;
		int digitsAmount = 0;
		
		String result = "";
		
		
		// Setting the number to convert
		
		System.out.print("Set a number: ");
		y = x = input.nextInt();
		
		
		// Computing the digits amount
		
		if (y >= 10)
		{
			while (y >= 10)
			{
				digitsAmount++;
				y /= 10;
			}
			
			digitsAmount++;
		}
		else
		{
			digitsAmount++;
		}
		
		
		// Computing the stick language version
		
		for (int i = 1; i <= digitsAmount; i++)
		{
			currentDigit = x / (int)Math.pow(10, digitsAmount - i) % 10;
			
			for (int j = 1; j <= currentDigit; j++)
			{
				System.out.print("|");
			}
			
			if (i < digitsAmount)
			{
				System.out.print("-");
			}
		}
		
		
		input.close();
	}
}