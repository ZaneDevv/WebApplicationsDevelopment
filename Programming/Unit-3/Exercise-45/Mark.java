import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @date 25/10/31
 * @author Álvaro Fernández Barrero
 */
 
public class Mark
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	// Defining percentages
	
	private static final byte CLASS_MARK_PERCENTAGES = 10;
	private static final byte PRACTICES_MARK_PERCENTAGES = 30;
	private static final byte EXAM_MARK_PERCENTAGES = 60;
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		float classMark = 0.0f;
		float practicesMark = 0.0f;
		float examMark = 0.0f;
		float totalMark = 0.0f;
		
		
		// Setting marks
		
		try
		{
			System.out.print("Set the class mark: ");
			classMark = input.nextFloat();
			
			if (classMark < 0 || classMark > 10)
			{
				throw new Exception("Marks cannot be less than 0 nor more than 10!");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
			return;
		}
		
		try	
		{
			System.out.print("Set the practices mark: ");
			practicesMark = input.nextFloat();
			
			if (practicesMark < 0 || practicesMark > 10)
			{
				throw new Exception("Marks cannot be less than 0 nor more than 10!");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
			return;
		}
		
		try
		{
			System.out.print("Set the exam mark: ");
			examMark = input.nextFloat();
			
			if (examMark < 0 || examMark > 10)
			{
				throw new Exception("Marks cannot be less than 0 nor more than 10!");
			}
		}
		catch (InputMismatchException exception)
		{
			System.out.println(ANSI_RED + "Only numbers are accepted!" + ANSI_RESET);
			return;
		}
		catch (Exception exception)
		{
			System.out.println(ANSI_RED + exception.getMessage() + ANSI_RESET);
			return;
		}
		
		
		// Computing total mark
		
		totalMark = (float)((classMark * CLASS_MARK_PERCENTAGES + practicesMark * PRACTICES_MARK_PERCENTAGES + examMark * EXAM_MARK_PERCENTAGES) / 1e+2);
		
		if (examMark < 5)
		{
			totalMark = Math.min(totalMark, 4);
		}
		
		
		// Printing result
		
		System.out.printf("Your final mark is %.2f", totalMark);
		
		
		input.close();
	}
}
