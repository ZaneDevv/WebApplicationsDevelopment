import java.util.LinkedList;

/**
 * Browser's history simulation: LinkedList tester
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    public static final int MAXIMUM_PAGES = 3;

    //----------------------------------------
    // Methods
    //----------------------------------------

    public static void main(String[] args)
    {
        String savedPage = "";

        LinkedList<String> history = new LinkedList<>();

        // b) Register web pages the user has visited
        history.addFirst("https://www.google.com/search?q=google.com");
        history.addFirst("wikipedia.org/Java");
        history.addFirst("stackoverflow.com");
        history.addFirst("github.com");

        // c) Checking last page visited
        System.out.printf("First page visited: %s\n", history.peekFirst());

        // d) Ensuring maximum amount of pages in history
        while (history.size() > MAXIMUM_PAGES)
        {
            history.removeLast();
        }
        
        // e) Back button
        savedPage = history.removeFirst();

        // f) Show the result
        for (String page : history)
        {
            System.out.println(page);
        }
    }
}