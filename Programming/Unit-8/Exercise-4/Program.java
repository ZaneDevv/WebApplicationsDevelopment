import com.phone.Contact;
import java.util.HashSet;
import java.util.Scanner;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private static HashSet<Contact> contacts = new HashSet<Contact>();

    private static Scanner input = new Scanner(System.in);

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Main program
     */
    public static void main(String[] args) throws Exception
    {
        addContacts();

        for (Contact contact : contacts)
        {
            System.out.println(contact);
        }

        input.close();
    }


    /**
     * Adds contacts to the HashSet
     */
    private static void addContacts()
    {
        char status = 'Y';

        String contactName = "";
        String contactNumber = "";
        String contactEmail = "";

        System.out.println("Do you want to add a new contact? [Y/N]");
        status = input.nextLine().charAt(0);

        if (status == 'y' || status == 'Y')
        {
            System.out.print("Contact\'s name: ");
            contactName = input.nextLine();

            System.out.print("Contact\'s phone: ");
            contactNumber = input.nextLine();

            System.out.print("Contact\'s email: ");
            contactEmail = input.nextLine();

            try
            {
                Contact contact = new Contact(contactName, contactNumber, contactEmail);
                contacts.add(contact);
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }

            addContacts();
        }
    }
}