package com.library;


/**
 * @version 1.0
 * @date 2025/11/25
 * @author Álvaro Fernández Barrero
 */

public class Book
{
	// Attributes

	private String title = "";
	private String author = "";
	private String editorial = "";

	private float price = 0;



	// Constructors

	/**
	 * @brief Creates an empty book
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Book() {}


	/**
	 * @brief Creates a book with the given title, author, editorial and price
	 * @param title Book's title
	 * @param author Book's author name
	 * @param editorial Editorial this book belongs to
	 * @param price Book's price
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Book(String title, String author, String editorial, float price)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setEditorial(editorial);
		this.setPrice(price);
	}


	/**
	 * @brief Copies the given book
	 * @param book Book to copy
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public Book(Book book)
	{
		this.setTitle(book.getTitle());
		this.setAuthor(book.getAuthor());
		this.setEditorial(book.getEditorial());
		this.setPrice(book.getPrice());
	}



	// Getters and setters

	/**
	 * @brief Sets the new book's title
	 * @param title New book's title
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}


	/**
	 * @brief Obtains the book's title
	 * @return The book's title
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public String getTitle()
	{
		return this.title;
	}


	/**
	 * @brief Sets the new book's author
	 * @param author New book's author
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}


	/**
	 * @brief Obtains the book's author
	 * @return The book's author
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public String getAuthor()
	{
		return this.author;
	}


	/**
	 * @brief Sets the new book's editorial
	 * @param editorial New book's editorial
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}


	/**
	 * @brief Obtains the book's editorial
	 * @return The book's editorial
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public String getEditorial()
	{
		return this.editorial;
	}


	/**
	 * @brief Sets the new book's price
	 * @param price New book's price
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public void setPrice(float price)
	{
		this.price = price;
	}


	/**
	 * @brief Obtains the book's price
	 * @return The book's price
	 * @version 1.0
	 * @date 2025/11/25
	 * @author Álvaro Fernández Barrero
	 */
	public float getPrice()
	{
		return this.price;
	}
}