/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*22- Se ingresa una nota, si es 10 mostrar excelente, si esta
        entre 9 y 4 mostrar aprobó, de lo contrario mostrar "La próxima será"*/
        
        Scanner sc= new Scanner(System.in);
        
        int Nota;
        
        System.out.println("Ingrese una nota: ");
        Nota= sc.nextInt();
        
        if(Nota==10){
            System.out.println("Excelente");
        }else if(Nota<10&&Nota>=4){
            System.out.println("Aprobó");
        }else{
            System.out.println("La próxima será");
        }
    }
    
}
