/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostrar el mismo nombre.
     */
    public static void main(String[] args) {
        // Para escribir las variable deben ser en MAYUSCULA.
        //1ro sca miEscanerNuevo = new scanner (system.in)
        //2do sout "Ingrese su nombre"
        //3ro nombre = miEscanerNuevo.nextLine();
        //4to sout "El nombre ingresado es: " + nombre
        //5to la variable String nombre
        String nombre;
        Scanner miEscanerNuevo = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = miEscanerNuevo.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
       
        
        
    }
    
}
