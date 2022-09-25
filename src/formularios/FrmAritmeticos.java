/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.Aritmeticos;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author hebod
 */
public class FrmAritmeticos extends javax.swing.JFrame {

        Aritmeticos arit = new Aritmeticos();
    /**
     * Creates new form FrmAritmeticos
     */
    public FrmAritmeticos() {
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

        lEjer1 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        lvs1 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bVerificar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        lsuma2 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        lresta2 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        lmulti2 = new javax.swing.JLabel();
        tfNum6 = new javax.swing.JTextField();
        lDiv2 = new javax.swing.JLabel();
        tfNum7 = new javax.swing.JTextField();
        bCalcular2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        lParen31 = new javax.swing.JLabel();
        tfNum8 = new javax.swing.JTextField();
        lSuma3 = new javax.swing.JLabel();
        tfNum9 = new javax.swing.JTextField();
        lParen32 = new javax.swing.JLabel();
        lMulti3 = new javax.swing.JLabel();
        tfNum10 = new javax.swing.JTextField();
        lResta3 = new javax.swing.JLabel();
        lParen33 = new javax.swing.JLabel();
        tfNum11 = new javax.swing.JTextField();
        lDiv3 = new javax.swing.JLabel();
        tfNum12 = new javax.swing.JTextField();
        lParen34 = new javax.swing.JLabel();
        bCalcular3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        lx4 = new javax.swing.JLabel();
        tfNum13 = new javax.swing.JTextField();
        la4 = new javax.swing.JLabel();
        tfNum14 = new javax.swing.JTextField();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        lx5 = new javax.swing.JLabel();
        tfNum15 = new javax.swing.JTextField();
        la5 = new javax.swing.JLabel();
        tfNum16 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tfNum17 = new javax.swing.JTextField();
        bCalcular5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operadores Aritméticos de Java");

        lEjer1.setText("1. Verificar si un número es múltiplo del otro");

        lvs1.setText("vs.");

        bVerificar1.setText("Verificar");
        bVerificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Calcular el resultado de la expresión");

        lsuma2.setText("+");

        lresta2.setText("-");

        lmulti2.setText("*");

        lDiv2.setText("/");

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Calcular el resultado de la expresión");

        lParen31.setText("(");

        lSuma3.setText("+");

        lParen32.setText(")");

        lMulti3.setText("*");

        lResta3.setText("-");

        lParen33.setText("(");

        lDiv3.setText("/");

        lParen34.setText(")");

        bCalcular3.setText("Calcular");
        bCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Calcular el resultado de la expresión: x^a");

        lx4.setText("x=");

        la4.setText("a=");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Calcular el resultado de la expresión: x^a * a/b");

        lx5.setText("x=");

        la5.setText("a=");

        lb5.setText("b=");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lParen31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSuma3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lParen32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMulti3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lResta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lParen33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDiv3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lParen34, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCalcular3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEjer1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lvs1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVerificar1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lsuma2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lresta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lmulti2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDiv2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bCalcular2))
                            .addComponent(lEjer2)
                            .addComponent(lEjer3)
                            .addComponent(lEjer4)
                            .addComponent(lEjer5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lx4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(la4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bCalcular4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lx5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(la5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bCalcular5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvs1)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsuma2)
                    .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lresta2)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmulti2)
                    .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDiv2)
                    .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lParen31)
                    .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSuma3)
                    .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lParen32)
                    .addComponent(lMulti3)
                    .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResta3)
                    .addComponent(lParen33)
                    .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDiv3)
                    .addComponent(tfNum12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lParen34)
                    .addComponent(bCalcular3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lx4)
                    .addComponent(tfNum13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la4)
                    .addComponent(tfNum14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lx5)
                    .addComponent(tfNum15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la5)
                    .addComponent(tfNum16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5)
                    .addComponent(tfNum17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar1ActionPerformed
        try {
            int num1 = Integer.parseInt(this.tfNum1.getText());
            int num2 = Integer.parseInt(this.tfNum2.getText());
            String resp = arit.evaluarMultiplo(num1, num2);
            JOptionPane.showMessageDialog(this, resp,
                    "Evaluar si el primer número es múltiplo del segundo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error al calcular su múltiplo",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar1ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        try {
            int num3 = Integer.parseInt(this.tfNum3.getText());
            int num4 = Integer.parseInt(this.tfNum4.getText());
            int num5 = Integer.parseInt(this.tfNum5.getText());
            int num6 =  Integer.parseInt(this.tfNum6.getText());
            int num7 = Integer.parseInt(this.tfNum7.getText());
            float ope = arit.calcularPrimeraExpresion(num3, num4, num5, num6, num7);
            JOptionPane.showMessageDialog(this, ope,
                    "Primera expresión resuelta",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error al calcular primera expresión",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular3ActionPerformed
        try {
            int num8 = Integer.parseInt(this.tfNum8.getText());
            int num9 = Integer.parseInt(this.tfNum9.getText());
            int num10 = Integer.parseInt(this.tfNum10.getText());
            int num11 =  Integer.parseInt(this.tfNum11.getText());
            int num12 = Integer.parseInt(this.tfNum12.getText());
            float result = arit.calcularSegundaExpresion(num8, num9, num10, num11, num12);
            JOptionPane.showMessageDialog(this, result,
                    "Segunda expresión resuelta",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error al calcular segunda expresión",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular3ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        try {
            int num13 = Integer.parseInt(this.tfNum13.getText());
            int num14 = Integer.parseInt(this.tfNum14.getText());
            int elevar = arit.elevar(num13, num14);
            JOptionPane.showMessageDialog(this, elevar,
                    "Número x elevado a a",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error al calcular número x elevado a a",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
        try {
            int num15 = Integer.parseInt(this.tfNum15.getText());
            int num16 = Integer.parseInt(this.tfNum16.getText());
            int num17 = Integer.parseInt(this.tfNum17.getText());
            float resultado = arit.calcularTerceraExpresion(num15, num16, num17);
            JOptionPane.showMessageDialog(this, resultado,
                    "Tercera expresión resuelta",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error al calcular tercera expresión",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular5ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAritmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAritmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAritmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAritmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAritmeticos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular3;
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bVerificar1;
    private javax.swing.JLabel lDiv2;
    private javax.swing.JLabel lDiv3;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lMulti3;
    private javax.swing.JLabel lParen31;
    private javax.swing.JLabel lParen32;
    private javax.swing.JLabel lParen33;
    private javax.swing.JLabel lParen34;
    private javax.swing.JLabel lResta3;
    private javax.swing.JLabel lSuma3;
    private javax.swing.JLabel la4;
    private javax.swing.JLabel la5;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lmulti2;
    private javax.swing.JLabel lresta2;
    private javax.swing.JLabel lsuma2;
    private javax.swing.JLabel lvs1;
    private javax.swing.JLabel lx4;
    private javax.swing.JLabel lx5;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum10;
    private javax.swing.JTextField tfNum11;
    private javax.swing.JTextField tfNum12;
    private javax.swing.JTextField tfNum13;
    private javax.swing.JTextField tfNum14;
    private javax.swing.JTextField tfNum15;
    private javax.swing.JTextField tfNum16;
    private javax.swing.JTextField tfNum17;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    private javax.swing.JTextField tfNum6;
    private javax.swing.JTextField tfNum7;
    private javax.swing.JTextField tfNum8;
    private javax.swing.JTextField tfNum9;
    // End of variables declaration//GEN-END:variables
}
