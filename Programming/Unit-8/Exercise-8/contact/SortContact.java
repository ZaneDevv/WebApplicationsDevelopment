package contact;

import java.util.Comparator;

/**
 * Class for comparing and sorting contacts alphabetically
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class SortContact implements Comparator<Contact>
{
    @Override
    public int compare(Contact contact0, Contact contact1)
    {
        return contact0.getName().compareTo(contact1.getName());
    }
}