/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        13- Se ingresa un color y una localidad, si es avellaneda o Lanús y
        el color es rojo, mostrar el mensaje "sos de independiente".
        */
        
        Scanner sc= new Scanner(System.in);
        
        String Localidad;
        String Color;
        
        System.out.println("Ingrese localidad: Avellaneda o Lanus");
        Localidad=sc.next();
        
        System.out.println("Ingresar un color");
        Color=sc.next();
        
        if(Localidad.equals("Avellaneda")||Localidad.equals("Lanus")&&Color.equals("Rojo")){
            System.out.println("Sos de independiente");
        }
        }
    }
    
