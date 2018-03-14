/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente
        mensaje "Su nombre es XXX y su apellido es XXX"*/
        
        Scanner sc= new Scanner(System.in);
        String Nombre, Apellido;
        
        System.out.println("Ingrese su nombre: ");
        Nombre= sc.next();
        
        System.out.println("Ingrese su apellido: ");
        Apellido= sc.next();
        
        System.out.println("Su nombre es: "+Nombre+" y su apellido es: "+Apellido);
    }
    
}
