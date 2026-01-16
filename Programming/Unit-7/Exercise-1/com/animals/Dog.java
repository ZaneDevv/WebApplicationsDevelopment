package com.animals;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public class Dog extends Animal
{
    //---------------------------
    // Methods
    //---------------------------

    @Override
    public void speak()
    {
        System.out.println("Dog > Woof");
    }
}