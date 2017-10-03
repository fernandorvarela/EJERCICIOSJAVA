/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaIf {
    
    
    public static void HacerEjercicio13()
    {
        String Localidad;
        String Color;
        
        Scanner miteclado= new Scanner(System.in);
        
        
        System.out.println("Ingrese color");
        Color= miteclado.next();
        
        
        System.out.println("Ingrese localidad");
        Localidad= miteclado.next();
        
        if (Color.equals("rojo")   ) {
            
            if (Localidad.equals("Avellaneda")||Localidad.equals("Lanus")   ) {
                System.out.println("Sos incha de independiente");
            }
            
        }
    }
    
}
