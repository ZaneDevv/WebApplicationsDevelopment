/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class NumberSquaresCubes
{
	public static void main(String[] args)
	{
		// Defining variables
		
		int[] numbers = new int[20];
		int[] squares = new int[20];
		int[] cubes = new int[20];
		
		
		// Setting values to array
		
		for (int i = 0; i < numbers.length; i++)
		{
			int number = randomNumber();
			int squared = number * number;
			int cube = squared * number;
			
			numbers[i] = number;
			squares[i] = squared;
			cubes[i] = cube;
		}
		
		
		// Printing result
		
		System.out.printf(" i | number  | squared | cube\n--------------------------------\n");
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%2d | %07d | %07d | %07d\n", i, numbers[i], squares[i], cubes[i]);
		}
	}
	
	
	
	/**
	 * @brief Computes a random number between 0 and 100
	 * @return A random number between 0 and 100
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/10
	 * @author Álvaro Fernández Barrero
	 */
	private static int randomNumber()
	{
		return (int)(Math.random() * 101);
	}
}