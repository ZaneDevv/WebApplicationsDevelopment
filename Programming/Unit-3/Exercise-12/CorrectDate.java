import java.util.Scanner;

public class CorrectDate
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte day = 0;
		byte month = 0;
		int year = 0;
		
		boolean isLeapYear = false;
		boolean isMonthCorrect = false;
		boolean isDayCorrect = false;
		
		
		// Setting the date
		
		System.out.print("Day: ");
		day = input.nextByte();
		
		System.out.print("Month: ");
		month = input.nextByte();
		
		System.out.print("Year: ");
		year = input.nextInt();
		
		
		// Checking if the date is correct
		
		isLeapYear = (year % 4 == 0 && year % 100 > 0) || year % 400 == 0;
		isMonthCorrect = month >= 1 && month <= 12;
		isDayCorrect = day > 0 && (day <= (month == 2 ? (isLeapYear ? 29 : 28) : (month % 2 == 0 ? 30 : 31)));
		
		if (isMonthCorrect && isDayCorrect)
		{
			System.out.println("This date is correct!");
		}
		else
		{
			System.out.println("The date is actually not correct.");
		}
	}
}