package EcoCity;

/**
 * @author Álvaro Fernández Barrero
 */
public class ElectricBike extends Vehicle
{
	// -----------------------------
	// Attributes
	// -----------------------------
	
	private boolean includesHelmet;
	
	// -----------------------------
	// Constructors
	// -----------------------------
	
	public ElectricBike(int vehicleId, String brand, double dailyBaseRate, boolean includesHelmet)
	{
		super(vehicleId, brand, dailyBaseRate);
		this.includesHelmet = includesHelmet;
	}
	
	// -----------------------------
	// Methods
	// -----------------------------
	
	@Override
	public String toString()
	{
		return super.toString() + String.format("Includes helmet: %b\n", this.includesHelmet);
	}
	
	@Override
	public double calculateRentalCost(int days)
	{
		double cost = super.calculateRentalCost(days);
		
		if (this.includesHelmet)
		{
			cost += 2 * days;
		}
		
		return cost;
	}
}