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

		String string1 = "";
		String string2 = "";

		char[] stringAsArray;
		int[] numbers;


		// Testing

		System.out.print("Write a text here:\n");
		string1 = input.nextLine();

		System.out.print("\nWrite another text here:\n");
		string2 = input.nextLine();

		System.out.printf("Concatenated: %s\n", StringsAndArrays.concat(string1, string2));



		System.out.print("\nWrite more text text:\n");
		string1 = input.nextLine();

		stringAsArray = StringsAndArrays.convertStringToArray(string1);

		System.out.print("\n{");
		for (int i = 0; i < stringAsArray.length; i++)
		{
			System.out.printf("\"%c\"", stringAsArray[i]);

			if (i < stringAsArray.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.print("}\n");



		System.out.print("\nSet the array\'s length: ");
		numbers = new int[input.nextInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("Set a number for the array:");
			numbers[i] = input.nextInt();
		}

		System.out.printf("\nResult: \"%s\"\n", StringsAndArrays.convertArrayToString(numbers));


		input.close();
	}
}