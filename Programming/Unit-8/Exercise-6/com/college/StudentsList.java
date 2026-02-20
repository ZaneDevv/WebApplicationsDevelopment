package com.college;

import java.util.ArrayList;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class StudentsList
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private ArrayList<Student> list = new ArrayList<Student>();

    //----------------------------------------
    // Methods
    //----------------------------------------

    public StudentsList() {}

    public StudentsList(Student[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            this.list.add(array[i]);
        }
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void add(Student student)
    {
        this.list.add(student);
    }

    public void showStudents()
    {
        for (Student student : this.list)
        {
            System.out.println(student);
        }
    }

    public Student search(Student student)
    {
        for (Student currentStudent : this.list)
        {
            if (student == currentStudent)
            {
                return currentStudent;
            }
        }

        return null;
    }
}