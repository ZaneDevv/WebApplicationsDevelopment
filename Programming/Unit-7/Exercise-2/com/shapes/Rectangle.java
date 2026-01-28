package com.shapes;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Rectangle extends Shape
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private float height = 0;
    private float base = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    /**
     * Creates a brand new rectangle with the height and base of 1
     * @return The new rectangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Rectangle()
    {
        this.setHeight(1);
        this.setBase(1);
    }

    /**
     * Creates a brand new rectangle with the given height and base
     * @param height The new rectangle's height
     * @param base The new rectangle's base
     * @return The new rectangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Rectangle(float height, float base)
    {
        this.setHeight(height);
        this.setBase(base);
    }

    /**
     * Copies the given rectangle
     * @param rectangle Rectangle to copy
     * @return The new rectangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Rectangle(Rectangle rectangle)
    {
        this.height = rectangle.getHeight();
        this.base = rectangle.getBase();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public float computeArea()
    {
        return this.getHeight() * this.getBase();
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public void setHeight(float height)
    {
        this.height = Math.abs(height);
    }

    public float getHeight()
    {
        return this.height;
    }

    public void setBase(float base)
    {
        this.base = Math.abs(base);
    }

    public float getBase()
    {
        return this.base;
    }
}