/**
 * @version 1.0
 * @date 2025/11/18
 * @author Álvaro Fernández Barrero
 */

public class Equations
{

	/**
	 * @brief Solving equation ax + b = 0
	 * @param a The first-degree coefficient
	 * @param b The isolated coefficient
	 * @return The value of x in the given equation
	 * @throws Exception No equation recognizable. Probabbly a number lacks
	 * @version 1.0
	 * @date 2025/11/18
	 * @author Álvaro Fernández Barrero
	 */
	public static double solve(double a, double b) throws Exception
	{
		if (a == 0)
		{
			throw new Exception("No equation recognizable!");
		}

		return -b / a;
	}



	/**
	 * @brief Solving equation ax^2 + bx + c = 0
	 * @param a The second-degree coefficient
	 * @param b The first-degree coefficient
	 * @param c The isolated coefficient
	 * @return The possible values of x in the given equation
	 * @throws Exception No equation recognizable. Probabbly a number lacks
	 * @throws Exception The given equation has no real solutions
	 * @version 1.0
	 * @date 2025/11/18
	 * @author Álvaro Fernández Barrero
	 */
	public static double[] solve(double a, double b, double c) throws Exception
	{
		if (a == 0 && b == 0)
		{
			throw new Exception("No equation recognizable!");
		}

		double[] results;

		if (a == 0)
		{
			results = new double[1];
			results[0] = solve(b, c);

			return results;
		}


		double discriminant = b*b - 4*a*c;
		if (discriminant < 0)
		{
			throw new Exception("This equation has no real solutions!");
		}

		double doubleA = 2 * a;
		double squareRoot = Math.sqrt(discriminant);

		results = new double[2];
		results[0] = (-b + squareRoot) / doubleA;
		results[1] = (-b - squareRoot) / doubleA;
		

		return results;
	}
}