package web.componentes;

/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

import java.util.regex.*;
import excepciones.*;

public abstract class Componente
{
	// ---------------------------------------
	// Constantes
	// ---------------------------------------
	
	private static final Pattern ID_CSS_PATRON = Pattern.compile("^#[a-z]{2,3}-\\d{3}$");
	
	// ---------------------------------------
	// Atributos
	// ---------------------------------------
	
	private String nombre;
	private String idCss;
	private float anchoPixeles;
	private float altoPixeles;
	
	// ---------------------------------------
	// Constructores
	// ---------------------------------------
	
	public Componente(String nombre, String idCss, float anchoPixeles, float altoPixeles) throws IllegalArgumentException, DimensionInvalidaException
	{
		this.setIdCss(idCss);
		this.nombre = nombre;
		
		this.setAnchoPixeles(anchoPixeles);
		this.setAltoPixeles(altoPixeles);
	}
	
	// ---------------------------------------
	// Metodos
	// ---------------------------------------
	
	@Override
	public boolean equals(Object componente)
	{
		return this.idCss.equals(((Componente)componente).getIdCss());
	}
	
	// ---------------------------------------
	// Getters & setters
	// ---------------------------------------
	
	public String getIdCss()
	{
		return this.idCss;
	}
	
	private void setIdCss(String idCss)
	{
		if (!Componente.ID_CSS_PATRON.matcher(idCss).matches())
		{
			throw new IllegalArgumentException("Error Formato Código");
		}
		
		this.idCss = idCss;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public float getAnchoPixeles()
	{
		return this.anchoPixeles;
	}
	
	public void setAnchoPixeles(float anchoPixeles) throws DimensionInvalidaException
	{
		if (anchoPixeles < 0)
		{
			throw new DimensionInvalidaException();
		}
		
		this.anchoPixeles = anchoPixeles;
	}
	
	public float getAltoPixeles()
	{
		return this.altoPixeles;
	}
	
	public void setAltoPixeles(float altoPixeles) throws DimensionInvalidaException
	{
		if (altoPixeles < 0)
		{
			throw new DimensionInvalidaException();
		}
		
		this.altoPixeles = altoPixeles;
	}
}