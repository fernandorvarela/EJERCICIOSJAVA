/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*30- Se ingresa un mes del año y si es Enero: "Que comiences bien el año!"
        Si es Marzo "A clases". Si es Julio "Se vienen las vacaciones!".
        Si es Diciembre "Felices fiestas!"*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        System.out.println("Ingrese un mes del año: ");
        Opciones= sc.next();
        
        switch(Opciones){
            case"Enero":
                System.out.println("Que comiences bien el año");
                break;
                case"Marzo":
                System.out.println("A clases");
                break;
                case"Julio":
                System.out.println("Se vienen las vacaciones");
                break;
                case"Diciembre":
                System.out.println("Felices fiestas");
        
        }
        
    }
    
}
