package contact;

import java.util.regex.*;

/**
 * Contact class
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public final class Contact
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private static final Pattern CONTACT_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9áÁéÉíÍóÓúÚàÀèÈìÌòÒùÙäÄëËïÏöÖüÜ]+$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^(\\+\\d{1,3}\\s?)?\\d{9}$");

    private String name = "";
    private String phoneNumber = "";

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Contact(String name, String phoneNumber) throws Exception
    {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
    }

    public Contact(Contact contact) throws Exception
    {
        this.setName(contact.getName());
        this.setPhoneNumber(contact.getPhoneNumber());
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public String toString()
    {
        return String.format("Name: %s\nPhone number: %s", this.name, this.phoneNumber);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getName()
    {
        return this.name;
    }

    public void setName(String name) throws Exception
    {
        if (!Contact.CONTACT_NAME_PATTERN.matcher(name).matches())
        {
            throw new Exception("Incompatible name for contact!");
        }

        this.name = name;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws Exception
    {
        if (!Contact.PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches())
        {
            throw new Exception("Incompatible phone number for contact!");
        }

        this.phoneNumber = phoneNumber;
    }
}