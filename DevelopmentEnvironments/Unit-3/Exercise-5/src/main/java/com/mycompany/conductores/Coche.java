/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conductores;

/**
 *
 * @author Álvaro Fernández Barrero
 */
public class Coche extends Vehiculo
{
    private int numPuertas;
    
    
    public Coche(String marca, String modelo, Motor motor, Matricula matricula, int numPuertas)
    {
        super(marca, modelo, motor, matricula);
        this.numPuertas = numPuertas;
    }
    
    
    public String mostrarInfo()
    {
        return String.format("Marca: %s\nModelo: %s\nNúmero de puertas: %d", this.marca, this.modelo, this.numPuertas);
    }
    
    
    public void abrirMaletero()
    {
        
    }
}
