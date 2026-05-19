package com.exception;

/**
 * Exception for invalid stocks
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class NotValidStockException extends Exception
{
    public NotValidStockException()
    {
        super("The stock cannot be negative!");
    }
}