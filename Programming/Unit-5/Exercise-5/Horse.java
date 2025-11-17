/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */
public class Horse
{
	// Attributes

	private String name = "";
	private String ownerName = "";

	private float height = 0;
	private float weight = 0; 

	private byte birthDay = 0;
	private byte birthMonth = 0;
	private int birthYear = 0;

	private String location = "";
	private String horseRiding = "";

	public boolean doesCompete = false;



	// Methods

	/**
	 * @brief Makes the horse run
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void run()
	{

	}


	/**
	 * @brief Makes the horse reluctant
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void reluctant()
	{

	}


	/**
	 * @brief Makes the horse eat
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void eat()
	{

	}


	/**
	 * @brief Makes the horse compete
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void compete()
	{

	}


	/**
	 * @brief Makes the horse sleep
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void sleep()
	{

	}


	/**
	 * @brief Sets the horse's name
	 * @param name Horse's new name
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setName(String name)
	{
		this.name = name.trim();
	}


	/**
	 * @brief Obtain horse's name
	 * @return Horse's name
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String getName()
	{
		return this.name;
	}


	/**
	 * @brief Sets the horse's owner
	 * @param name Horse's new owner
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setOwner(String name)
	{
		this.ownerName = name.trim();
	}


	/**
	 * @brief Obtain horse's owner
	 * @return Horse's owner
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String getOwner()
	{
		return this.ownerName;
	}


	/**
	 * @brief Sets horse's birth date
	 * @param day Horse's birth day
	 * @param month Horse's birth month
	 * @param year Horse's birth year
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setBirthDate(byte day, byte month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}


	/**
	 * @brief Obtain horse's birth day
	 * @return Horse's birth day
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private int getBirthDay()
	{
		return this.day;
	}


	/**
	 * @brief Obtain horse's birth month
	 * @return Horse's birth month
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private int getBirthDay()
	{
		return this.day;
	}


	/**
	 * @brief Obtain horse's birth year
	 * @return Horse's birth year
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private int getBirthYear()
	{
		return this.year;
	}


	/**
	 * @brief Sets the horse's location
	 * @param location Horse's new location
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setLocation(String location)
	{
		this.location = location.trim();
	}


	/**
	 * @brief Obtains the horse's location
	 * @return Horse's location
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String getLocation()
	{
		return this.location;
	}


	/**
	 * @brief Sets the horse's horse riding
	 * @param horseRiding Horse's new horse riding
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void sethorseRiding(String horseRiding)
	{
		this.horseRiding = horseRiding.trim();
	}


	/**
	 * @brief Obtains the horse's horse riding
	 * @return Horse's horse riding
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String gethorseRiding()
	{
		return this.horseRiding;
	}
}