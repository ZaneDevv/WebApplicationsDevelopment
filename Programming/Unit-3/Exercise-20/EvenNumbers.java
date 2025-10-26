import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class EvenNumbers
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int minimumLimit = 0;
		int maximumLimit = 0;
		
		
		// Setting the limits
		
		System.out.print("Inferior limit: ");
		minimumLimit = input.nextInt();
		
		do
		{
			System.out.print("Superior limit: ");
			maximumLimit = input.nextInt();
		
		} while (maximumLimit <= minimumLimit);
		
		
		// Printing all even numbers between the set minimum and the maximum
		
		for (int i = (minimumLimit % 2 == 0) ? minimumLimit : minimumLimit + 1; i <= maximumLimit; i += 2)
		{
			System.out.println(i);
		}
		
		input.close();
	}
}