import java.util.Scanner;

public class Roots
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double index = 0;
		double x = 0;
		double result = 0;
		
		
		// Setting the index and x for the root operations
		
		System.out.print("Set the root index: ");
		
		index = input.nextDouble();
		index = Math.max(0.0, index);
		
		System.out.print("Set x: ");
		x = input.nextDouble();
		
		
		// Computing the root
		
		result = Math.pow(x, 1 / index);
		System.out.printf("The operation of the root with index %.3f of %.3f is %.3f.", index, x, result);
	}
}