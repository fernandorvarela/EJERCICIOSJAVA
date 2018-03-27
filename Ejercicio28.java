/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*28- Se ingresa un mes del año, si es febrero o enero, mostrar el 
        mensaje "Feliz verano".
        De lo contrario, informar "No es verano".*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        
        System.out.println("Ingresar mes del año: ");
        Opciones= sc.next();
        
        switch(Opciones){
        
        case "Enero":
        case "Febrero":
        System.out.println("Feliz verano");
        break;
        
        default:
            System.out.println("No es verano");
    
    
    }
    }
    
}
