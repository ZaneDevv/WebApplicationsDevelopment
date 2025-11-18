import java.util.Scanner;

/**
 * When you try to use the class Scanner in order to interact with the user trough the terminal, the user sends a buffer of data that the scanner obtains and
 * saves it when the specilized methods are fired. However, it has a problem, because when the user press enter to send the data, actually is sending "\n".
 * This may not affect whatsoever, mainly when you are asking only for numbers, but if you have that character saved in the buffer and ask the user for a string,
 * since the method reads the buffer until it finds a "\n", the user will not be able to write anything.
 *
 * There are several ways to solve this problem, but being completely honest, they are kind of tedious. Hence, due to that, I decided to make a silly class
 * which has all the possible methods to ask the user for a value without worrying whatsoever about this issue.
 *
 * Additionally, this class also contains a method to obtain chars.
 *
 * @version 1.0
 * @date 25/11/17
 * @author Álvaro Fernández Barrero
 */

public class ScannerSolver
{
	private static final Scanner INPUT = new Scanner(System.in);
	
	
	
	/**
	 * @brief Cleans the input buffer
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private static void cleanBuffer()
	{
		INPUT.nextLine();
	}
	
	
	
	/**
	 * @brief Obtains the integer number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static byte nextByte()
	{
		byte number = INPUT.nextByte();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the integer number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static short nextShort()
	{
		short number = INPUT.nextShort();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the integer number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int nextInt()
	{
		int number = INPUT.nextInt();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the integer number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static long nextLong()
	{
		long number = INPUT.nextLong();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the real number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static float nextFloat()
	{
		float number = INPUT.nextFloat();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the real number the user wrote on the terminal
	 * @return The number the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static double nextDouble()
	{
		double number = INPUT.nextDouble();
		cleanBuffer();
		
		return number;
	}
	
	
	
	/**
	 * @brief Obtains the boolean the user wrote on the terminal
	 * @return The boolean the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean nextBoolean()
	{
		boolean bool = INPUT.nextBoolean();
		cleanBuffer();
		
		return bool;
	}
	
	
	
	/**
	 * @brief Obtains the character the user wrote on the terminal
	 * @return The character the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static char nextChar()
	{
		String text = INPUT.nextLine();
		
		if (text.length() == 0)
		{
			return ' ';
		}
		
		return text.charAt(0);
	}
	
	
	
	/**
	 * @brief Obtains the text the user wrote on the terminal
	 * @return The text the user wrote
	 * @version 1.0
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static String nextLine()
	{
		return INPUT.nextLine();
	}
}