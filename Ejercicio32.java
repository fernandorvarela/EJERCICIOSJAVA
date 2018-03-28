/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*32- Al ingresar una hora del dia, informar si esta entre las 7 y 
        las 11: "Es de mañana".*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        System.out.println("Ingrese una hora del dia: ");
        Opciones= sc.next();
        
        switch(Opciones){
            case"7":
                case"8":
                    case"9":
                        case"10":
                            case"11":
                                System.out.println("Es de mañana");
                                break;
                                                        
                                                            
                                                            
                                                        
                                                            
                                                            
        
        }
    }
    
}
