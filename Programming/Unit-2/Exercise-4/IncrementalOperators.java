public class IncrementalOperators
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 0;
		int z = 0;
		
		y = ++x; // Increments by one to the x variable and saves the value in y.
		z = y++; // Saves the value of y in z and increments by one the value of y.
		
		System.out.printf(" x = %d \n y = %d \n z = %d", x, y, z);
	}
}