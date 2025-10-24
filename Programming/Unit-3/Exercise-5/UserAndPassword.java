import java.util.Scanner;

public class UserAndPassword
{
	private static final String USER = "pepe";
	private static final String PASSWORD = "asdasd";
	

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String user = "";
		String password = "";
		
		
		// Logging in
		
		System.out.print("User: ");
		user = input.nextLine();
		
		System.out.print("Password: ");
		password = input.nextLine();
		
		
		// Checking if the user and password are correct
		
		if (user.equals(USER) && password.equals(PASSWORD))
		{
			System.out.println("Welcome!");
		}
	}
}