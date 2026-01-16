package com.animals;


/**
 * @version 2.0
 * @author Álvaro Fernández Barrero
 */

public class Horse extends Animal
{
    //---------------------------
    // Attributes
    //---------------------------

    private boolean doesCompete = false;

    //---------------------------
    // Methods
    //---------------------------

    @Override
    public void speak()
    {
        System.out.println("Horse > Pfff");
    }


    /**
     * Gives a string with the animal's description
     * @return Animal's data
     * @version 1.0
     * @since 1.6
     * @author Álvaro Fernández Barrero
     */
    @Override
    public String toString()
    {
        return String.format("Name: %s\nAge: %d\nDoes compete: %b\n", this.getName(), this.getAge(), this.getDoesCompete());
    }

    //---------------------------
    // Getters & setters
    //---------------------------

    /**
     * Check if the horse competes
     * @return True if the horse competes, false otherwise
     * @version 1.0
     * @since 1.4
     * @author Álvaro Fernández Barrero
     */
    public boolean getDoesCompete()
    {
        return this.doesCompete;
    }


    /**
     * Sets wether the horse competed
     * @param doesCompete True if the horse competes, false otherwise
     * @version 1.0
     * @since 1.4
     * @author Álvaro Fernández Barrero
     */
    public void setDoesCompete(boolean doesCompete)
    {
        this.doesCompete = doesCompete;
    }
}