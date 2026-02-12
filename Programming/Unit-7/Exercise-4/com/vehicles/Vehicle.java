package com.vehicles;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public abstract class Vehicle
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    protected static int createdVehiclesAmount = 0;
    protected static float totalKilometers = 0;

    private float kilometersTraveled = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Vehicle()
    {
        Vehicle.createdVehiclesAmount++;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void travel(float kilometers)
    {
        this.kilometersTraveled += kilometers;  
        this.totalKilometers += kilometers;
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public static int getCreatedVehicles()
    {
        return Vehicle.createdVehiclesAmount;
    }

    public static float getTotalKilometers()
    {
        return Vehicle.totalKilometers;
    }

    public float getKilometersTraveled()
    {
        return this.kilometersTraveled;
    }
}