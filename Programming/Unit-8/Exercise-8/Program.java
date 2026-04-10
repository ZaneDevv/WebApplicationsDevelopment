import contact.*;
import java.util.TreeSet;

public class Program
{
    public static void main(String[] args)
    {
        try
        {
            Contact contact0 = new Contact("John", "000000000");
            Contact contact1 = new Contact("Jane", "111111111");
            Contact contact2 = new Contact("John", "222222222");
            Contact contact3 = new Contact("John", "333333333");
            Contact contact4 = new Contact("John", "444444444");
            Contact contact5 = new Contact("John", "555555555");

            TreeSet<Contact> treeSet = new TreeSet<>(new SortContact());
            treeSet.add(contact0);
            treeSet.add(contact1);
            treeSet.add(contact2);
            treeSet.add(contact3);
            treeSet.add(contact4);
            treeSet.add(contact5);

            for (Contact contact : treeSet)
            {
                System.out.println(contact);
                System.out.println("--------------------------------");
            }
        }
        catch (Exception Exception)
        {
            System.out.println(Exception.getMessage());
        }
    }
}