package com.calendar;

import com.math.MathFunctions;


/**
 * @version 1.3.2
 * @author Álvaro Fernández Barrero
 */
public class Date
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private int year = 0;
    private byte month = 1;
    private byte day = 1;

    //----------------------------------------
    // Constructor
    //----------------------------------------

    /**
     * Create a new date instance which corresponds to 0/01/01
     * @version 1.0
     * @since 1.3.1
     * @author Álvaro Fernández Barrero
     */
    public Date() {}

    /**
     * Create a new date instance which corresponds to the given day, month and year
     * @param year Date's year
     * @param month Date's month
     * @param day Date's day
     * @version 1.0
     * @since 1.3.1
     * @author Álvaro Fernández Barrero
     */
    public Date(int year, byte month, byte day)
    {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    /**
     * Create a new date instance which corresponds to the given day, month and year
     * @param year Date's year
     * @param month Date's month
     * @param day Date's day
     * @version 1.0
     * @since 1.3.1
     * @author Álvaro Fernández Barrero
     */
    public Date(int year, int month, int day)
    {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    /**
     * Copies the given date
     * @param date Date instance to copy
     * @version 1.0
     * @since 1.3.1
     * @author Álvaro Fernández Barrero
     */
    public Date(Date date)
    {
        this.year = date.getYear();
        this.month = date.getMonth();
        this.day = date.getDay();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Computes the amount of days in the current month and year
     * @return The amount of days the current month and year have
     * @version 1.1
     * @since 1.3
     * @author Álvaro Fernández Barrero
     */
    private int computeDaysAmountInMonth()
    {
        int maxDays = (this.month & 1) == 1 ? 31 : 30;

        if (this.month == 2)
        {
            maxDays = this.isLeapYear() ? 29 : 28;
        }

        return maxDays;
    }

    /**
     * Computes if the current year is leap
     * @return True if the current year is leap, false otherwise
     * @version 1.0
     * @since 1.3
     * @author Álvaro Fernández Barrero
     */
    public boolean isLeapYear()
    {
        return this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 > 0);
    }


    public String toString()
    {
        return String.format("%d/%02d/%02d", this.year, this.month, this.day);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }


    public byte getMonth()
    {
        return this.month;
    }

    public void setMonth(byte month)
    {
        this.month = (byte)MathFunctions.clamp(month, 1, 12);
    }

    public void setMonth(int month)
    {
        this.setMonth((byte)month);
    }


    public byte getDay()
    {
        return this.day;
    }

    public void setDay(byte day)
    {
        this.day = (byte)MathFunctions.clamp(day, 1, this.computeDaysAmountInMonth());
    }

    public void setDay(int day)
    {
        this.setDay((byte)day);
    }
}