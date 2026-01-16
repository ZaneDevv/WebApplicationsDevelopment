import com.animals.*;
import com.utils.Printer;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public class Program
{
    public static void main(String[] args)
    {
        Animal myPet = new Horse();
        myPet.setName("My pet");
        myPet.speak();

        System.out.println(myPet.toString());
    }
}