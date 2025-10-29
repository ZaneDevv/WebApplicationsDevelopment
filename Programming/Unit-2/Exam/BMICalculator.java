import java.util.Scanner;



/**

 * BMI Calculator

 *

 * Álvaro Fernández Barrero

 * 1º DAW Bilingual

 */



public class BMICalculator

{

	enum Status

	{

		Underweight,

		Normal,

		Overweight,

		Obesity

	}

	

	

	public static void main(String[] args)

	{

		// Defining variables

		

		Scanner input = new Scanner(System.in);

		

		String name = "";

				

		int dniNumbers = 0;

		char dniLetter = ' ';

		

		float weight = 0f;

		float height = 0f;

		

		int bmi = 0;

		

		Status status = Status.Normal;

		

		

		// Setting data

		

		System.out.print("Enter your name (up to 10 characters): ");

		name = input.nextLine();

		

		System.out.print("DNI number (8 digits): ");

		dniNumbers = input.nextInt();

		input.nextLine();

		

		System.out.print("DNI letter: ");

		dniLetter = input.nextLine().toUpperCase().charAt(0);

		

		System.out.print("Enter your weight in kilograms (e.g. 45.5): ");

		weight = input.nextFloat();

		

		System.out.print("Enter your height in meters (e.g. 1.75): ");

		height = input.nextFloat();

		

		

		// Computing BMI

		

		bmi = (int)(weight / (height * height));

		

		

		// Checking BMI's status

		

		status = (bmi < 18) ? Status.Underweight : (bmi > 30) ? Status.Obesity : (bmi >= 18 && bmi <= 25) ? Status.Normal : Status.Overweight;

		

		

		// Displaying information

		

		System.out.print("\nBody Mass Index (BMI) Calculator");

		System.out.print("\n********************************************\n");

		System.out.printf("* Name: %-10s    *\t ID:   %-9s   *", name, String.valueOf(dniNumbers) + String.valueOf(dniLetter));

		System.out.print("\n********************************************\n");

		System.out.printf("* BMI: %-10d     *\t STATUS: %-10s*  ", bmi, status.name());

		System.out.print("\n********************************************\n");

	}

}

