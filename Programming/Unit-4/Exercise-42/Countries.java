public class Countries
{
	public static void main(String[] args)
	{
		// Defining variables

		String[] countries = {"Spain", "Russia", "Japan", "Australia"};

		int[][] numbers = new int[4][10];

		int greatest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		
		int totalSum = 0;
		int avarage = 0;


		// Setting numbers

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[0].length; j++)
			{
				numbers[i][j] = (int)(140 + Math.random() * 71);
			}
		}


		// Printing table

		System.out.print(" Countries \t\t\t\t\tValues\t\t\t\t     MIN    MAX   AVARAGE\n");
		for (int i = 0; i < numbers.length; i++)
		{
			// Restarting values

			greatest = Integer.MIN_VALUE;
			lowest = Integer.MAX_VALUE;
			
			totalSum = 0;
			avarage = 0;



			System.out.printf("%10s |", countries[i]);
			
			for (int j = 0; j < numbers[0].length; j++)
			{
				int number = numbers[i][j];
				System.out.printf("  %d  ", number);


				// Obtaining the greatest and lowest

				if (number > greatest)
				{
					greatest = number;
				}

				if (number < lowest)
				{
					lowest = number;
				}

				// Adding to the sum

				totalSum += number;
			}


			// Computing avarage

			avarage = totalSum / numbers.length;

			System.out.printf("|  %d    %d     %d\n", lowest, greatest, avarage);
		}
	}
}