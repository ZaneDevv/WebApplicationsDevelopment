import java.util.Scanner;

/**
 * @date 25/10/28
 * @author Álvaro Fernández Barrero
 */

public class NumbersData
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int lastNumberIntroduced = 0;
		
		int numbersAmount = 0;
		int greatestEven = 0;
		
		double avarageOdds = 0;
		int oddsAmount = 0;
		
		
		// Inserting numbers
		
		System.out.println("Insert all numbers you want. When you introduce a negative number, it will stop.");
		
		while (true)
		{
			lastNumberIntroduced = input.nextInt();
			
			// If the set number is negative, stop the loop
			
			if (lastNumberIntroduced < 0)
			{
				break;
			}
			
			numbersAmount++;
			
			if (lastNumberIntroduced % 2 == 0)
			{
				if (greatestEven < lastNumberIntroduced)
				{
					greatestEven = lastNumberIntroduced;
				}
			}
			else
			{
				oddsAmount++;
				avarageOdds += lastNumberIntroduced;
			}
		}
		
		avarageOdds /= (double)oddsAmount;
		
		
		// Printing results
		
		System.out.printf("Amount of set numbers: %d\n", numbersAmount);
		System.out.printf("Greatest even number: %d\n", greatestEven);
		System.out.printf("Avarage of odd numbers: %.2f", avarageOdds);
		
		
		input.close();
	}
}