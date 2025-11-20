import personal.date.*;

/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		Date date = new Date(5);
		date.setMonth(Month.July);
		date.setYear(1999);

		Date currentDate = new Date(20, Month.November, 2025);


		System.out.println(date.toString());
		System.out.printf("It\'s Summer: %b\n", date.isSummer());
		System.out.printf("Difference between current date and the given one: %d\n", date.computeDifferenceYears(currentDate));

		System.out.println("---------------------------");

		System.out.println(currentDate.toString());
		System.out.printf("It\'s Summer: %b\n", currentDate.isSummer());
	}
}