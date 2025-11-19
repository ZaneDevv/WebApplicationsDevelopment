/**
 * @version 1.0
 * @date 2025/11/19
 * @author Álvaro Fernández Barrero
 */

public class Matrix
{
	// Constants

	private final int MIN_VALUE = 0;
	private final int MAX_VALUE = 25;



	// Attributes

	private double[][] matrix;

	private int rowsAmount = 0;
	private int columnsAmount = 0;



	// Constructors

	/**
	 * @brief Creates a new 4x4 matrix with random numbers
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix()
	{
		this.rowsAmount = 4;
		this.columnsAmount = 4;

		this.matrix = new double[columnsAmount][rowsAmount];


		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				matrix[i][j] = this.MIN_VALUE + Math.random() * (this.MAX_VALUE - this.MIN_VALUE - 1);
			}
		}
	}


	/**
	 * @brief Creates a new matrix NxM with random numbers
	 * @param rows The amount of rows in the matrix
	 * @param columns The amount of columns in the matrix
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix(int columns, int rows)
	{
		this.columnsAmount = Math.abs(columns);
		this.rowsAmount = Math.abs(rows);

		this.matrix = new double[this.columnsAmount][this.rowsAmount];


		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				matrix[i][j] = this.MIN_VALUE + Math.random() * (this.MAX_VALUE - this.MIN_VALUE - 1);
			}
		}
	}


	/**
	 * @brief Creates a new matrix object with the given matrix
	 * @param matrix The matrix to create
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix(double[][] matrix)
	{
		this.columnsAmount = matrix.length;
		this.rowsAmount = matrix[0].length;
		this.matrix = matrix;
	}


	/**
	 * @brief Copies the given matrix
	 * @param matrix Matrix to copy
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix(Matrix matrix)
	{
		this.rowsAmount = matrix.getRowsAmount();
		this.columnsAmount = matrix.getColumnsAmount();
		this.matrix = matrix.getMatrix();
	}



	// Methods

	/**
	 * @brief Converts the given matrix to a string
	 * @param matrix Matrix to convert
	 * @return The matrix converted to string
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public static StringBuilder toString(Matrix matrix)
	{
		StringBuilder result = new StringBuilder();

		int rowsAmount = matrix.getRowsAmount();
		int columnsAmount = matrix.getColumnsAmount();

		double[][] actualMatrix = matrix.getMatrix();


		for (int i = 0; i < rowsAmount; i++)
		{
			for (int j = 0; j < columnsAmount; j++)
			{
				result.append(actualMatrix[i][j]);

				if (j < columnsAmount - 1)
				{
					result.append(" ");
				}
			}
			result.append("\n");
		}


		return result;
	}


	/**
	 * @brief Checks if the tow given numbers have the same size
	 * @param matrix1 First matrix to check
	 * @param matrix2 Second matrix to check
	 * @return True if the two given matrices has the same amount of rows and columns, false otherwise
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean hasMatricesSameSize(Matrix matrix1, Matrix matrix2)
	{
		return matrix1.getColumnsAmount() == matrix2.getColumnsAmount() && matrix1.getRowsAmount() == matrix2.getRowsAmount();
	}


	/**
	 * @brief Adds this matrix with the given one
	 * @param other Matrix to add
	 * @return The addition of this matrix and the other
	 * @throws Exception The matrices have no the same amount of rows or columns
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix add(Matrix other) throws Exception 
	{
		if (!Matrix.hasMatricesSameSize(this, other))
		{
			throw new Exception("Cannot add these matrices together! They do not have the same size...");
		}


		double[][] result = new double[this.columnsAmount][this.rowsAmount];
		double[][] otherMatrix = other.getMatrix();

		for (int i = 0; i < this.columnsAmount; i++)
		{
			for (int j = 0; j < this.rowsAmount; j++)
			{
				result[i][j] = this.matrix[i][j] + otherMatrix[i][j];
			}
		}

		return new Matrix(result);
	}


	/**
	 * @brief Subtracts this matrix with the given one
	 * @param other Matrix to subtract
	 * @return The subtraction of this matrix and the other
	 * @throws Exception The matrices have no the same amount of rows or columns
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix subtract(Matrix other) throws Exception
	{
		if (!Matrix.hasMatricesSameSize(this, other))
		{
			throw new Exception("Cannot add these matrices together! They do not have the same size...");
		}


		double[][] result = new double[this.columnsAmount][this.rowsAmount];
		double[][] otherMatrix = other.getMatrix();

		for (int i = 0; i < this.columnsAmount; i++)
		{
			for (int j = 0; j < this.rowsAmount; j++)
			{
				result[i][j] = this.matrix[i][j] - otherMatrix[i][j];
			}
		}

		return new Matrix(result);
	}


	/**
	 * @brief Computes the scalar product of this matrix with the given scalar
	 * @param scalar Scalar to multiply this matrix by
	 * @return The result of the scalar product of this matrix with the given scalar
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Matrix scalarProcut(double scalar)
	{
		double[][] result = new double[this.columnsAmount][this.rowsAmount];

		for (int i = 0; i < this.columnsAmount; i++)
		{
			for (int j = 0; j < this.rowsAmount; j++)
			{
				result[i][j] = scalar * this.matrix[i][j];
			}
		}

		return new Matrix(result);
	}



	// Getters and setters

	/**
	 * @brief Obtains the matrix in form of actual matrix
	 * @return The matrix' matrix
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public double[][] getMatrix()
	{
		return this.matrix;
	}


	/**
	 * @brief Obtains the columns amount
	 * @return The matrix' columns amount
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public int getColumnsAmount()
	{
		return this.columnsAmount;
	}


	/**
	 * @brief Obtains the rows amount
	 * @return The matrix' rows amount
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public int getRowsAmount()
	{
		return this.rowsAmount;
	}
}