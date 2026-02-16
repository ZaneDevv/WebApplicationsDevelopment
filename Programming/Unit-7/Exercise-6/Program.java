import com.library.*;
import com.calendar.Date;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        // Variables

        Publication[] publications = new Publication[3];

        publications[0] = new Book("The forbidden path", "123456", new Date(2007, 5, 2));
        publications[1] = new Magazine("Year zero", "444555", new Date(2019, 11, 21));
        publications[2] = new Publication("The world\'s rose", "444555", new Date(1995, 2, 17));


        // Printing

        for (Publication publication : publications)
        {
            System.out.println(publication);
            System.out.print("\n");
        }
        System.out.print("\n");


        // Testing

        ((Book)publications[0]).lend();
        if (((Book)publications[0]).isLent)
        {
            System.out.print("This book has been lent!");
        }
    }
}