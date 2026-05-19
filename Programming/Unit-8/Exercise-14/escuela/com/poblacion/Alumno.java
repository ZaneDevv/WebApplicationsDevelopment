package com.poblacion;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Alumno extends Persona{
	//Atributos
	private String grupo;
	double notaMedia;
	
	//Constructor
	public Alumno(String nombre, String apellidos, GregorianCalendar fechaNac, String grupo){
		super(nombre,apellidos,fechaNac);
		this.grupo=grupo;
	}
	
	//Métodos
	public String getGrupo(){
		return grupo;
	}
	
	public double getNotaMedia(){
		return notaMedia;
	}
	
	public void setGrupo(String grupo){
		this.grupo=grupo;
	}
	
	public void setNotaMedia(double notaMedia){
		this.notaMedia=notaMedia;
	}
	
	@Override
	public String getNombre(){
		return nombre;
	}
	
	@Override
	public void mostrar(){
		super.mostrar(); //LLamada al método mostrar de la superclase
		System.out.printf("Grupo: %s\n",grupo);
		System.out.printf("Nota media: %.2f\n",notaMedia);
	}
	
	@Override
	public String devolverContenidoString()
	{
		return super.devolverContenidoString()+
		"\nGrupo: "+grupo+"\nNota media: "+notaMedia;
	}
	
	public String prueba(){
		return "Metodo prueba de la clase Alumno";
	}
}