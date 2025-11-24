import com.courses.*;


/**
 * @version 1.0
 * @date 2025/11/24
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Student student0 = new Student("12345678P", "Bob");
			Student[] students = {
				new Student(student0),
				new Student(student0),
				new Student(student0),
				new Student(student0),
				new Student(student0)
			};

			Course course = new Course("Physics", "Erwin Schrödinger", students);

			course.displayInformation();
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}