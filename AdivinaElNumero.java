/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        Integer numeroingresado;
        String DatoAux;
        
        System.out.println("");
        Integer miRandom = (int) (Math.random()*10)+1;
        
        System.out.println("Numero secreto "+miRandom);
        System.out.println("Ingrese el numero");
        DatoAux= sc.next();
        
        if (miNumeroSecreto== numeroIngresado) {
            System.out.println("Gano");
            
        }else{
            if (numeroIngresado> miNumeroSecreto) {
                System.out.println("te pasaste");
                
            }else{
            }
        }
    }
    
}
/*Informar si: 
A si le erro por un punto mensaje "casi casi"
B si le erro por 2 puntos mensaje "cerca"
C si le erro por 3 puntos mensaje "ni cerca"
D si le erro por 4 puntos "bien lejos"
E para todo lo demas el mensaje "sos horrible en este juego"*/