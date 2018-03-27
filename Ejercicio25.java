/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*25- Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una
        pared de 1 metro cuadrado, se pide el alto y ancho y se informa 
        la cantidad de cada material que necesito.*/
        
        Scanner sc= new Scanner (System.in);
        
        Integer Cal;
        Integer Cemento;
        Integer Alto;
        Integer Ancho;
        Integer Pared;
        Integer Ccemento;
        Integer Ccal;
        String DatoAux;
        
        System.out.println("Ingrese el alto: ");
        DatoAux= sc.next();
        Alto= Integer.parseInt(DatoAux);
        
        System.out.println("Ingrese el ancho: ");
        DatoAux= sc.next();
        Ancho= Integer.parseInt(DatoAux);
        
        Pared= Alto*Ancho;
        
        System.out.println("El tamaño de la pared es: "+Pared);
        
        Cemento=3;
        Cal=2;
        
        Ccemento= Pared * Cemento;
        System.out.println("Cantidad de cemento necesaria: "+ Ccemento);
        
        Ccal= Pared * Cal;
        System.out.println("Cantidad de cal necesaria: "+ Ccal);
    }
    
}
