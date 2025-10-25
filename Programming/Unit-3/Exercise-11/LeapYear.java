import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int year = 0;
		
		
		// Setting the year
		
		System.out.print("Give the year: ");
		year = input.nextInt();
		
		
		// Checking if the given year is a leap year
		
		if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0)
		{
			System.out.println("It is a leap year.");
		}
		else
		{
			System.out.println("It is not a leap year.");
		}
	}
}