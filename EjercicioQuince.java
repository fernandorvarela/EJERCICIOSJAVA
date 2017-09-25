/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquince;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EjercicioQuince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se pide el nombre, el sexo y la localidad. Si se llama José o maría
        y es de sexo masculino, viviendo en morón, se muestra el mensaje
        “sos de morón”.*/
        Scanner sc= new Scanner(System.in);
        
        String Nombre,Sexo,Localidad;
        
        System.out.println("Ingrese Nombre");
        Nombre= sc.next();
        
        System.out.println("Ingrese Sexo");
        Sexo= sc.next();
        
        System.out.println("Ingrese Localidad");
        Localidad= sc.next();
        
        if (Nombre.equals("Jose")||(Nombre.equals("Maria"))    ) {
            if (Sexo.equals("M")) {
                if (Localidad.equals("Moron")) {
                    System.out.println("Sos de Moron");
                    
                }
                
            }
            
        }
        
    }
    
}
