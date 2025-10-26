import java.util.Scanner;

/**
 * @date 25/10/21
 * @author Álvaro Fernández Barrero
 */

public class NextDay
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte day = 0;
		
		
		do
		{
			// Setting the day index
			
			System.out.print("Write the number in the week the day you are thinking of corresponds to: ");
			day = input.nextByte();
			
			
			// Giving the next day
			
			switch(day)
			{
				case 1 -> System.out.println("The next day is Tuesday");
				case 2 -> System.out.println("The next day is Wednesday");
				case 3 -> System.out.println("The next day is Thursday");
				case 4 -> System.out.println("The next day is Friday");
				case 5 -> System.out.println("The next day is Saturday");
				case 6 -> System.out.println("The next day is Sunday");
				case 7 -> System.out.println("The next day is Monday");
				default -> System.out.println("This number does not correspond to a day!");
			}
			
		} while(day > 1 && day < 7);
		
		
		input.close();
	}
}