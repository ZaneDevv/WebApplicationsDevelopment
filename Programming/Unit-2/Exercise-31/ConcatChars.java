import java.util.Scanner;

public class ConcatChars
{
	public static void main(String[] agrs)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		char firstChar = 'n';
		char secondChar = 'n';
		char thirdChar = 'n';
		char fourthChar = 'n';
		char fivethChar = 'n';
		
		String result = "";
		
		
		// Setting characters
		
		System.out.print("Set the  first character: ");
		firstChar = input.nextLine().charAt(0);
		
		System.out.print("Set the  second character: ");
		secondChar = input.nextLine().charAt(0);
		
		System.out.print("Set the  third character: ");
		thirdChar = input.nextLine().charAt(0);
		
		System.out.print("Set the  fourth character: ");
		fourthChar = input.nextLine().charAt(0);
		
		System.out.print("Set the  fivethcharacter: ");
		fivethChar = input.nextLine().charAt(0);
		
		
		// Joining characters
		
		result += String.valueOf(firstChar) + String.valueOf(secondChar) + String.valueOf(thirdChar) + String.valueOf(fourthChar) + String.valueOf(fivethChar);
		System.out.printf("You said: \"%s\".", result);
	}
}