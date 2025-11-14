/**
 * @version 1.0
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class RotateMatrix
{
	public static void main(String[] args)
	{
		// Defining variables

		int[][] matrix = new int[12][12];
		int[][] rotatedMatrix = new int[12][12];


		// Setting values for matrix

		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				matrix[i][j] = (int)(Math.random() * 101);
			}
		}


		// Rotating matrix

		for (int i = 0; i < rotatedMatrix.length; i++)
		{
			for (int j = 0; j < rotatedMatrix[0].length; j++)
			{
				rotatedMatrix[i][j] = matrix[(i + 1) % matrix.length][(j + 1) % matrix[0].length];
			}
		}


		// Printing matrices

		System.out.println("Original matrix:");
		printMatrix(matrix);

		System.out.println("\nRotated matrix:");
		printMatrix(rotatedMatrix);
	}



	/**
	 * @brief Prints the given matrix
	 * @param matrix Matrix to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static void printMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.printf("  %3d  ", matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
}