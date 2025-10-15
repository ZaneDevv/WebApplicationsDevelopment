import java.util.Scanner;

public class Circunsference
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double radius = 0.0;
		double circunsference = 0.0;
		
		
		// Setting radius
		
		System.out.print("Set the radius of the circle: ");
		radius = input.nextDouble();
		
		
		// Computing circunsference
		
		circunsference = 2 * Math.PI * radius;
		
		System.out.printf("The circunsference of the circle of radius %.3f is %.3f.", radius, circunsference);
	}
}