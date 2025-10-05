import java.util.Scanner;

public class Hypotenuse
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double lenght1 = 0;
		double lenght2 = 0;
		double hypotenuse = 0;
		
		
		// Setting lenghts
		
		System.out.print("Set the first lenght: ");
		lenght1 = input.nextDouble();
		
		System.out.print("Set the second lenght: ");
		lenght2 = input.nextDouble();
		
		
		// Computing hypotenuse
		
		hypotenuse = Math.sqrt(lenght1 * lenght1 + lenght2 * lenght2);
		System.out.printf("The hypotenuse\'s lenght is %.3f", hypotenuse);
	}
}