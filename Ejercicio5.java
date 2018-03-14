/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se necesita pedir 2 numeros y luego sumarlos. Mostrar el resultado.
        Scanner sc= new Scanner(System.in);
        int Num1, Num2,Resultado;
        
        System.out.println("Ingrese primer numero: ");
        Num1= sc.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        Num2= sc.nextInt();
        
        Resultado= Num1+Num2;
        
        System.out.println("El resultado es: "+Resultado);
    }
    
}
