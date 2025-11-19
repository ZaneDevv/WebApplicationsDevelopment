/**
 * @version 1.0
 * @date 2025/11/19
 * @author Álvaro Fernández Barrero
 */

public class Account
{
	// Attributes

	private int number = 0;
	private float money = 0;



	// Constructors

	/**
	 * @brief Creates a new account with the given account's number
	 * @param number The new account's number
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Account(int number)
	{
		this.number = number;
	}


	/**
	 * @brief Creates a new account with the given account's number and the given amount of money
	 * @param number The new account's number
	 * @param money The money the new account will store
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Account(int number, float money)
	{
		this.number = number;
		this.money = money;
	}


	/**
	 * @brief Copies the given account
	 * @param other The account to copy
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public Account(Account other)
	{
		this.number = other.getNumber();
		this.money = other.getMoney();
	}



	// Methods

	/**
	 * @brief Joins the given amount of money to the account
	 * @param money The money to join to the account
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public void joinMoney(float money)
	{
		this.money += Math.abs(money);
	}



	/**
	 * @brief Withdraws the given amount of money from the account
	 * @param money The amount of money to withdraw
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public void withdrawMoney(float money)
	{
		this.money -= Math.abs(money);
	}



	/**
	 * @brief Transfers the given amount of money from this account to the given one
	 * @param money The amount of money to transfer from this account to the other
	 * @param otherAccount The account to transfer the given money to
	 * @exception Exception The account has no enough money
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public void transferMoney(float money, Account otherAccount) throws Exception
	{
		if (this.money < money)
		{
			throw new Exception("This account has no enough money!");
		}

		this.withdrawMoney(money);
		otherAccount.joinMoney(money);
	}



	// Getters and Setters

	/**
	 * @brief Sets the amount of money this account has
	 * @param money The amount of money to store in the account
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public void setMoney(float money)
	{
		this.money = money;
	}


	/**
	 * @brief Obtains the amount of money this account has
	 * @return The amount of money in the account
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public float getMoney()
	{
		return this.money;
	}


	/**
	 * @brief Obtains the account's number
	 * @return The account's number
	 * @version 1.0
	 * @date 2025/11/19
	 * @author Álvaro Fernández Barrero
	 */
	public int getNumber()
	{
		return this.number;
	}
}