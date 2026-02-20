import com.datastructures.*;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        IntList list = new IntList();

        for (int i = 1; i <= 100; i++)
        {
            list.add(i);
        }

        System.out.println(list);
        System.out.printf("Addition: %d", list.addUp());
    }
}