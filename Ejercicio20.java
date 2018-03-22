/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*20- Se ingresa un importe del pasaje de avión y el mes de viaje,
        si el mes es enero, se le descuenta un 10% por temporada baja.*/
        
        Scanner sc= new Scanner(System.in);
        
        String mesDeViaje;
        int ImportePasaje;
        float Descuento;
        
        System.out.println("Ingrese importe del pasaje de avión: ");
        ImportePasaje= sc.nextInt();
        
        System.out.println("Ingrese mes de viaje: ");
        mesDeViaje= sc.next();
        
        if(mesDeViaje.equals("Enero")){
            Descuento= ImportePasaje - ImportePasaje * 0.10f;
            System.out.println("En el mes de enero, se le descuenta un 10% por temporada baja: "+Descuento);
        }
    }
    
}
