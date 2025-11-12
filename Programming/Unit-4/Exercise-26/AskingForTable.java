import java.util.Scanner;

/**
 * @version 1.0
 * @date 2025/11/12
 * @author Álvaro Fernández Barrero
 */

public class AskingForTable
{
	// Defining colors
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	
	
	// Settings
	
	private static final byte MAXIMUM_PEOPLE_PER_TABLE = 4;
	
	
	
	public static void main(String[] args)
	{
		// Defining variables
		
		Scanner input = new Scanner(System.in);
		
		byte[] tables = new byte[10];
		byte peopleAmount = 0;
		
		boolean canGroupSitTogether = false;
		
		
		// Sitting people at the tables
		
		for (int i = 0; i < tables.length; i++)
		{
			tables[i] = (byte)(Math.random() * (MAXIMUM_PEOPLE_PER_TABLE + 1));
		}
		
		
		// Printing tables
		
		printTables(tables);
		
		
		// Adding people
		
		do
		{
			canGroupSitTogether = false;
			
			
			System.out.print("\nHow many people? (Write -1 to exit): ");
			peopleAmount = input.nextByte();
			
			if (peopleAmount > 0 && peopleAmount <= MAXIMUM_PEOPLE_PER_TABLE)
			{
				// Checking if there is at least a free table. If there is, sit group there
				
				for (int i = 0; i < tables.length; i++)
				{
					byte amountOfPeopleInTable = tables[i];
					
					if (amountOfPeopleInTable == 0)
					{
						tables[i] = peopleAmount;
						canGroupSitTogether = true;
						
						break;
					}
				}
				
				
				// If the gropu could not sit together at the same table, look for the space among the tables
				
				if (!canGroupSitTogether)
				{
					for (int i = 0; i < tables.length; i++)
					{
						byte amountOfPeopleInTable = tables[i];
						
						if (amountOfPeopleInTable >= MAXIMUM_PEOPLE_PER_TABLE)
						{
							continue;
						}
						
						
						while (peopleAmount > 0 && tables[i] < MAXIMUM_PEOPLE_PER_TABLE)
						{
							tables[i] += 1;
							peopleAmount--;
						}
					}
				}
				
				
				// Printing tables
		
				printTables(tables);
			}
			else if (peopleAmount != -1)
			{
				System.out.print(ANSI_RED + "It cannot be that amount, at least one person is needed and more than 4 people cannot fit here!\n" + ANSI_RESET);
			}
		}
		while (peopleAmount != -1);
		
		
		
		input.close();
	}
	
	
	
	/**
	 * @brief Prints the tables
	 * @param tables The array with the tables' information to print
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/12
	 * @author Álvaro Fernández Barrero
	 */
	private static void printTables(byte[] tables)
	{
		System.out.print("\nnº table |");
		
		for (int i = 0; i < tables.length; i++)
		{
			System.out.printf(" %2d  |", i);
		}
		
		System.out.print("\n----------------------------------------------------------------------\n  people |");
		
		for (int i = 0; i < tables.length; i++)
		{
			System.out.printf(" %2d  |", tables[i]);
		}
		
		System.out.print("\n");
	}
}