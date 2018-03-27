/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*23- Debemos pedir el ancho y el largo de un terreno e informar
        cuantos metros de alambre necesitamos para dar
        tres (3) vueltas de alambre*/ 
        
        Scanner sc= new Scanner(System.in);
        
        String DatoAux;
        Float Ancho, Largo, MetrosAlambre;
        
        System.out.println("Ingrese el ancho: ");
        DatoAux= sc.next();
        Ancho= Float.parseFloat(DatoAux);
        
        System.out.println("Inrgese el alto: ");
        DatoAux= sc.next();
        Largo= Float.parseFloat(DatoAux);
        
        MetrosAlambre= (Ancho * Largo) *3;
        
        System.out.println("Los metros de alambre necesarios para dar 3 vueltas son: "+ MetrosAlambre);
        
        
        
    }
    
}
