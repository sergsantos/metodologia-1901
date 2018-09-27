
package ejercicio1;


public class Test {

    public static void main(String[] args) {
        Persona P= new Persona();
        P.altura=1.73f;
        P.peso=70;
        IMC x=new IMC();
        x.P=P;
        x.calcular();
        
            System.out.println("El valor del IMC es"+x.valor);
    }
    
}
