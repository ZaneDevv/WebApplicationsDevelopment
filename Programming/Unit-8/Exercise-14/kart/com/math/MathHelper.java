package com.math;

/**
 * Relevant math features for this project
 * @version 1.2
 * @author Álvaro Fernández Barrero
 */
public class MathHelper
{
    /**
     * Rounds the given number to the given decimal
     * @param x Number to round
     * @param decimals Decimals amount to contain in the rounded number
     * @return The x number rounded with the given amount of decimals
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static float roundToDecimal(double x, int decimals)
    {
        float scientificNotation = (float)Math.pow(10, decimals);
        return (float)Math.floor(x * scientificNotation) / scientificNotation;
    }

    /**
     * Rounds the given number to the given decimal
     * @param x Number to round
     * @param decimals Decimals amount to contain in the rounded number
     * @return The x number rounded with the given amount of decimals
     * @version 1.0
     * @since 1.1
     * @author Álvaro Fernández Barrero
     */
    public static float roundToDecimal(float x, int decimals)
    {
        return MathHelper.roundToDecimal((double)x, decimals);
    }
}