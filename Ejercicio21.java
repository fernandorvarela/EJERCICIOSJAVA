/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;


/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*21- Se ingresa la cantidad de equipaje, si son más de tres, se informa
        que no pueden viajar, de lo contrario desear buen viaje.*/
        
        Scanner sc= new Scanner(System.in);
        
        int CantidadEquipaje;
        
        System.out.println("Ingrese  la cantidad de equipaje: ");
        CantidadEquipaje= sc.nextInt();
        
        if(CantidadEquipaje>3){
            System.out.println("No pueden viajar");
        }else{
            System.out.println("Buen viaje");
        }
    }
    
}
