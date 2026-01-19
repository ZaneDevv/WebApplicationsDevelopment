package com.math;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public class Number
{
    /**
     * Obtains the amount of digits the given number has
     * @param x The number to check the amount of digits it has
     * @return The amount of digits the given number has
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static byte getDigits(int x)
    {
        if (x == 0)
        {
            return 1;
        }

        byte digits = 0;

        while (x > 0)
        {
            digits++;
            x /= 10;
        }

        return digits;
    }
}