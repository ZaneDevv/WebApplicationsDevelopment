package date;


/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */

public class Date
{
	// Attributes

	private byte day = 1;
	private Month month = Month.January;
	private int year = 2000;

	private boolean isLeapYear = Date.isLeapYear(2000);

	private byte maximumDaysInMonth = (byte)Date.maximumDaysInMonth(Month.January);



	// Constructors

	/**
	 * @brief Creates a new Date object at the 1st of January of 2000
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date() {}


	/**
	 * @brief Creates a new Date object at the given day of January of 2000
	 * @param day The day of the month
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(byte day)
	{
		this.setDay(day);
	}


	/**
	 * @brief Creates a new Date object at the given day of January of 2000
	 * @param day The day of the month
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(int day)
	{
		this.setDay(day);
	}


	/**
	 * @brief Creates a new Date object at the 1st of the given month of 2000
	 * @param month The month of the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(Month month)
	{
		this.setMonth(month);
	}


	/**
	 * @brief Creates a new Date object at the given day of the given month of 2000
	 * @param day The day of the date
	 * @param month The month of the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(byte day, Month month)
	{
		this.setMonth(month);
		this.setDay(day);
	}


	/**
	 * @brief Creates a new Date object at the given day of the given month of the given year
	 * @param day The day of the date
	 * @param month The month of the date
	 * @param year The year of the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(byte day, Month month, int year)
	{
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}


	/**
	 * @brief Creates a new Date object at the given day of the given month of the given year
	 * @param day The day of the date
	 * @param month The month of the date
	 * @param year The year of the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(int day, Month month, int year)
	{
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}


	/**
	 * @brief Copies the given date object
	 * @param other Date to copy
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Date(Date other)
	{
		this.setYear(other.getYear());
		this.setDay(other.getDay());
		this.setDay(other.getDay());
	}



	// Methods

	/**
	 * @brief Checks if the given date is valid for the given month without considering leap years
	 * @param day The day to check
	 * @param Month The month which the day belongs to
	 * @return True if the day is valid in the month, false otherwise
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isValidDayInMonth(byte day, Month month)
	{
		return day > 0 && day <= Date.maximumDaysInMonth(month);
	}


	/**
	 * @brief Checks if the given date is valid for the given month considering leap years
	 * @param day The day to check
	 * @param Month The month which the day belongs to
	 * @param year Year of the date
	 * @return True if the day is valid in the month, false otherwise
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isValidDayInMonth(byte day, Month month, int year)
	{
		return day > 0 && day <= Date.maximumDaysInMonth(month, year);
	}


	/**
	 * @brief Checks if the given year is leap
	 * @param year Year to check
	 * @return True if the given year is leap, false otherwise
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public static boolean isLeapYear(int year)
	{
		return year % 400 == 0 || (year % 4 == 0 && year % 100 > 0);
	}


	/**
	 * @brief Computes the maximum days in the given month without considering leap years
	 * @param month Month to see its own amount of numbers
	 * @return The amount of days the given month has
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public static int maximumDaysInMonth(Month month)
	{
		return (month == Month.February) ? 28 : (((month.ordinal() + 1) & 1) == 0 ? 31 : 30);
	}


	/**
	 * @brief Computes the maximum days in the given month considering leap years
	 * @param month Month to see its own amount of numbers
	 * @param year The year of the month
	 * @return The amount of days the given month has
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public static int maximumDaysInMonth(Month month, int year)
	{
		return (month == Month.February) ? (Date.isLeapYear(year) ? 29 : 28) : (((month.ordinal() + 1) & 1) == 0 ? 31 : 30);
	}


	/**
	 * @Checks if the date is summer
	 * @return True if the current date is summer, false otherwise
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public boolean isSummer()
	{
		return this.month == Month.July || (this.month == Month.June && this.day >= 21) || (this.month == Month.August && day <= 23);
	}


	/**
	 * @brief Computes the difference of the years of this date and another
	 * @param other Date to compute the difference
	 * @return The difference between the given date's year and the current one's
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public int computeDifferenceYears(Date other)
	{
		return Math.abs(this.year - other.getYear());
	}


	/**
	 * @brief Obtains the string version of the current date
	 * @return The date converted to string
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public String toString()
	{
		return this.day + "/" + this.month.name() + "/" + this.year;
	}



	// Getters and setters

	/**
	 * @brief Gets the date's day
	 * @return The date's day
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public byte getDay()
	{
		return this.day;
	}


	/**
	 * @brief Sets the given day to the date
	 * @param day The new day for the date 
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public void setDay(byte day)
	{
		this.day = (day < 1) ? 1 : (day > this.maximumDaysInMonth) ? this.maximumDaysInMonth : day;
	}


	/**
	 * @brief Sets the given day to the date
	 * @param day The new day for the date 
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public void setDay(int day)
	{
		this.setDay((byte)day);
	}


	/**
	 * @brief Gets the date's month
	 * @return The date's month
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public Month getMonth()
	{
		return this.month;
	}


	/**
	 * @brief Sets the given month to the date
	 * @param month The new month for the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public void setMonth(Month month)
	{
		this.month = month;
		this.maximumDaysInMonth = (byte)Date.maximumDaysInMonth(month, this.year);

		if (this.day > this.maximumDaysInMonth)
		{
			this.day = this.maximumDaysInMonth;
		}
	}


	/**
	 * @brief Gets the date's year
	 * @return The date's year
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public int getYear()
	{
		return this.year;
	}


	/**
	 * @brief Sets the given year to the date
	 * @param year The new year for the date
	 * @version 1.0
	 * @date 2025/11/20
	 * @author Álvaro Fernández Barrero
	 */
	public void setYear(int year)
	{
		this.isLeapYear = Date.isLeapYear(year);
		this.year = year;

		this.setMonth(this.month);		
	}
}