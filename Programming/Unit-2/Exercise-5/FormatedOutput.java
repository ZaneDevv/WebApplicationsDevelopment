public class FormatedOutput
{
	public static void main(String[] args)
	{
		/*
			%s gets strings.
			%-ns gets a string limited with n characters (n must be specified).
			%d gets integer numbers.
			%nd gets an integer number limited with n digits (n must be specified).
			%f gets real numbers.
			%.nf gets real number with n decimals (n must be specified).
			%n.mf gets a real number limited with n digits in the natural part and m in the fractional part (both n and m must be specified).
		*/
	
		System.out.printf("Hi, my name is %s.\n", "Bob");
		System.out.printf("My favourite fruit is the %-10s", "apple");
	
		System.out.printf("The number %d has no decimals.\n", 21);
		System.out.printf("I am %2d years old.", 520);
		System.out.printf("The number %f has decimals.\n", 25.3458);
		System.out.printf("The number %.3f is printed with exactly 3 decimals.\n", 21.23464);
		System.out.printf("I have %5.2f $ in my bank", 3426.234);
	}
}