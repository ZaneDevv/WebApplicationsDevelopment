import java.util.Scanner;

public class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double fahrenheit = 0;
		double celsius = 0;

		
		// Setting the Fahrenheits
		
		System.out.print("Set Fahrenheits: ");
		fahrenheit = input.nextDouble();
		
		
		// Computing celsius
		
		celsius = 5 * (fahrenheit - 32) / 9;
		System.out.printf("%.3f F = %.3f ºC", fahrenheit, celsius);
	}
}