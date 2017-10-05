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
public class GuiaIf {
    public static void HacerEjercicio11(){
    /*11- Se pide el valor de la hora de trabajo de un empleado y
            la cantidad de horas trabajadas,*/
    Scanner sc= new Scanner(System.in);
    
    Integer ValorHora;
    Integer HorasTrabajadas;
    
        System.out.println("El valor por hora es: ");
        ValorHora= sc.nextInt();
        
        System.out.println("Cantidad de horas trabajadas son : ");
        HorasTrabajadas= sc.nextInt();
    
    }
    
    
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
    public static void HacerEjercicio15(){
    /* 15 Se ingresa un importe si supera los 100 pesos, se le suma un 23%.
        Si es menor a 100 pesos se le descuenta el 50%.*/
        
        Scanner sc= new Scanner(System.in);
        String Clave;
        
        
        System.out.println("La clave es");
        Clave= sc.next();
        
        if(Clave.equals("UTN750")){
        System.out.println("bienvenido");
        
    }else{System.out.println("clave erronea");}
        
        
        
        
    
    
    }
}
