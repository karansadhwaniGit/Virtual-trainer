/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;
/**
 *
 * @author karan
 */
public class choiceDiet extends javax.swing.JFrame {
    /**
     * Creates new form choiceDiet
     */
    public choiceDiet() {
        initComponents();
      user.setVisible(false);  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        VEGETARIAN = new javax.swing.JRadioButton();
        NON_VEGETARIAN = new javax.swing.JRadioButton();
        fatfull = new javax.swing.JRadioButton();
        fatless = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(VEGETARIAN);
        VEGETARIAN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VEGETARIAN.setSelected(true);
        VEGETARIAN.setText("VEGETARIAN");
        VEGETARIAN.setOpaque(false);
        VEGETARIAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VEGETARIANActionPerformed(evt);
            }
        });
        jPanel1.add(VEGETARIAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 53, 150, -1));

        buttonGroup1.add(NON_VEGETARIAN);
        NON_VEGETARIAN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NON_VEGETARIAN.setText("NON_VEGETARIAN");
        NON_VEGETARIAN.setOpaque(false);
        NON_VEGETARIAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NON_VEGETARIANActionPerformed(evt);
            }
        });
        jPanel1.add(NON_VEGETARIAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 53, -1, -1));

        buttonGroup2.add(fatfull);
        fatfull.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatfull.setText("Fat-Full");
        fatfull.setOpaque(false);
        jPanel1.add(fatfull, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 94, -1, -1));

        buttonGroup2.add(fatless);
        fatless.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatless.setText("Fat-Less");
        fatless.setOpaque(false);
        jPanel1.add(fatless, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 135, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PLEASE CHOOSE THE TYPE OF DIET");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("GENERATE");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 140, 50));

        user.setText("jLabel1");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 90, -1));

        jLabel22.setBackground(new java.awt.Color(204, 51, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel22.setText("X");
        jLabel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel22MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel22MouseMoved(evt);
            }
        });
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brand-gradients-hex-color-background.png"))); // NOI18N
        jLabel3.setText("user");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VEGETARIANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEGETARIANActionPerformed
        // TODO add your handling code here:
         if(VEGETARIAN.getText()=="VEGETARIAN"){
         fatless.setVisible(true);
         fatfull.setVisible(true);
        }
    }//GEN-LAST:event_VEGETARIANActionPerformed

    private void NON_VEGETARIANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NON_VEGETARIANActionPerformed
        // TODO add your handling code here:
         if(NON_VEGETARIAN.getText()=="NON_VEGETARIAN" && NON_VEGETARIAN.isSelected()){
         fatless.setVisible(false);
         fatfull.setVisible(false);
         }
    }//GEN-LAST:event_NON_VEGETARIANActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DietGenerator().setVisible(true);
        DietGenerator.user.setText(user.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel22MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseDragged
        // TODO add your handling code here:
        //  jLabel6.setBackground(Color.RED);
    }//GEN-LAST:event_jLabel22MouseDragged

    private void jLabel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseMoved
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel22MouseMoved

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
      //  System.exit(0);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        // jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel22MouseExited

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
            java.util.logging.Logger.getLogger(choiceDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choiceDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choiceDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choiceDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choiceDiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton NON_VEGETARIAN;
    public static javax.swing.JRadioButton VEGETARIAN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    public static javax.swing.JRadioButton fatfull;
    public static javax.swing.JRadioButton fatless;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
