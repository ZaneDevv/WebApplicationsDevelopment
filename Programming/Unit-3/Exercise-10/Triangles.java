import java.util.Scanner;

public class Triangles
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double length1 = 0;
		double length2 = 0;
		double length3 = 0;
		

		// Setting the values for each length in the triangle
		
		System.out.print("First length: ");
		length1 = input.nextDouble();
		
		System.out.print("Second length: ");
		length2 = input.nextDouble();
		
		System.out.print("Third length: ");
		length3 = input.nextDouble();
		
		
		// Checking what kind of triangle corresponds to the given lengths
		
		if (length1 == length2 && length2 == length3)
		{
			System.out.println("This is an equilaterial triangle.");
		}
		else if (length1 == length2 || length2 == length3 || length1 == length3)
		{
			System.out.println("This is an isosceles triangle.");
		}
		else if (
			length1 * length1 + length2 * length2 == length3 * length3 ||
			length3 * length3 + length2 * length2 == length1 * length1 ||
			length1 * length1 + length3 * length3 == length2 * length2
		)
		{
			System.out.println("This is a right triangle.");
		}
		else
		{
			System.out.println("This is a scalene triangle.");
		}
	}
}