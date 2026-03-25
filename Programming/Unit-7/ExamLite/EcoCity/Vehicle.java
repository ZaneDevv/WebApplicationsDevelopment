package EcoCity;

/**
 * 1st DAW BIL
 * @author Álvaro Fernández Barrero
 */
public class Vehicle implements Rentable
{
	// -----------------------------
	// Attributes
	// -----------------------------
	
	protected int vehicleId;
	protected String brand;
	protected double dailyBaseRate;
	
	// -----------------------------
	// Constructors
	// -----------------------------
	
	public Vehicle(int vehicleId, String brand, double dailyBaseRate)
	{
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.dailyBaseRate = dailyBaseRate;
	}
	
	// -----------------------------
	// Methods
	// -----------------------------
	
	public String toString()
	{
		return String.format("VehicleId: %d\nBrand: %s\nDailyBaseRate: %.2f\n", this.vehicleId, this.brand, this.dailyBaseRate);
	}
	
	@Override
	public double calculateRentalCost(int days)
	{
		return this.dailyBaseRate * days;
	}
}