package com.utils;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public abstract class Printer
{
    //---------------------------
    // Constants
    //---------------------------

    public static final String ANSI_RESET = "\u001B[0m";


	// Text colors

	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	

	// Background colors

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	//---------------------------
    // Methods
    //---------------------------

	/**
	 * Prints an error with the given message
	 * @param message Message to throw with error format
	 */
	public static void error(String message)
	{
		System.out.print(Printer.ANSI_RED + message + Printer.ANSI_RESET);
	}


	/**
	 * Prints an warn with the given message
	 * @param message Message to throw with warn format
	 */
	public static void warn(String message)
	{
		System.out.print(Printer.ANSI_YELLOW + message + Printer.ANSI_RESET);
	}
}