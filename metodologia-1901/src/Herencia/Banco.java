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
       //Crear la tarjeta de credito
       TarjetaCredito tcredito=new TarjetaCredito();
       tcredito.setNumero(1234);
       tcredito.setNombre("banamex");
       tcredito.setTipo("credito");
       tcredito.setSaldo(100);
       
       TarjetaAhorro tahorro=new TarjetaAhorro();
       tahorro.setNumero(4321);
       tahorro.setNombre("bancomer");
       tahorro.setTipo("ahorro");
       tahorro.setSaldo(100);
       
       TarjetaNomina tnomina=new TarjetaNomina();
       tnomina.setNumero(7777);
       tnomina.setNombre("hsbc");
       tnomina.setTipo("nomina");
       tnomina.setSaldo(100);
       
       //Generar el codigo del deposito  forma basica
       
     
       
       //Generar un arreglo de tarjetas
       Tarjeta tarjetas[]=new Tarjeta[3];
       tarjetas[0]=tnomina;
       tarjetas[1]=tcredito;
       tarjetas[2]=tahorro;
       
       //Iterar el arreglo
       for(Tarjeta t: tarjetas){
           t.pagar(150);
           System.out.println("Saldo es " +t.getSaldo()+"tipo " +t.getTipo());
       }
       
       //Agregar a cada tarjeta un nombre que sea el nombre del banco de la tarjeta
       //, "banamex" y otro atributo que diga tipo e indique "debito" o "credito"
       
    }
}
