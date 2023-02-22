
package sistemadegarantias;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author AGONZALEZ
 */
public class MENU extends javax.swing.JFrame {
 
    public MENU() {
        initComponents();
       Leer_fichero.leerconexion();

       // this.setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/RECURSOS/logo.png")).getImage());//icono  superior baraa
      /*
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(LBLMARCAAGUA.getWidth(),
        LBLMARCAAGUA.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        LBLMARCAAGUA.setIcon(iconoEscalado);
        */ 
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        LBLMARCAAGUA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        REIMPRIMIR = new javax.swing.JMenuItem();
        NUEVAGARANTIA = new javax.swing.JMenuItem();
        JBHISTORIALCOMPRA = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMAS DE GARANTIAS SOUNDS ");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("HISTORIAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 250, 60));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("RE IMPRESION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 320, 60));

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("GENERAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 230, 50));

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 240, 50));

        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 250, 60));

        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 320, 60));

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("SALIR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 170, 60));

        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 230, 60));

        LBLMARCAAGUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3P.jpg"))); // NOI18N
        LBLMARCAAGUA.setText("marca de agua");
        getContentPane().add(LBLMARCAAGUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 740));

        jMenu1.setText("MENU");

        REIMPRIMIR.setText("RE IMPRIMIR");
        REIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REIMPRIMIRActionPerformed(evt);
            }
        });
        jMenu1.add(REIMPRIMIR);

        NUEVAGARANTIA.setText("GENERAR ");
        NUEVAGARANTIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVAGARANTIAActionPerformed(evt);
            }
        });
        jMenu1.add(NUEVAGARANTIA);

        JBHISTORIALCOMPRA.setText("HISTORIAL COMPRA");
        JBHISTORIALCOMPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBHISTORIALCOMPRAActionPerformed(evt);
            }
        });
        jMenu1.add(JBHISTORIALCOMPRA);

        jMenu2.setText("AYUDA");
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void REIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REIMPRIMIRActionPerformed
        MENUREIMPRIMIR MR = new MENUREIMPRIMIR();
        MR.setVisible(true);
        MR.setLocation(220, 50);
        MR.setSize(865, 400);
        dispose();
    }//GEN-LAST:event_REIMPRIMIRActionPerformed

    private void NUEVAGARANTIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVAGARANTIAActionPerformed
       NUEVAGARANTIA MG = new NUEVAGARANTIA();
        MG.setVisible(true);
        MG.setLocation(220, 50);
        MG.setSize(865, 400);
        dispose();
    }//GEN-LAST:event_NUEVAGARANTIAActionPerformed

    private void JBHISTORIALCOMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBHISTORIALCOMPRAActionPerformed
        HISTORIAL HC= new HISTORIAL();
        HC.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBHISTORIALCOMPRAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       NUEVAGARANTIA MG = new NUEVAGARANTIA();
        MG.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HISTORIAL HC = new HISTORIAL();
        HC.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MENUREIMPRIMIR MR = new MENUREIMPRIMIR();
        MR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JBHISTORIALCOMPRA;
    private javax.swing.JLabel LBLMARCAAGUA;
    private javax.swing.JMenuItem NUEVAGARANTIA;
    private javax.swing.JMenuItem REIMPRIMIR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
