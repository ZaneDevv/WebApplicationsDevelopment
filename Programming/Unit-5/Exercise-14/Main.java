import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/19
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		Account account1 = new Account(0);
		Account account2 = new Account(1);



		// Testing

		account1.joinMoney(100);
		account1.withdrawMoney(20);
		System.out.printf("%,.2f\n", account1.getMoney());



		try
		{
			account1.transferMoney(90, account2);
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}

		System.out.printf("Account1: %,.2f\nAccount2: %,.2f", account1.getMoney(), account2.getMoney());



		input.close();
	}
}