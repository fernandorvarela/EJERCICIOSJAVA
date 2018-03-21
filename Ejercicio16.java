/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se debe ingresar una edad e informar si es mayor de edad o no.*/
        
        Scanner sc= new Scanner(System.in);
        
        int Edad;
        
        System.out.println("Ingrese su edad: ");
        Edad=sc.nextInt();
        
        if(Edad>=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
    
}
