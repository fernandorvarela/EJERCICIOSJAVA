/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*14- Se pide el sexo y el nombre, si es "f" de femenino, se muestra
        el mensaje "Feliz dia XXXX", donde XXXX es el nombre.*/
        
        Scanner sc= new Scanner(System.in);
        
        String Sexo;
        String Nombre;
        
        System.out.println("Ingrese su sexo: f O m");
        Sexo= sc.next();
        
        System.out.println("Ingrese su Nombre");
        Nombre= sc.next();
        
        if(Sexo.equals("f")){
            System.out.println("Feliz día "+Nombre);
        }
        }
    }
    

