/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conductores;

/**
 *
 * @author Álvaro Fernández Barrero
 */
public class Conductor
{
    private String nombre;
    private String dni;
    private Vehiculo vehiculo;
    
    
    public Conductor(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    public void asignarVehiculo(Vehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }
    
    
    public void comer(Comida comida)
    {
        
    }
    
    
    public void mostrarNumeroMovil()
    {
        
    }
}
