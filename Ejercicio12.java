/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 12- Se ingresa el importe de un producto importado y se le debe
        agregar el 35% de impuestos internos*/
        Scanner sc=new Scanner(System.in);
        
        int importeProducto;
        float impuestoInterno;
        
        
        System.out.println("Ingrese el importe del producto");
        importeProducto=sc.nextInt();
        
        impuestoInterno= (float)(importeProducto+35/100.0);
        
        System.out.println("EL importe del producto + el impuesto agregado del 35% es: "+impuestoInterno);
        
    }
    
}
