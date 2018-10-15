
package Test;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class PresentacionTEST extends javax.swing.JFrame {
JRadioButton radios[];
Opcion []opciones;
Pregunta p1;
   
    public PresentacionTEST() {
        initComponents();
        setLocationRelativeTo(this);
        
        //Generar en un arreglo los "rdio buttons visuales"
        radios=new JRadioButton[5];
        opciones=new Opcion[5];
        radios[0]=radioOp1;
        radios[1]=radioOp2;
        radios[2]=radioOp3;
        radios[3]=radioOp4;
        radios[4]=radioOp5;
        
        //LLenar el modelo con los vlaores correctos en la interfaz de usuario
        Opcion op1=new Opcion ("Las quesadillas",false);
        Opcion op2=new Opcion ("La grasa",false);
        Opcion op3=new Opcion ("Azucar y Harina",true);
        Opcion op4=new Opcion ("La contaminacion",false);
        Opcion op5=new Opcion ("La sal",false);
        
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
        opciones[4]=op5;
        
        p1=new Pregunta ("Esta es la principal causa del cancer",opciones);
        EtiquetaTitulo.setText(p1.titulo);
        for(int i=0;i<radios.length;i++){
        radios[i].setText(p1.opciones[i].titulo);
        }
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        EtiquetaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        radioOp5 = new javax.swing.JRadioButton();
        checarrespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setForeground(new java.awt.Color(0, 153, 255));

        EtiquetaTitulo.setText("jLabel1");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        buttonGroup1.add(radioOp5);
        radioOp5.setText("jRadioButton5");

        checarrespuesta.setText("Checar Respuesta");
        checarrespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarrespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checarrespuesta)
                    .addComponent(radioOp5)
                    .addComponent(radioOp4)
                    .addComponent(radioOp3)
                    .addComponent(radioOp2)
                    .addComponent(radioOp1)
                    .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(EtiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(radioOp1)
                .addGap(18, 18, 18)
                .addComponent(radioOp2)
                .addGap(18, 18, 18)
                .addComponent(radioOp3)
                .addGap(18, 18, 18)
                .addComponent(radioOp4)
                .addGap(18, 18, 18)
                .addComponent(radioOp5)
                .addGap(18, 18, 18)
                .addComponent(checarrespuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarrespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarrespuestaActionPerformed
        // TODO add your handling code here:
        //Buscar el "radio button seleccionado"
        int indiceSeleccionado=0;
        for(int i=0;i<radios.length;i++){
            if(radios[i].isSelected()){
            indiceSeleccionado=i;
            break;
            }
        }
        
        JOptionPane.showConfirmDialog(this,""+ evaluar(p1,radios[indiceSeleccionado]));
    }//GEN-LAST:event_checarrespuestaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionTEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checarrespuesta;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JRadioButton radioOp5;
    // End of variables declaration//GEN-END:variables

public boolean evaluar(Pregunta p, JRadioButton r){
boolean correcta=false;
//Logica de validacion ??
for(int i=0;i<p.opciones.length;i++){
if(opciones[i].titulo.equals(r.getText())){
   if(p1.opciones[i].correcta){
       correcta=true;
       break;
   }
          
}
}
return correcta;
}

}






