import java.util.Scanner;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		try
		{
			Card card0 = new Card();

			System.out.print("Set a suit: ");
			card0.setSuit(input.nextLine().charAt(0));

			System.out.print("Set number: ");
			card0.setNumber(input.nextInt());

			Card card1 = new Card(card0);
			card1.setNumber(12);


			// Testing

			card0.show();
			card1.show();

			System.out.print("\nWinner:\n");
			(card0.compare(card1)).show();
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			input.close();
		}
	}
}