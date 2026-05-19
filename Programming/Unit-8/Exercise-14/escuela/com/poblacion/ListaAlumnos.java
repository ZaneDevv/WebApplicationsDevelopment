package com.poblacion;

import java.util.ArrayList;

public class ListaAlumnos
{
    // --------------------------------------
    // Atributos
    // --------------------------------------

    private ArrayList<Alumno> lista;

    // --------------------------------------
    // Constructores
    // --------------------------------------

    public ListaAlumnos()
    {
        this.lista = new ArrayList<>();
    }

    // --------------------------------------
    // Métodos
    // --------------------------------------

    public void agregarAlumno(Alumno alumno)
    {
        this.lista.add(alumno);
    }

    public void mostrarAlumnos()
    {
        for (Alumno alumno : this.lista)
        {
            alumno.mostrar();
            System.out.println("-----------------------");
        }
    }

    public Alumno buscarAlumno(String nombre)
    {
        boolean encontrado = false;
        int indice = 0;

        Alumno alumnoEncontrado = null;
        Alumno alumnoEnRevision;

        while (!encontrado && indice < this.lista.size())
        {
            alumnoEnRevision = this.lista.get(indice);
            indice++;

            if (alumnoEnRevision.getNombre().equalsIgnoreCase(nombre))
            {
                encontrado = true;
                alumnoEncontrado = alumnoEnRevision;
            }
        }

        return alumnoEncontrado;
    }
}