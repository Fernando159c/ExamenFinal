/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

/**
 *
 * @author Administrator
 */
public class FormularioCompra extends javax.swing.JFrame {

    /**
     * Creates new form FormularioCompra
     */
    public FormularioCompra() {
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

        jTextField1 = new javax.swing.JTextField();
        ltitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCcv = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ltitulo.setText("PAGO CON TARJETA");
        getContentPane().add(ltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel1.setText("Aceptamos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 52, -1, -1));

        jLabel2.setText("Nombre del titular:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 60, -1));

        jLabel3.setText("Numero de tarjeta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        getContentPane().add(txtTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 130, -1));

        jLabel4.setText("Fecha de caducidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));
        getContentPane().add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 130, -1));

        jLabel5.setText("CCV(Codigo de Seguridad) :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        txtCcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCcvActionPerformed(evt);
            }
        });
        getContentPane().add(txtCcv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, -1));
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 60, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Confirmar mi pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 170, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\unifacil\\trabajos\\java\\lpoo172-s22ejercicio01\\src\\main\\resources\\img\\credit-cards-logos.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCcvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCcvActionPerformed

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Resultado resultado = new Resultado();
        resultado.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel ltitulo;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField txtCcv;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}