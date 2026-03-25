package EcoCity;

/**
 * @author Álvaro Fernández Barrero
 */
public class EcoCityManager
{
	// -----------------------------
	// Attributes
	// -----------------------------
	
	private static Vehicle[] vehicles = new Vehicle[5];
	
	// -----------------------------
	// Methods
	// -----------------------------
	
	public static void main(String[] args)
	{
		// Adding vehicles to the array
		
		vehicles[0] = new ElectricCar(1, "Seat", 150, 100);
		vehicles[1] = new ElectricCar(2, "Tesla", 200, 100);
		vehicles[2] = new ElectricBike(3, "Trek", 50, true);
		vehicles[3] = new ElectricBike(4, "Modraker", 50, false);
				
		// Printing vehicle data
		
		System.out.println("*************  REPORT  *************");
		for (int i = 0; i < vehicles.length; i++)
		{
			Vehicle vehicle = vehicles[i];
			
			if (vehicle != null)
			{
				System.out.print(vehicle);
				System.out.printf("Cost for 7 rental days: %.2f\n", vehicle.calculateRentalCost(7));
				System.out.println("*************************************");
			}
		}
	}
}