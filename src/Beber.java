public class Beber extends javax.swing.JFrame {
    
    private Escalar escalar = new Escalar();
    private Bars barras;
    

    public Beber() {
        initComponents();
        setLocationRelativeTo(null);
        jLabelNombre.setText("Nombre: " + DatosMascota.getNombreMascota());
        escalar.escalarLabel(jLabelImagenMascota, DatosMascota.getRutaImagen());
        escalar.escalarButton(IconoB, "/imagenes/IconoA.jpeg");
        escalar.escalarButton(Next7, "/imagenes/NextV.jpeg");
        escalar.escalarButton(Next8, "/imagenes/NextV.jpeg");
        
        barras = new Bars(IconoCa, IconoAg, IconoPi);
        
    }
    
    public Bars getBars() {
        return barras;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Next7 = new javax.swing.JButton();
        Next8 = new javax.swing.JButton();
        IconoB = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        IconoCa = new javax.swing.JProgressBar();
        IconoAg = new javax.swing.JProgressBar();
        IconoPi = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelImagenMascota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Next7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Next7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Next7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next7ActionPerformed(evt);
            }
        });
        getContentPane().add(Next7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 40));

        Next8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Next8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Next8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next8ActionPerformed(evt);
            }
        });
        getContentPane().add(Next8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 40));

        IconoB.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        IconoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IconoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconoBActionPerformed(evt);
            }
        });
        getContentPane().add(IconoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 60));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelNombre.setText("jLabelNombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));
        getContentPane().add(IconoCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        IconoAg.setValue(100);
        getContentPane().add(IconoAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        IconoPi.setValue(100);
        getContentPane().add(IconoPi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("HAMBRE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("SUEÑO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("SED:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        jLabelImagenMascota.setToolTipText("");
        getContentPane().add(jLabelImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next7ActionPerformed
        Comer v5 = new Comer();
        v5.setVisible(true);
        this.setVisible(false);
        
        v5.getBars().setProgresoBar1Value(barras.getProgresoBar1Value());
        v5.getBars().setProgresoBar2Value(barras.getProgresoBar2Value());
        v5.getBars().setProgresoBar3Value(barras.getProgresoBar3Value());
    }//GEN-LAST:event_Next7ActionPerformed

    private void Next8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next8ActionPerformed
        Dormir v4 = new Dormir();
        v4.setVisible(true);
        this.setVisible(false);
        
        v4.getBars().setProgresoBar1Value(barras.getProgresoBar1Value());
        v4.getBars().setProgresoBar2Value(barras.getProgresoBar2Value());
        v4.getBars().setProgresoBar3Value(barras.getProgresoBar3Value());
    }//GEN-LAST:event_Next8ActionPerformed

    private void IconoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconoBActionPerformed
        int currentValue = barras.getProgresoBar2Value();

        if (currentValue < 100) {
            barras.setProgresoBar2Value(currentValue + 10);
        }
    }//GEN-LAST:event_IconoBActionPerformed

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
            java.util.logging.Logger.getLogger(Beber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar IconoAg;
    private javax.swing.JButton IconoB;
    private javax.swing.JProgressBar IconoCa;
    private javax.swing.JProgressBar IconoPi;
    private javax.swing.JButton Next7;
    private javax.swing.JButton Next8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelImagenMascota;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}
