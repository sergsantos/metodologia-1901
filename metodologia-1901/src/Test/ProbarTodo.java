
package Test;


public class ProbarTodo {
    public static void main(String[] args) {
        Opcion op1=new Opcion ("El azucar y la harina",true);
        Opcion op2=new Opcion ("La grasa",false);
        Opcion op3=new Opcion ("el sol",false);
        Opcion op4=new Opcion ("La contaminacion",false);
        Opcion op5=new Opcion ("La sal",false);
        
        Opcion[] opciones={op1,op2,op3,op4,op5};
        Pregunta p1=new Pregunta ("Esta es la principal causa del cancer",opciones);
        System.out.println(p1.titulo);
        
        for (Opcion opcion : opciones){
            System.out.println(opcion.titulo);
        }
    }
    
}
