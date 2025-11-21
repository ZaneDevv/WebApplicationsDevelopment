package com.shapes;


/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */
 
public class Rectangle
{
	// Attributes

	private double base = 0;
	private double height = 0;



	// Constructors

	/**
	 * @brief Creates a rectangle whose lengths are 0
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public Rectangle() {}


	/**
	 * @brief Creates a rectangle with the specified length
	 * @param length Rectangle's length
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public Rectangle(double length)
	{
		this.setBase(length);
		this.setHeight(length);
	}


	/**
	 * @brief Creates a rectangle with the given base and height
	 * @param base Rectangle's base
	 * @param height Rectangle's height
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public Rectangle(double base, double height)
	{
		this.setBase(base);
		this.setHeight(height);
	}


	/**
	 * @brief Copies the given rectangle
	 * @param rectangle Rectangle object to copy
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public Rectangle(Rectangle rectangle)
	{
		this.setBase(rectangle.getBase());
		this.setHeight(rectangle.getHeight());
	}



	// Methods

	/**
	 * @brief Computes the rectangle's area
	 * @return Rectangle's area
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public double computeArea()
	{
		return this.base * this.height;
	}


	/**
	 * @brief Checks if the rectangle is a square
	 * @return True if the rectangle is a square, false otherwise
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public boolean isSquare()
	{
		return this.base == this.height;
	}


	/**
	 * @brief Converts the rectangle to a string
	 * @return The rectangle converted to string
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public String toString()
	{
		return String.format("Base: %.2f\nHeight: %.2f\n", this.base, this.height);
	}



	// Getters and setters

	/**
	 * @brief Sets the base length to the rectangle
	 * @param base The new base length
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public void setBase(double base)
	{
		this.base = Math.abs(base);
	}


	/**
	 * @brief Obtains the base length of the current rectangle
	 * @return The current base length
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public double getBase()
	{
		return this.base;
	}


	/**
	 * @brief Sets the height length to the rectangle
	 * @param height The new base height
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */
	public void setHeight(double height)
	{
		this.height = Math.abs(height);
	}


	/**
	 * @brief Obtains the heigjt length of the current rectangle
	 * @return The current height length
	 * @version 1.0
	 * @date 2025/11/21
	 * @author Álvaro Fernández Barrero
	 */

	public double getHeight()
	{
		return this.height;
	}
}