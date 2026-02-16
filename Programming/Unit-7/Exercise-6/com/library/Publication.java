package com.library;

import com.calendar.Date;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Publication
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    protected Date releaseDate = new Date();
    
    protected String isbnCode = "";
    protected String title = "";

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Publication() {}

    public Publication(String title, String isbnCode, Date releaseDate)
    {
        this.setTitle(title);
        this.setIsbnCode(isbnCode);
        this.setReleaseDate(releaseDate);
    }

    public Publication(Publication book)
    {
        this.isbnCode = book.getIsbnCode();
        this.title = book.getTitle();
        this.releaseDate = book.getReleaseDate();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public String toString()
    {
        return String.format("ISBN: %s\nRelease date: %s\nTitle: %s", this.isbnCode, this.releaseDate, this.title);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getIsbnCode()
    {
        return this.isbnCode;
    }

    public void setIsbnCode(String isbnCode)
    {
        this.isbnCode = isbnCode;
    }


    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }


    public Date getReleaseDate()
    {
        return this.releaseDate;
    }

    public void setReleaseDate(Date date)
    {
        this.releaseDate = releaseDate;
    }
}