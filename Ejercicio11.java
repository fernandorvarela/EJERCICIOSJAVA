/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se pide el valor de la hora de trabajo de un empleado y la cantidad
            de horas trabajadas,informar cuanto le corresponde de sueldo, 
        restandole el 15% de aportes.*/
        Scanner sc= new Scanner(System.in);
        Integer valorHoraDeTrabajo, cantidadHorasTrabajadas;
        double Sueldo;
        
        System.out.println("Inrgesar el valor de la hora de trabajo");
        valorHoraDeTrabajo=sc.nextInt();
        
        System.out.println("Ingrese cantidad de horas trabajadas");
        cantidadHorasTrabajadas=sc.nextInt();
        
        Sueldo= (float)((cantidadHorasTrabajadas*100)/valorHoraDeTrabajo);
        
        System.out.println("Le corresponde de sueldo: $"+Sueldo);
    }
    
}
