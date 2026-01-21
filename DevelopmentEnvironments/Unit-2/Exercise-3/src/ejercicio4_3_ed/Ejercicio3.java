/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_3_ed;

import java.util.Scanner;

/**
 *
 * @author Prof. Entornos de desarrollo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Calculadora
        int opcion;
        Scanner scanner = new Scanner(System.in);
        Calculadora miCalculadora=new Calculadora();

        System.out.println("************************************");
        System.out.println("Bienvenido a la GRAN CALCULADORA");
        System.out.println("************************************");
        System.out.println("Indique cuál será el operando 1");
        opcion = scanner.nextInt();
        miCalculadora.setOperando1(opcion);
        System.out.println("Indique cuál será el operando 2");
        opcion = scanner.nextInt();
        miCalculadora.setOperando2(opcion);
        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Realizar la operación correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + miCalculadora.sumar());
                    break;
                case 2:
                    System.out.println("Resultado: " + miCalculadora.restar());
                    break;
                case 3:
                    System.out.println("Resultado: " + miCalculadora.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: " + miCalculadora.dividir());
                    break;
                case 5:
                    System.out.println("Resultado: " + miCalculadora.exponente());
                    break;     
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
    
}
