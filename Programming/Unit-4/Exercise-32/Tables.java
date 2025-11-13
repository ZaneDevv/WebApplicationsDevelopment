/**
 * @version 1.0
 * @date 2025/11/13
 * @author Álvaro Fernández Barrero
 */

public class Tables
{
	public static void main(String[] args)
	{
		// Defining variables

		int[][] table = new int[3][6];


		// Setting values to the matrix

		table[0][0] = 0;
		table[1][0] = 75;
		table[0][1] = 30;
		table[0][2] = 2;
		table[2][2] = -2;
		table[2][3] = 9;
		table[1][4] = 0;
		table[0][5] = 5;
		table[2][5] = 11;


		// Printing table

		try
		{
			printMatrix(table);
		}
		catch (Exception exception)
		{
			System.out.print(exception.getMessage());
		}
	}



	/**
	 * @brief Prints the given numerical matrix
	 * @param matrix Matrix to print
	 * @throws Exception The matrix is empty
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/13
	 * @author Álvaro Fernández Barrero
	 */
	private static void printMatrix(int[][] matrix) throws Exception
	{
		if (matrix.length == 0)
		{
			throw new Exception("Empty matrix! It cannot be printed...");
		}


		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.printf("  %2d  |", matrix[i][j]);
			}

			System.out.print("\n");
		}
	}
}