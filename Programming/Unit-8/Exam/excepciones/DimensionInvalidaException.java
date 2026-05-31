package excepciones;

/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

public class DimensionInvalidaException extends Exception
{
	public DimensionInvalidaException()
	{
		super("Dimensiones inválidas");
	}
}