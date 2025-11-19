import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/18
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double c = 0;


		// Testing

		System.out.print("Set the value of a: ");
		a = input.nextDouble();

		System.out.print("Set the value of b: ");
		b = input.nextDouble();

		try
		{
			System.out.printf("ax + b = 0: %.3f\n\n", Equations.solve(a, b));
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}



		System.out.print("Set the value of a: ");
		a = input.nextDouble();

		System.out.print("Set the value of b: ");
		b = input.nextDouble();

		System.out.print("Set the value of c: ");
		c = input.nextDouble();

		try
		{
			double[] results = Equations.solve(a, b, c);

			if (results.length == 2)
			{
				System.out.printf("0x^2 + bx + c = 0: %.3f, %.3f", results[0], results[1]);
			}
			else
			{
				System.out.printf("ax^2 + bx + c = 0: %.3f", results[0]);
			}
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}


		input.close();
	}
}