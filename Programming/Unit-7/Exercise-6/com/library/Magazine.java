package com.library;

import com.calendar.Date;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Magazine extends Publication
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private int code = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Magazine() {}

    public Magazine(String title, String isbnCode, Date releaseDate)
    {
        super(title, isbnCode, releaseDate);
    }

    public Magazine(String title, String isbnCode, Date releaseDate, int code)
    {
        super(title, isbnCode, releaseDate);

        this.setCode(code);
    }

    public Magazine(Magazine magazine)
    {
        super(magazine);

        this.setCode(magazine.getCode());
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String toString()
    {
        return String.format("%s\nCode: %d", super.toString(), this.getCode());
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public int getCode()
    {
        return this.code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }
}