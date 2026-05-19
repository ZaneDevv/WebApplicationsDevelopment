package com;

import com.poblacion.*;
import java.util.GregorianCalendar;

public class Programa
{
    public static void main(String[] args)
    {
        // Creando lista
        ListaAlumnos lista = new ListaAlumnos();

        // Añadiendo alumnos a la lista
        Alumno alumno1 = new Alumno("John", "Doe", new GregorianCalendar(2000, 1, 1), "A");
        Alumno alumno2 = new Alumno("Jane", "Doe", new GregorianCalendar(2000, 2, 1), "B");

        lista.agregarAlumno(alumno1);
        lista.agregarAlumno(alumno2);


        // Mostrando lista
        System.out.println("--------------MOSTRANDO ALUMNOS--------------");
        lista.mostrarAlumnos();

        // Buscando alumno por nombre
        System.out.println("\n\n--------------BUSCANDO ALUMNO:--------------");
        
        Alumno alumnoEncontrado = lista.buscarAlumno("John");
        if (alumnoEncontrado != null)
        {
            alumnoEncontrado.mostrar();
        }
        else
        {
            System.out.println("Alumno no encontrado...");
        }


        // Modificando alumno
        System.out.println("\n\n--------------MOSTRANDO ALUMNOS--------------");
        System.out.println("Se ha modificado un alumno\n");

        alumno1.setFechaNac(new GregorianCalendar(1990, 12, 31));
        lista.mostrarAlumnos();
    }
}