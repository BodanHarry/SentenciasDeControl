/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.Do;
import javax.swing.JOptionPane;

/**
 *
 * @author hebod
 */
public class FrmDo extends javax.swing.JFrame {

    Do doing = new Do();

    /**
     * Creates new form Do
     */
    public FrmDo() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bVerificar3 = new javax.swing.JButton();
        bCalcular2 = new javax.swing.JButton();
        ln1 = new javax.swing.JLabel();
        bImprimir6 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        bVerificar4 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        lContra4 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        lEjer2 = new javax.swing.JLabel();
        bCalcular5 = new javax.swing.JButton();
        tfContra5 = new javax.swing.JTextField();
        lEjer3 = new javax.swing.JLabel();
        la2 = new javax.swing.JLabel();
        bCalcular1 = new javax.swing.JButton();
        lEjer1 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        tfNum2 = new javax.swing.JTextField();
        tfNum1 = new javax.swing.JTextField();
        lEjer5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bVerificar3.setText("Verificar");
        bVerificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar3ActionPerformed(evt);
            }
        });

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        ln1.setText("N=");

        bImprimir6.setText("Imprimir");
        bImprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimir6ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Verifique que la contraseña es correcta: \"abc.123\"");

        lb2.setText("b=");

        bVerificar4.setText("Verificar");
        bVerificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar4ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Imprimir los 6 primeros términos de la serie de Fibonacci");

        lContra4.setText("Contraseña:");

        lEjer2.setText("2. Calcule el promedio de los números entre a y b");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Verificar si el siguiente número es compuesto");

        la2.setText("a=");

        bCalcular1.setText("Calcular");
        bCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular1ActionPerformed(evt);
            }
        });

        lEjer1.setText("1. Calcule el promedio de los números entre 1 y N");

        lEjer5.setText("5. Imprimir la suma de los número impares existentes entre 2 y 200");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lContra4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContra5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar3))
                    .addComponent(lEjer1)
                    .addComponent(lEjer2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ln1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular2))))
                    .addComponent(lEjer3)
                    .addComponent(lEjer4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bImprimir6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln1)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la2)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular2)
                    .addComponent(lb2)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lContra4)
                    .addComponent(tfContra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bCalcular5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bImprimir6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar3ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(tfNum4.getText());
        String resp = String.valueOf(doing.esComp(n));
        JOptionPane.showMessageDialog(null, resp);

    }//GEN-LAST:event_bVerificar3ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(tfNum2.getText());
        int n2 = Integer.parseInt(tfNum3.getText());
        JOptionPane.showMessageDialog(null, doing.calcularProm2(n2, n1));

    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bImprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimir6ActionPerformed
        // TODO add your handling code here:
          int n1=0,n2=1,n3,i;
          i=2;
        do{
            n3=n1+n2;    
            JOptionPane.showMessageDialog(this, n3);;    
            n1=n2;    
            n2=n3;    
            ++i;
        }while(i < 7);
    }//GEN-LAST:event_bImprimir6ActionPerformed

    private void bVerificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar4ActionPerformed
        String pass1 = tfContra5.getText();
        try {

            if (pass1.equals("abc123")) {
                JOptionPane.showMessageDialog(this, "Acceso concedido");

            } else {

                JOptionPane.showMessageDialog(this, "Vuelva a intentar");

            }
        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_bVerificar4ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, doing.imprimirImpar());
        
    }//GEN-LAST:event_bCalcular5ActionPerformed

    private void bCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular1ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(tfNum1.getText());
        JOptionPane.showMessageDialog(null, doing.calcularProm(n));
    }//GEN-LAST:event_bCalcular1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular1;
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bImprimir6;
    private javax.swing.JButton bVerificar3;
    private javax.swing.JButton bVerificar4;
    private javax.swing.JLabel lContra4;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel la2;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel ln1;
    private javax.swing.JTextField tfContra5;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    // End of variables declaration//GEN-END:variables
}
