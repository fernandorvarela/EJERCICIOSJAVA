/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos
        de alambre e informar cuantos metros de alambre necesitamos para
        completar las vueltas de alambre.*/
        
        Scanner sc= new Scanner(System.in);
        
        String DatoAux;
        double Ancho, Largo, HilosAlambre;
        double TotalAlambre;
        
        System.out.println("Ingrese el ancho: ");
        DatoAux= sc.next();
        Ancho= Double.parseDouble(DatoAux);
        
        System.out.println("Ingrese el largo: ");
        DatoAux= sc.next();
        Largo= Double.parseDouble(DatoAux);
        
        System.out.println("Ingrese la cantidad de hilos de alambre: ");
        DatoAux=sc.next();
        HilosAlambre= Double.parseDouble(DatoAux);
        
        TotalAlambre= ((Ancho * 2 + Largo * 2)*3) - HilosAlambre;
        
        System.out.println("La cantidad de alambre que necesitamos es: "+TotalAlambre);
        
    }
    
}
