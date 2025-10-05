import java.util.Scanner;

public class GetCurrency
{
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int amount2Euros = 0;
		int amount1Euro = 0;
		int amount50Cents = 0;
		int amount20Cents = 0;
		int amount10Cents = 0;
		
		int totalEuros = 0;
		int totalCents = 0;
		
		
		// Setting currency
		
		System.out.print("How many 2€ coins do you have? ");
		amount2Euros = input.nextInt();
		
		System.out.print("How many 1€ coins do you have? ");
		amount1Euro = input.nextInt();
		
		System.out.print("How many 50 cents coins do you have? ");
		amount50Cents = input.nextInt();
		
		System.out.print("How many 20 cents coins do you have? ");
		amount20Cents = input.nextInt();
		
		System.out.print("How many 10 cents coins do you have? ");
		amount10Cents = input.nextInt();
		
		
		// Computing final currency
		
		totalCents = amount10Cents * 10 + amount20Cents * 20 + amount50Cents * 50;
		totalEuros = amount1Euro + 2 * amount2Euros + (int)Math.floor(totalCents / 100);
		totalCents %= 100;
		
		System.out.printf("You have %d,%02d€", totalEuros, totalCents);
	}
}