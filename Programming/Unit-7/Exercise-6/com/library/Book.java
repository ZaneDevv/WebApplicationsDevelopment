package com.library;


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
        System.out.println("Book lent!");
    }

    @Override
    public void return()
    {
        System.out.println("The book has been returned!");
    }

    public String toString()
    {
        return String.format("%s\nIs lendable: %b", super, this.getIsLendable());
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