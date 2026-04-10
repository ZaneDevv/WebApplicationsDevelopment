import attendance.*;

public class Program
{
    public static void main(String[] args)
    {
        StudentRegister register = new StudentRegister();

        register.registerStudent("John");
        register.registerStudent("Mary");
        register.registerStudent("David");
        register.registerStudent("Mark");

        System.out.println(register);
    }
}