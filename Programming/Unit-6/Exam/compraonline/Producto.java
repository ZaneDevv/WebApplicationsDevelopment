package compraonline;

import java.util.regex.*;


/**
 * @author Álvaro Fernández Barrero
 */
public class Producto
{
	// --------------------------
	// Constantes
	// --------------------------
	
	private static final Pattern PATRON_FECHA = Pattern.compile("(3[01]|[21][0-9]|0?[1-9])[/](1[0-2]|0?[1-9])[/][\\d]+");
	
	// --------------------------
	// Atributos
	// --------------------------
	
	private String nombre;
	private String marca;
	private String fechaRegistro;
	
	// --------------------------
	// Constructores
	// --------------------------
	
	public Producto(String nombre, String marca, String fechaRegistro) throws Exception
	{
		if (!validarFecha(fechaRegistro))
		{
			throw new Exception("");
		}
		
		this.nombre = nombre.trim();
		this.marca = marca.trim();
		this.fechaRegistro = fechaRegistro;
	}
	
	// --------------------------
	// Métodos
	// --------------------------
	
	private boolean validarFecha(String fecha)
	{
		return Producto.PATRON_FECHA.matcher(fecha).matches();
	}
	
	public String toString()
	{
		return String.format("Nombre: %s\nMarca: %s\nFecha de registro: %s", this.nombre, this.marca, this.fechaRegistro);
	}
	
	// --------------------------
	// Getters & setters
	// --------------------------
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public String getFechaDeRegistro()
	{
		return this.fechaRegistro;
	}
}