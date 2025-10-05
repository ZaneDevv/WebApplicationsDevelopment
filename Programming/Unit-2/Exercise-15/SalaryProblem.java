import java.util.Scanner;

public class SalaryProblem
{
	private static final byte EXTRA_PERCENTAGE = 10;
	private static final byte SOLDS_PER_MONTH = 3;

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		double baseSalary = 0;
		double commisionsSalary = 0;
		double totalSalary = 0;
		
		
		// Setting base salary and commisions
		
		System.out.print("Set the base salary for the employee: ");
		
		baseSalary = input.nextDouble();
		commisionsSalary = SOLDS_PER_MONTH * baseSalary * EXTRA_PERCENTAGE / 100;
		
		
		// Computing total salary
		
		totalSalary = baseSalary + commisionsSalary;
		System.out.printf("\nCommisions: %.2f€, \nTotal salary: %.2f€.", commisionsSalary, totalSalary);
	}
}