import java.util.Scanner;

public class RectanglePerimeter
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double width = 0;
		double height = 0;
		double perimeter = 0;
		
		
		// Setting the rectangle size
		
		System.out.print("Set the rectangle\'s width: ");
		width = input.nextDouble();
		
		System.out.print("Set the rectangle\'s height: ");
		height = input.nextDouble();
		
		
		// Computing perimeter:
		
		perimeter = 2 * (width + height);
		System.out.printf("The rectangle\'s perimeter is %.3f", perimeter);
	}
}