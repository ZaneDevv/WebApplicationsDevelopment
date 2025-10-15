import java.util.Scanner;

public class TypesOfDog
{
	private static enum DogType
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
		DogType dog2 = DogType.Bulldog;
		
		
		// Printing data
		
		System.out.print(dog1 == dog2 ? "They\'re the same dog." : "They\'re different types of dog.");
	}
}