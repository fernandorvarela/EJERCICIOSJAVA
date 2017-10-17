/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;
//Centro numerico
/**
 *
 * @author alumno
 */
public class FuncionesParaFor {
    public static void Saludar(){
        System.out.println("hola mundo");
        
    }
    public static void SaberSiEsPrimo() {
        int numero=7;
        int Contador;
        boolean Bandera=true;
        for(Contador=2; Contador < numero;Contador++){
            if(numero%Contador==0)
            {
                Bandera=false;
                break;
            }
        }
        if (Bandera==false) {
            
        }else{
            System.out.println("Es un numero primo");
        }
    }
    public static void CentroNumerico()
    {
        int Numero=6;
        int SumaAnteriores=0;
        int sumaPosteriores=0;
        boolean EsCentroNumerico=false;
     
        
        for (int Contador=1; Contador< Numero; Contador++)
        {
            SumaAnteriores= SumaAnteriores+Contador;
        {
        System.out.println(SumaAnteriores);            
        for (int posterior = Numero+1; ; posterior++)
        {
            sumaPosteriores= sumaPosteriores+posterior;
            if(sumaPosteriores== sumaPosteriores){

                    EsCentroNumerico=true;
                    break;
            }
            if(sumaPosteriores>SumaAnteriores)
            {
                break;
            }
        }
        if(EsCentroNumerico)
        {
            System.out.println("Es centro numerico"+Numero);
        }else
        {
            System.out.println("No es");
        }
        }   
        
    }
    }
    public static void FibonacciSucesion()
    {
       int Numero=1;
       int Suma=1;
       int Anterior=1;
       int Fibonacci=0;
       int AuxAnterior;
       
        for (int Contador = 1; Contador < 10; Contador++) {
            AuxAnterior=Fibonacci;
            Fibonacci=Suma+Anterior;
            
            Anterior=Fibonacci;  
        }
    }
}

