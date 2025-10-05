import java.util.Scanner;

public class SecondsToHoursAndMinutes
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		
		
		// Setting minutes
		
		System.out.print("Set the seconds: ");
		seconds = input.nextInt();
		
		
		// Computing minutes and hours
		
		minutes = (int)(seconds / 60);
		hours = (int)(minutes / 60);
		
		System.out.printf("%d seconds are %d minutes and %d hours.", seconds, minutes, hours);
	}
}