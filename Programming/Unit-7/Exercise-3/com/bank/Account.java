package com.bank;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public abstract class Account
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private String holder = "";
    private String code = "";
    private double credit = 0;
    private double maintenanceFee = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Account(String holder, String code, double credit, double maintenanceFee)
    {
        this.holder = holder;
        this.code = code;
        this.credit = credit;
        this.maintenanceFee = maintenanceFee;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void deposit(double amount)
    {
        this.credit += amount;
    }


    public boolean reintegrate(double amount)
    {
        return true;
    }


    public static boolean transfer(Account origin, Account addressee, double amount)
    {
        origin.setCredit(origin.getCredit() - amount);
        addressee.setCredit(addressee.getCredit() + amount);

        return true;
    }


    public String toString()
    {
        return String.format("Credit: %.2f€\n", this.credit);
    }


    public abstract boolean applyCommissions();

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public void setHolder(String holder)
    {
        this.holder = holder;
    }

    
    public String getHolder()
    {
        return this.holder;
    }


    public void setCode(String code)
    {
        this.code = code;
    }


    public String getCode()
    {
        return this.code;
    }


    public void setCredit(double credit)
    {
        this.credit = credit;
    }


    public double getCredit()
    {
        return this.credit;
    }


    public double getMaintenanceFee()
    {
        return this.maintenanceFee;
    }
}