package com.user;

import java.util.regex.*;


/**
 * @version 1.0
 * @date 2025/11/22
 * @author Álvaro Fernández Barrero
 */

public class User
{
	// Constants

	private static final Pattern USERNAME_PATTERN = Pattern.compile("^.{3,}$");
	private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[€%-_&!¡¿?¬~·|@<>,:;\\{\\}\\[\\]\\(\\)$#\"\'\\.=]).+$");



	// Attributes

	private String userName = "";
	private String password = "";



	// Constructors

	/**
	 * @brief Creates in case that it is possible a new user with the given user name and password
	 * @param name New user's name
	 * @param password New user's password
	 * @throws Exception Invalid user name!
	 * @throws Exception Invalid user password!
	 * @version 1.0
 	 * @date 2025/11/22
 	 * @author Álvaro Fernández Barrero
	 */
	public User(String name, String password) throws Exception
	{
		if (!User.USERNAME_PATTERN.matcher(name).matches())
		{
			throw new Exception("Invalid user name!");
		}

		if (!User.PASSWORD_PATTERN.matcher(password).matches())
		{
			throw new Exception("Invalid password!");
		}


		this.userName = name;
		this.password = password;
	}



	// Methods

	/**
	 * @brief Tries to log in with the given name and password
	 * @param name The user's name to log in
	 * @param password The user's password to log in
	 * @return True if it was possible to log in, false otherwise
	 * @version 1.0
	 * @date 2025/11/22
	 * @author Álvaro Fernández Barrero
	 */
	public boolean logIn(String name, String password)
	{
		if (name.equals(this.userName) && password.equals(this.password))
		{
			System.out.println("Success! You logged in!");
			return true;
		}

		System.out.println("Incorrect name or password! :(");
		return false;
	}



	// Getters and setters

	/**
	 * @brief Obtains the user's name
	 * @return The user's name
	 * @version 1.0
	 * @date 2025/11/22
	 * @author Álvaro Fernández Barrero
	 */
	public String getUserName()
	{
		return this.userName;
	}
}