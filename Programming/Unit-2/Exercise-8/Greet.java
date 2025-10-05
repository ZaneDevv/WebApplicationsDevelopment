import java.util.Scanner;

public class Greet
{
	public static void main(String[] args)
	{
		// Defining variables
		Scanner input = new Scanner(System.in);
		String userName = "";
		
		// Greeting
		System.out.println("What\'s your name?");
		userName = input.nextLine();
		
		System.out.printf("Hi, %s!", userName);
	}
}