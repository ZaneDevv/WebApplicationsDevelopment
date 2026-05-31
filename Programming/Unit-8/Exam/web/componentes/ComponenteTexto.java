package web.componentes;

/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

import excepciones.*;

public class ComponenteTexto extends Componente
{
	// ---------------------------------------
	// Atributos
	// ---------------------------------------
	
	private String contenidoTexto;
	
	// ---------------------------------------
	// Constructores
	// ---------------------------------------
	
	public ComponenteTexto(String nombre, String idCss, float anchoPixeles, float altoPixeles, String contenidoTexto) throws IllegalArgumentException, DimensionInvalidaException
	{
		super(nombre, idCss, anchoPixeles, altoPixeles);
		this.contenidoTexto = contenidoTexto;
	}
	
	// ---------------------------------------
	// Getters & setters
	// ---------------------------------------
	
	public void setContenidoTexto(String contenidoTexto)
	{
		this.contenidoTexto = contenidoTexto;
	}
	
	public String getContenidoTexto()
	{
		return this.contenidoTexto;
	}
}