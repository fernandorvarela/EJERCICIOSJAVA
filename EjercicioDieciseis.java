/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciseis;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se debe ingresar una edad  e  informar si es mayor de edad o no.
        Scanner sc= new Scanner(System.in);
        
        Integer Edad;
        
        System.out.println("Ingrese Su Edad");
        
        Edad= sc.nextInt();
        
        
        if (Edad >17) {
            System.out.println("Es mayor");
            
        }else{
            System.out.println("Es menor");
        }
        
    }
    
}
