import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/19
 * @author Álvaro Fernández Barrero
 */


public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		boolean keepAsking = true;

		byte action = 0;
		double multiplier = 0;

		Matrix matrix1 = new Matrix();
		Matrix matrix2 = new Matrix();



		// Checking action to do

		do
		{
			System.out.print("Which do you want to do?\n 1. Add matrices\n 2. Subtract matrices\n 3. Scalar product\n 0. Exit\n\n");
			action = input.nextByte();

			switch (action)
			{
			case 0:
				keepAsking = false;
				break;

			case 1:
				try
				{
					System.out.print(Matrix.toString(matrix1.add(matrix2)));
				}
				catch (Exception exception)
				{
					System.out.println(exception.getMessage());
				}

				break;

			case 2:
				try
				{
					System.out.print(Matrix.toString(matrix1.subtract(matrix2)));
				}
				catch (Exception exception)
				{
					System.out.println(exception.getMessage());
				}
				break;

			case 3:
				System.out.print("Set a number to multiply: ");
				multiplier = input.nextDouble();

				System.out.print(Matrix.toString(matrix1.scalarProcut(multiplier)));

				break;

			default:
				System.out.println("Invalid operation!");
			}

			System.out.print("\n\n");
		}
		while (keepAsking);


		input.close();	
	}
}