package com.library;


/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Library
{
	// Attributes

	private Book[] books = new Book[0];



	// Constructors

	/**
	 * @brief Creates a library with no books
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Library() {}


	/**
	 * @brief Creates a library with the given books
	 * @param books Books in the library
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Library(Book[] books)
	{
		this.books = books;
	}



	// Methods

	/**
	 * @brief Adds the given book to the library. It will be in last position
	 * @param book Book to add to the library
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void addBook(Book book)
	{
		Book[] savedBooks = this.books;
		this.books = new Book[this.books.length + 1];

		for (int i = 0; i < savedBooks.length; i++)
		{
			this.books[i] = savedBooks[i];
		}
		this.books[this.books.length - 1] = book;
	}


	/**
	 * @brief Adds the given books to the library. They will be in last positions
	 * @param books Books to add
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void addBooks(Book[] books)
	{
		Book[] savedBooks = this.books;
		this.books = new Book[this.books.length + books.length];

		for (int i = 0; i < savedBooks.length; i++)
		{
			this.books[i] = savedBooks[i];
		}
		
		for (int i = 0; i < books.length; i++)
		{
			this.books[this.books.length - books.length - 1 + i] = books[i];
		}
	}


	/**
	 * @brief Takes the book in the given position from the library
	 * @param index The book's position in the library
	 * @return The withdrawn book, null if it was not found
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Book takeBook(int index)
	{
		index--;
		if (index < 0 || index >= this.books.length)
		{
			return null;
		}

		Book selectedBook = this.books[index];
		Book[] savedBooks = new Book[this.books.length - 1];

		int currentPosition = 0;

		for (int i = 0; i < this.books.length; i++)
		{
			if (i != index)
			{				
				savedBooks[currentPosition] = this.books[i];
				currentPosition++;
			}
		}

		this.books = savedBooks;

		return selectedBook;
	}


	/**
	 * @brief Checks the position of the book with the given title
	 * @param name The title of book you are looking for
	 * @return The position where the book is. -1 if the book was not found
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public int lookForBook(String name)
	{
		int index = -2;

		name = name.toUpperCase();


		for (int i = 0; i < this.books.length; i++)
		{
			if (this.books[i] == null)
			{
				continue;
			}


			String bookName = this.books[i].getTitle().toUpperCase();

			if (bookName.contains(name))
			{
				index = i;
				break;
			}
		}

		return index + 1;
	}



	// Getters and setters

	/**
	 * @brief Obtains the books in the library
	 * @return The books in the library
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Book[] getBooks()
	{
		return this.books;
	}


	/**
	 * @brief Obtains the amount of books the current library has
	 * @return The amount of books the current library has
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public int getBooksAmount()
	{
		return this.books.length;
	}
}
