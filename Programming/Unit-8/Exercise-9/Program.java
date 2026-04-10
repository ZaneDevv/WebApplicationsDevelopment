import java.util.ArrayList;

/**
 * Race competition program: testing ArrayList's methods
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        // a) Listing participants
        ArrayList<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("Carlos");
        list.add("Beatriz");
        list.add("David");
        list.add("Elena");

        // b) Unexpected: Beatriz's out
        list.remove("Beatriz");

        // c) Comeback: David's the first now
        for (int i = list.indexOf("David"); i > 0; i--)
        {
            list.set(i, list.get(i - 1));
        }
        list.set(0, "David");

        // d) Replacement: Carlos's out and is replaced by Zacarías
        list.set(list.indexOf("Carlos"), "Zacarías");

        // f) Podium
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("%dº: %s\n", i + 1, list.get(i));
        }
    }
}