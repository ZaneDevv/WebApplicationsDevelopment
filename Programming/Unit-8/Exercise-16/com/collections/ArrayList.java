package com.collections;

/**
 * ArrayList class
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class ArrayList<T> extends Collection<T> implements CollectionMethods<T>
{
    // --------------------------------
    // Constants
    // --------------------------------

    private static int ARRAY_SIZE = 10;

    // --------------------------------
    // Constructor
    // --------------------------------

    public ArrayList()
    {
        super(ArrayList.ARRAY_SIZE);
    }

    // --------------------------------
    // Methods
    // --------------------------------

    private boolean isArrayFull()
    {
        return this.array[this.array.length - 1] != null;
    }

    public void addSpaceToArray()
    {
        T[] newArray = new T[this.length + ArrayList.ARRAY_SIZE];

        for (int i = 0; i < this.array.length; i++)
        {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    @Override
    public void add(T element)
    {
        if (this.isArrayFull())
        {
            this.addSpaceToArray();
        }

        this.array[this.lastPosition] = element;
        this.lastPosition++;
    }

    @Override
    public void remove(T element)
    {
        int elementIndex = -1;

        for (int i = 0; i <= this.lastPosition && elementIndex >= 0; i++)
        {
            if (this.array[i] == element)
            {
                elementIndex = i;
            }
        }

        for (int i = elementIndex + 1; i <= this.lastPosition; i++)
        {
            this.array[i - 1] = this.array[i];
        }

        this.lastPosition--;
    }
}