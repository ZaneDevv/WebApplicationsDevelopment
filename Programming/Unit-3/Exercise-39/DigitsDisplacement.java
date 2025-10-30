import java.util.Scanner;

/**
 * @date 25/10/30
 * @author Álvaro Fernández Barrero
 */
 
public class DigitsDisplacement
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int y = 0;
		int x = 0;
		int displacedX = 0;
		byte digits = 0;
		
		
		// Setting the number
		
		System.out.print("Set a number: ");
		y = x = input.nextInt();
		
		
		// Displacing digits
		
		if (x < 10)
		{
			displacedX = x;
		}
		else
		{
			// Computing digits amount
			
			while (y >= 10)
			{
				digits++;
				y /= 10;
			}
			digits++;
			
			// Displacing all digits
			
			for (byte i = 0; i < digits; i++)
			{
				byte digit = x / (byte)Math.pow(10, i) % 10;
				displacedX += digit * Math.pow(10, (i == 0) ? digits - 1 : i - 1);
			}
		}
		
		
		 // Printing result
		
		System.out.printf("The result is: %d", displacedX);
		
		
		input.close();
	}
}
