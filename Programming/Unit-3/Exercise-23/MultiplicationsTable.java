import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class MultiplicationsTable
{
	// Defining limits
	
	private static final int STARTING_TABLE = 1;
	private static final int LAST_TABLE = 5;
	
	private static final String SEPARATOR = "\t-----------";


	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		
		// Displaying multiplications table
		
		System.out.println(SEPARATOR);
		for (int i = STARTING_TABLE; i <= LAST_TABLE; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.printf("  \t%d x %d = %d\n", i, j, i * j);
			}
			System.out.println(SEPARATOR);
		}
		
		
		input.close();
	}
}