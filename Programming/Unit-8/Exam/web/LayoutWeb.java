package web;

/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

import java.util.LinkedHashMap;
import java.util.Iterator;

import excepciones.*;
import web.componentes.*;

public class LayoutWeb
{
	// ---------------------------------------
	// Atributos
	// ---------------------------------------
	
	private LinkedHashMap<String, Componente> listaComponentes;
	
	// ---------------------------------------
	// Constructores
	// ---------------------------------------
	
	public LayoutWeb()
	{
		this.listaComponentes = new LinkedHashMap<>();
	}
	
	// ---------------------------------------
	// Métodos
	// ---------------------------------------
	
	private boolean existeYaElComponente(String idCss)
	{
		return this.getComponente(idCss) != null;
	}
	
	public boolean aniadirComponente(Componente componente)
	{
		boolean yaExiste = existeYaElComponente(componente.getIdCss());
		
		if (!yaExiste)
		{
			System.out.printf("Nuevo componente guardado: %s\n", componente.getIdCss());
			this.listaComponentes.put(componente.getIdCss(), componente);
		}
		
		return !yaExiste;
	}
	
	public void listarMaquetacion()
	{
		System.out.println("|NOMBRE               |   IDCSS|    ALTO|   ANCHO|                    URL/TEXTO");
		System.out.println("----------------------------------------------------------------------------------");
		
		for (Componente componente : this.listaComponentes.values())
		{
			System.out.printf("|%-22s|%8s|%6.1fpx|%6.1fpx|", componente.getNombre(), componente.getIdCss(), componente.getAltoPixeles(), componente.getAnchoPixeles());
			
			if (componente instanceof ComponenteMultimedia)
			{
				System.out.printf("%30s|", ((ComponenteMultimedia)componente).getUrlOrigen());
			}
			else if (componente instanceof ComponenteTexto)
			{
				System.out.printf("%30s|", ((ComponenteTexto)componente).getContenidoTexto());
			}
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------");
	}
	
	public void limpiarInvisibles()
	{
		Iterator<Componente> iterador = this.listaComponentes.values().iterator();
		
		while (iterador.hasNext())
		{
			Componente componenteActivo = iterador.next();
			
			if (componenteActivo.getAltoPixeles() == 0 || componenteActivo.getAnchoPixeles() == 0)
			{
				System.out.printf("Elemento %s ha sido eliminado\n", componenteActivo.getIdCss());
				iterador.remove();
			}
		}
	}
	
	public boolean redimensionarComponente(String idCss, float ancho, float alto) throws DimensionInvalidaException
	{
		Componente componente = getComponente(idCss);
		boolean componenteExiste = componente != null;
		
		if (componenteExiste)
		{
			componente.setAnchoPixeles(ancho);
			componente.setAltoPixeles(alto);
		}
		
		return componenteExiste;
	}
	
	// ---------------------------------------
	// Getters & setters
	// ---------------------------------------
	
	public Componente getComponente(String idCss)
	{
		return this.listaComponentes.get(idCss);
	}
}