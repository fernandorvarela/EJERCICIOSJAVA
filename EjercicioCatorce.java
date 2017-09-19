/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se pide ingresar una clave, si es ''UTN750'' se mostrara el mensaje bienvenido, de lo contrario el mensaje clave erronea*/
        //15 Se ingresa un importe si supera los 100 pesos, se le suma un 23%. Si es menor a 100 pesos se le descuenta el 50%.
        //16 Se ingresa el importe de un pasaje de avion y el mes de viaje, si es enero se le descuenta un 10% por temporada baja.
        Scanner sc= new Scanner(System.in);
        String Clave;
        
        
        System.out.println("La clave es");
        Clave= sc.next();
        
        if(Clave.equals("UTN750")){
        System.out.println("bienvenido");
        
    }else{System.out.println("clave erronea");}
        
        
        
        
    }
    
}
