import java.util.Scanner;

/**
 * @version 2.2
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class BishopMove
{
	// Defining directions

	private enum Direction
	{
		RightDown,
		RightUp,
		LeftDown,
		LeftUp
	}



	// Defining colors

	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";


	// Settings

	private static final char BISHOP = '#';
	private static final char AVALIABLE = '*';



	// Attributes

	private static char[][] board = new char[8][8];

	private static int[] bishopPosition = {0, 0};
	private static int[] checkingPosition = {bishopPosition[0], bishopPosition[1]};



	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);


		// Setting boshop's position in the board

		board[bishopPosition[0]][bishopPosition[1]] = BISHOP;


		// Starting game

		do
		{
			// Checking directions

			checkDirection(Direction.RightDown);
			checkDirection(Direction.RightUp);
			checkDirection(Direction.LeftUp);
			checkDirection(Direction.LeftDown);



			// Printing the board

			printBoard();


			// Setting a new position for the bishop

			System.out.print("Set a position in X (-1 to exit): ");
			checkingPosition[0] = bishopPosition[0] = input.nextInt() - 1;

			if (bishopPosition[0] < 0)
			{
				break;
			}


			System.out.print("Set a position in Y (-1 to exit): ");
			checkingPosition[1] = bishopPosition[1] = input.nextInt() - 1;


			if (bishopPosition[1] < 0)
			{
				break;
			}

			if (!isWithiBoard(bishopPosition[0], bishopPosition[1]))
			{
				break;
			}


			// Cleaning the board

			for (int i = 0; i < board.length; i++)
			{
				for (int j = 0; j < board[0].length; j++)
				{
					board[i][j] = ' ';
				}
			}
			board[bishopPosition[0]][bishopPosition[1]] = BISHOP;
		}
		while (true);



		input.close();
	}



	/**
	 * @brief Adds an asterisk where the bishop can move from the current position
	 * @param direction Direction to check
	 * @since 2.0
	 * @version 1.2
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static void checkDirection(Direction direction)
	{
		int moveX = (direction == Direction.RightUp || direction == Direction.RightDown) ? 1 : -1;
		int moveY = (direction == Direction.LeftUp || direction == Direction.RightUp) ? -1 : 1;

		checkingPosition[0] = bishopPosition[0];
		checkingPosition[1] = bishopPosition[1];

		while (true)
		{
			checkingPosition[0] += moveX;
			checkingPosition[1] += moveY;

			if (!isWithiBoard(checkingPosition[0], checkingPosition[1]))
			{
				break;
			}

			board[checkingPosition[0]][checkingPosition[1]] = AVALIABLE;
		}
	}



	/**
	 * @brief Checks if a position is within the board
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return True if the position is within the board, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isWithiBoard(int x, int y)
	{
		return x >= 0 && x < 8 && y >= 0 && y < 8;
	}



	/**
	 * @brief Prints the game's board
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static void printBoard()
	{
		System.out.print("\n---------------------------------\n");

		for (int i = 0; i < board.length; i++)
		{
			System.out.print("|");

			for (int j = 0; j < board[0].length; j++)
			{
				char characterToPrint = board[i][j];
				characterToPrint = characterToPrint == 0 ? ' ' : characterToPrint;

				if (characterToPrint == BISHOP)
				{
					System.out.print(ANSI_CYAN);
				}
				else if (characterToPrint == AVALIABLE)
				{
					System.out.print(ANSI_GREEN);
				}

				System.out.printf(" %c ", characterToPrint);

				System.out.print(ANSI_RESET + "|");
			}

			System.out.print("\n---------------------------------\n");
		}
	}
}