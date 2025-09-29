/**
*	This class writes on terminal the schedule my classmates and I have in our computer science class once the main method is executed.
*	This schedule is written following the next structure:
*	
*		   Monday | Tuesday | Wednessday | Thursday | Friday
*	time |   S1   |   S1    |     S1     |    S1    |   S1
*	time |   S2   |   S2    |     S2     |    S2    |   S2
*	time |   S3   |   S3    |     S3     |    S3    |   S3
*	     ----------------------------------------------------
*	time |   S4   |   S4    |     S4     |    S4    |   S4
*	time |   S5   |   S5    |     S5     |    S5    |   S5
*	time |   S6   |   S6    |     S6     |    S6    |   S6
*	
*	@date 2025/09/29
*	@author Álvaro Fernández Barrero
*/

public class ScheduleFormatedString
{
	/*
		Defining ANSI terminal colors.
		List obtained from: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
	*/

	private static final String ANSI_RESET = "\u001B[0m";
	
	private static final String ANSI_BLACK = "\u001B[30m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_WHITE = "\u001B[37m";
	
	private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";	
	private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	
	// Defining colors and texts for subjects and days.
	
	private static final String DAYS_COLOR = ANSI_RED_BACKGROUND;
	private static final String HOURS_COLOR = ANSI_BLACK_BACKGROUND;
	
	private static final String PROGRAMMING_SUBJECT = ANSI_PURPLE + "PR" + ANSI_RESET;
	private static final String DATABASES_SUBJECT = ANSI_RED + "DB" + ANSI_RESET;
	private static final String MARKUP_LANGUAGES_SUBJECT = ANSI_GREEN + "LM" + ANSI_RESET;
	private static final String DEVELOPMENT_ENVIROMENTS_SUBJECT = ANSI_CYAN + "ED" + ANSI_RESET;
	private static final String DIGITALIZATION_SUBJECT = ANSI_YELLOW + "DI" + ANSI_RESET;
	private static final String IT_SUBJECT = ANSI_BLUE + "IT" + ANSI_RESET;
	private static final String IP_SUBJECT = ANSI_WHITE + "IP" + ANSI_RESET;
	private static final String SUSTANIBILITY_SUBJECT = ANSI_YELLOW + "SO" + ANSI_RESET;
	
	
	// Defining schedule format
	
	private static final String SCHEDULE_FORMAT = "\t%s|    %2s    |   %2s   |     %2s     |    %2s    |   %2s\n";
	
	private static String separator = "\t\t     ---------------------------------------------------";
	private static String breakHour = "\t\t\t\t           BREAK";
	
	
	public static void main(String[] args)
	{
		// Printing days row.
		
		String daysRow = "\t\t     ";
		daysRow += DAYS_COLOR + " Monday " + ANSI_RESET;
		daysRow += "|" + DAYS_COLOR + " Tuesday " + ANSI_RESET;
		daysRow += "|" + DAYS_COLOR + " Wednessday " + ANSI_RESET;
		daysRow += "|" + DAYS_COLOR + " Thursday " + ANSI_RESET;
		daysRow += "|" + DAYS_COLOR + " Friday " + ANSI_RESET;
		
		System.out.println(daysRow);
		
		// Printing whole schedule row by row
		
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "08:15-09:15" + ANSI_RESET, PROGRAMMING_SUBJECT, DATABASES_SUBJECT, DATABASES_SUBJECT, PROGRAMMING_SUBJECT, IT_SUBJECT);
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "09:15-10:15" + ANSI_RESET, PROGRAMMING_SUBJECT, DATABASES_SUBJECT, DATABASES_SUBJECT, PROGRAMMING_SUBJECT, IT_SUBJECT);
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "10:15-11:15" + ANSI_RESET, IT_SUBJECT, DEVELOPMENT_ENVIROMENTS_SUBJECT, DIGITALIZATION_SUBJECT, IT_SUBJECT, DEVELOPMENT_ENVIROMENTS_SUBJECT);
		
		System.out.println(separator);
		System.out.println(breakHour);
		System.out.println(separator);
		
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "11:45-12:45" + ANSI_RESET, IT_SUBJECT, DEVELOPMENT_ENVIROMENTS_SUBJECT, PROGRAMMING_SUBJECT, DATABASES_SUBJECT, PROGRAMMING_SUBJECT);
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "12:45-13:45" + ANSI_RESET, IP_SUBJECT, MARKUP_LANGUAGES_SUBJECT, PROGRAMMING_SUBJECT, DATABASES_SUBJECT, PROGRAMMING_SUBJECT);
		System.out.printf(SCHEDULE_FORMAT, HOURS_COLOR + "13:45-14:45" + ANSI_RESET, IP_SUBJECT, MARKUP_LANGUAGES_SUBJECT, MARKUP_LANGUAGES_SUBJECT, SUSTANIBILITY_SUBJECT, IP_SUBJECT);
	}
}