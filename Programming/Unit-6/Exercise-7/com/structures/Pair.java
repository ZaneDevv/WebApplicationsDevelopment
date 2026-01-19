package com.structures;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public class Pair<T, U>
{
    //---------------------------------------
    // Attributes
    //---------------------------------------
    
    private T key;
    private U value;

    //---------------------------------------
    // Constructor
    //---------------------------------------

    public Pair(T key, U value)
    {
        this.setKey(key);
        this.setValue(value);
    }

    //---------------------------------------
    // Getters & setters
    //---------------------------------------

    /**
     * Sets the key for the current pair
     * @param key Key to set
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
    */
    public void setKey(T key)
    {
        this.key = key;
    }

     /**
     * Gets the current pair's key
     * @return The current pair's key
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
    */
    public T getKey()
    {
        return this.key;
    }


    /**
     * Sets the key for the current value
     * @param value Value to set
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
    */
    public void setValue(U value)
    {
        this.value = value;
    }

     /**
     * Gets the current pair's value
     * @return The current pair's value
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
    */
    public U getValue()
    {
        return this.value;
    }
}