/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadmayormenor;

import java.util.Scanner;

/**
 *
 * @author wetsuit-skr
 */
public class EdadMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Se pide una edad y se informa si es menor, adolescente o mayor.
        Scanner sc= new Scanner(System.in);
        
        Integer Edad;
        
        Edad= sc.nextInt();
        
        if(Edad >17){
            System.out.println("Es Mayor");
        
        }else if(Edad <13){
            System.out.println("Es Menor");
        }else{
            System.out.println("Es Adolescente");
        }
        
        
    }
    
}
