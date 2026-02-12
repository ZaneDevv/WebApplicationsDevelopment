package com.vehicles;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Car extends Vehicle
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private float engineDisplacement = 0;
    private float partialKilometers = 0;
    private int revision = 1500;    

    //----------------------------------------
    // Methods
    //----------------------------------------

    public float knowPartialKilometers()
    {
        return this.partialKilometers;
    }

    public void check()
    {
        this.partialKilometers = 0;
    }

    public String toString()
    {
        return String.format(
            "Engine displacement: %.2f\nRevision: %d\nTotal kilometers: %.2f\nPartial kilometers: %.2f\n",
            this.getEngineDisplacement(), this.revision,
            this.getKilometersTraveled(), this.getPartialKilometers()
        );
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public float getEngineDisplacement()
    {
        return this.engineDisplacement;
    }

    public float getPartialKilometers()
    {
        return this.partialKilometers;
    }
}