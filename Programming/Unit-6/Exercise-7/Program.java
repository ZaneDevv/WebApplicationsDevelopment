import com.math.Matrix;
import com.math.Number;
import com.structures.Pair;
import com.print.Colors;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 3.6
 * @author Álvaro Fernández Barrero
 */

public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //---------------------------------------
        // SIMPLE EXERCISES
        //---------------------------------------

        //---------------------------------------
        // First exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "1. FIRST EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix1 = {
            {10, 50, 30},
            {1, 100, 5},
            {300, 200, 100}
        };

        Matrix.print(matrix1);
        System.out.print("\n\n");

        //---------------------------------------
        // Second exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "2. SECOND EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix2 = new int[4][4];
        {
            for (int i = 0; i < matrix2.length; i++)
            {
                for (int j = 0; j < matrix2[i].length; j++)
                {
                    matrix2[i][j] = (int)(Math.random() * 101);
                }
            }
        }

        Matrix.print(matrix2);
        System.out.printf("Addition: %d\n", Matrix.addUp(matrix2));
        System.out.printf("Avarage: %.2f", Matrix.computeAvarage(matrix2));
        System.out.print("\n\n");

        //---------------------------------------
        // Third exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "3. THIRD EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        try
        {
            Matrix.print(matrix3);

            System.out.print("Diagonal: ");
            Matrix.printDiagonal(matrix3);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        System.out.print("\n\n");

        //---------------------------------------
        // INTERMEDIATE EXERCISES
        //---------------------------------------

        //---------------------------------------
        // Fourth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "4. FOURTH EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix4 = {
            {10, 15, 20},
            {1, 50, 20}
        };

        System.out.print("Matrix:\n");
        Matrix.print(matrix4);

        System.out.print("Transposed:\n");
        Matrix.print(Matrix.transpose(matrix4));
        System.out.print("\n\n");

        //---------------------------------------
        // Fifth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "5. FIFTH EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix5 = {
            {1, 1, 1, 1, 1},
            {1, 2, 3, 2, 1},
            {1, 2, 3, 2, 1},
            {1, 2, 3, 2, 1},
            {1, 2, 3, 2, 1}
        };

        System.out.print("Matrix:\n");
        Matrix.print(matrix5);

        System.out.print("Borders addition: ");
        System.out.println(Matrix.addUpBorders(matrix5));
        System.out.print("\n\n");

        //---------------------------------------
        // Sixth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "6. SIXTH EXERCISE:\n" + Colors.ANSI_RESET);

        int numberToLookFor = (int)(Math.random() * 11);
        int[][] matrix6 = new int[5][5];
        {
            for (int i = 0; i < matrix6.length; i++)
            {
                for (int j = 0; j < matrix6[i].length; j++)
                {
                    matrix6[i][j] = (int)(Math.random() * 11);
                }
            }
        }

        System.out.print("Matrix:\n");
        Matrix.print(matrix6);

        System.out.printf("Coordinates for %d:\n", numberToLookFor);
        for (Pair<Integer, Integer> point : Matrix.lookForNumber(numberToLookFor, matrix6))
        {
            System.out.printf("<%d, %d>\n", (int)point.getKey(), (int)point.getValue());
        }

        System.out.print("\n\n");

        //---------------------------------------
        // ADVANCED EXERCISES
        //---------------------------------------

        //---------------------------------------
        // Seventh exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "7. SEVENTH EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix70 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        int[][] matrix71 = {
            {1, 1, 2},
            {3, 5, 8},
            {13, 21, 34}
        };

        System.out.print("Matrix 1:\n");
        Matrix.print(matrix70);

        System.out.print("Matrix 2:\n");
        Matrix.print(matrix71);

        try
        {
            System.out.print("multiplication:\n");
            Matrix.print(Matrix.multiply(matrix70, matrix71));
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

        System.out.print("\n\n");

        //---------------------------------------
        // Eighth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "8. EIGHTH EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix8 = {
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1}
        };

        System.out.print("Matrix:\n");
        Matrix.print(matrix8);

        System.out.printf("Is identity: %b\n", Matrix.isIdentity(matrix8));
        System.out.print("\n\n");

        //---------------------------------------
        // Nineth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "9. NINETH EXERCISE:\n" + Colors.ANSI_RESET);

        int[][] matrix9 = {
            {6, 6, 6, 6},
            {5, 5, 5, 5},
            {4, 4, 4, 4}
        };

        System.out.print("Matrix:\n");
        Matrix.print(matrix9);

        System.out.print("Rotated matrix:\n");
        Matrix.print(Matrix.rotateMatrix90deg(matrix9));
        
        System.out.print("\n\n");

        //---------------------------------------
        // Tenth exercise
        //---------------------------------------

        System.out.print(Colors.ANSI_YELLOW + "10. TENTH EXERCISE:\n" + Colors.ANSI_RESET);
        System.out.print(Colors.ANSI_RED + "THE MAGIC SQUARE!\n" + Colors.ANSI_RESET);

        int rowsAmount = 0;
        int columnsAmount = 0;

        int[][] matrix10;

        
        System.out.print("How many rows do you want? ");
        System.out.print(Colors.ANSI_GREEN);
        rowsAmount = input.nextInt();
        System.out.print(Colors.ANSI_RESET);

        System.out.print("How many columns do you want? ");
        System.out.print(Colors.ANSI_GREEN);
        columnsAmount = input.nextInt();
        System.out.print(Colors.ANSI_RESET);

        matrix10 = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < rowsAmount; i++)
        {
            for (int j = 0; j < columnsAmount; j++)
            {
                System.out.printf("Value for <%d, %d>: ", i + 1, j + 1);
                System.out.print(Colors.ANSI_GREEN);
                matrix10[i][j] = input.nextInt();
                System.out.print(Colors.ANSI_RESET);
            }
        }

        Matrix.print(matrix10);
        System.out.printf("It is magic: %b\n", Matrix.isMagicSquare(matrix10));



        input.close();
    }
}