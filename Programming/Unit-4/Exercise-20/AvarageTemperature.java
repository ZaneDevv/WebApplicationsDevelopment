import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/10
 * @author Álvaro Fernández Barrero
 */

public class AvarageTemperature
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_CYAN = "\u001B[36m";
	
	
	
	// Graph constants
	
	private static final char CHARACTER_TO_REPRESENt = '*';
	private static final int GRAPH_MULTIPLIER = 10;
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		float[] avarageTemperatures = new float[12];
		float greatestAbsolute = 0;
		
		
		try
		{
			// Setting avarage temperatures
			
			for (int i = 0; i < avarageTemperatures.length; i++)
			{
				System.out.printf("Set the avarage temperature of %s: ", obtainMonthByNumber((byte)(i + 1)));
				avarageTemperatures[i] = input.nextFloat();
			}
			
			
			// Obtaining greatest absolute value from the array
			
			greatestAbsolute = obtainGreatestAbsoluteNumber(avarageTemperatures);
			
			
			// Printing graph
			
			for (int i = GRAPH_MULTIPLIER; i > 0; i--)
			{
				System.out.print("|");
				for (int j = 0; j < avarageTemperatures.length; j++)
				{
					System.out.print(ANSI_CYAN);
					System.out.printf(" %c ", Math.ceil(avarageTemperatures[j] / greatestAbsolute * (GRAPH_MULTIPLIER - 1)) >= i ? CHARACTER_TO_REPRESENt : ' ');
					System.out.print(ANSI_RESET);
					System.out.print("|");
				}
				
				System.out.print("\n");
			}
			
			System.out.print("|");
			for (int i = 1; i <= 12; i++)
			{
				System.out.printf("%3s|", obtainMonthByNumber((byte)i).substring(0, 3));
			}
		}
		catch (Exception exception)
		{
			System.out.print(ANSI_RED + exception.getMessage() + ANSI_RESET);
		}
		finally
		{
			input.close();
		}
	}
	
	
	
	/**
	 * @brief Comutes the greatest absolute number of the given array of numbers
	 * @param numbers Number array to obtain the greatest absolute number from
	 * @return Greatest absolute number in the given array
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/10
	 * @author Álvaro Fernández Barrero
	 */
	private static float obtainGreatestAbsoluteNumber(float[] numbers)
	{
		float greatestNumber = Float.MIN_VALUE;
		
		for (float x : numbers)
		{
			float absolute = (float)Math.abs(x);
			
			if (greatestNumber < absolute)
			{
				greatestNumber = absolute;
			}
		}
		
		return greatestNumber;
	}
	
	
	
	/**
	 * @brief Obtains a string with the name of the month which corresponds to the given number
	 * @param x The number to obtain the month's name from
	 * @return The name of the month which corresponds to the given number
	 * @throws Unknown month, the given number is not valid
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/10
	 * @author Álvaro Fernández Barrero
	 */
	private static String obtainMonthByNumber(byte x) throws Exception
	{
		return switch (x)
		{
			case 1: yield "January";
			case 2: yield "February";
			case 3: yield "March";
			case 4: yield "April";
			case 5: yield "May";
			case 6: yield "June";
			case 7: yield "July";
			case 8: yield "August";
			case 9: yield "September";
			case 10: yield "October";
			case 11: yield "November";
			case 12: yield "December";

			default: throw new Exception("Unknown month! Known months are [1, 12]");
		};
	}
}
