import com.datastructures.IntQueue;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args) throws Exception
    {
        IntQueue queue = new IntQueue();

        for (int i = 0; i < 4; i++)
        {
            queue.add((int)(Math.random() * 101));
            System.out.println(queue);
        }

        System.out.printf("\n\nFirst element: %d\nLast element: %d\n\n", queue.checkFirst(), queue.checkLast());

        int currentLength = queue.getLength();
        for (int i = 0; i < currentLength; i++)
        {
            int removed = queue.remove();

            System.out.println(removed);
            System.out.println(queue);
            System.out.print("\n");
        }

        if (queue.isEmpty())
        {
            System.out.println("Empty queue!");
        }
    }
}