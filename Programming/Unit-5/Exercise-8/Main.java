import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int integer = 0;
		
		float decimals1 = 0;
		float decimals2 = 0;
		
		double decimals3 = 0;
		
		char character = ' ';
		
		
		// Testing static methods
		
		FirstMethods.nothing();
		
		
		
		System.out.print("\nSet here a number: ");
		integer = input.nextInt();
		
		System.out.printf("%d + 1 = %d", integer, FirstMethods.add1(integer));
		
		
		
		System.out.print("\n\nSet number 1 to add: ");
		decimals1 = input.nextFloat();
		
		System.out.print("Set number 1 to add: ");
		decimals2 = input.nextFloat();
		
		System.out.printf("%.2f + %.2f = %.2f", decimals1, decimals2, FirstMethods.add(decimals1, decimals2));
		
		
		
		System.out.print("\n\nSet square\'s size: ");
		integer = input.nextInt();
		
		FirstMethods.drawSquare(integer);
		
		
		
		System.out.print("\n\nSet a number: ");
		decimals3 = input.nextDouble();
		
		System.out.printf("The sign of %.3f is %d", decimals3, FirstMethods.sign(decimals3));
		
		
		
		System.out.print("\n\nSet a number: ");
		integer = input.nextInt();
		
		System.out.printf("%d! = %d", integer, FirstMethods.factorial(integer));
		
		
		
		System.out.print("\n\nSet a number: ");
		integer = input.nextInt();
		
		System.out.printf("%d is prime: %b", integer, FirstMethods.isPrime(integer));
		
		
		
		System.out.print("\n\nSet a number: ");
		integer = input.nextInt();
		
		System.out.printf("%d is prime or 0: %b", integer, FirstMethods.isPrimeOr0(integer));
		
		
		
		input.nextLine();
		System.out.print("\n\nSet a character: ");
		character = input.nextLine().trim().charAt(0);
		
		System.out.printf("%c is a number: %b", character, FirstMethods.isNumber(character));
		
		
		
		input.close();
	}
}