/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*31- Se ingresa un mes del año, al seleccionar un mes informar:
        Si tiene 28 dias, si tiene 30, si tiene 31 dias.*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        System.out.println("Inrgese un mes del año: ");
        Opciones= sc.next();
        
        switch(Opciones){
            case"Enero":
                case"Marzo":
                    case"Mayo":
                        case"Julio":
                            case"Agosto":
                                case"Octubre":
                                    case"Diciembre":
                                        System.out.println("El mes seleccionado tiene 31 dias.");
                                        break;
            case"Abril":
                case"Junio":
                    case"Septiembre":
                        case"Noviembre":
                            System.out.println("El mes seleccionado tiene 30 dias.");
                            break;
            case"Febrero":
                System.out.println("El mes seleccionado tiene 28 dias.");
                            
                
                    
                
        
        }
    }
    
}
