/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karan;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author karan
 */
//SPECIFYING
public class FInalHome extends javax.swing.JFrame{
    Connection con;
    ResultSet r;
    Statement st=null ; 
    /**
     * Creates new form FInalHome
     */
    public Thread t4;
    public FInalHome() throws InterruptedException {
       initComponents();
       Rectangle r=jPanel2.getBounds();
       System.out.println(r);
       Thread th=new Thread(){ 
       @Override
       public void run(){
            for(int i=0;i<=63;i++){
                try{
                    Thread.sleep(30);
                }catch(InterruptedException e){            
                }
                jLabel1.setBounds(14,6,i,68);
            }
    }                                        
       };th.start();
        Thread th1=new Thread(){ 
             public void run(){
                 for(int i=0;i<=11;i++){
                 try{
                    Thread.sleep(70);
                    }catch(InterruptedException e){ 
                }
                user.setBounds(95,i,115,53);
            }
    }                                        
       };th1.start();
        t4=new Thread(){
            public void run(){
                for(int i=0;i<=107;i++){
                    try{
                        Thread.sleep(15);
                    }
                    catch(Exception e){}
                    jPanel2.setBounds(6,i,674,328);
                }
            }
          };t4.start();
    }         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1266, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CALORIE METER:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CALORIES BURNT");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CALORIES GAINED");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("TODAY");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("YESTERDAY");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("DAY-WISE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 677, 301);

        a4.setBackground(new java.awt.Color(0, 51, 51));
        a4.setForeground(new java.awt.Color(255, 255, 255));
        a4.setText("                                                                     WORKOUT GENERATOR");
        a4.setOpaque(true);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a4MousePressed(evt);
            }
        });
        getContentPane().add(a4);
        a4.setBounds(712, 321, 508, 38);

        a2.setBackground(new java.awt.Color(0, 51, 51));
        a2.setForeground(new java.awt.Color(255, 255, 255));
        a2.setText("                                                                           BMF CALCULATOR");
        a2.setOpaque(true);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a2MousePressed(evt);
            }
        });
        getContentPane().add(a2);
        a2.setBounds(712, 209, 508, 38);

        a5.setBackground(new java.awt.Color(0, 51, 51));
        a5.setForeground(new java.awt.Color(255, 255, 255));
        a5.setText("                                                                      CALORIE CALCULATOR");
        a5.setOpaque(true);
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a5MousePressed(evt);
            }
        });
        getContentPane().add(a5);
        a5.setBounds(712, 154, 508, 37);

        a3.setBackground(new java.awt.Color(0, 51, 51));
        a3.setForeground(new java.awt.Color(255, 255, 255));
        a3.setText("                                                                           DIET GENERATOR");
        a3.setOpaque(true);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a3MousePressed(evt);
            }
        });
        getContentPane().add(a3);
        a3.setBounds(712, 265, 508, 38);

        a1.setBackground(new java.awt.Color(0, 51, 51));
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setText("                                                                              YOUR DATA");
        a1.setOpaque(true);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a1MousePressed(evt);
            }
        });
        getContentPane().add(a1);
        a1.setBounds(712, 98, 508, 38);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(462, 52, 304, 40);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText(".");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(240, 40, 292, 40);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(810, 370, 292, 52);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Desktop\\icon.png")); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 63, 68);

        jLabel14.setBackground(new java.awt.Color(204, 51, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel14.setText("X");
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1229, 0, 21, 22);

        jLabel13.setBackground(new java.awt.Color(102, 0, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setText("-");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1151, 0, 36, 22);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel16.setText("  HOME");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(550, 0, 190, 50);

        user.setBackground(new java.awt.Color(255, 153, 0));
        user.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setOpaque(true);
        getContentPane().add(user);
        user.setBounds(80, -2, 115, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Desktop\\advance java\\New folder\\SomeFlamboyantEwe-size_restricted.gif")); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(820, 0, 460, 490);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Desktop\\advance java\\New folder\\SomeFlamboyantEwe-size_restricted.gif")); // NOI18N
        jLabel20.setText("jLabel19");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 500, 490);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\karan\\Desktop\\advance java\\New folder\\SomeFlamboyantEwe-size_restricted.gif")); // NOI18N
        jLabel21.setText("jLabel19");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(500, 0, 500, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseClicked

    private void a1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MousePressed
        // TODO add your handling code here:
        result r1=new result();
        r1.setVisible(true);       
    }//GEN-LAST:event_a1MousePressed

    private void a2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MousePressed
        // TODO add your handling code here:
        Bmf1 b=new Bmf1();
        b.setVisible(true);
    }//GEN-LAST:event_a2MousePressed

    private void a3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MousePressed
        // TODO add your handling code here:
        choiceDiet d1=new choiceDiet();
        choiceDiet.user.setText(user.getText());
        d1.setVisible(true);
    }//GEN-LAST:event_a3MousePressed

    private void a4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MousePressed
        // TODO add your handling code here:
        workOut1 w=new workOut1();
        w.setVisible(true);
        workOut1.user.setText(user.getText());   
    }//GEN-LAST:event_a4MousePressed

    private void a5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MousePressed
        // TODO add your handling code here:
        Workout w=new Workout();
        w.setVisible(true);
        Workout.user.setText(user.getText());
    }//GEN-LAST:event_a5MousePressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setState(karan1.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        // TODO add your handling code here:
      //  jLabel6.setBackground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        // TODO add your handling code here:
       // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
       // jLabel6.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
       // jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        String s=jLabel15.getText();
        String s2="";
        if(s.equalsIgnoreCase("OBESE")){
            s2="Need to Lower down";
    }//GEN-LAST:event_jLabel15MouseEntered
  
        else if(s.equalsIgnoreCase("AVERGAE")){
            s2="Need to workout";
    }    
        else if(s.equalsIgnoreCase("FITNESS")){
            s2="A Fitter person You are";
    }    
        else if(s.equalsIgnoreCase("ESSENTIAL FAT")){
            s2="Need to More Intake of Essential Food Viatamins";
    }
        else if(s.equalsIgnoreCase("ATHLETES")){
            s2="PERFECT BFP MAINTAIN IT";
    }
        jLabel18.setText(s2);
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new FInalHome().setVisible(true);
     
                } catch (InterruptedException ex) {
                    Logger.getLogger(FInalHome.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
