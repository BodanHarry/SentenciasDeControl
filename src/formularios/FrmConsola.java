/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author hebod
 */
public class FrmConsola extends javax.swing.JFrame {

    Scanner entrada = new Scanner(System.in);
    
    /**
     * Creates new form Consola
     */
    public FrmConsola() {
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

        lEjer4 = new javax.swing.JLabel();
        bRealizar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        bRealizar5 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        lEjer1 = new javax.swing.JLabel();
        bRealizar6 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        lEjer7 = new javax.swing.JLabel();
        bRealizar2 = new javax.swing.JButton();
        bRealizar7 = new javax.swing.JButton();
        bRealizar1 = new javax.swing.JButton();
        lEjer8 = new javax.swing.JLabel();
        lEjer3 = new javax.swing.JLabel();
        bRealizar8 = new javax.swing.JButton();
        bRealizar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lEjer4.setText("4. Descomponga una cifra de 5 dígitos en sus dígitos individuales");

        bRealizar4.setText("Realizar");
        bRealizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Calcule la raíz cuadrada de un número dado");

        bRealizar5.setText("Realizar");
        bRealizar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar5ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Calcule la tabla de verdad del Y (lógico) usando valores booleanos ");

        lEjer1.setText("1. Solicite el tamaño de un DD en TB y muestre su tamaño en bytes");

        bRealizar6.setText("Realizar");
        bRealizar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar6ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Calcule el residuo de una división entre dos números enteros");

        lEjer7.setText("7. Lea 6 caracteres e imprima la concatenación de estos");

        bRealizar2.setText("Realizar");
        bRealizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar2ActionPerformed(evt);
            }
        });

        bRealizar7.setText("Realizar");
        bRealizar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar7ActionPerformed(evt);
            }
        });

        bRealizar1.setText("Realizar");
        bRealizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar1ActionPerformed(evt);
            }
        });

        lEjer8.setText("8. Muestre la fecha del sistema ");

        lEjer3.setText("3. Calcule el total a pagar de una venta de 4 productos, incluya IVA y descuento");

        bRealizar8.setText("Realizar");
        bRealizar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar8ActionPerformed(evt);
            }
        });

        bRealizar3.setText("Realizar");
        bRealizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar3ActionPerformed(evt);
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
                        .addComponent(lEjer1)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer2)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer4)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer8)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer1)
                    .addComponent(bRealizar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer2)
                    .addComponent(bRealizar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer3)
                    .addComponent(bRealizar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer4)
                    .addComponent(bRealizar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bRealizar5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bRealizar6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer7)
                    .addComponent(bRealizar7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer8)
                    .addComponent(bRealizar8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRealizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar4ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite el numero de 5 cifras");
        int num1 = entrada.nextInt();
        String num = String.valueOf(num1);
        for(int i = 0; i < num.length(); i++){
            System.out.println(num.charAt(i));
        }
        
    }//GEN-LAST:event_bRealizar4ActionPerformed

    private void bRealizar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar5ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite el numero de para calcular la raiz");
        double num1 = entrada.nextInt();
        double numRaiz = Math.sqrt(num1);
        System.out.println("La raiz del numero es : " + numRaiz);
        
    }//GEN-LAST:event_bRealizar5ActionPerformed

    private void bRealizar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar6ActionPerformed

    private void bRealizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite el numero 1");
        int num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = entrada.nextInt();
        float residuo = num1%num2;
        System.out.println("El residuo es: " + residuo);
        
    }//GEN-LAST:event_bRealizar2ActionPerformed

    private void bRealizar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar7ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite 6 caracteres");
        System.out.println("Digite el caracter 1");
        String uno = entrada.next();
        System.out.println("Digite el caracter 2");
        String dos = entrada.next();
        System.out.println("Digite el caracter 3");
        String tres = entrada.next();
        System.out.println("Digite el caracter 4");
        String cuatro = entrada.next();
        System.out.println("Digite el caracter 5");
        String cinco = entrada.next();
        System.out.println("Digite el caracter 6");
        String seis = entrada.next();
        String suma = uno + dos + tres + cuatro + cinco + seis;
         System.out.println("La respuesta es: " + suma);

        
    }//GEN-LAST:event_bRealizar7ActionPerformed

    private void bRealizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite el tamaño de su disco duro en TB: ");
        double tam  = entrada.nextInt();
        double tamEnBytes = tam * 1099511627776L ;
        System.out.println("El tamaño de su disco Duro en bytes " + tamEnBytes + "Bytes" );
        
    }//GEN-LAST:event_bRealizar1ActionPerformed

    private void bRealizar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar8ActionPerformed
        // TODO add your handling code here:
        System.out.println(LocalDateTime. now());
    }//GEN-LAST:event_bRealizar8ActionPerformed

    private void bRealizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar3ActionPerformed
        // TODO add your handling code here:
        System.out.println("Digite el precio de los 4 siguientes productos");
        float num1, num2, num3, num4; 
        System.out.println("Producto 1 : ");
        num1 = entrada.nextInt();
        System.out.println("Producto 2 : ");
        num2 = entrada.nextInt();
        System.out.println("Producto 3 : ");
        num3 = entrada.nextInt();
        System.out.println("Producto 4 : ");
        num4 = entrada.nextInt();
        
        float suma = num1 + num2 + num3 + num4; 
        double precioConIVA = suma + suma*0.15;
        double precioDescuento = suma - precioConIVA*0.10;
        
        System.out.println("El subtotal es de: "+ suma);
        System.out.println("El subtotal con IVA es de: "+ precioConIVA);
        System.out.println("El total con el 10% de descuento es de: "+ precioDescuento);
    }//GEN-LAST:event_bRealizar3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRealizar1;
    private javax.swing.JButton bRealizar2;
    private javax.swing.JButton bRealizar3;
    private javax.swing.JButton bRealizar4;
    private javax.swing.JButton bRealizar5;
    private javax.swing.JButton bRealizar6;
    private javax.swing.JButton bRealizar7;
    private javax.swing.JButton bRealizar8;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEjer8;
    // End of variables declaration//GEN-END:variables
}