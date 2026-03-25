package EcoCity;

/**
 * @author Álvaro Fernández Barrero
 */
public class ElectricCar extends Vehicle
{
	// -----------------------------
	// Attributes
	// -----------------------------
	
	private int batteryLevel;
	
	// -----------------------------
	// Constructors
	// -----------------------------
	
	public ElectricCar(int vehicleId, String brand, double dailyBaseRate, int batteryLevel)
	{
		super(vehicleId, brand, dailyBaseRate);
		this.batteryLevel = batteryLevel;
	}
	
	// -----------------------------
	// Methods
	// -----------------------------
	
	@Override
	public String toString()
	{
		return super.toString() + String.format("Battery level: %d", this.batteryLevel) + "%\n";
	}
	
	@Override
	public double calculateRentalCost(int days)
	{
		double cost = super.calculateRentalCost(days);
		
		if (days > 5)
		{
			cost -= cost * 0.1f;
		}
		
		return cost;
	}
}