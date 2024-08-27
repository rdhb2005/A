public class Ventana1 extends javax.swing.JFrame {

    Escalar escalar = new Escalar();
    
    public Ventana1() {
        initComponents();
        setLocationRelativeTo(null);
        escalar.escalarLabel(PantallaDeCarga, "/imagenes/Pantalla de carga.jpg");
        escalar.escalarButton(Abrir2, "/imagenes/comenzar.jpg");
        
    
        Audio.iniciarMusica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abrir2 = new javax.swing.JButton();
        PantallaDeCarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Abrir2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Abrir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Abrir2.setMaximumSize(new java.awt.Dimension(100, 50));
        Abrir2.setMinimumSize(new java.awt.Dimension(100, 50));
        Abrir2.setPreferredSize(new java.awt.Dimension(150, 80));
        Abrir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Abrir2MouseClicked(evt);
            }
        });
        Abrir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir2ActionPerformed(evt);
            }
        });
        getContentPane().add(Abrir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 150, -1));

        PantallaDeCarga.setToolTipText("");
        getContentPane().add(PantallaDeCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Abrir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir2ActionPerformed
        Ventana2 v2 = new Ventana2();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Abrir2ActionPerformed

    private void Abrir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Abrir2MouseClicked
    }//GEN-LAST:event_Abrir2MouseClicked

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir2;
    private javax.swing.JLabel PantallaDeCarga;
    // End of variables declaration//GEN-END:variables
}
