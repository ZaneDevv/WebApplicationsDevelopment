package com.vehicles;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Bike extends Vehicle
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private int pinionsAmount = 0;
    private float partialKilometers = 0;

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void changePinions(int pinionsAmount)
    {
        this.pinionsAmount = pinionsAmount;
        this.partialKilometers = 0;
    }

    public String toString()
    {
        return String.format(
            "Pinions amount: %d\nTotal kilometers: %.2f\nPartial kilometers: %.2f\n",
            this.pinionsAmount,
            this.getKilometersTraveled(), this.getPartialKilometers()
        );
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public int getPinionsAmount()
    {
        return this.pinionsAmount;
    }

    public float getPartialKilometers()
    {
        return this.partialKilometers;
    }
}