package com.courses;

import java.util.regex.*;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández Barrero
 */

public class Student
{
	// Constants

	private static final Pattern ID_PATTERN = Pattern.compile("^\\d{8}[A-Z]$");



	// Attributes

	private String id = "00000000A";
	private String name = "";

	private float[] semestersMark = {-1, -1, -1};



	// Constructors

	/**
	 * @brief Creates an empty student
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Student() {}


	/**
	 * @brief Creates a student with the given parameters
	 * @param id Student's ID
	 * @param name Student's name
	 * @throws Exception Invalid ID
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Student(String id, String name) throws Exception
	{
		this.setId(id);
		this.setName(name);
	}


	/**
	 * @brief Copies the given student
	 * @param student Student to copy
	 * @throws Exception Invalid ID
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Student(Student student) throws Exception
	{
		this.setId(student.getId());
		this.setName(student.getName());

		this.setMark(0, student.getMark(0));
		this.setMark(1, student.getMark(1));
		this.setMark(2, student.getMark(2));
	}



	// Methods

	/**
	 * @brief Computes the total mark of the course. It corresponds to the avarage of the three semesters's mark
	 * @return The total mark of the three semesters. -1 if the student has no evaluated semester
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float computeTotalMark()
	{
		float result = 0;
		byte marksAmount = 0;

		for (float mark : this.semestersMark)
		{
			if (mark >= 0)
			{
				result += mark;
				marksAmount++;
			}
		}

		return marksAmount == 0 ? -1 : result / marksAmount;
	}


	/**
	 * @brief Displays the student's information
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void displayInformation()
	{
		System.out.printf("Name: %s\nID: %s\n", this.getName(), this.getId());
		System.out.printf("\nSemesters 1 mark: %.1f\nSemesters 2 mark: %.1f\nSemesters 3 mark: %.1f", this.getMark(0), this.getMark(1), this.getMark(2));
		System.out.printf("\nTotal: %.1f\n", this.computeTotalMark());
	}



	// Getters and setters

	/**
	 * @brief Obtains student's id
	 * @return Student's id
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public String getId()
	{
		return this.id;
	}


	/**
	 * @brief Sets the student's ID
	 * @param id Student's ID
	 * @throws Exception Invalid ID
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setId(String id) throws Exception
	{
		if (!Student.ID_PATTERN.matcher(id).matches())
		{
			throw new Exception("Invalid ID! " + id);
		}

		this.id = id;
	}


	/**
	 * @brief Obtains student's name
	 * @return Student's name
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public String getName()
	{
		return this.name;
	}


	/**
	 * @brief Sets the student's name
	 * @param name Student's name
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setName(String name)
	{
		this.name = name;
	}


	/**
	 * @brief Sets the student's mark in a specific semester
	 * @param semesterIndex Semester's index
	 * @param mark Mark to set
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setMark(int semesterIndex, float mark)
	{
		this.semestersMark[semesterIndex] = mark;
	}


	/**
	 * @brief Obtains student's mark in a specific semester
	 * @return Student's mark in a specific semester
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float getMark(int semesterIndex)
	{
		return this.semestersMark[semesterIndex];
	}


	/**
	 * @brief Obtains student's marks
	 * @return Student's marks
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float[] getMarks()
	{
		return this.semestersMark;
	}
}