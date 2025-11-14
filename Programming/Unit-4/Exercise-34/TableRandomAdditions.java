import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class TableRandomAdditions
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		double[][] table = new double[6][5];


		// Setting numbers

		for (int i = 0; i < table.length - 1; i++)
		{
			for (int j = 0; j < table[0].length - 1; j++)
			{
				table[i][j] = 100 + Math.random() * 900;
			}
		}


		// Adding rows up

		for (int i = 0; i < table.length - 1; i++)
		{
			double rowResult = 0;

			for (int j = 0; j < table[0].length - 1; j++)
			{
				rowResult += table[i][j];
			}

			table[i][table[0].length - 1] = rowResult;
		}


		// Adding columns up

		for (int i = 0; i < table[0].length; i++)
		{
			double columnResult = 0;

			for (int j = 0; j < table.length - 1; j++)
			{
				columnResult += table[j][i];
			}

			table[table.length - 1][i] = columnResult;
		}


		// Printing table

		System.out.print("\n");
		printMatrix(table);

		input.close();
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