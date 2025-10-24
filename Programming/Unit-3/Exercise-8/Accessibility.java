import java.util.Scanner;

public class Accessibility
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		float mark = 0;
		byte age = 0;
		char genre = 'n';
		
		boolean isAccessible = false;
		
		
		// Setting the mark and age
		
		System.out.print("Mark: ");
		mark = input.nextFloat();
		
		System.out.print("Age: ");
		age = input.nextByte();
		
		System.out.print("Genre [M/F]: ");
		input.nextLine();
		genre = input.nextLine().toUpperCase().charAt(0);
		
		
		// Checking if it is accessible
		
		isAccessible = mark >= 5 && age >= 18;
		
		if (genre == 'M' || genre == 'F')
		{
			if (isAccessible && genre == 'F')
			{
				System.out.println("Accepted");
			}
			else if (isAccessible && genre == 'M')
			{
				System.out.println("Possible");
			}
			else
			{
				System.out.println("No accepted!");
			}
		}
		else
		{
			System.out.println("Unknown genre!");
		}
	}
}