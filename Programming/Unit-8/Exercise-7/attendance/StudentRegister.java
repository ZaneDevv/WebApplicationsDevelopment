package attendance;

import java.util.HashSet;

/**
 * Class to register the students that attend to class
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public final class StudentRegister
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private HashSet<String> studentsInClass = new HashSet<>();

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Registers the given student
     * @param studentName Student to register's name
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void registerStudent(String studentName)
    {
        this.studentsInClass.add(studentName);
    }

    @Override
    public String toString()
    {
        return String.valueOf(studentsInClass);
    }
}