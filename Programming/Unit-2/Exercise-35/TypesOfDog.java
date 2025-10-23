import java.util.Scanner;

public class TypesOfDog
{
	private enum DogType
	{
		Mastiff,
		Terrier,
		Bulldog,
		Pekingese,
		Poodle,
		Greyhound
	}


	public static void main(String[] args)
	{
		// Defining variables
		
		DogType dog1 = DogType.Mastiff;
		DogType dog2 = DogType.Poodle;
		
		int ordinal1 = dog1.ordinal();
		int ordinal2 = dog2.ordinal();
		
		
		// Printing data
		
		System.out.printf("Position dog 1: %d\n", ordinal1);
		System.out.printf("Position dog 2: %d\n", ordinal2);
		System.out.print(dog1 == dog2 ? "They\'re the same dog." : "They\'re different types of dog.");
	}
}