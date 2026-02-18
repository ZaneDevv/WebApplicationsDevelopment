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

    /**
     * Creates a new empty queue
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public IntQueue() {}

    /**
     * Creates a new queue with all the elements in the given array
     * @param array Array with all the ints to contain in the new queue
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public IntQueue(int[] array)
    {
        this.array = array;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Adds a new int to the queue. It will be the last one
     * @param x Int to add to the queue
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
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

    
    /**
     * Removes the first elemenet in the queue
     * @return The number that was removed (1st)
     * @throws Exception The queue is empty
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
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

    /**
     * Obtains the nth number of the queue
     * @param index Number's index
     * @return The nth number of the queue
     * @throws Exception The current queue is empty
     * @throws Exception The given index is out of the bounds of the queue
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
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

    /**
     * Obtains the first number of the queue
     * @return The first number of the queue
     * @throws Exception The current queue is empty
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public int checkFirst() throws Exception
    {
        return this.checkNth(0);
    }

    /**
     * Obtains the last number of the queue
     * @return The last number of the queue
     * @throws Exception The current queue is empty
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public int checkLast() throws Exception
    {
        return this.checkNth(this.array.length - 1);
    }

    /**
     * Checks if the given queue is empty
     * @return True if the queue is empty, false otherwise
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public boolean isEmpty()
    {
        return this.array.length <= 0;
    }

    /**
     * Turns the current queue into a string
     * @return The queue converted to a string
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
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