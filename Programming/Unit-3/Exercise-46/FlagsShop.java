import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class FlagsShop
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	// Settings
	
	private static final float PRINCE_PER_CENTIMETER_SQUARED = 0.01f;
	private static final float SHIELD_PRICE = 2.5f;
	private static final float DELIVERY_PRICE = 3.25f;
	
	private static final int TAXES_PERCENTAGE = 21;
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		float priceForCentimeters = 0f;
		float totalPrice = 0f;
		float totalPriceWithTaxes = 0f;
		
		float width = 0f;
		float height = 0f;
		
		float totalCentimetersSquared = 0f;
		
		boolean hasShield = false;
		
		
		// Setting flag data
		
		try
		{
			System.out.print("Flag width (cm): ");
			width = input.nextFloat();
		}
		catch(InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		
		width = Math.abs(width);
		
		
		try
		{
			System.out.print("Flag height (cm): ");
			height = input.nextFloat();
		}
		catch(InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		
		height = Math.abs(height);
		
		
		input.nextLine();
		System.out.print("Do you want a shild on it? [Y/N]: ");
		hasShield = input.nextLine().equalsIgnoreCase("Y");
		
		
		// Computing total price
		
		totalCentimetersSquared = width * height;
		
		priceForCentimeters = totalCentimetersSquared * PRINCE_PER_CENTIMETER_SQUARED;
		totalPrice = priceForCentimeters + (hasShield ? SHIELD_PRICE : 0) + DELIVERY_PRICE;
		totalPriceWithTaxes = (float)(totalPrice * (1 + TAXES_PERCENTAGE / 1e+2));
		
		
		// Printing result
		
		System.out.println("Thanks you! There are here the prices:");
		System.out.printf(" · Flag of %.2f cm^2: " + ANSI_GREEN + "%,.2f€" + ANSI_RESET + "\n", totalCentimetersSquared, priceForCentimeters);
		System.out.printf(" · %s shield: " + ANSI_GREEN + "%,.2f€" + ANSI_RESET + "\n", hasShield ? "With" : "Without", hasShield ? SHIELD_PRICE : 0);
		System.out.printf(" · Delivery: " + ANSI_GREEN + "%,.2f€" + ANSI_RESET + "\n", DELIVERY_PRICE);
		System.out.printf(" · Total: " + ANSI_GREEN + "%,.2f€" + ANSI_RESET, totalPriceWithTaxes);
		
		
		input.close();
	}
}