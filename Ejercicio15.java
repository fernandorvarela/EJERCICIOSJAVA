/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*15- Se pide el nombre, sexo y la localidad. Si se llama José o María
        y es de sexo masculino, viviendo en Morón, se muestra el mensaje
        "Sos de Morón"*/
        
        Scanner sc= new Scanner(System.in);
        
        String Nombre,Sexo,Localidad;
        
        System.out.println("Ingrese su nombre");
        Nombre= sc.next();
        
        System.out.println("Ingrese su sexo");
        Sexo= sc.next();
        
        System.out.println("Ingrese su localidad");
        Localidad= sc.next();
        
        if (Nombre.equals("Jose")||Nombre.equals("Maria")) {
            if (Sexo.equals("Masculino")) {
                if(Localidad.equals("Moron")){
                    System.out.println("Sos de Moron");
                }
                
            }
            
        }
    }
    }
    
    

