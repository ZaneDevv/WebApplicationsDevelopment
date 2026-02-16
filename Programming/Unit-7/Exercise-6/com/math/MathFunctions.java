package com.math;


/**
 * @version 1.2
 * @author Álvaro Fernández Barrero
 */
public class MathFunctions
{
    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Limits the given number x within the boundary [min, max]
     * @param x Number to limit
     * @param min The minimum value the given value x can have
     * @param max The maximum value the given value x can have
     * @return The given value x limited within the given min and max values
     * @version 1.1
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static <T extends Number> double clamp(T x, T min, T max)
    {
        return x < min ? min : x > max ? max : x;
    }
}