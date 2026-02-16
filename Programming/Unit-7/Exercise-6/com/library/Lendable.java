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
    
    public boolean isLent = false;

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void lend();
    public void returnProduct();
}