/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se piden tres números e informar el promedio.
        Scanner sc= new Scanner(System.in);
        int Num1,Num2,Num3;
        int Promedio;
        
        System.out.println("Ingrese primer numero: ");
        Num1= sc.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        Num2= sc.nextInt();
        
        System.out.println("Inrgese tercer numero: ");
        Num3= sc.nextInt();
        
        Promedio= (Num1+Num2+Num3)/3;
        
        System.out.println("El promedio es: "+Promedio);
    }
    
}
