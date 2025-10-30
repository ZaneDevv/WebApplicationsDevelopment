import java.util.Scanner;

/**
 * @date 25/10/30
 * @author Álvaro Fernández Barrero
 */

public class BorweinPiApproximation
{
	// Defining constants
	
	private static final double SQRT_2 = Math.sqrt(2);
	
	private static final int ITERATIONS = 10;
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x_n = SQRT_2;
		double y_n = Math.pow(2, 1 / 4.0);
		double pi_n = 2 + SQRT_2;
		
		double sqrt_x = Math.sqrt(x_n);
		
		
		// Computing pi approximations
		
		for (int i = 0; i < ITERATIONS; i++)
		{
			x_n = 0.5 * (sqrt_x + 1 / sqrt_x);
			sqrt_x = Math.sqrt(x_n);
			pi_n = pi_n * (x_n + 1) / (y_n + 1);
			y_n = (y_n * sqrt_x + 1 / sqrt_x) / (y_n + 1);
			
			// Printing the ith approximation
			
			System.out.printf("%.20f\n", pi_n);
		}
		
		
		input.close();
	}
}