/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TomarDatosValidos();
        //EjemploWhile.ContadorYAcumuladores();
        //EjemploWhile.NumeroPrimo();
        EjemploWhile.PrimosDelUnoAlCien();
    }
    
    /*
    *Pide los datos de una persona y valida cada uno.
    *Datos a pedir: Nombre, Edad, Entre 1 y 100 Años.
    *Sexo (F o M)
    *Estado Civil (soltero-casado-divorciado-viudo)
    *Nacionalidad (n: nativo, L: latinoamericano,E: europeo o R: resto del mundo)
    *Sueldo (entre 8000 y 58000)
    *Dona Organos (Si o No)
    *Clave no menos de 6 caracteres
    */
    public static void TomarDatosValidos()
    {
        Scanner miTeclado= new Scanner(System.in);
        String Aux;
        String Nombre;
        Integer Edad;
        String Sexo;
        String EstadoCivil;
        String Nacionalidad;
        Integer Sueldo;
        String Donador;
        
        
        System.out.println("Ingrese nombre");
        Nombre= miTeclado.next();
        
        
        
        System.out.println("Ingrese edad");
        Aux= miTeclado.next();
        Edad=Integer.parseInt(Aux);
        
        while( Edad<=0 || Edad>100)
        {
           System.out.println("Error ,Ingrese edad");
            Aux= miTeclado.next();
            Edad=Integer.parseInt(Aux);
        
        
        }
        
        System.out.println("Ingrese sexo");
        Sexo= miTeclado.next();
        while(!Sexo.equals("F")&&!Sexo.equals("M"))
        {
            System.out.println("Ingrese sexo");
            Sexo= miTeclado.next();
        
        }
        
        System.out.println("Ingresar estado civil");
        EstadoCivil=miTeclado.next();
        
        while(EstadoCivil.equals("S")||EstadoCivil.equals("C")||EstadoCivil.equals("D")||EstadoCivil.equals("V"))
        {
            System.out.println("Ingresar estado civil");
        EstadoCivil=miTeclado.next();
        }
        
        System.out.println("Ingrese nacionalidad");
        Nacionalidad= miTeclado.next();
        while(Nacionalidad.equals("N")||Nacionalidad.equals("L")||Nacionalidad.equals("E")||Nacionalidad.equals("R"))
        {
            System.out.println("Ingrese nacionalidad");
        Nacionalidad= miTeclado.next();
        }
        
        System.out.println("Ingrese sueldo");
        Aux=miTeclado.next();
        Sueldo=Integer.parseInt(Aux);
        
        while(Sueldo>7999||Sueldo<58001)
        {
            System.out.println("Ingrese sueldo");
        Aux=miTeclado.next();
        Sueldo=Integer.parseInt(Aux);
        }
        
        System.out.println("Ingrese si es donador o no");
        Donador= miTeclado.next();
        
        while(Donador.equals("Si")||Donador.equals("No"))
        {
            System.out.println("Ingrese si es donador o no");
        Donador= miTeclado.next();
        }
        
        
        System.out.println("Su nombre es: "+Nombre+"Su edad es:"+Edad+"Su sexo es:"+Sexo+"Su Estado Civil es:"+EstadoCivil+"Su nacionalidad es:"+Nacionalidad+"Su sueldo es:"+Sueldo+"Usted es donador :"+Donador);
        
       
    }
    
    public static void ContadorYAcumuladores()
    {
        Integer Contador=0;
        Integer Acumulador=0;
        Integer Multiplicador=1;
        Integer Restador=0;
        Integer ContadorPares=0;
        Integer ContadorDiv3=0;
        
        while(Contador<10)
        {
            Contador++;
            System.out.println("Numero: "+Contador);
            Acumulador=Acumulador+Contador;
            Multiplicador=Multiplicador*Contador;
            Restador=Restador-Contador;
            
            if(Contador%2==0)
            {
                ContadorPares++;
            }
            if (Contador%3==0) {
                ContadorDiv3++;
            }
        }
        System.out.println("La suma es: "+Acumulador);
        System.out.println("La multiplicacio: "+Multiplicador);
        System.out.println("La resta: "+Restador);
        System.out.println("Los pares son: "+ContadorPares);
        System.out.println("Los divisores son: "+ContadorDiv3);
    }
    public static void NumeroPrimo()
    {
        Integer NumerIngresado=9;
        Integer Contador=2;
        Integer ContadorDivisores=0;
        
        
        while(Contador<NumerIngresado)
        {
            if (NumerIngresado%Contador==0) {
                ContadorDivisores++;
            break;
            }
            Contador++;
        }
        if (ContadorDivisores>0)
        {
            System.out.println("No es primo");    
        
        }else
        {
            System.out.println("Es primo");
        }
    }
    public static void PrimosDelUnoAlCien()
    {
        Integer NumerIngresado=1;
        while(NumerIngresado<101)
        {
            NumerIngresado++;
        
         Integer Contador=2;
         Integer ContadorDivisores=0;


         while(Contador<NumerIngresado)
         {
             if (NumerIngresado%Contador==0) {
                 ContadorDivisores++;
             break;
             }
             Contador++;
         }
         if (ContadorDivisores>0)
         {
             //System.out.println("No es primo");    

         }else
         {
             System.out.println("Es primo el numero: "+NumerIngresado);
         }
     }
    }
}
