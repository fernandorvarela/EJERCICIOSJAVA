/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Al ingresar la edad y el nombre mostrar el siguiente mensaje
        "Usted se llama XXX y tiene XX años de edad.
        */
        Scanner sc=new Scanner(System.in);
        int Edad;
        String Nombre;
        
        System.out.println("Ingrese su edad: ");
        Edad= sc.nextInt();
        
        
        System.out.println("Ingrese su nombre: ");
        Nombre= sc.next();
        
        System.out.println("Usted se llama: "+Nombre+" y tiene "+Edad+"años de edad");
    }
    
}
