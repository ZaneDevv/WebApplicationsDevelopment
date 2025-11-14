/**
 * @version 1.0
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class Diagonal
{
	public static void main(String[] args)
	{
		// Deining variables

		double[][] numbers = new double[10][10];

		double greatest = Double.MIN_VALUE;
		double lowest = Double.MAX_VALUE;

		double totalSum = 0;
		double avarage = 0;
		int diagonalAmount = 0;


		// Setting numbers

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[0].length; j++)
			{
				numbers[i][j] = 200 + Math.random() * 101;
			}
		} 


		// Computing diagonal

		for (int i = 0; i < numbers.length; i++)
		{
			double number = numbers[i][i];

			totalSum += number;
			diagonalAmount++;


			if (number > greatest)
			{
				greatest = number;
			}

			if (number < lowest)
			{
				lowest = number;
			}
		}
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

		System.out.printf("\nGreatest: %.2f\nLowest: %.3f\n\n", greatest, lowest);
		System.out.printf("Total sum: %.2f\nAvarage: %.2f\n\n", totalSum, avarage);
		System.out.printf("Left-up: %.2f\nRight-down: %.2f", numbers[0][0], numbers[numbers.length - 1][numbers[0].length - 1]);
	}
}