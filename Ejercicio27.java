/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*27- Para una pileta se necesita saber la superficie,
        se debe pedir que tipo de pileta tiene( cuadrada o redonda)
        de ser redonda, pedir el radio, si es cuadrada pedir el largo y el ancho,
        mostrar la superficie de la pileta.*/
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        
        String DatoAux, Superficie;
        Double Radio, Largo, Ancho, TotalSup;
        
        System.out.println("Que tipo de pileta tiene (Cuadrada o Redonda)");
        Superficie= sc.next();
        
        if (Superficie.equals("Cuadrada")){
            System.out.println("Ingrese el Ancho: ");
            DatoAux= sc.next();
            Ancho= Double.parseDouble(DatoAux);
            
            System.out.println("Ingrese el Largo: ");
            DatoAux= sc.next();
            Largo= Double.parseDouble(DatoAux);
            
            TotalSup= Ancho * Largo;
            
            System.out.println("La superficie de la pileta es: "+TotalSup);
            
        
        }else if(Superficie.equals("Redonda")){
            System.out.println("Ingrese el Radio: ");
            DatoAux= sc.next();
            Radio= Double.parseDouble(DatoAux);
            
            TotalSup= Radio * Radio * 3.1416;
            
            System.out.println("El radio de la pileta es: "+TotalSup);
        
        }
        
       
    }
    
}
