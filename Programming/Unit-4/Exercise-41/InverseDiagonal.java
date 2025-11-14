/**
 * @version 1.0
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class InverseDiagonal
{
	public static void main(String[] args)
	{
		// Defining variables

		double[][] numbers = new double[9][9];
		double[] diagonal = new double[9];

		double greatest = Double.MIN_VALUE;
		double lowest = Double.MAX_VALUE;

		double avarage = 0;	
		double totalSum = 0;
		int diagonalAmount = 0;


		// Setting numbers

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[0].length; j++)
			{
				numbers[i][j] = 500 + Math.random() * 401;
			}
		}


		// Getting umbers in diagonal

		for (int i = 0; i < numbers.length; i++)
		{
			double number = numbers[numbers.length - i - 1][i];
			diagonal[i] = number;


			// Obtaining greatest and lowest
			
			if (greatest < number)
			{
				greatest = number;
			} 

			if (lowest > number)
			{
				lowest = number;
			}

			// Adding to the sum

			totalSum += number;
			diagonalAmount++;
		}


		// Computing avarage

		avarage = totalSum / diagonalAmount;



		// Printing result

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[0].length; j++)
			{
				System.out.printf("  %3.2f  ", numbers[i][j]);
			}

			System.out.print("\n");
		}


		System.out.printf("\n\nNumbers in diagonal: ");
		for (int i = 0; i < diagonal.length; i++)
		{
			System.out.printf("%.2f", diagonal[i]);

			if (i < diagonal.length - 1)
			{
				System.out.print(", ");
			}
		}

		System.out.printf("\n\nTotal sum: %.2f\nAvarage: %.2f\n\n", totalSum, avarage);
		System.out.printf("Greatest: %.2f\nLowest: %.2f\n\n", greatest, lowest);
		System.out.printf("Left-down: %.2f\nRight-up: %.2f\n\n", diagonal[0], diagonal[diagonal.length - 1]);
	}
}