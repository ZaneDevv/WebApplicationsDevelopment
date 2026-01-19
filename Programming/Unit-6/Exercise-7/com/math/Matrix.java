package com.math;

import com.math.Number;
import com.structures.Pair;
import java.util.ArrayList;


/**
 * @version 1.12
 * @author Álvaro Fernández Barrero
 */

public class Matrix
{
    /**
     * Prints the given matrix
     * @param matrix Matrix to print
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static void print(int[][] matrix)
    {
        int maximumDigits = (int)Number.getDigits(Matrix.getMaximumValueFromMatrix(matrix));
        String format = "| %" + maximumDigits + "d ";

        for (int i = 0; i < matrix.length; i++)
        {
            int[] currentRow = matrix[i];

            for (int j = 0; j < currentRow.length; j++)
            {
                System.out.printf(format, currentRow[j]);
            }

            System.out.print("|\n");
        }
    }


    /**
     * Prints the diagonal of the given matrix
     * @param matrix Matrix to print the diagonal
     * @throws exception The given matrix is not square
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static void printDiagonal(int[][] matrix) throws Exception
    {
        int length = matrix.length;

        if (length != matrix[0].length)
        {
            throw new Exception("Cannot print the diagonal for a non-square matrix!");
        }

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print(matrix[i][i]);

            if (i < length - 1)
            {
                System.out.print(", ");
            }
        }
    }


    /**
     * Obtains the greatest value form a integer matrix
     * @param matrix Matrix to obtain the integer from
     * @return The maximum value from the given matrix
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static int getMaximumValueFromMatrix(int[][] matrix)
    {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++)
        {
            int[] currentRow = matrix[i];

            for (int j = 0; j < currentRow.length; j++)
            {
                int currentValue = currentRow[j];

                if (currentValue > maximum)
                {
                    maximum = currentValue;
                }
            }
        }

        return maximum;
    }


    /**
     * Adds up all the integers from the given matrix
     * @param matrix Matrix to obtain the numbers to add up from
     * @return The result of the summation of all the numbers from the given matrix
     * @version 1.0
     * @since 1.2
     * @author Álvaro Fernández Barrero
     */
    public static long addUp(int[][] matrix)
    {
        long result = 0L;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                result += matrix[i][j];
            }
        }

        return result;
    }
    
    
    /**
     * Computes the avarage of all the integers from the given matrix
     * @param matrix Matrix to obtain the numbers to compute the avarage from
     * @return The result of the avarage of all the numbers from the given matrix
     * @version 1.1
     * @since 1.2
     * @author Álvaro Fernández Barrero
     */
    public static float computeAvarage(int[][] matrix)
    {
        long result = 0L;
        int numbersAmount = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                result += matrix[i][j];
                numbersAmount++;
            }
        }

        return result / (float)numbersAmount;
    }


    /**
     * Transposes the given matrix
     * @param matrix The matrix to transpose
     * @return The given matrix transposed
     * @version 1.0
     * @since 1.5
     * @author Álvaro Fernández Barrero
     */
    public static int[][] transpose(int[][] matrix)
    {
        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }


    /**
     * Adds up all the numbers in the given matrix's border
     * @param matrix Matrix to obtain the numbers to add up from
     * @return The addition of all the numbers in the perimeter of the given matrix
     * @version 1.7
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static long addUpBorders(int[][] matrix)
    {
        long result = 0L;

        int rowAmount = matrix.length;
        int columnsAmount = matrix[0].length;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                boolean isBorderRow = i == 0 || i == rowAmount - 1;
                boolean isBorderColumn = j == 0 || j == columnsAmount - 1;

                if (isBorderColumn || isBorderRow)
                {
                    result += matrix[i][j];
                }
            }
        }

        return result;
    }


    /**
     * Checks all the positions in the given matrix for the given value
     * @param x Value to check the position in the given matrix
     * @param matrix Matrix to look for the given value
     * @return All the coordinates in the matrix where the given value is shown up
     * @version 2.1
     * @since 1.10
     * @author Álvaro Fernández Barrero
    */
    public static ArrayList<Pair<Integer, Integer>> lookForNumber(int x, int[][] matrix)
    {
        ArrayList<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == x)
                {
                    coordinates.add(new Pair<Integer, Integer>(i + 1, j + 1));
                }
            }
        }

        return coordinates;
    }


    /**
     * Multiplies the given two matrices
     * @param matrix0 First matrix to multiply
     * @param matrix1 Second matrix to multiply
     * @return The result of the two given matrices multiplied
     * @throws Exception The given two matrices cannot be multiplied
     * @version 1.2
     * @since 1.8
     * @author Álvaro Fernández Barrero
     */
    public static int[][] multiply(int[][] matrix0, int[][] matrix1) throws Exception
    {
        if (!Matrix.canBeMultiplied(matrix0, matrix1))
        {
            throw new Exception("The given two matrices cannot be multiplied!");
        }

        int[][] result = new int[matrix0[0].length][matrix1.length];

        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[i].length; j++)
            {
                int element = 0;

                for (int mu = 0; mu < matrix1.length; mu++)
                {
                    element += matrix0[mu][i] * matrix1[j][mu];
                }

                result[i][j] = element;
            }
        }

        return result;
    }


    /**
     * Checks if the given two matrices can be multiplied
     * @param matrix0 First matrix in the multiplication
     * @param matrix1 Second matrix in the multiplication
     * @return True if the two matrices can be multiplied, false otherwise
     * @version 1.0
     * @since 1.8
     * @author Álvaro Fernández Barrero
     */
    public static boolean canBeMultiplied(int[][] matrix0, int[][] matrix1)
    {
        return matrix0.length == matrix1[0].length;
    }


    /**
     * Checks if the given matrix is square
     * @param matrix Matrix to check
     * @return True if the given matrix is square, false otherwise
     * @version 1.0
     * @since 1.9
     * @author Álvaro Fernández Barrero
     */
    public static boolean isSquare(int[][] matrix)
    {
        return matrix.length == matrix[0].length;
    }


    /**
     * Checks if the given matrix is the identity
     * @param matrix Matrix to check wether it is an identity matrix
     * @return True if the given matrix is a identity matrix, false otherwise
     * @version 1.0.1
     * @since 1.9
     * @author Álvaro Fernández Barrero
     */
    public static boolean isIdentity(int[][] matrix)
    {
        if (!Matrix.isSquare(matrix))
        {
            return false;
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                boolean isDiagonal = i == j;

                if (isDiagonal && matrix[i][j] != 1)
                {
                    return false;
                }

                if (!isDiagonal && matrix[i][j] != 0)
                {
                    return false;
                }
            }
        }

        return true;
    }


    /**
     * Rotates clock-wise the given matrix
     * @param matrix Matrix to rotate
     * @return The matrix rotated
     * @since 1.11
     * @version 1.2
     * @author Álvaro Fernández Barrero
     */
    public static int[][] rotateMatrix90deg(int[][] matrix)
    {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }


    /**
     * Checks if the given matrix is a square matrix. A square matrix is a matrix which when all the diagonals, columns and rows are added up, all the results are the same
     * @param matrix Matrix to check
     * @return True if the given matrix is a magic square, false otherwise
     * @version 1.0
     * @since 1.11
     * @author Álvaro Fernández Barrero
     */
    public static boolean isMagicSquare(int[][] matrix)
    {
        if (!Matrix.isSquare(matrix))
        {
            return false;
        }

        long diagonalSummation0 = 0L;
        long diagonalSummation1 = 0L;

        long rowSummation0 = 0L;
        long rowSummation1 = 0L;

        long columnSummation0 = 0L;
        long columnSummation1 = 0L;


        // Computing diagonals

        for (int i = 0; i < matrix.length; i++)
        {
            diagonalSummation0 += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++)
        {
            diagonalSummation1 += matrix[matrix.length - 1 - i][i];
        }

        if (diagonalSummation0 != diagonalSummation1)
        {
            System.out.println("FLASEEEEEE 0");
            return false;
        }


        // Computing rows

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                rowSummation1 += matrix[i][j];
            }

            if (i == 0)
            {
                rowSummation0 = rowSummation1;
                rowSummation1 = 0L;
            }
            else
            {
                if (rowSummation0 != rowSummation1)
                {
                    return false;
                }
            }
        }


        // Computing columns

        for (int i = 0; i < matrix[0].length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                columnSummation1 += matrix[j][i];
            }

            if (i == 0)
            {
                columnSummation0 = columnSummation1;
                columnSummation1 = 0L;
            }
            else
            {
                if (columnSummation0 != columnSummation1)
                {
                    return false;
                }
            }
        }

        return diagonalSummation0 == rowSummation0 && rowSummation0 == columnSummation0;
    }
}