public enum DwellingType
{
	House,
	Apartment
}


/**
 * @version 1.0
 * @date 2025/11/17
 * @author Álvaro Fernández Barrero
 */
public class Dwelling
{
	private float price = 0;

	private byte roomsAmount = 0;
	private float centimetersSquared = 0;

	private String location = "";

	private DwellingType dwellingType = DwellingType.House;
}