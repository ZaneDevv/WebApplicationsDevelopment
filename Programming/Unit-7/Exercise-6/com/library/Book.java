package com.library;

import com.calendar.Date;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Book extends Publication implements Lendable
{
    //----------------------------------------
    // Attributes
    //----------------------------------------
    
    public boolean isLendable = false;

    public boolean isLent = false;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Book() {}

    public Book(String title, String isbnCode, Date releaseDate)
    {
        super(title, isbnCode, releaseDate);
    }

    public Book(String title, String isbnCode, Date releaseDate, boolean isLendable)
    {
        super(title, isbnCode, releaseDate);

        this.setIsLendable(isLendable);
    }

    public Book(Book book)
    {
        super(book);

        this.setIsLendable(book.getIsLendable());
    } 

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public void lend()
    {
        if (this.isLendable)
        {
            this.isLent = true;
        }
    }

    @Override
    public void returnProduct()
    {
        if (this.isLent)
        {
            this.isLent = false;
        }
    }

    public String toString()
    {
        return String.format("%s\nIs lendable: %b\nIs lent: %b", super.toString(), this.getIsLendable(), this.isLent);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public boolean getIsLendable()
    {
        return this.isLendable;
    }

    public void setIsLendable(boolean isLendable)
    {
        this.isLendable = isLendable;
    }
}