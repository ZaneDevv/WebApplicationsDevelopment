import java.util.Scanner;

/**
 * @version 3.1
 * @date 2025/11/14
 * @author Álvaro Fernández Barrero
 */

public class TicTacToe
{
	// Defining colors

	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_CYAN = "\u001B[36m";


	// Settings

	private static char PLAYER_X = 'X';
	private static char PLAYER_O = 'O';


	// Attributes

	private static char[][] board = new char[3][3];



	public static void main(String[] args)
	{
		// Defining variables

		Scanner input = new Scanner(System.in);

		boolean hasXWon = false;
		boolean hasOWon = false;


		// Starting game

		printBoard();
		System.out.print("\n");

		while (!hasXWon && !hasOWon && !isBoardFull())
		{
			hasXWon = playerPlay(PLAYER_X, input);
			printBoard();


			if (!hasXWon && !isBoardFull())
			{
				hasOWon = playerPlay(PLAYER_O, input);
				printBoard();
			}
		}


		// Finishing the game

		if (hasXWon)
		{
			System.out.print("\n\nX has won!!!");
		}

		if (hasOWon)
		{
			System.out.print("\n\nO has won!!!");
		}

		if (!hasXWon && !hasOWon && isBoardFull())
		{
			System.out.print("\n\nTie!!!");
		}


		input.close();
	}



	/**
	 * @brief The player plays, a new character on the board is set
	 * @param character Curret player playing
	 * @param input Scanner instance to ask player's new position
	 * @return True if the player has won, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean playerPlay(char character, Scanner input)
	{
		int x = 0;
		int y = 0;

		boolean isPositionAccepted = false;


		do
		{
			System.out.printf("User %c:\nSet the x position: ", character);
			y = input.nextInt() - 1;

			System.out.print("Set the y position: ");
			x = input.nextInt() - 1;


			isPositionAccepted = isPositionAvaliable(x, y);

			if (!isPositionAccepted)
			{
				System.out.println(ANSI_RED + "Position unavaliable!" + ANSI_RESET);
			}
			else
			{
				board[x][y] = character;
			}
		}
		while (!isPositionAccepted);


		return hasPlayerWon(character, x, y);
	}



	/**
	 * @brief Checks if the given position belongs to the board
	 * @param x X position
	 * @param y Y position
	 * @return True if the given position belongs to the game's board, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isPositionInBoard(int x, int y)
	{
		return x >= 0 && x < 3 && y >= 0 && y < 3;
	}



	/**
	 * @brief Checks if the given position is avaliable to place a new character
	 * @param x X position
	 * @param y Y position
	 * @return True if the position is avaliable, false otherwise
	 * @since 1.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isPositionAvaliable(int x, int y)
	{
		if (!isPositionInBoard(x, y))
		{
			return false;
		}


		return board[x][y] == 0 || board[x][y] == ' ';
	}



	/**
	 * @brief Checks if the given user has won
	 * @param player The player's character
	 * @param lastX Last x position the player has set
	 * @param lastY Last y position the player has set
	 * @return True if the given player has won, false otherwise
	 * @since 2.0
	 * @version 1.2
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean hasPlayerWon(char player, int lastX, int lastY)
	{
		return checkVertically(player) || checkHorizontally(player) || checkDiagonals(player);
	}



	/**
	 * @brief Checks if the give character is in any of the diagonals
	 * @param character The character to check
	 * @return True if the given character is in either of the diagonals, false otherwise
	 * @since 3.0
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean checkDiagonals(char character)
	{
		for (int i = 0; i < board.length; i++)
		{
			if (character != board[i][i])
			{
				break;
			}

			if (i == board.length - 1)
			{
				return true;
			}
		}

		for (int i = 0; i < board.length; i++)
		{
			if (character != board[board.length - i - 1][i])
			{
				break;
			}

			if (i == board.length - 1)
			{
				return true;
			}
		}

		return false;
	}



	/**
	 * @brief Checks if the give character is in any of the vertial lines on the board
	 * @param character The character to check
	 * @return True if the given character is either of the vertical lines on the board, false otherwise
	 * @since 3.1
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean checkVertically(char character)
	{
		for (int i = 0; i < board[0].length; i++)
		{
			for (int j = 0; j < board.length; j++)
			{
				if (board[j][i] != character)
				{
					break;
				}

				if (j == board.length - 1)
				{
					return true;
				}
			}
		}

		return false;
	}



	/**
	 * @brief Checks if the give character is in any of the horizontal lines on the board
	 * @param character The character to check
	 * @return True if the given character is either of the horizontal lines on the board, false otherwise
	 * @since 3.1
	 * @version 1.0
	 * @date 2025/11/14
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean checkHorizontally(char character)
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[0].length; j++)
			{
				if (board[i][j] != character)
				{
					break;
				}

				if (j == board[0].length - 1)
				{
					return true;
				}
			}
		}

		return false;
	}



	/**
	 * @brief Checks if the board is full and cannot play with it anymore
	 * @return True if the board is full, false otherwise
	 * @since 3.0
	 * @version 1.0
	 * @date 2025/11/15
	 * @author Álvaro Fernández Barrero
	 */
	private static boolean isBoardFull()
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[0].length; j++)
			{
				char spot = board[i][j];

				if (spot == ' ' || spot == 0)
				{
					return false;
				}
			}
		}

		return true;
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
		System.out.println("\n-------------");

		for (int i = 0; i < board.length; i++)
		{
			System.out.print("|");

			for (int j = 0; j < board[0].length; j++)
			{
				// Obtaining character

				char character = board[i][j];

				if (character == 0)
				{
					character = ' ';
				}


				// Setting color

				if (character == PLAYER_X)
				{
					System.out.print(ANSI_RED);
				}
				else if (character == PLAYER_O)
				{
					System.out.print(ANSI_CYAN);
				}


				System.out.printf(" %c ", character);
				System.out.print(ANSI_RESET  + "|");
			}

			System.out.print("\n-------------\n");
		}
	}
}