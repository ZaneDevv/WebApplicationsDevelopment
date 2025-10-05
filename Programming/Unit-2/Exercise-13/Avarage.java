import java.util.Scanner;

public class Avarage
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double z = 0;
		
		double avarage = 0;
		
		
		// Setting the values for x, y and z
		
		System.out.print("Set the value for x: ");
		x = input.nextDouble();
		
		System.out.print("Set the value for y: ");
		y = input.nextDouble();
		
		System.out.print("Set the value for Z: ");
		z = input.nextDouble();
		
		
		// Computing the avarage number among x, y and z
		
		avarage = (x + y + z) / 3;
		System.out.printf("The avarage number among %.3f, %.3f and %.3f is %.3f", x, y, z, avarage);
	}
}