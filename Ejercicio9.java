/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se ingresa la cantidad y precio de un producto y se informa el total
        a pagar*/
        
        int Cantidad, Precio, TotalAPagar;
        
        Cantidad=10;
        System.out.println("Cantidad del producto: "+Cantidad);
        
        Precio=20;
        System.out.println("Precio del producto: $"+Precio);
        
        TotalAPagar= Cantidad*Precio;
        
        System.out.println("La cantidad a pagar es: $"+TotalAPagar);
        
    }
    
}
