package com.datastructures;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class IntQueue
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private int[] array = new int[0];

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public IntQueue() {}

    public IntQueue(int[] array)
    {
        this.array = array;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void add(int x)
    {
        int[] newArray = new int[this.array.length + 1];

        for (int i = 0; i < this.array.length; i++)
        {
            newArray[i] = this.array[i];
        }
        newArray[newArray.length - 1] = x;

        this.array = newArray;
    }

    public int remove() throws Exception
    {
        if (this.isEmpty())
        {
            throw new Exception("Cannot remove ints from a empty IntQueue");
        }

        int firstInt = this.array[0];
        int[] newArray = new int[this.array.length - 1];

        for (int i = 1; i < this.array.length; i++)
        {
            newArray[i - 1] = this.array[i];
        }
        this.array = newArray;

        return firstInt;
    }

    public int checkNth(int index) throws Exception
    {
        if (this.array.length <= 0)
        {
            throw new Exception("This queue is empty!");
        }

        if (index < 0 || index >= this.array.length)
        {
            throw new Exception("The given index is not found in the queue!");
        }

        return this.array[index];
    }

    public int checkFirst() throws Exception
    {
        return this.checkNth(0);
    }

    public int checkLast() throws Exception
    {
        return this.checkNth(this.array.length - 1);
    }

    public boolean isEmpty()
    {
        return this.array.length <= 0;
    }

    public String toString()
    {
        String toPrint = "";

        for (int i = 0; i < this.array.length; i++)
        {
            toPrint += String.valueOf(this.array[i]);

            if (i < this.array.length - 1)
            {
                toPrint += ", ";
            }
        }

        return toPrint;
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    /**
     * Gets the length of the current queue
     * @return The current queue's lenght
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public int getLength()
    {
        return this.array.length;
    }
}