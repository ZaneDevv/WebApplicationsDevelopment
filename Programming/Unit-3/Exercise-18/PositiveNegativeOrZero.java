import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class PositiveNegativeOrZero
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int numbersAmount = 0;
		
		int zerosAmount = 0;
		int positivesAmount = 0;
		int negativeAmount = 0;
		
		double currentNumber = 0.0;
		
		
		// Defining how many numbers the user wants to set
		
		System.out.print("How many numbers do you want to set? ");
		numbersAmount = input.nextInt();
		
		
		// Checking all numbers
		
		for (int i = 1; i <= numbersAmount; i++)
		{
			System.out.printf("Set the number no. %d: ", i);
			currentNumber = input.nextDouble();
			
			// Checkig if the number set is positive, negative or zerosAmount
			
			if (currentNumber > 0)
			{
				positivesAmount++;
			}
			else if (currentNumber < 0)
			{
				negativeAmount++;
			}
			else
			{
				zerosAmount++;
			}
		}
		
		
		// Printing results
		
		System.out.printf("You said %d positive number(s), %d negative number(s) and %d zero(s).", positivesAmount, negativeAmount, zerosAmount);
		
		input.close();
	}
}