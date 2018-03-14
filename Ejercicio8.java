/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se pide el largo y ancho de un terreno y se pide la superficie del mismo.
        
        Scanner sc= new Scanner(System.in);
        int Largo,Ancho,Superficie;
        
        
        System.out.println("Ingresar el largo del terreno: ");
        Largo= sc.nextInt();
        
        System.out.println("Ingrese el ancho del terreno: ");
        Ancho= sc.nextInt();
        
        Superficie= (Largo+Largo)+(Ancho+Ancho);
        
        System.out.println("La superficie es: "+Superficie);
        
    }
    
}
