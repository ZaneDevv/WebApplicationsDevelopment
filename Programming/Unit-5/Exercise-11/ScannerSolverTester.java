/**
 * @version 1.0
 * @date 25/11/17
 * @author Álvaro Fernández Barrero
 */

public class ScannerSolverTester
{
	public static void main(String[] args)
	{
		// Testing numbers
		
		System.out.print("TESTING NUMBERS\n\n");
		System.out.println("Write integers:");
		
		byte x1 = ScannerSolver.nextByte();
		short x2 = ScannerSolver.nextShort();
		int x3 = ScannerSolver.nextInt();
		long x4 = ScannerSolver.nextLong();
		
		System.out.println("Now real numbers:");
		
		float x5 = ScannerSolver.nextFloat();
		double x6 = ScannerSolver.nextDouble();
		
		System.out.print("Write a text to introduce the numbers you have written so far: ");
		String introduction = ScannerSolver.nextLine();
		
		System.out.printf("\n%s %d, %d, %d, %d, %.2f, %.2f", introduction, x1, x2, x3, x4, x5, x6);
		
		
		// Testing characters
		
		System.out.print("\n\nTESTING CHAARCTERS\n\nWrite a character: ");
		char character = ScannerSolver.nextChar();
		
		System.out.printf("You set the character %c.", character);
		
		
		// Testing booleans
		
		System.out.print("\n\nTESTING BOOLEANS\n\nWrite a bool: ");
		boolean bool = ScannerSolver.nextBoolean();
		
		System.out.printf("\nYou said %b.", bool);
	}
}