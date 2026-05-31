package com.collections;

/**
 * Collection class
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public abstract class Collection<T>
{
    // --------------------------------
    // Attributes
    // --------------------------------

    protected T[] array;
    protected int lastPosition = 0;

    // --------------------------------
    // Constructor
    // --------------------------------

    public Collection()
    {
        array = new T[10];
    }

    public Collection(int size)
    {
        array = new T[size];
    }

    // --------------------------------
    // Methods
    // --------------------------------

    @Override
    public String toString()
    {
        StringBuilder stringResult = new StringBuilder();
        stringResult.append("[");

        for (int i = 0; i < this.array.length; i++)
        {
            stringResult.append(this.array[i]);

            if (this.array.length - 1 != i)
            {
                stringResult.append(", ");
            }
        }

        stringResult.append("]");
        return stringResult.toString();
    }

    public boolean contains(T element)
    {
        boolean found = false;

        for (int i = 0; i <= this.lastPosition && !found; i++)
        {
            if (element.equals(this.array[i]))
            {
                found = true;
            }
        }

        return found;
    }
}