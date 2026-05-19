package com.exception;

/**
 * Exception for invalid name
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class NotValidNameException extends Exception
{
    public NotValidNameException()
    {
        super("The given name is has forbidden characters!");
    }
}