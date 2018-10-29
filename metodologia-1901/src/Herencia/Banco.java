/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Banco {
    
    public static void main(String[] args) {
        //Primero creamos una tarjeta de tipo "credito"
        TarjetaCredito t1=new TarjetaCredito();
        //Le asignamos un numero
        t1.setNumero(666);
        
        
        
        //TarjetaAhorro t2=new TarjetaAhorro();
       // t2.setNumero(4321);
        
        //TarjetaNomina t3=new TarjetaNomina();
       // t3.numero=-666;
     
        System.out.println("El numero de la tarjeta t3 es: " +t1.getNumero());
        
       
    }
}
