/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploit;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EjemploIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc= new Scanner(System.in);
        // defino variables
        String nombre;
        String clave;
        String Sexo;
        String localidad;
        String colorfavorito;
        
        
        //tomo datos
        System.out.println("ingrese nombre");
        nombre= miSc.next();
        
        System.out.println("ingrese clave");
        clave= miSc.next();
        
        System.out.println("ingrese sexo: ");
        Sexo= miSc.next();
        
        System.out.println("ingrese localidad: ");
        localidad= miSc.next();
        
        System.out.println("color favorito: ");
        colorfavorito= miSc.next();
        
        /**
         * Si es masculino que viva en Lanus o avellaneda y que su color favorito sea el rojo, mostrar el mensaje sos de independiente
         * Si el nombre es Andrea la localidad es Moron y el color favorito es verde o azul se le pone el mensaje feliz primavera.
         */ 
        
            
        if (Sexo.equals("M")) {
            
            if (localidad.equals("Lanus")||nombre.equals("Avellaneda")      ) {
                if (colorfavorito.equals("rojo")) {
                    
                }
                System.out.println("sos de independiente");
                
            }
        }
        if (nombre.equals("Andrea")) {
            if (localidad.equals("Moron")) {
                if (colorfavorito.equals("Verde")||colorfavorito.equals("Azul")      ) {
                    
                }
                
            }
            System.out.println("FELIZ PRIMAVERA");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        if (colorfavorito.equals("celeste")) {
//            
//            System.out.println("sos un patriota");
//        }
        if (colorfavorito.equals("celeste")|| colorfavorito.equals("blanco")){
            
            System.out.println("sos un patriota");
    }
        /*if (nombre.equals("Admin")) {
            System.out.println("bienvenido administrador");
        }
        else {
            System.out.println("bienvenido: " + nombre);
            
        }
        
        //Ingresa M para masculino, F para femenino.
        if (nombre.equals("f")){
        
         System.out.println("Feliz día de la mujer");
        
        }
        
        if (nombre.equals("lanus")){
        
         System.out.println("Mujeres de lanus bienvenidas");
        
        }*/
        
        if (nombre.equals("Admin")) {
            System.out.println("bienvenido administrador");
        }
        else {
            System.out.println("bienvenido: " + nombre);
            
        }
        
        //Ingresa M para masculino, F para femenino.
        if (nombre.equals("f")){
        
         System.out.println("Feliz día de la mujer");
        
        }
        
        if (nombre.equals("lanus")){
        
         System.out.println("Mujeres de lanus bienvenidas");
        
        }
       
      
           
            
    }
    
}
    

