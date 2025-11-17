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
		
		int[] array = ArrayLibrary.createArray(10, 1, 10);
		
		int integer = 0;
		
		
		// Testing
		
		ArrayLibrary.printArray(array);
		
		System.out.printf("\nLowest: %d", ArrayLibrary.getLowestNumber(array));
		System.out.printf("\nGreatest: %d", ArrayLibrary.getGreatestNumber(array));
		System.out.printf("\nAvarage: %d", ArrayLibrary.computeArrayNumbersAvagare(array));
		
		
		
		System.out.print("\nSet a number: ");
		integer = input.nextInt();
		System.out.printf("The number is in the array: %b", ArrayLibrary.isNumberInArray(array, integer));
		System.out.printf("\nThe number is in position: %d", ArrayLibrary.getIndexOfValue(array, integer));
		
		
		
		System.out.print("\nTurned array:\n");
		ArrayLibrary.printArray(ArrayLibrary.turnArray(array));
		
		
		
		System.out.print("\nSet a number: ");
		integer = input.nextInt();
		
		System.out.print("Moved to the right\n");
		ArrayLibrary.printArray(ArrayLibrary.moveArrayToRight(array, integer));
		
		System.out.print("\nMoved to the left\n");
		ArrayLibrary.printArray(ArrayLibrary.moveArrayToLeft(array, integer));
		
		
		input.close();
	}
}