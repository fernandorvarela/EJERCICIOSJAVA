/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*29- Se ingresa un mes del año, si es Enero o Febrero, mostrar
        el mensaje "Iniciando el año".
        Si es Junio o Julio el mensaje "Mitad de año" y si es Diciembre
        el mensaje "Fin de año"*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        System.out.println("Ingrese un mes del año");
        Opciones= sc.next();
        
        switch(Opciones){
            case"Enero":
                case"Febrero":
                    System.out.println("Iniciando el año");
                    break;
                    case"Junio":
                        case"Julio":
                            System.out.println("Mitad de año");
                            break;
                            case"Diciembre":
                                System.out.println("Fin de año");
                                
        
        }
    }
    
}
