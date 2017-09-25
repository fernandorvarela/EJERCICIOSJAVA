/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintidos;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EjercicioVeintidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4 mostrar
            aprobó , de lo contrario mostrar “ la próxima será” .*/
        Scanner sc= new Scanner(System.in);
        
        Integer Nota;
        
        System.out.println("Ingrese Nota");
        
        Nota= sc.nextInt();
        
        
        
        if (Nota >9) {
            System.out.println("Excelente");
            
        }else if (Nota >3) {
            System.out.println("Aprobo");
            
        }else{
            System.out.println("La proxima será");
        }
        
    }
    
}
