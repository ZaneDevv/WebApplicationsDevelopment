/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */
 
 public class StringBuilderMethods
 {
	public static void main(String[] args)
	{
		// Defining variables
		
		StringBuilder string1 = new StringBuilder("Esto es un String");
		StringBuilder string2 = new StringBuilder("Y esto también");
		
		String concatenated1 = string1.toString() + string2.toString();
		String concatenated2 = concatenated1;
		
		boolean areFirstEqual = string1.toString().equals(string2.toString());
		boolean areConcatenaredEqual = concatenated1.equals(concatenated2);
		
		int string1Length = string1.length();
		int string2Length = string2.length();
		int concatenated1Length = concatenated1.length();
		int concatenated2Length = concatenated2.length();
		
		
		// Modifing strings
		
		string2.append(string1);
		string1.replace(0, 4, "This");
		
		
		// Printing result
		
		System.out.printf("First string:\n%s\n\nSecond string:\n%s\n", string1, string2);
		System.out.println("-------------------------------------------------");
		System.out.printf("They are equal: %b\n", areFirstEqual);
		System.out.printf("Their concatenations are equal: %b\n", areConcatenaredEqual);
		System.out.printf("\nFirst string length: %d\nSecond string length: %d\n", string1Length, string2Length);
		System.out.printf("First concatenated string length: %d\nSecond concatenatedstring length: %d\n", concatenated1Length, concatenated2Length);
	}
 }