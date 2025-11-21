package personal;

import date.*;


/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */

public class PersonalData
{
	// Attributes

	private String name = "";
	private Date birthDate;
	private byte age = 0;



	// Constructors

	/**
	 * @brief Creates a new personal data object with the given name
	 * @param name Personal data's user's name
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public PersonalData(String name)
	{
		this.setName(name);
	}


	/**
	 * @brief Creates a new personal data object with the given birth date
	 * @param birthDate Personal data's user's brith date
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public PersonalData(Date birthDate)
	{
		this.setBirthDate(birthDate);
	}


	/**
	 * @brief Creates a new personal data object with the given age
	 * @param age Personal data's user's age
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public PersonalData(byte age)
	{
		this.setAge(age);
	}


	/**
	 * @brief Creates a new personal data object with the given name, brith date and age
	 * @param name Personal data's user's name
	 * @param birthDate Personal data's user's brith date
	 * @param age Personal data's user's age
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Áalvaro Fernández Barrero
	 */
	public PersonalData(String name, Date birthDate, byte age)
	{
		this.setName(name);
		this.setBirthDate(birthDate);
		this.setAge(age);
	}


	/**
	 * @brief Copies the given personal data
	 * @param data Personal data object to copy
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public PersonalData(PersonalData data)
	{
		this.setName(data.getName());
		this.setBirthDate(data.getBirthDate());
		this.setAge(data.getAge());
	}



	// Methods

	/**
	 * @brief Obtains a string version of the current personal data
	 * @return The personal data converted to string
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public String toString()
	{
		return String.format("Name: %s\nBirth date: %s\nAge: %d", this.name, this.birthDate.toString(), this.age);
	}



	// Getters and setters

	/**
	 * @brief Obtains the data's name
	 * @return The data's name
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public String getName()
	{
		return this.name;
	}


	/**
	 * @brief Sets the data's name
	 * @param name The data's name
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public void setName(String name)
	{
		this.name = name.trim();
	}


	/**
	 * @brief Obtains the data's birth date
	 * @return The data's birth date
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public Date getBirthDate()
	{
		return this.birthDate;
	}


	/**
	 * @brief Sets the data's brith date
	 * @param birthDate The data's birth date
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}


	/**
	 * @brief Obtains the data's age
	 * @return The data's age
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public byte getAge()
	{
		return this.age;
	}


	/**
	 * @brief Sets the data's age
	 * @param age The data's age
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public void setAge(byte age)
	{
		this.age = age;
	}
}