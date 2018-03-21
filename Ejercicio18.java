/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*18- Se pide una clave y si coincide, mostrar el mensaje "Bienvenido".
        De lo contrario, mostrar "Clave incorrecta".*/
        
        Scanner sc= new Scanner(System.in);
        
        int Clave;
        
        System.out.println("Ingrese una clave: ");
        Clave= sc.nextInt();
        
        if(Clave==12345){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Calve incorrecta");
        }
        
        
        
    }
    
}
