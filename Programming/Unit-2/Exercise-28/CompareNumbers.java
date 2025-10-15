import java.util.Scanner;

public class CompareNumbers
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double x = 0.0;
		double y = 0.0;
		
		
		// Setting values
		
		System.out.print("Give me a number: " + ANSI_CYAN);
		x = input.nextDouble();
		System.out.print(ANSI_RESET);
		
		System.out.print("Give me another one: " + ANSI_CYAN);
		y = input.nextDouble();
		System.out.print(ANSI_RESET);
		
		
		// Comparing numbers
		
		System.out.printf("%.2f == %.2f: %b\n", x, y, x == y);
		System.out.printf("%.2f != %.2f: %b\n", x, y, x != y);
		System.out.printf("%.2f < %.2f:  %b\n", x, y, x < y);
		System.out.printf("%.2f > %.2f:  %b\n", x, y, x > y);
		System.out.printf("%.2f <= %.2f: %b\n", x, y, x <= y);
		System.out.printf("%.2f >= %.2f: %b\n", x, y, x >= y);
	}
}