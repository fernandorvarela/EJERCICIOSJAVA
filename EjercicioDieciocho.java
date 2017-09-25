/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciocho;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EjercicioDieciocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”
        de lo contrario mostrar el mensaje “clave incorrecta.*/
        Scanner sc= new Scanner(System.in);
        
        String Clave;
        
        System.out.println("Ingrese Una Clave");
        Clave= sc.next();
        
        if (Clave.equals("Facultad")) {
            System.out.println("Bienvenido");
            
        }else{
            System.out.println("Clave Incorrecta");
        }
    }
    
}
