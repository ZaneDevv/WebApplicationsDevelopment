public enum WindowStatus
{
	Opened,
	Hidden,
	Closed
}


/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */
public class Window
{
	// Attributes

	private String program = "";
	private String windowName = "";

	private WindowStatus status = WindowStatus.Closed;


	// Methods

	/**
	 * @brief Opens the window
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void open()
	{
		this.status = WindowStatus.Opened;
	}


	/**
	 * @brief Closes the window
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void close()
	{
		this.status = WindowStatus.Closed;
	}


	/**
	 * @brief Hides the window
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void hide()
	{
		this.status = WindowStatus.Hidden;
	}


	/**
	 * @brief Obtains the window's status
	 * @return Window's status
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private WindowStatus getStatus()
	{
		return this.status;
	}


	/**
	 * @brief Sets the window's program
	 * @param programName Program to assign to the window
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setProgram(String programName)
	{
		this.program = programName.trim();
	}


	/**
	 * @brief Obtains the program's name
	 * @return Program's name
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String getProgramName()
	{
		return this.program;
	}


	/**
	 * @brief Sets the window's name
	 * @param name Window's name
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void setProgram(String name)
	{
		this.windowName = name.trim();
	}


	/**
	 * @brief Obtains the window's name
	 * @return Window's name
	 * @version 1.0
	 * @date 2025/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private String getProgramName()
	{
		return this.windowName;
	}
}