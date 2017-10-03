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
public class GuiaInicial {
    public static void saludar() {
        
        System.out.println("Buenas Tardes");
        
    }
    public static void HacerEjercicio1()
    {
        System.out.println("esto funciona de maravilla");
    
    
    }
    public static void HacerEjercicio2() {
        Scanner miteclado= new Scanner(System.in);
        String nombre;
        
        System.out.println("ingrese su nombre");
        nombre= miteclado.next();
        
        
    }
    public static void HacerEjercicio4() {
        /*() vacios
        *4- Al ingresar la edad y el nombre mostrar el siguiente mensaje: 
        *“ Usted se llama “ XXXXXX y tiene XX años de edad”.*/
        Scanner sc= new Scanner(System.in);
        
        String Nombre;
        Integer Edad;
        
        
        System.out.println("Ingrese su nombre");
        Nombre= sc.next();
        
        System.out.println("Ingrese su edad");
        Edad= sc.nextInt();
        
        System.out.println("Usted se llama: "+Nombre);
        System.out.println("Y su edad es: "+Edad);
        
        
        
    }
    
    public static void HacerEjercicio6() {
        /*() vacios
        6- Se piden tres números e informar el promedio.*/
        Scanner sc= new Scanner(System.in);
        
        Integer NumeroUno;
        Integer NumeroDos;
        Integer NumeroTres;
        Integer Promedio;
        
        System.out.println("Ingrese Primer Numero");
        NumeroUno= sc.nextInt();
        
        System.out.println("Ingrese Segundro Numero");
        NumeroDos= sc.nextInt();
        
        System.out.println("Ingrese Tercer Numero");
        NumeroTres= sc.nextInt();
        
        Promedio=(NumeroUno+NumeroDos+NumeroTres)/3;
        
        System.out.println("El promedio es: "+Promedio);
        
        
        
        
        
        
        
    }
    
    public static void HacerEjercicio8() {
        /*() vacios
        8- Se pide el largo y ancho de un terreno y se pide la superficie del mismo.*/
        Scanner sc= new Scanner(System.in);
        
        Integer Largo;
        Integer Ancho;
        Integer Superficie;
        
        System.out.println("Ingresar el largo");
        Largo= sc.nextInt();
        
        System.out.println("Ingresar el ancho");
        Ancho= sc.nextInt();
        
        Superficie= (Largo*Ancho);
        System.out.println("La superficie es: "+Superficie);
        
    }
    
    public static void HacerEjercicio10() {
        /*() vacios
        10- Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
informar cuánto dinero le corresponde a cada uno.*/
        Scanner sc= new Scanner(System.in);
        
        Integer Ganadores;
        Integer MontoTotal;
        Integer Dinero;
        
        System.out.println("Ingresar Ganadores");
        Ganadores= sc.nextInt();
        
        System.out.println("Ingresar monto total");
        MontoTotal= sc.nextInt();
        Dinero= Ganadores/MontoTotal;
        
        System.out.println("A cada ganador le corresponde: "+Dinero);
        
        
        
        
        
    }
    
}
