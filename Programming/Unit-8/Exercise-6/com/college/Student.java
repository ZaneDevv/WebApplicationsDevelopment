package com.college;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Student
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private String name = "";
    private int age = 0;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Student(String name, int age)
    {
        this.setName(name);
        this.setAge(age);
    }

    public Student(Student student)
    {
        this.setName(student.getName());
        this.setAge(student.getAge());
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public String toString()
    {
        return String.format("Name: %s\nAge: %d", this.getName(), this.getAge());
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}