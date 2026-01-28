package com.shapes;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Circle extends Shape
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private float radius = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    /**
     * Creates a brand new circle with the radius of 1
     * @return The new circle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Circle()
    {
        this.setRadius(1);
    }

    /**
     * Creates a brand new circle with the given radius
     * @param radius New circle's radius
     * @return The new circle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Circle(float radius)
    {
        this.setRadius(radius);
    }

    /**
     * Copies the given circle
     * @param circle Circle to copy
     * @return The new circle
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Circle(Circle circle)
    {
        this.radius = circle.getRadius();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public float computeArea()
    {
        return (float)Math.PI * this.getRadius() * this.getRadius();
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public void setRadius(float radius)
    {
        this.radius = Math.abs(radius);
    }

    public float getRadius()
    {
        return this.radius;
    }
}