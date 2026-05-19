package com.poblacion;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Persona{
	//Atributos
	protected String nombre;
	protected String apellidos;
	protected GregorianCalendar fechaNac;
	
	//Constructor
	public Persona(String nombre,String apellidos,GregorianCalendar fechaNac){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNac=fechaNac;
	}
		
	//Metodos
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidos(){
		return apellidos;
	}
	
	public GregorianCalendar getFechaNac(){
		return fechaNac;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}
	
	public void setFechaNac(GregorianCalendar fechaNac){
		this.fechaNac=fechaNac;
	}
	
	public void mostrar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = sdf.format(fechaNac.getTime());
		System.out.println("Fecha de nacimiento: "+fecha);
	}

	public String devolverContenidoString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = sdf.format(fechaNac.getTime());
		return "Nombre: "+nombre+"\nApellidos: "+apellidos+
		"\nFecha de nacimiento: "+fecha;
	}
}



