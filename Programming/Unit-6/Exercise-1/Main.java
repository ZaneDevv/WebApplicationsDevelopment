import com.vehicles.Motocycle;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández
 */

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Motocycle motocycle1 = new Motocycle();	
			Motocycle motocycle2 = new Motocycle(20, 80, "4444 XZL");

			motocycle1.setHorses(10);
			motocycle1.setPeakSpeed(65);
			motocycle1.setRegistration("1234XYZ");


			motocycle1.showRegistration();
			motocycle2.showRegistration();
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}