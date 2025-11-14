import java.util.Scanner;

/**
 * @version 1.4
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class BoundsInMatrix
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		double[][] numbers = new double[6][10];

		double greatest = Double.MIN_VALUE;
		int[] greatestIndex = {0, 0};

		double lowest = Double.MAX_VALUE;
		int[] lowestIndex = {0, 0};

		double numberToSet = 0;


		// Setting numbers to matrix

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[0].length; j++)
			{
				do
				{
					numberToSet = Math.random() * 1001;
				}
				while (isValueInMatrix(numbers, numberToSet));

				numbers[i][j] = numberToSet;


				// Saving greatest and minimum

				if (greatest < numberToSet)
				{
					greatest = numberToSet;
					greatestIndex[0] = i;
					greatestIndex[1] = j;
				}

				if (lowest > numberToSet)
				{
					lowest = numberToSet;
					lowestIndex[0] = i;
					lowestIndex[1] = j;
				}
			}
		}


		// Printing table and bounds

		printMatrix(numbers);

		System.out.printf("\n\nGreatest value: %.3f\nPosition: %d, %d", greatest, greatestIndex[0] + 1, greatestIndex[1] + 1);
		System.out.printf("\n\nLowest value: %.3f\nPosition: %d, %d", lowest, lowestIndex[0] + 1, lowestIndex[1] + 1);


		input.close();
	}



	/**
	 * @brief Checks if the given value is in the given matrix
	 * @param matrix Matrix to check
	 * @param value Value to check if it is in the given matrix
	 * @return True if the given value is in the given matrix, false otherwise
	 * @since 1.3
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero 
	 */
	private static boolean isValueInMatrix(double[][] matrix, double value)
	{
		// If the matrix has no length, the value cannot be found there

		if (matrix.length == 0)
		{
			return false;
		}


		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; i < matrix[0].length; j++)
			{
				if (matrix[i][j] == value)
				{
					return true;
				}
			}
		}

		return false;
	}



	/**
	 * @brief Prints the given matrix
	 * @param matrix The matrix to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static void printMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.printf("  %7.2f  ", matrix[i][j]);
			}

			System.out.print("\n");
		}
	}
}