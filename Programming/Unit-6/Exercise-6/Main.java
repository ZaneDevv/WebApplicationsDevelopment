import com.library.*;


/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Library library = new Library();
		library.addBook(new Book("A", "Bob", "Julian", 20));
		library.addBook(new Book("B", "Bob", "Julian", 20));
		library.addBook(new Book("C", "Bob", "Julian", 20));



		// Testing

		System.out.printf("#Books: %d\n", library.getBooksAmount());

		System.out.printf("Book \"b\" in position %d\n", library.lookForBuck("b"));

		library.takeBook(1);
		System.out.printf("#Books: %d\n", library.getBooksAmount());
	}
}