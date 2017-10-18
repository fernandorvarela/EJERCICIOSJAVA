/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author alumno
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplos.RetornarMayor();
        //Ejemplos.SerieFibnacchi();
        //Ejemplos.SerieUtnFra();
        //Ejemplos.NumeroArmstrong();
        Ejemplos.HacerPiramide();
    }
    public static void HacerPiramide()
    {/**
     * 1
     * 12
     * 123
     * 1234
     * 12345+
     * 
     */
     
     
        int CantidadDeFilas=7;
        for (int Contador = 1; Contador < CantidadDeFilas; Contador++) {
            
            for (int ContadorLugares = CantidadDeFilas-1; ContadorLugares > Contador; ContadorLugares--) {
                System.out.print(" ");
            }
            
            for (int ContadorDos = 1; ContadorDos <=(2*Contador-1); ContadorDos++) {
                System.out.print("X");
            }
            System.out.println("");
            
            
            
        }
        
    }
    
    
    /**
     * 153 1^3+5^3+3^3=153
     */
    public static void NumeroArmstrong()
    {
        int NumeroIngresado=153;
        
        int Numero=NumeroIngresado;
        if(Numero<0)
        {
            Numero=Numero*-1;
        }
        
        int CantidadDigitos=0;
        while(Numero>0)
        {
            Numero=Numero/10;
            CantidadDigitos++;
        }
        System.out.println(CantidadDigitos);
        int Digito = 0;
        int Suma=0;
        int AuxNumero=NumeroIngresado;
        
        
        while(NumeroIngresado>0)
        Digito=NumeroIngresado%10;
        //Suma=Suma+(int)Math.pow(Digito^CantidadDigitos);
        NumeroIngresado=NumeroIngresado/10;
        System.out.println(Digito);
        
        System.out.println(Suma);
        if(Suma==NumeroIngresado)
        {
            System.out.println("Es armstrong");
        }else
        {
            System.out.println("No es");
        }
    }
    public static void RetornarMayor()
    {
        /*fibonacci= Anterior+Actual
        *1= 0+1
        *2= 1+1
        *3= 1+2
        *5= 2+3
        */
        int NumeroUno=9;
        int NumeroDos=6;
        int NumeroTres=3;
        
        if (NumeroUno>NumeroDos&&NumeroUno>NumeroTres) {
            System.out.println("El mayor es: ");
        }else
        {
            if (NumeroDos>NumeroUno&&NumeroUno>NumeroTres)
                System.out.println("El mayor es: ");
        else
        
            System.out.println("El mayor es: ");
        }
        
        
    }
    public static void SerieUtnFra()
    {
       /*
        *Recorrer los numeros del 1 al 100
        *Mostrar en el lugar del numero la palabra "UTN" para todos los 
        *multiplos de 3(tres)
        *Mostrar en el lugar del numero la palabra "FRA" para todos los 
        *multiplos de 5(cinco)
        *Mostrar la palabra "UTNFRA"
        *Para todos los multiplos de 3 y 5 (ej:15)
        */ 
        
    }
    public static void SerieFibnacchi()
    {
        int Fibonacci;
        int Actual=1;
        int Anterior=0;
        
        for (int Contador = 0; Contador < 5; Contador++) {
            Fibonacci= Anterior+Actual;
            Anterior=Actual;
            Actual=Fibonacci;
            System.out.println("es el: "+Fibonacci);
        }
    }
}
