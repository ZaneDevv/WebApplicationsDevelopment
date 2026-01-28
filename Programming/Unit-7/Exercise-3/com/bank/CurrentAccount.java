package com.bank;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class CurrentAccount extends Account
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private double importPerTransaction = 0;
    private int transactionsAmount = 0;
    private int exemptTransactionsAmount = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public CurrentAccount()
    {
        super("A", "A", 0, 0);
    }


    public CurrentAccount(String holder, String code, double credit, double maintenanceFee,
                          double importPerTransaction, int transactionsAmount, int exemptTransactionsAmount)
    {
        super(holder, code, credit, maintenanceFee);

        this.importPerTransaction = importPerTransaction;
        this.transactionsAmount = transactionsAmount;
        this.exemptTransactionsAmount = exemptTransactionsAmount;
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

    public void setImportPerTransaction(double importPerTransaction)
    {
        this.importPerTransaction = importPerTransaction;
    }


    public double getImportPerTransaction()
    {
        return this.importPerTransaction;
    }


    public void setTransactionsAmount(int transactionsAmount)
    {
        this.transactionsAmount = transactionsAmount;
    }


    public int getTransactionsAmount()
    {
        return this.transactionsAmount;
    }


    public int getExemptTransactionsAmount()
    {
        return this.exemptTransactionsAmount;
    }
}