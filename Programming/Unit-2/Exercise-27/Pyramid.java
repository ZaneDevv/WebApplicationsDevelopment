public class Pyramid
{
	// Defining colors
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	
	public static void main(String[] args)
	{
		// Printing pyramid
		
		System.out.print(ANSI_YELLOW);
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
		System.out.print(ANSI_RESET);
	}
}