package com.animals;

import com.utils.Text;
import com.utils.Printer;
import java.util.regex.*;


/**
 * @version 2.0
 * @author Álvaro Fernández Barrero
 */

public abstract class Animal
{
    //---------------------------
    // Constants
    //---------------------------

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{3,}$");
    private static final String DEFAULT_NAME = "Pet";

    //---------------------------
    // Attributes
    //---------------------------

    private String name = "";
    private int age = 0;

    //---------------------------
    // Constructors
    //---------------------------

    /**
     * Creates a new animal with default attribute's values
     * @since 1.3
     * @version 1.0
     * @author Álvaro Fernández Barrero
     */
    public Animal()
    {
        this.setName("Default name");
        this.setAge(0);
    }


    /**
     * Creates a new animal with the given attribute's value
     * @param name Animal's name
     * @since 1.3
     * @version 1.0
     * @author Álvaro Fernández Barrero
     */
    public Animal(String name)
    {
        this.setName(DEFAULT_NAME);
        this.setAge(age);
    }


    /**
     * Creates a new animal by copying another
     * @param animal Animal object to copy
     * @since 1.3
     * @version 1.0
     * @author Álvaro Fernández Barrero
     */
    public Animal(Animal animal)
    {
        this.setName(animal.getName());
        this.setAge(animal.getAge());
    }
    

    //---------------------------
    // Methods
    //---------------------------

    /**
     * Makes the animal speak
     * @version 1.0
     * @since 1.6
     * @author Álvaro Fernández Barrero
     */
    public abstract void speak();


    /**
     * Gives a string with the animal's description
     * @return Animal's data
     * @version 1.0
     * @since 1.6
     * @author Álvaro Fernández Barrero
     */
    public String toString()
    {
        return String.format("Name: %s\nAge: %d", this.getName(), this.getAge());
    }

    //---------------------------
    // Getters & setters
    //---------------------------

    /**
     * Gets the animal's name
     * @return Animal's name
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * Sets a name for the animal
     * @param name Name to set to the animal
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void setName(String name)
    {
        boolean canNameBeSet = Animal.NAME_PATTERN.matcher(name).matches();

        if (!canNameBeSet)
        {
            name = DEFAULT_NAME;
            Printer.warn("Invalid name!\nSetting the default name...\n");
        }

        this.name = Text.formatString(name);
    }


    /**
     * Gets the animal's age
     * @return Animal's age
     * @version 1.0
     * @since 1.4
     * @author Álvaro Fernández Barrero
     */
    public int getAge()
    {
        return this.age;
    }


    /**
     * Sets the animal's age
     * @param age Animal's age
     * @version 1.0
     * @since 1.4
     * @author Álvaro Fernández Barrero
     */
    public void setAge(int age)
    {
        this.age = age > 0 ? age : 0;
    }
}