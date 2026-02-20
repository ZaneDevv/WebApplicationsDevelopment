import com.college.*;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        Student student0 = new Student("A", 20);
        Student student1 = new Student("B", 21);
        Student student2 = new Student("C", 22);
        Student student3 = new Student("D", 23);
        Student student4 = new Student("E", 24);
        Student student5 = new Student("F", 25);

        StudentsList list = new StudentsList();
        list.add(student0);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        list.showStudents();

        System.out.printf("\n\n%s", list.search(student5));
    }
}