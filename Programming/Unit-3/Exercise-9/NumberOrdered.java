import java.util.Scanner;

public class NumberOrdered
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		double greatest = 0;
		double middle = 0;
		double lowest = 0;
		
		
		// Setting the numbers
		
		System.out.print("First number: ");
		a = input.nextDouble();
		
		System.out.print("Second number: ");
		b = input.nextDouble();
		
		System.out.print("Third number: ");
		c = input.nextDouble();
		
		
		// Order numbers
		
		if (a > b && a > c)
		{
			greatest = a;
		}
		else if (b > a && b > c)
		{
			greatest = b;
		}
		else
		{
			greatest = c;
		}
		
		if (a < b && a < c)
		{
			lowest = a;
		}
		else if (b < a && b < c)
		{
			lowest = b;
		}
		else
		{
			lowest = c;
		}
		
		if ((lowest == a || greatest == a) && (lowest == b || greatest == b))
		{
			middle = c;
		}
		else if ((lowest == c || greatest == c) && (lowest == b || greatest == b))
		{
			middle = a;
		}
		else
		{
			middle = b;
		}
		
		
		// Printing result
		
		System.out.printf("%.3f, %.3f, %.3f", greatest, middle, lowest);
	}
}