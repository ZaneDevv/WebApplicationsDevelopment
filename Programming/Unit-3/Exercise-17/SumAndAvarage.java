import java.util.Scanner;

/**
 * @date 25/10/26
 * @author Álvaro Fernández Barrero
 */
 
public class SumAndAvarage
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double lastNumber = 0.0;
		
		int numbersAmount = 0;
		
		double totalSum = 0.0;
		double avarage = 0.0;
		
		
		// Asking for numbers
		
		do
		{
			System.out.print("Set a number: ");
			lastNumber = input.nextDouble();
			
			// Comuting total sum
			
			totalSum += lastNumber;
			numbersAmount++;
		
		} while(lastNumber != 0);
		
		
		// Computing avarage
		
		avarage = totalSum / (numbersAmount - 1);
		
		
		// Printing result
		
		System.out.printf("\n- Total sum: %.3f\n- Avarage: %.3f", totalSum, avarage);
		
		input.close();
	}
}