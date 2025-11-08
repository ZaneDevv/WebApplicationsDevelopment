/**
 * @version 1.0
 * @date 2025/11/08
 * @author Álvaro Fernández Barrero
 */

public class TestingStringBuilder
{
	public static void main(String[] args)
	{
		// Defining variables
		
		StringBuilder stringBuilder = new StringBuilder("Heeelllo Woldr");
		
		
		// Fixing string
		
		stringBuilder.delete(2, 5); // Hello Woldr
		stringBuilder.replace(8, 11, "rld"); // Hello World 
		stringBuilder.append("!"); // Hello World!
		stringBuilder.insert(5, ","); // Hello, World!
		
		
		// Printing result
		
		System.out.println(stringBuilder);
	}
}