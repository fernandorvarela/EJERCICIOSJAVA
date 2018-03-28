/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*34- Se pide un dia de la semana, si es lunes mostrar el mensaje 
        "Buen comienzo". Para el resto de los dias hábiles mostrar "A aguantar".
        Si es sabado o domingo mostrar "Buen finde"*/
        
        Scanner sc= new Scanner(System.in);
        
        String Opciones;
        
        System.out.println("Ingrese un día de la semana");
        Opciones= sc.next();
        
        switch(Opciones){
            case"Lunes":
                System.out.println("Buen comienzo");
                break;
          
                        case"Sabado":
                            case"Domingo":
                                System.out.println("Buen finde");
                                break;
                                
                            default:
                                System.out.println("A aguantar");
                                
        
        }
    }
    
}
