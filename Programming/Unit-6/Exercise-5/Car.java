/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Car
{
	// Attributes

	private String brand = "";
	private String model = "";

	private int year = 0;



	// Constructors

	/**
	 * @brief Creates a new empty car
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Car() {}


	/**
	 * @brief Creates a new car with the given parameters
	 * @param brand Car's brand
	 * @param model Car's model
	 * @param year Car's years
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Car(String brand, String model, int year)
	{
		this.setBrand(brand);
		this.setModel(model);
		this.setYear(year);
	}


	/**
	 * @brief Copies the given car
	 * @param car Car to copy
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Car(Car car)
	{
		this.setBrand(car.getBrand());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}



	// Getters and setters

	/**
	 * @brief Obtains the current car's brand
	 * @return The current car's brand
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public String getBrand()
	{
		return this.brand;
	}


	/**
	 * @brief Sets the current car's brand
	 * @param brand The new brand for the current car
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setBrand(String brand)
	{
		this.brand = brand;
	}


	/**
	 * @brief Obtains the current car's model
	 * @return The current car's model
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public String getModel()
	{
		return this.model;
	}


	/**
	 * @brief Sets the current car's model
	 * @param model The new model for the current car
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setModel(String model)
	{
		this.model = model;
	}


	/**
	 * @brief Obtains the current car's year
	 * @return The current car's year
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public int getYear()
	{
		return this.year;
	}


	/**
	 * @brief Sets the current car's year
	 * @param year The new year for the current car
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setYear(int year)
	{
		this.year = year;
	}
}