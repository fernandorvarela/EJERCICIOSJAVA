/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se ingresa la cantidad de ganadores de la loteria nacional y 
        el monto total del premio,informar cuánto dinero le corresponde a cada uno.
        */
        
        int CantidadGanadores,MontoTotal;
        int DineroCorrespondiente;
        
        CantidadGanadores=4;
        System.out.println("Cantidad de ganadores: "+CantidadGanadores);
        
        MontoTotal=8000;
        System.out.println("Monto total: "+MontoTotal);
        
        DineroCorrespondiente= MontoTotal/CantidadGanadores;
        
        System.out.println("A cada uno le corresponde un total de "+DineroCorrespondiente);
    }
    
}
