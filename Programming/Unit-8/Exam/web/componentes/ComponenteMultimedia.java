package web.componentes;

/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

import excepciones.*;

public class ComponenteMultimedia extends Componente
{
	// ---------------------------------------
	// Atributos
	// ---------------------------------------
	
	private String urlOrigen;
	
	// ---------------------------------------
	// Constructores
	// ---------------------------------------
	
	public ComponenteMultimedia(String nombre, String idCss, float anchoPixeles, float altoPixeles, String urlOrigen) throws IllegalArgumentException, DimensionInvalidaException
	{
		super(nombre, idCss, anchoPixeles, altoPixeles);
		this.urlOrigen = urlOrigen;
	}
	
	// ---------------------------------------
	// Getters & setters
	// ---------------------------------------
	
	public String getUrlOrigen()
	{
		return this.urlOrigen;
	}
	
	public void setUrlOrigen(String urlOrigen)
	{
		this.urlOrigen = urlOrigen;
	}
}