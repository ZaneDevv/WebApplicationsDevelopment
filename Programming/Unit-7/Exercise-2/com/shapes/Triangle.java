package com.shapes;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Triangle extends Shape
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
     * Creates a brand new triangle with the height and base of 1
     * @return The new triangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Triangle()
    {
        this.setHeight(1);
        this.setBase(1);
    }

    /**
     * Creates a brand new triangle with the given height and base
     * @param height The new triangle's height
     * @param base The new triangle's base
     * @return The new triangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Triangle(float height, float base)
    {
        this.setHeight(height);
        this.setBase(base);
    }

    /**
     * Copies the given triangle
     * @param triangle Triangle to copy
     * @return The new triangle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Triangle(Triangle triangle)
    {
        this.height = triangle.getHeight();
        this.base = triangle.getBase();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public float computeArea()
    {
        return this.getHeight() * this.getBase() / 2f;
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