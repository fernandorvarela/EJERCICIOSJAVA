/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*35- Las lamparas estan al mismo precio de $35 pesos final.
        
        A. Si compra 6 o mas lamparitas bajo consumo tiene un descuento del 50%.+
        B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un+
        descuento del 40% y si es de otra marca el descuento es del 30%.
        C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o "FelipeLamparas
        se hace un descuento del 25%y si es de otra marca el descuento es del 20%.+
        D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento
        es del 15%, si es "FelipeLamparas" se hace un descuento del 10% y si es
        de otra marca un 5%.
        E. Si el importe final con descuento suma mas de $120 se debe sumar un 
        10% de ingresos brutos e informar del impuesto con el siguiente mensaje:
        "IIBB usted pago X", siendo X el impuesto que se pagó.*/
        
        Scanner sc= new Scanner(System.in);
        
        Integer Cantidad;
        Double Precio= 35.0;
        String Marca;
        Double Total;
        Double Impuesto;
        
        System.out.println("Ingrese cantidad de lamparas a comprar");
         Cantidad = sc.nextInt();
         
         System.out.println("Ingrese la marca de las lamparas");
         Marca= sc.next();
         
         switch(Cantidad){
             case 5:
                 switch(Marca){
                     case "ArgentinaLuz":
                         Total= (Cantidad * Precio)*0.40;
                         System.out.println("El precio total es de: "+Total);
                         break;
                     default:
                         Total= (Cantidad * Precio)*0.30;
                         System.out.println("El precio total es de: "+Total);
                 
                 }
                 break;
             case 4:
                 switch(Marca){
                     case "ArgentinaLuz":
                     case "FelipeLaparas":
                         Total= (Cantidad * Precio)*0.25;
                         System.out.println("El precio total es de: "+Total);
                         break;
                         default:
                         Total= (Cantidad * Precio)*0.20;
                         System.out.println("El precio total es de: "+Total);
                 }
                 break;
                 case 3:
                 switch(Marca){
                     case "ArgentinaLuz":
                     Total= (Cantidad * Precio)*0.15;
                         System.out.println("El precio total es de: "+Total);
                         break;
                         case "FelipeLaparas":
                             Total= (Cantidad * Precio)*0.10;
                         System.out.println("El precio total es de: "+Total);
                         break;
                             
                         default:
                         Total= (Cantidad * Precio)*0.5;
                         System.out.println("El precio total es de: "+Total);
                 }
                 break;
                 case 2:
                     Total=(Precio * Cantidad);
                     System.out.println("El precio total es de: "+Total);
                     break;
                     case 1:
                     Total=(Precio * Cantidad);
                     System.out.println("El precio total es de: "+Total);
                     break;
                     default:
                         Total= (Precio * Cantidad)*0.50;
                         System.out.println("El precio total es de: "+Total);
                         break;
         }
         if(Total > 120){
         Impuesto= (Total * 0.10);
             System.out.println("IIBB usted pago"+Impuesto+" de impuesto");
         
         }
        
    }
    
}
