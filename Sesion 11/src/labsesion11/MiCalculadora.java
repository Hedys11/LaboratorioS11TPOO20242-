/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labsesion11;

/**
 *
 * @author HEDY
 */
public class MiCalculadora extends javax.swing.JFrame {

    
    public MiCalculadora() {
        initComponents();
    }

    String memory; 
    int operacion;
    private static final int SUMA = 0;
    private static final int RESTA = 1;
    private static final int MULTIPLICACION = 2;
    private static final int DIVISION = 3; 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Restar = new javax.swing.JLabel();
        Sumar = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        Igual = new javax.swing.JLabel();
        Dividir = new javax.swing.JLabel();
        Multiplicar = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("CALCULADORA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 130, 30));

        jButton1.setBackground(new java.awt.Color(165, 58, 54));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("x");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Group 11.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Text field.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 70));

        Restar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Small FAB (1).png")); // NOI18N
        Restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarMouseClicked(evt);
            }
        });
        jPanel1.add(Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 90, 80));

        Sumar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Small FAB.png")); // NOI18N
        Sumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarMouseClicked(evt);
            }
        });
        jPanel1.add(Sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 70));

        Clear.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Group 7.png")); // NOI18N
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 80, 80));

        Igual.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Group 8.png")); // NOI18N
        Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IgualMouseClicked(evt);
            }
        });
        jPanel1.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, 70));

        Dividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Group 9.png")); // NOI18N
        Dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DividirMouseClicked(evt);
            }
        });
        jPanel1.add(Dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 80, 70));

        Multiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HEDY\\Downloads\\Group 10.png")); // NOI18N
        Multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplicarMouseClicked(evt);
            }
        });
        jPanel1.add(Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 80));

        Resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Resultado.setText("0");
        Resultado.setBorder(null);
        Resultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicarMouseClicked
         almacenarMemoria(MULTIPLICACION);    
    }//GEN-LAST:event_MultiplicarMouseClicked

    private void DividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DividirMouseClicked
        almacenarMemoria(DIVISION); 
    }//GEN-LAST:event_DividirMouseClicked

    private void SumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarMouseClicked
      almacenarMemoria(SUMA);
    }//GEN-LAST:event_SumarMouseClicked
 private void almacenarMemoria(int ope) 
    {
        memory = Resultado.getText();
        Resultado.setText(""); 
        operacion = ope;
    }    
 
    private void RestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarMouseClicked
      almacenarMemoria(RESTA); 
    }//GEN-LAST:event_RestarMouseClicked

    private void IgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IgualMouseClicked
        Logica log = new Logica(memory, Resultado.getText(), operacion);
        Resultado.setText(log.getResultado()+ "");   
        
    }//GEN-LAST:event_IgualMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
         memory = "0";
        Resultado.setText("0"); 
    }//GEN-LAST:event_ClearMouseClicked

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
      
    }//GEN-LAST:event_ResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Dividir;
    private javax.swing.JLabel Igual;
    private javax.swing.JLabel Multiplicar;
    private javax.swing.JLabel Restar;
    private javax.swing.JTextField Resultado;
    private javax.swing.JLabel Sumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
