/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */

public class FirstMethods
{
	/**
	 * @brief Does nothing
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static void nothing() {}


	/**
	 * @brief Adds 1 to the given number
	 * @param x Number to add 1
	 * @return The given number incremented by 1
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int add1(int x)
	{
		return x + 1;
	}


	/**
	 * @brief Adds two numbers together
	 * @param x First number to add
	 * @param y Second number to add
	 * @return The addition of the two given numbers
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static float add(float x, float y)
	{
		return x + y;
	}


	/**
	 * @brief Cleans the screen
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static void cleanScreen()
	{
		for (int i = 0; i < 25; i++)
		{
			System.out.print("\n");
		}
	}


	/**
	 * @brief Draws a sqaure on screen
	 * @param size Square's dimensions
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static void drawSquare(int size)
	{
		System.out.print("\n");

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}



	/**
	 * @brief Obtains the given number's sign
	 * @param x The number to obtain the sign from
	 * @return Either -1 if the given number is negative, 1 if it is positive or 0 if the number is 0
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static int sign(double x)
	{
		return x < 0 ? -1 : x > 0 ? 1 : 0;
	}


	/**
	 * @brief Computes the factorial of the given number
	 * @param x The number to compute the factorial with
	 * @return The factorial of the given number
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static long factorial(int x)
	{
		if (x <= 1)
		{
			return 1;
		}

		return x * factorial(x - 1);
	}


	/**
	 * @brief Checks if the given number is prime
	 * @param x The number to check if it is prime
	 * @return True if the given number is prime, false otherwise
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isPrime(int x)
	{
		// If the number is even and bigger than 2, it cannot be prime

		if (x == 2)
		{
			return true;
		}

		if ((x & 1) == 0)
		{
			return false;
		}


		for (int i = 3; i < x; i += 2)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		return true;
	}


	/**
	 * @brief Checks if the given number is either prime or 0
	 * @param x The number to check if it is either prime or 0
	 * @return True if the given number is prime or 0, false otherwise
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isPrimeOr0(int x)
	{
		return x == 0 || isPrime(x);
	}


	/**
	 * @brief Checks if the given character is a numner
	 * @param character The character to check
	 * @return True if the given character is actually a number, false otherwise
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */	
	public static boolean isNumber(char character)
	{
		return character >= '1' && character <= '9';
	}
}