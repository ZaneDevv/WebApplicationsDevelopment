/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */

public class StringsAndArrays
{
	/**
	 * @brief Concatenates the two given strings
	 * @param string1 First string to concatenate
	 * @param string2 Second string to concatenate
	 * @return The concatenation of the two given strings
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static String concat(String string1, String string2)
	{
		return string1 + string2;
	}



	/**
	 * @brief Converts the given string to an array
	 * @param string String to convert to an array
	 * @return The string converted to array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static char[] convertStringToArray(String string)
	{
		char[] array = new char[string.length()];

		for (int i = 0; i < array.length; i++)
		{
			array[i] = string.charAt(i);
		}

		return array;
	}



	/**
	 * @brief Converts the given array to a string
	 * @param array Array to convert to a string
	 * @return The comverted array
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public static String convertArrayToString(int[] array)
	{
		String result = "";

		for (int i = 0; i < array.length; i++)
		{
			result += String.valueOf(array[i]);
		}

		return result;
	}
}