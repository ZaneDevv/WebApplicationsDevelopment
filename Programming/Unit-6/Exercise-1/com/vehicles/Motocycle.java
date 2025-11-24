package com.vehicles;

import java.util.regex.*;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández
 */

public class Motocycle
{
	// Constants

	private static final Pattern REGISTRATION_PATTERN = Pattern.compile("^\\d{4}\\s?[A-Z]{3}$");



	// Attributes

	private float horses = 0;
	private float peakSpeed = 0;
	private String registration = "0000AAA";



	// Constructors

	/**
	 * @brief Creates a default motocycle
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Motocycle() {}


	/**
	 * @brief Creates a motocycle with the given parameters
	 * @param horses Motocycle's horses
	 * @param peakSpeed Motocycle's peak speed
	 * @param registration Motocycle's registration
	 * @throws Exception The given registration is not valid
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Motocycle(float horses, float peakSpeed, String registration) throws Exception
	{
		this.setRegistration(registration);
		this.setHorses(horses);
		this.setPeakSpeed(peakSpeed);
	}


	/**
	 * @brief Copies the given motocycle
	 * @param motocycle Motocycle to copy
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Motocycle(Motocycle motocycle)
	{
		this.horses = motocycle.getHorses();
		this.peakSpeed = motocycle.getPeakSpeed();
		this.registration = motocycle.getRegistration();
	}



	// Methods

	/**
	 * @brief Shows the current motocycle's registration
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void showRegistration()
	{
		System.out.println(this.registration);
	}


	/**
	 * @brief Checks if the given registration is valid
	 * @param registration Registration to check
	 * @return True if the given registration is valid, false otherwise
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isValidRegistration(String registration)
	{
		return Motocycle.REGISTRATION_PATTERN.matcher(registration).matches();
	}



	// Getters and setters

	/**
	 * @brief Obtains the current motocycle's horses
	 * @return Motocycle's horses
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float getHorses()
	{
		return this.horses;
	}


	/**
	 * @brief Sets the current motocycle's horses
	 * @param registration The new motocycle's horses
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setHorses(float horses)
	{
		this.horses = horses;
	}


	/**
	 * @brief Obtains the current motocycle's peak speed
	 * @return Motocycle's peak speed
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float getPeakSpeed()
	{
		return this.peakSpeed;
	}


	/**
	 * @brief Sets the current motocycle's registration
	 * @param peakSpeed The new motocycle's peak speed
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setPeakSpeed(float peakSpeed)
	{
		this.peakSpeed = peakSpeed;
	}


	/**
	 * @brief Obtains the current motocycle's registration
	 * @return Motocycle's registration
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public String getRegistration()
	{
		return this.registration;
	}


	/**
	 * @brief Sets the current motocycle's registration
	 * @param registration The new motocycle's registration
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setRegistration(String registration) throws Exception
	{
		if (!Motocycle.isValidRegistration(registration))
		{
			throw new Exception("The given registration does not follow the registration\'s pattern!" + registration);
		}

		this.registration = registration;
	}
}
