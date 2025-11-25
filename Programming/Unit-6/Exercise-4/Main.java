/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		Book[] library = {
			new Book("A", "Bob", "AA", 10),
			new Book("B", "Bob", "AA", 34),
			new Book("C", "Bob", "AA", 12),
			new Book("D", "Bob", "AA", 20),
			new Book("E", "Bob", "AA", 31),
		};

		Book mostExpensive = obtainMostExpensive(library);

		System.out.printf("The most expensive book is %s", mostExpensive.getTitle());
	}



	/**
	 * @brief Obtains the most expensive book in the given array of books
	 * @param books Books list to obtain the most expensive book from
	 * @return The most expensive book
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	private static Book obtainMostExpensive(Book[] books)
	{
		Book mostExpensiveBook = null;
		float price = Float.MIN_VALUE;


		for (Book book : books)
		{
			if (book == null)
			{
				continue;
			}

			if (price < book.getPrice())
			{
				price = book.getPrice();
				mostExpensiveBook = book;
			}
		}


		return mostExpensiveBook;
	}
}