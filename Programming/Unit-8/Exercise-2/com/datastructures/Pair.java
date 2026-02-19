package com.datastructures;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Pair<T, U>
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private T first;
    private U second;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public T getFirst()
    {
        return this.first;
    }

    public U getSecond()
    {
        return this.second;
    }
}