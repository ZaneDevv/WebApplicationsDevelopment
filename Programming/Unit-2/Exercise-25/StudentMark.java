import java.util.Scanner;

public class StudentMark
{
	private static final byte POINTS_PER_CORRECT_ANSWER = 5;
	private static final byte POINTS_PER_EMPTY_ANSWER = 0;
	private static final byte POINT_PER_WRONG_ANSWER = -1;

	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		int totalMark = 0;
		
		byte mark1 = 0;
		byte mark2 = 0;
		byte mark3 = 0;
		byte mark4 = 0;
		byte mark5 = 0;
		
		String userMark = "";
		
		
		// Setting the marks
		
		System.out.println("Set here the correct, wrong and empty answers: [C - Correct, W - Wrong, E - Empty]\n5 marks are needed:");
		
		userMark = input.nextLine();
		mark1 = (userMark.equalsIgnoreCase("C")) ? POINTS_PER_CORRECT_ANSWER : (userMark.equalsIgnoreCase("W")) ? POINT_PER_WRONG_ANSWER : POINTS_PER_EMPTY_ANSWER; 
		
		userMark = input.nextLine();
		mark2 = (userMark.equalsIgnoreCase("C")) ? POINTS_PER_CORRECT_ANSWER : (userMark.equalsIgnoreCase("W")) ? POINT_PER_WRONG_ANSWER : POINTS_PER_EMPTY_ANSWER; 
		
		userMark = input.nextLine();
		mark3 = (userMark.equalsIgnoreCase("C")) ? POINTS_PER_CORRECT_ANSWER : (userMark.equalsIgnoreCase("W")) ? POINT_PER_WRONG_ANSWER : POINTS_PER_EMPTY_ANSWER; 
		
		userMark = input.nextLine();
		mark4 = (userMark.equalsIgnoreCase("C")) ? POINTS_PER_CORRECT_ANSWER : (userMark.equalsIgnoreCase("W")) ? POINT_PER_WRONG_ANSWER : POINTS_PER_EMPTY_ANSWER; 
		
		userMark = input.nextLine();
		mark5 = (userMark.equalsIgnoreCase("C")) ? POINTS_PER_CORRECT_ANSWER : (userMark.equalsIgnoreCase("W")) ? POINT_PER_WRONG_ANSWER : POINTS_PER_EMPTY_ANSWER; 
		
		
		
		// Computing total points
		
		totalMark = mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.printf("You've got %d/%d.", totalMark, POINTS_PER_CORRECT_ANSWER * 5);
	}
}