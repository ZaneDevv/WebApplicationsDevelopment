package com.exception;

/**
 * Exception for invalid prices
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class NotValidPriceException extends Exception
{
    public NotValidPriceException()
    {
        super("The price cannot be negative!");
    }
}