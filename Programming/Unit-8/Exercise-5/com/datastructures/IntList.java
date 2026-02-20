package com.datastructures;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class IntList
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private int[] array = new int[0];
    private int length = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public IntList()
    {
        this.array = new int[this.length];
    }

    public IntList(int capacity)
    {
        this.array = new int[capacity];
    }

    public IntList(int[] array)
    {
        this.array = array;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Adds a new element to the list
     * @param integer Number to add
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void add(int integer)
    {
        if (this.length < this.array.length)
        {
            this.array[this.length] = integer;
        }
        else
        {
            int[] newArray = new int[this.length + 6];

            for (int i = 0; i < this.array.length; i++)
            {
                newArray[i] = this.array[i];
            }
            newArray[this.array.length] = integer;

            this.array = newArray;
        }

        this.length++;
    }

    /**
     * Adds up all the numbers in the list
     * @return The result of adding up all the numbers in the list
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public int addUp()
    {
        int result = 0;

        for (int number : this.array)
        {
            result += number;
        }

        return result;
    }

    /**
     * Converts the current list to a string
     * @return The list in form of string
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < this.length; i++)
        {
            result.append(this.array[i]);
            result.append(i == this.length - 1 ? "]" : ", ");
        }

        return result.toString();
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    /**
     * Obtains the current list's length
     * @return The current list's length
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public int getLength()
    {
        return this.length;
    }
}