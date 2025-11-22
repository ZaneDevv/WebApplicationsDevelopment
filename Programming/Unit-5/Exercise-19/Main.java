import java.util.Scanner;
import com.user.User;
import com.printing.Colors;


/**
 * @version 1.0
 * @date 2025/11/22
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		User user;

		boolean isLoggedIn = false;


		// Signing in

		System.out.print(Colors.ANSI_YELLOW + "\n\t\tSIGN IN\n" + Colors.ANSI_RESET);
		do
		{
			try
			{
				String name = "";
				String password = "";


				System.out.print("Set a user name: ");
				System.out.print(Colors.ANSI_CYAN);
				name = input.nextLine();
				System.out.print(Colors.ANSI_RESET);

				System.out.print("Set a password: ");
				System.out.print(Colors.ANSI_CYAN);
				password = input.nextLine();
				System.out.print(Colors.ANSI_RESET);


				user = new User(name, password);
			}
			catch (Exception exception)
			{
				System.out.println(Colors.ANSI_RED + exception.getMessage() + Colors.ANSI_RESET);
				user = null;
			}
		}
		while (user == null);

		System.out.printf(Colors.ANSI_GREEN + "Account created successfully!\nWelcome %s!\n" + Colors.ANSI_RESET, user.getUserName());



		// Logging in

		System.out.print(Colors.ANSI_YELLOW + "\n\t\tLOG IN\n" + Colors.ANSI_RESET);
		do
		{
			String name = "";
			String password = "";


			System.out.print("Set a user name: ");
			System.out.print(Colors.ANSI_CYAN);
			name = input.nextLine();
			System.out.print(Colors.ANSI_RESET);

			System.out.print("Set a password: ");
			System.out.print(Colors.ANSI_CYAN);
			password = input.nextLine();
			System.out.print(Colors.ANSI_RESET);

			isLoggedIn = user.logIn(name, password);
		}
		while (!isLoggedIn);


		input.close();
	}
}