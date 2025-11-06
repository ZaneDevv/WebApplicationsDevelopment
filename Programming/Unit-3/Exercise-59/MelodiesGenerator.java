import java.util.Scanner;

/**
 * @version 1.4
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */

public class MelodiesGenerator
{
	private enum Notes
	{
		C,
		D,
		E,
		F,
		G,
		A,
		H
	}


	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		Notes firstLastNote = getRandomNote();
		byte compassAmount = (byte)(Math.random() * 6 + 1);
		
		
		// Displaying melody
		
		for (byte i = 1; i <= compassAmount; i++)
		{
			for (byte j = 1; j <= 4; j++)
			{
				boolean isFirstNote = (i == j && j == 1);
				boolean isLastNote = (j == 4 && i == compassAmount);
				
				Notes note = (isFirstNote || isLastNote) ? firstLastNote : getRandomNote();

				System.out.printf(" " + note.name());
			}
			
			System.out.print(" |");
		}
		System.out.print("|");
		
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Obtains a random musical note from the Notes enum
	 * @return A random musical note
	 * @since 1.3
	 * @version 1.0
	 * @date 2025/11/06
	 * @author Álvaro Fernández Barrero
	 */
	private static Notes getRandomNote()
	{
		return Notes.values()[(byte)(Math.random() * 7)];
	}
}