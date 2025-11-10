import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class SetMark
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String stringMark = "";

		float mark1 = 0;
		float mark2 = 0;
		float mark3 = 0;
		
		byte avarage = 0;
		
		
		// Setting marks
		
		System.out.print("Set mark (1/3): ");
		mark1 = input.nextFloat();
		
		System.out.print("Set mark (2/3): ");
		mark2 = input.nextFloat();
		
		System.out.print("Set mark (3/3): ");
		mark3 = input.nextFloat();
		
		
		// Computing rounded avarage mark
		
		avarage = (byte)Math.round((mark1 + mark2 + mark3) / 3.0f);
		
		
		// Setting string mark
		
		if (avarage >= 9)
		{
			stringMark = "Sobresaliente";
		}
		else if (avarage >= 7)
		{
			stringMark = "Notable";
		}
		else if (avarage == 6)
		{
			stringMark = "Bien";
		}
		else if (avarage == 5)
		{
			stringMark = "Suficiente";
		}
		else
		{
			stringMark = "Suspenso";
		}
		
		
		// Displaying result
		
		System.out.println(stringMark);
		
		
		input.close();
	}
}