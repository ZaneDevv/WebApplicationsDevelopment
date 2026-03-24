/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conductores;

/**
 *
 * @author Álvaro Fernández Barrero
 */
public class Moto extends Vehiculo implements Tuning
{
    private int cilindradas;
    
    
    public Moto(String marca, String modelo, Motor motor, Matricula matricula, int cilindradas)
    {
        super(marca, modelo, motor, matricula);
        this.cilindradas = cilindradas;
    }
    
    
    public String mostrarInfo()
    {
        return String.format("Marca: %s\nModelo: %s\nCilindradas: %d", this.marca, this.modelo, this.cilindradas);
    }
    
    
    public void hacerCaballito()
    {
        
    }
    
    @Override
    public void activarNitro()
    {
        
    }
    
}