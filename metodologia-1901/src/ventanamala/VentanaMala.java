/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanamala;
import java.awt.Point;
import javax.swing.JFrame;
import java.util.Random;
import java.util.logging.Level;
import javax.swing.JFrame;
/**
 *
 * @author T-107
 */
public class VentanaMala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1=new Thread(new Runnable() {
        
            public void run() {
                
                while (true){
                    try {
                        Thread.sleep(50);
                        
               JFrame v=new JFrame();
               v.setSize(350,350);
               v.setTitle("Virus");
               v.setLocationRelativeTo(null);
               v.setVisible(true);
               
               Point p= v.getLocationOnScreen();
                System.out.println("x:"+p.x+"y:"+p.y);
                int largo=p.x*2;
                int alto=p.y*2;
                Random r1=new Random();
                Random r2=new Random();
                int dx=r1.nextInt(largo);
                int dy=r2.nextInt(alto);
                v.setLocation(dx,dy);
                
               } catch (InterruptedException ex){
               }
                }
                  
            }
        
            });
               t1.start(); 
    }
    
}
