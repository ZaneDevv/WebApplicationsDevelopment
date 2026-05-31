package collections;

import java.util.Arrays;

/**
 * Array of ints
 * @version 1.2
 * @author Álvaro Fernández Barrero
 */
public class ArrayInt
{
    // -------------------------------
    // Attributes
    // -------------------------------

    private int[] array;

    // -------------------------------
    // Constructor
    // -------------------------------

    /**
     * Creates a new ArrayInt with the given amount of integers to store
     * @param size Array's size
     * @version 1.1
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public ArrayInt(int size)
    {

        array = new int[Math.max(size, 0)];
    }

    // -------------------------------
    // Methods
    // -------------------------------

    /**
     * Fills up the array with random numbers
     * @param size Array's size
     * @version 1.2
     * @since 1.1
     * @author Álvaro Fernández Barrero
     */
    public void fill()
    {
        for (int i = 0; i < array.length; i++)
        {
            this.array[i] = (int)(Math.random() * 101);
        }
    }

    /**
     * Sorts the array from least to greatest
     * @version 1.1
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void sort()
    {
        Arrays.sort(this.array);
    }

    /**
     * Gives a string to print the class
     * @return String version of the class in the current status
     * @version 1.1
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append("{\n");

        for (int i = 0; i < array.length; i++)
        {
            result.append("\t[");
            result.append(i);
            result.append("] = ");
            result.append(array[i]);
            result.append(";\n");
        };


        result.append("}");
        return result.toString();
    }
}