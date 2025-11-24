package com.courses;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández Barrero
 */

public class Course
{
	// Attributes

	private String name = "";
	private String professorName = "";
	private Student[] students = new Student[20];



	// Constructors

	/**
	 * @brief Creates an empty course
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Course() {}


	/**
	 * @brief Creates a course with the given parameters
	 * @param name Course's name
	 * @param professorName Course's professor's name
	 * @param students Students in the course
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Course(String name, String professorName, Student[] students)
	{
		this.setName(name);
		this.setProfessorName(professorName);
		this.setStudents(students);
	}


	/**
	 * @brief Copies the given course
	 * @param cource Course to copy
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Course(Course course)
	{
		this.setName(course.getName());
		this.setProfessorName(course.getProfessorName());
		this.setStudents(course.getStudents());
	}



	// Methods

	/**
	 * @brief Computes the avarage mark of the students in the given semester
	 * @param semesterIndex Index of the semester to check
	 * @return The avarage of the student's mark in the given semester
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public float computeSemesterAvarage(int semesterIndex)
	{
		float result = 0;
		byte marksAmount = 0;

		for (Student student : this.students)
		{
			if (student == null)
			{
				continue;
			}

			float mark = student.getMark(semesterIndex);

			if (mark >= 0)
			{
				result += mark;
				marksAmount++;
			}
		}

		return result / marksAmount;
	}


	/**
	 * @brief Displays the course's information
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void displayInformation()
	{
		System.out.print("COURSE:\n");
		System.out.printf("Name: %s\nProfessor\'s name: %s", this.getName(), this.getProfessorName());

		for (Student student : this.students)
		{
			if (student != null)
			{
				System.out.print("\nSTUDENT:\n");
				student.displayInformation();
			}
		}
	}



	// Getters and setters

	/**
	 * @brief Obtains course's name
	 * @return Course's name
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public String getName()
	{
		return this.name;
	}


	/**
	 * @brief Sets the course's name
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
	 * @brief Obtains course's professor's name
	 * @return Course's professor's name
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public String getProfessorName()
	{
		return this.professorName;
	}


	/**
	 * @brief Sets the course's professor's name
	 * @param name Course's professor's name
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setProfessorName(String name)
	{
		this.professorName = name;
	}


	/**
	 * @brief Obtains course's students
	 * @return Course's students
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public Student[] getStudents()
	{
		return this.students;
	}


	/**
	 * @brief Sets the course's students
	 * @param students Students in the course
	 * @version 1.0
	 * @date 2025/11/24
	 * @author Álvaro Fernández Barrero
	 */
	public void setStudents(Student[] students)
	{
		for (int i = 0; i < Math.min(students.length, this.students.length); i++)
		{
			this.students[i] = students[i];
		}
	}
}