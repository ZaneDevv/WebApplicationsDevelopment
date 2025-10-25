import java.util.Scanner;

/**
 * @date 25/10/21
 * @author Álvaro Fernández Barrero
 */

public class Greetings
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte hour = 0;
		
		
		// Setting the current hour
		
		System.out.print("What is the current hour? ");
		hour = (byte)(input.nextByte() % 24);
		
		
		// Greeting the user
		
		if (hour >= 6 && hour <= 12)
		{
			System.out.println("Good morning!");
		}
		else if (hour >= 13 && hour <= 20)
		{
			System.out.println("Good evening!");
		}
		else
		{
			System.out.println("Good night!");
		}
		
		
		input.close();
	}
}