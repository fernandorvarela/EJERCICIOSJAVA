/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se pide la base de un cuadrado y se informa el perimetro.
        Scanner sc= new Scanner(System.in);
        
        int Base;
        int Perimetro;
        
        System.out.println("Ingrese la base del cuadrado: ");
        Base= sc.nextInt();
        
        Perimetro= Base*4;
        
        System.out.println("El perimetro es: "+Perimetro);
    }
    
}
