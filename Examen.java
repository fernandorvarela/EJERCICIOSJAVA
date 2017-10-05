/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer Opcion;
        Scanner miteclado= new Scanner(System.in);
        System.out.println("Que ejercicio quiero probar del 1 al 34???");
        
        String Aux= miteclado.next();
        Opcion= Integer.parseInt(Aux);
        switch(Opcion){
              case 1:
                GuiaInicial.HacerEjercicio1();
                break;
              case 4:
                  GuiaInicial.HacerEjercicio4();
                  break;
              case 6:
                  GuiaInicial.HacerEjercicio6();
                  break;
              case 8:
              GuiaInicial.HacerEjercicio8();
              break;
              case 10:
              GuiaInicial.HacerEjercicio10();
              break;
              case 11:
                  GuiaIf.HacerEjercicio11();
                  break;
              case 14:
                  GuiaIf.HacerEjercicio15();
              
            case 13:
                GuiaIf.HacerEjercicio13();
                break;
               
        
        }
        
        
    }
    
}
