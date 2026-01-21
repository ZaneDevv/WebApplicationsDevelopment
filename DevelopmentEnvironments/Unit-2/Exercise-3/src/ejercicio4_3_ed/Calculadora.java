/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_3_ed;

/**
 *
 * @author Prof. Entornos de desarrollo
 */
public class Calculadora {

    private int operando1;
    private int operando2;

    public Calculadora() {
        operando1=0;
        operando2=0;
    }
    
    public int sumar() {
        return operando1 + operando2;
    }

    public int restar() {
        return operando2-operando1;
    }
    
    public int multiplicar(){
        return operando1 * operando2;
    }
    
    public int dividir(){
        return operando1 / operando2;
    }
    
    public int exponente(){
        return (int)Math.pow(operando1, operando2);
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando1;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
    
    
}
