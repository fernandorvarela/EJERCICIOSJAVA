/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author wetsuit-skr
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*26- Se pide una temperatura y se pide si quiere pasar Celsius o 
        Farenheit, hacer la cuenta y mostrar el resultado*/
        Scanner sc= new Scanner(System.in);
        Double Temperatura, Conversion;
        String Respuesta;
        
        System.out.println("Ingrese una temperatura en grados Celsius: ");
        Temperatura= sc.nextDouble();
        
        System.out.println("Le gustaria pasar la temperatura a Fareinheit?");
        Respuesta= sc.next();
        
        Conversion= (Temperatura*9)/5 + 32;
        
        if (Respuesta.equals("Si")){
            System.out.println("La temperatura en Farenheit es: "+Conversion);
        }else{
            System.out.println("La temperatura en Celsius es: "+Temperatura);
        }
    }
    
}
