import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class MultiplicationTable
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0.0;
		
		
		// Setting the number to display the multiplication table
		
		System.out.print("Which number do you want the multiplication table of? ");
		x = input.nextDouble();
		
		
		// Displaying the selected number's multiplication table
		
		for (byte i = 1; i <= 10; i++)
		{
			System.out.printf("%.2f x %d = %.2f\n", x, i, x * i);
		}
		
		
		input.close();
	}
}