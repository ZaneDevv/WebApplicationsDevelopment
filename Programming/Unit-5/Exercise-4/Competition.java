/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */
public class Competition
{
	private String name = "";

	private Team team1;
	private Team team2;

	private Field fieldToPlay;

	private byte day = 0;
	private byte month = 0;
	private int year = 0;

	private boolean hasFinished = false;
	private Team winner;
}