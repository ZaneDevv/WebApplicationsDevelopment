import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/07
 * @author Álvaro Fernández Barrero
 */
 
 public class CountLetters
 {
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		String text = "";
		
		int asAmount = 0;
		int bsAmount = 0;
		int csAmount = 0;
		int dsAmount = 0;
		int esAmount = 0;
		int fsAmount = 0;
		int gsAmount = 0;
		int hsAmount = 0;
		int isAmount = 0;
		int jsAmount = 0;
		int ksAmount = 0;
		int lsAmount = 0;
		int msAmount = 0;
		int nsAmount = 0;
		int osAmount = 0;
		int psAmount = 0;
		int qsAmount = 0;
		int rsAmount = 0;
		int ssAmount = 0;
		int tsAmount = 0;
		int usAmount = 0;
		int vsAmount = 0;
		int wsAmount = 0;
		int xsAmount = 0;
		int ysAmount = 0;
		int zsAmount = 0;
		
		
		// Setting the text
		
		System.out.println("Write here a sentence, only english characters allowed:");
		text = input.nextLine().toUpperCase();
		
		
		// Counting letters
		
		for (int i = 0; i < text.length(); i++)
		{
			char character = text.charAt(i);
			
			if (character < 'A' || character > 'Z')
			{
				continue;
			}
			
			
			switch (character)
			{
				case 'A' -> asAmount++;
				case 'B' -> bsAmount++;
				case 'C' -> csAmount++;
				case 'D' -> dsAmount++;
				case 'E' -> esAmount++;
				case 'F' -> fsAmount++;
				case 'G' -> gsAmount++;
				case 'H' -> hsAmount++;
				case 'I' -> isAmount++;
				case 'J' -> jsAmount++;
				case 'K' -> ksAmount++;
				case 'L' -> lsAmount++;
				case 'M' -> msAmount++;
				case 'N' -> nsAmount++;
				case 'O' -> osAmount++;
				case 'P' -> psAmount++;
				case 'Q' -> qsAmount++;
				case 'R' -> rsAmount++;
				case 'S' -> ssAmount++;
				case 'T' -> tsAmount++;
				case 'U' -> usAmount++;
				case 'V' -> vsAmount++;
				case 'W' -> wsAmount++;
				case 'X' -> xsAmount++;
				case 'Y' -> ysAmount++;
				case 'Z' -> zsAmount++;
			}
		}
		
		
		// Printing result
		
		System.out.printf("A: %d\n", asAmount);
		System.out.printf("B: %d\n", bsAmount);
		System.out.printf("C: %d\n", csAmount);
		System.out.printf("D: %d\n", dsAmount);
		System.out.printf("E: %d\n", esAmount);
		System.out.printf("F: %d\n", fsAmount);
		System.out.printf("G: %d\n", gsAmount);
		System.out.printf("H: %d\n", hsAmount);
		System.out.printf("I: %d\n", isAmount);
		System.out.printf("J: %d\n", jsAmount);
		System.out.printf("K: %d\n", ksAmount);
		System.out.printf("L: %d\n", lsAmount);
		System.out.printf("M: %d\n", msAmount);
		System.out.printf("N: %d\n", nsAmount);
		System.out.printf("O: %d\n", osAmount);
		System.out.printf("P: %d\n", psAmount);
		System.out.printf("Q: %d\n", qsAmount);
		System.out.printf("R: %d\n", rsAmount);
		System.out.printf("S: %d\n", ssAmount);
		System.out.printf("T: %d\n", tsAmount);
		System.out.printf("U: %d\n", usAmount);
		System.out.printf("V: %d\n", vsAmount);
		System.out.printf("W: %d\n", wsAmount);
		System.out.printf("X: %d\n", xsAmount);
		System.out.printf("Y: %d\n", ysAmount);
		System.out.printf("Z: %d\n", zsAmount);
		
		
		input.close();
	}
 }