/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeprueba;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner miTeclado= new Scanner(System.in);
        String MesDelAño;
        String Vacaciones;
        int edad;
        /*Si paso los 80 años y se va de vacaciones en invierno.
        Mostrar el mensaje vacunate contra la gripe*/
        
        System.out.println("Mes del año");
        MesDelAño=miTeclado.next();
        
        System.out.println("Vas de vacaiones?");
        Vacaciones= miTeclado.next();
        
        System.out.println("Ingrese su edad");
        edad= miTeclado.nextInt();
        
        
        if (Vacaciones.equals("si")) {
            System.out.println("Vacaciones");
        }
        switch(MesDelAño)
        {
            case "enero" :
                case "febrero" :
                System.out.println("Lindo Veranito!!!");
                break;
                case "julio" :
                System.out.println("Lindo invierno!!!");
                    if (edad >80) {
                        System.out.println("vacunate contra la gripe");
                        
                    }
                break;
                default:
                    System.out.println("No estamos en verano");
                    break;
                
        }
    }
    
}
