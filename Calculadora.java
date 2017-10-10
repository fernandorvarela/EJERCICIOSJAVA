/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    public static void ArrancarCalculadora()
    {
        String opcion="algo";
        System.out.println("Bienvenido a la calculadora");
        while(!opcion.equals("6"))
        Calculadora.MostrarMenu();
        Scanner miTeclado= new Scanner(System.in);
        opcion= miTeclado.next();
        switch(opcion){
            case "1":
                Calculadora.Sumar();
                break;
            case "2":
                Calculadora.Restar();
                break;
            case "6":
                Calculadora.Salir();
                
                break;
                
        }
            
    }
    private static void MostrarMenu()
    {
        
        System.out.println("1-suma");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("6-salir");
        System.out.println("Ingrese opcion deseada");
    }
    
}
