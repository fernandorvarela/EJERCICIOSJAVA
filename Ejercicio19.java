/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*19- Se ingresa un importe, si supera los 100 pesos se le suma
        un impuesto del 23%, sino, se le descuenta el 50%.*/
        
        Scanner sc= new Scanner(System.in);
        
        int Importe;
        float Impuesto;
        System.out.println("Ingrese un importe: ");
        Importe= sc.nextInt();
        
        if(Importe>100){
            Impuesto=Importe + Importe * 0.23f;
            System.out.println("El importe superior a $100 es de: "+Impuesto);
        }else{
            Impuesto= Importe - Importe * 0.50f;
            System.out.println("El importe inferior a $100 es de: "+Impuesto);
        }
    }
    
}
