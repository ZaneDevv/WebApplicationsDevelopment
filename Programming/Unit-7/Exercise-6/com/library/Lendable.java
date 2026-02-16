package com.library;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public interface Lendable
{
    //----------------------------------------
    // Attributes
    //----------------------------------------
    
    public boolean isLent;

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void lend();
    public void return();
}