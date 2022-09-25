/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.Arreglo2;
import javax.swing.JOptionPane;

/**
 *
 * @author hebod
 */
public class FrmArreglo2 extends javax.swing.JFrame {
    
    Arreglo2 matrix = new Arreglo2();
    /**
     * Creates new form FrmArreglo2
     */
    public FrmArreglo2() {
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

        lMensaje1 = new javax.swing.JLabel();
        lMatriz = new javax.swing.JLabel();
        lMultiplicar = new javax.swing.JLabel();
        tfEscalar = new javax.swing.JTextField();
        bVerResultado = new javax.swing.JButton();
        lMensaje2 = new javax.swing.JLabel();
        lMatrizb = new javax.swing.JLabel();
        bSumarAyB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lMensaje1.setText("Dada la siguiente matriz A:");

        lMatriz.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lMatriz.setText("int[][] matrizA ={{10, 15, 20}, {-3, 12, 4}, {0, 5, -4}};");

        lMultiplicar.setText("Multiplicar por el escalar K: ");

        tfEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEscalarActionPerformed(evt);
            }
        });

        bVerResultado.setText("Ver Resultado");
        bVerResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVerResultadoMouseClicked(evt);
            }
        });
        bVerResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerResultadoActionPerformed(evt);
            }
        });

        lMensaje2.setText("Dada la siguiente matriz B:");

        lMatrizb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lMatrizb.setText("int[][] matrizB ={{25, -5, 10}, {-10, 21, 54}, {10, -55, -25}};");

        bSumarAyB.setText("Suma Matriz A y Matriz B");
        bSumarAyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumarAyBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMensaje1)
                    .addComponent(lMatriz)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMultiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVerResultado))
                    .addComponent(lMensaje2)
                    .addComponent(lMatrizb))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSumarAyB)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMultiplicar)
                    .addComponent(tfEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMensaje2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMatrizb)
                .addGap(18, 18, 18)
                .addComponent(bSumarAyB)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEscalarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEscalarActionPerformed

    private void bVerResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerResultadoMouseClicked
        // TODO add your handling code here:
        int k = Integer.parseInt(tfEscalar.getText());
        int[][] matrizA = {{10, 15, 20}, {-3, 12, 4}, {0, 5, -4}};
        int[][] arrayFinal = new int[3][3];

        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; j++) {
                arrayFinal[i][j] = k * matrizA[i][j];
            }
        }
        String resultado = "";
        for(int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; j++) {
                resultado += arrayFinal[i][j];
                resultado += " ";

            }
            resultado += " \n";
        }
        JOptionPane.showMessageDialog(null, resultado, "El resultado de la operación es: ", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_bVerResultadoMouseClicked

    private void bVerResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerResultadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bVerResultadoActionPerformed

    private void bSumarAyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumarAyBActionPerformed
        // TODO add your handling code here:
        int[][] matrizA = {{10, 15, 20}, {-3, 12, 4}, {0, 5, -4}};
        int[][] matrizB ={{25, -5, 10}, {-10, 21, 54}, {10, -55, -25}};
        int[][] arrayFinal = new int[3][3];

        for (int y = 0; y < matrizA.length; y++) {
            for (int x = 0; x < matrizA[y].length; x++) {
                int numeroMatriz1 = matrizA[y][x];
                int numeroMatriz2 = matrizB[y][x];
                int suma = numeroMatriz1 + numeroMatriz2;
                arrayFinal[y][x] = suma;
            }
        }
        String resultado = "";
        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; j++) {
                resultado += arrayFinal[i][j];
                resultado += " ";

            }
            resultado += " \n";
        }
        JOptionPane.showMessageDialog(null, resultado, "El resultado de la operación es: ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bSumarAyBActionPerformed

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
            java.util.logging.Logger.getLogger(FrmArreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmArreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmArreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmArreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmArreglo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSumarAyB;
    private javax.swing.JButton bVerResultado;
    private javax.swing.JLabel lMatriz;
    private javax.swing.JLabel lMatrizb;
    private javax.swing.JLabel lMensaje1;
    private javax.swing.JLabel lMensaje2;
    private javax.swing.JLabel lMultiplicar;
    private javax.swing.JTextField tfEscalar;
    // End of variables declaration//GEN-END:variables
}
