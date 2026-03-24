/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conductores;

/**
 *
 * @author Álvaro Fernández Barrero
 */
public class Motor
{
    private String tipo;
    private int caballosFuerza;
    
    
    public Motor(String tipo, int caballosFuerza)
    {
        this.tipo = tipo;
        this.caballosFuerza = caballosFuerza;
    }
    
    
    public String getInfoMotor()
    {
        return String.format("Tipo: %s\nCaballos de fuerza; %d\n", this.tipo, this.caballosFuerza);
    }
}