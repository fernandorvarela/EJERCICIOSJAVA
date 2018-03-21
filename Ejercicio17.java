/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*17- Se pide una edad y se informa si es niño, adolescente o mayor
        de edad.*/
        
        Scanner sc= new Scanner(System.in);
        
        int Edad;
        
        System.out.println("Ingrese su edad: ");
        Edad= sc.nextInt();
        
        if (Edad>=18) {
            System.out.println("Usted es mayor de edad");
            
        }else if (Edad<18&&Edad>12) {
            System.out.println("Usted es adolescente");
            
        }else{
            System.out.println("Usted es un niño");
        }
    }
    
}
