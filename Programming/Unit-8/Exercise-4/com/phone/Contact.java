package com.phone;

import java.util.regex.*;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Contact
{
    //----------------------------------------
    // Constants
    //----------------------------------------

    private static final Pattern NUMBER_PATTERN = Pattern.compile("^(\\+\\d{1,3}\\s?)?\\d{3}\\s?(\\d{2}\\s?){3}$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9-_\\.][a-zA-Z]@([a-zA-Z][a-zA-Z0-9-_\\.]+[a-zA-Z]\\.)+[a-zA-Z]{2,}$");

    //----------------------------------------
    // Attributes
    //----------------------------------------

    private String name = "";
    private String number = "";
    private String email = "";

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Contact(String name, String number, String email) throws Exception
    {
        this.setName(name);
        this.setNumber(number);
        this.setEmail(email);
    }

    public Contact(Contact contact)
    {
        this.name = contact.getName();
        this.number = contact.getNumber();
        this.email = contact.getEmail();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public String toString()
    {
        return String.format("Name: %s\nNumber: %s\nEmail: %s\n", this.getName(), this.getNumber(), this.getEmail());
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name.trim();
    }


    public String getNumber()
    {
        return this.number;
    }

    public void setNumber(String number) throws Exception
    {
        number = number.trim();

        boolean isValidNumber = Contact.NUMBER_PATTERN.matcher(number).matches();
        if (!isValidNumber)
        {
            throw new Exception("Invalid number! It does not obey the set of rules!");
        }

        this.number = number;
    }


    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email) throws Exception
    {
        email = email.trim();

        boolean isValidEmail = Contact.EMAIL_PATTERN.matcher(email).matches();
        if (!isValidEmail)
        {
            throw new Exception("Invalid email! It does not obey the set of rules!");
        }

        this.email = email;
    }
}