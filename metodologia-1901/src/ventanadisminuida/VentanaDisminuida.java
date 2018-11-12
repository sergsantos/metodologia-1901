/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanadisminuida;
import javax.swing.JFrame;
/**
 
 * @author T-107
 */
public class VentanaDisminuida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final JFrame ventana=new JFrame();
        ventana.setSize(300,300);
        ventana.setVisible(true);
        
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int dx=300;
                int dy=300;
               while (true){
                   try{
               Thread.sleep(100);
               ventana.setSize(dx,dy);
               dx--;
               dy--;
               } catch (InterruptedException ex){
               }
               }
            }
        }
        );
        t1.start();
    }
    
}
