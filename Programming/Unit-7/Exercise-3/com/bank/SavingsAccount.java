package com.bank;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class SavingsAccount extends Account
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private double rateOfInterest = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public SavingsAccount()
    {
        super("A", "A", 0, 0);
    }


    public SavingsAccount(String holder, String code, double credit, double maintenanceFee, double rateOfInterest)
    {
        super(holder, code, credit, maintenanceFee);
        this.rateOfInterest = rateOfInterest;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public boolean applyCommissions()
    {
        return true;
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public void setRateOfInterest(double rateOfInterest)
    {
        this.rateOfInterest = rateOfInterest;
    }


    public double getRateOfInterest()
    {
        return this.rateOfInterest;
    }
}