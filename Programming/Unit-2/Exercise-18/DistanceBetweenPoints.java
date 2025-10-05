import java.util.Scanner;

public class DistanceBetweenPoints
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x0 = 0;
		double y0 = 0;
		
		double x1 = 0;
		double y1 = 0;
		
		double distance = 0;
		
		
		// Setting the points
		
		System.out.print("Set the x-coordinate for the first point: ");
		x0 = input.nextDouble();
		
		System.out.print("Set the y-coordinate for the first point: ");
		y0 = input.nextDouble();
		
		System.out.print("Set the x-coordinate for the second point: ");
		x1 = input.nextDouble();
		
		System.out.print("Set the y-coordinate for the second point: ");
		y1 = input.nextDouble();
		
		
		// Computing distance
		
		distance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
		System.out.printf("\nThe distance between these points is %.4f.", distance);
	}
}