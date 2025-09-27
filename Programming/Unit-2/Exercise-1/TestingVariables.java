public class TestingVariables
{
	// Color constants
	
	private static final String ANSI_COLOR = "\u001B[36m";
	private static final String ANSI_RESET = "\u001B[0m";
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		byte oneByte = 1;
		short shortNumber = 128;
		int integer = 32768;
		long longNumber = 2147483648L;
		float decimals = 10.5f;
		double moreDecimals = 1080.653;
		
		boolean bool = true;
		
		char character = 'a';
		String text = "Awesome text";
		
		
		// Printing variables
		
		System.out.println(ANSI_COLOR + "\t - byte: " + ANSI_RESET + oneByte);
		System.out.println(ANSI_COLOR + "\t - short: " + ANSI_RESET + shortNumber);
		System.out.println(ANSI_COLOR + "\t - int: " + ANSI_RESET + integer);
		System.out.println(ANSI_COLOR + "\t - long: " + ANSI_RESET + longNumber);
		System.out.println(ANSI_COLOR + "\t - float: " + ANSI_RESET + decimals);
		System.out.println(ANSI_COLOR + "\t - double: " + ANSI_RESET + moreDecimals);
		System.out.println(ANSI_COLOR + "\t - boolean: " + ANSI_RESET + bool);
		System.out.println(ANSI_COLOR + "\t - char: " + ANSI_RESET + character);
		System.out.println(ANSI_COLOR + "\t - String: " + ANSI_RESET + text);
	}
}