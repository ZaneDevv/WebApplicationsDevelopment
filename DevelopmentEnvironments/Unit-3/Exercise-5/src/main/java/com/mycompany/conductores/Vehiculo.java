/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conductores;

/**
 *
 * @author Álvaro Fernández Barrero
 */
public abstract class Vehiculo
{
    protected String marca;
    protected String modelo;
    private Motor motor;
    private Matricula matricula;
    
    
    public Vehiculo(String marca, String modelo, Motor motor, Matricula matricula)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.matricula = matricula;
    }
}