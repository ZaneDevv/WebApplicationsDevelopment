import date.*;
import personal.*;

/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		Date birthDate = new Date(22, Month.June, 2007);
		PersonalData data = new PersonalData("Alvaro", birthDate, (byte)18);

		System.out.print(data.toString());
	}
}