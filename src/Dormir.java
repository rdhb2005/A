import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dormir extends javax.swing.JFrame {
    
    
    private Escalar escalar = new Escalar();   
    private Bars barras;
    
    public Bars getBars() {
        return barras;
    }

    public Dormir() {
        initComponents();
        setLocationRelativeTo(null);
        jLabelNombre.setText("Nombre: " + DatosMascota.getNombreMascota());
        escalar.escalarLabel(jLabelImagenMascota, DatosMascota.getRutaImagen());
        escalar.escalarButton(IconoD, "/imagenes/IconoD.jpeg");
        escalar.escalarButton(Next1, "/imagenes/NextV.jpeg");
        escalar.escalarButton(Next2, "/imagenes/NextV.jpeg");

        // Inicializa Bars con las JProgressBar del formulario
        barras = new Bars(IconoCa, IconoAg, IconoPi);
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        Next2 = new javax.swing.JButton();
        Next1 = new javax.swing.JButton();
        IconoD = new javax.swing.JButton();
        IconoCa = new javax.swing.JProgressBar();
        IconoAg = new javax.swing.JProgressBar();
        IconoPi = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelImagenMascota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelNombre.setText("jLabelNombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        Next2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Next2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Next2.setMaximumSize(new java.awt.Dimension(100, 40));
        Next2.setMinimumSize(new java.awt.Dimension(100, 40));
        Next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next2ActionPerformed(evt);
            }
        });
        getContentPane().add(Next2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 40));

        Next1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Next1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next1ActionPerformed(evt);
            }
        });
        getContentPane().add(Next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 40));

        IconoD.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        IconoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconoDActionPerformed(evt);
            }
        });
        getContentPane().add(IconoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 60));
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

    private void Next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next1ActionPerformed
        Beber v7 = new Beber();
        v7.setVisible(true);
        this.setVisible(false);
        
        v7.getBars().setProgresoBar1Value(barras.getProgresoBar1Value());
        v7.getBars().setProgresoBar2Value(barras.getProgresoBar2Value());
        v7.getBars().setProgresoBar3Value(barras.getProgresoBar3Value());
           
    }//GEN-LAST:event_Next1ActionPerformed

    private void Next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next2ActionPerformed
        Juego v6 = new Juego();
        v6.setVisible(true);
        this.setVisible(false);
        
        v6.getBars().setProgresoBar1Value(barras.getProgresoBar1Value());
        v6.getBars().setProgresoBar2Value(barras.getProgresoBar2Value());
        v6.getBars().setProgresoBar3Value(barras.getProgresoBar3Value());
    }//GEN-LAST:event_Next2ActionPerformed

    private void IconoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconoDActionPerformed
        int currentValue = barras.getProgresoBar1().getValue();
        int newValue = Math.min(currentValue + 10, 100); // Asegura que el valor no supere el 100%
        barras.setProgresoBar1Value(newValue);
    }//GEN-LAST:event_IconoDActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Dormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dormir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dormir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar IconoAg;
    private javax.swing.JProgressBar IconoCa;
    private javax.swing.JButton IconoD;
    private javax.swing.JProgressBar IconoPi;
    private javax.swing.JButton Next1;
    private javax.swing.JButton Next2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelImagenMascota;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}
