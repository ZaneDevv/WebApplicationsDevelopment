import java.util.HashSet;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    private static HashSet<String> students = new HashSet<String>();

    public static void main(String[] args)
    {
        students.add("Alvaro");
        students.add("Mateo");
        students.add("Pablo");
        students.add("Alvaro");
        students.add("Vicente");


        for (String name : students)
        {
            System.out.println(name);
        }
    }
}