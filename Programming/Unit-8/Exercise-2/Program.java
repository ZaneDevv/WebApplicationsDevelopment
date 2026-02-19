import com.datastructures.Pair;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        Pair<Integer, String> pair = new Pair<Integer, String>(10, "Test");
        
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}